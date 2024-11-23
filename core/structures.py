## _structures.py
# Defines structures used by Cobra
##


##
# Class CobraVariable__
# Defines class CobraVariable__ to save scripts variables.
##


class CobraVariable__:
    def __init__(self, name, value=None, kind="any", params={}):
        self.name = name
        self.kind = kind
        self.value = value
        self.params = params

        try:
            value._visitor = CobraVariable__._visitor
            value._memory_manager = CobraVariable__._memory_manager
        except:
            pass

    def __eq__(self, other):
        if isinstance(other, str):
            return self.name == other
        else:
            return isinstance(other, CobraVariable__) and self.name == other.name

    def __str__(self):
        return (
            "| NAME: "
            + self.name
            + " - VALUE: "
            + str(self.value)
            + " - KIND: "
            + str(self.kind)
            + " |"
        )

    def set_value(self, value):
        self.value = value


##
# Class CobraParameter__
# Defines class CobraParameter__ to manage parameters in functions
##


class CobraParameter__:
    def __init__(self, name, kind=None, mandatory=False, default=None):
        self.name = name
        self.kind = kind
        self.mandatory = mandatory
        self.default = default

    def is_mandatory(self):
        return self.mandatory == True


##
# Class CobraLocalMemory__
# Defines class CobraLocalMemory__ to manage local variables in functions
##


class CobraLocalMemory__:

    def __init__(self, name, depth, variables={}):
        self.name = name
        self.depth = depth
        self.variables = {}

        if isinstance(variables, dict):
            for name, var in variables.items():
                if isinstance(var, CobraVariable__):
                    self.variables[name] = var
                else:
                    self.variables[name] = CobraVariable__(name, var, "any")

    def find(self, name):
        portions = name.split(".")
        current_portion = 0
        result = None
        current = self.variables

        for portion in portions:
            current_portion += 1

            # Is the last portion
            if current_portion == len(portions):

                if isinstance(current, dict):
                    result = current.get(portions[-1])
                elif isinstance(current, CobraVariable__):
                    if isinstance(current.value, dict):
                        result = current.value.get(portions[-1])
                    else:
                        try:
                            result = CobraVariable__(
                                portion, getattr(current.value, portion)
                            )
                        except Exception:
                            raise Exception("Error: Variable not found.")
                else:
                    try:
                        result = CobraVariable__(portion, getattr(current, portion))
                    except Exception:
                        raise Exception("Error: Variable not found.")
            else:
                if isinstance(current, dict):
                    nxt = current.get(portion, False)
                    if nxt:
                        current = nxt
                    else:
                        raise Exception("Error: Variable not found.")
                elif isinstance(current, CobraVariable__):
                    if isinstance(current.value, dict):
                        nxt = current.value.get(portion, False)
                        if nxt:
                            current = nxt
                        else:
                            raise Exception("Error: Variable not found.")
                    else:
                        try:
                            current = CobraVariable__(
                                portion, getattr(current.value, portion)
                            )
                        except Exception:
                            raise Exception("Error: Variable not found.")
                else:
                    # Special type of variable
                    raise Exception("Error: Variable not found.")

        return result

    def assign(self, name, obj):
        var = self.find(name)

        if var is None:
            if isinstance(obj, CobraVariable__):
                self.variables[name] = obj
            else:
                self.variables[name] = CobraVariable__(name, obj, "default")
        else:
            var.set_value(obj)

    def getVariables(self):
        return self.variables


##
# Class __GlobalMemory__
# Defines class __GlobalMemory__ to manage local memories
##


class CobraGlobalMemory__:

    memory_stack = None

    def __init__(self, local_memories=[]):
        self.memory_stack = []

        main_memory = CobraLocalMemory__("Main", 0)
        self.memory_stack.append(main_memory)

    def find(self, name):
        result = None

        for memory in reversed(self.memory_stack):
            try:
                result = memory.find(name)
            except Exception as e:
                raise e

            if result is not None:
                break

        return result

    def peek_memory(self):
        return self.memory_stack[-1]

    def get_memory(self, index):
        if index < 0 or index > len(self.memory_stack):
            raise Exception("Memory IndexOutOfRange")

        return self.memory_stack[index]

    def assign(self, name, obj):
        var = self.find(name)

        if var is None:
            if not isinstance(obj, CobraVariable__):
                obj = CobraVariable__(name, obj, "any")

            local_memory = self.peek_memory()

            local_memory.assign(name, obj)
        else:
            var.set_value(obj)

        pass

    def add_memory(self, name, params={}):
        if type(params) is not dict:
            raise Exception("Error: typeof 'params' is not dict")

        memory_depth = self.memory_stack[-1].depth + 1

        local_memory = CobraLocalMemory__(name, memory_depth, params)

        self.memory_stack.append(local_memory)

        return local_memory

    def pop_memory(self):
        return self.memory_stack.pop()
