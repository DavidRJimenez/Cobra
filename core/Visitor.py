__author__ = "MateoPissarello"

from .CobraVisitor import CobraVisitor
from .CobraParser import CobraParser
from numpy import arange
from importlib import import_module
from .structures import CobraVariable__, CobraGlobalMemory__, CobraParameter__


class Visitor(CobraVisitor):
    memory_manager = None
    value_spitted = None
    spicy_snake_line = -1

    def __init__(self):
        self.memory_manager = CobraGlobalMemory__()
        CobraVariable__.visitor = self
        CobraVariable__.memory_manager = self.memory_manager

    def visitParse(self, ctx: CobraParser.ParseContext):
        if ctx.from_file is not None:
            return self.visit(ctx.from_file())
        else:
            return self.visit(ctx.from_input())

    # Visit a parse tree produced by TLONParser#from_input.
    def visitFrom_input(self, ctx: CobraParser.From_inputContext):
        return self.visit(ctx.stat())

    # Visit a parse tree produced by TLONParser#from_file.
    def visitFrom_file(self, ctx: CobraParser.From_fileContext):
        return self.visitChildren(ctx)

    def visitStat(self, ctx: CobraParser.StatContext):
        if ctx.compound_stat() is not None:
            return self.visit(ctx.compound_stat())
        return self.visit(ctx.simple_stat())

    def visitCompound_stat(self, ctx: CobraParser.Compound_statContext):
        if ctx.ifStatement() is not None:
            return self.visit(ctx.ifStatement())
        elif ctx.whileLoop() is not None:
            return self.visit(ctx.whileLoop())
        elif ctx.forLoop() is not None:
            return self.visit(ctx.forLoop())
        elif ctx.functionDeclaration() is not None:
            return self.visit(ctx.funcion())
        elif ctx.snaketronTraining() is not None:
            return self.visit(ctx.snaketronTraining())
        elif ctx.makeNest() is not None:
            return self.visit(ctx.makeNest())
        elif ctx.fileHandling() is not None:
            return self.visit(ctx.fileHandling())
        return self.visit(ctx.dataPlotting())

    # Visit a parse tree produced by TLONParser#simple_stat.
    def visitSimple_stat(self, ctx: CobraParser.Simple_statContext):
        if ctx.assignment() is not None:
            return self.visit(ctx.assignment())
        elif ctx.hiss() is not None:
            return self.visit(ctx.hiss())
        elif ctx.bite() is not None:
            return self.visit(ctx.bite())
        elif ctx.spit() is not None:
            return self.visit(ctx.spit())
        elif ctx.atom() is not None:
            return self.visit(ctx.atom())
        raise Exception("SpicySnake Error: Found " + str(self.OTHER()))

    def visitAtomExpr(self, ctx: CobraParser.AtomExprContext):
        return self.visitChildren(ctx)

    def visitAtom(self, ctx: CobraParser.AtomContext):
        if ctx.NUMBER():
            return float(ctx.NUMBER().getText())
        elif ctx.ID():
            return self.memory_manager.find(ctx.ID().getText())
        elif ctx.STRING():
            string = str(ctx.STRING().getText())
            return string[1 : len(string) - 1]

        raise Exception("SpicySnake Error: Unsupported atom type.")

    def visitAccessVariable(self, ctx: CobraParser.AccessVariableAtomContext):
        return self.visitChildren(ctx)

    def visitNumericAtom(self, ctx: CobraParser.NumericAtomContext):
        if ctx.INT() is not None:
            return int(ctx.INT().getText())
        return float(ctx.FLOAT().getText())

    def visitVariable(self, ctx: CobraParser.VariableContext):
        # TODO
        ...

    def visitHiss(self, ctx: CobraParser.HissContext):
        variable = self.visit(ctx.expr())
        if isinstance(variable, CobraVariable__):
            print(variable.value)
        else:
            print(variable)

        return None

    def visitAssignment(self, ctx: CobraParser.AssignmentContext):
        name = str(ctx.variable().getText())
        value = None

        if ctx.expr() is not None:
            value = self.visit(ctx.expr())
        elif ctx.assignment() is not None:
            value = self.visit(ctx.assigment())

        self.memory_manager.assign(name, value)
        return value

    def visitIfStatement(self, ctx: CobraParser.IfStatementContext):
        conditions = ctx.condition_block()

        for condition in conditions:
            result = self.visit(condition)
            if result["accepted"] is True:
                return result["value_returned"]
        if ctx.stat_block() is not None:
            self.memory_manager.add_memory("ELSTRIKE_STMT")
            value_returned = self.visit(ctx.stat_block())
            self.memory_manager.pop_memory()
            return value_returned
        return None

    def visitWhileLoop(self, ctx: CobraParser.WhileLoopContext):
        condition = ctx.condition_block()
        returned_value = None
        while condition:
            self.memory_manager.add_memory("COIL_STMT")
            returned_value = self.visit(ctx.stat_block())
            self.memory_manager.pop_memory()

            if type(returned_value) is tuple and returned_value[1] == 1:
                return returned_value[0]

            condition = self.visit(ctx.expr())
        return None

    def visitForLoop(self, ctx: CobraParser.ForLoopContext):
        items = self.visit(ctx.expr())
        var = str(ctx.ID())
        if self.memory_manager.find(var) is not None:
            raise Exception("SpicySnake Error: Variable " + var + " already exists")
        try:
            items_iterator = iter(items)
            for item in items:
                self.memory_manager.add_memory("TRAIL_STMT")
                self.memory_manager.assign(var, item)
                returned_value = self.visit(ctx.stat_block())
                self.memory_manager.pop_memory()

                if type(returned_value) is tuple and returned_value[1] == 1:
                    return returned_value[0]
        except:
            raise Exception("SpicySnake Error: Trail loop requires an iterable object")
        return None

    def functionDeclaration(self, ctx: CobraParser.FunctionDeclarationContext):
        opcionales = False
        name = str(ctx.ID())
        kind = "user"
        value = ctx.stat()

        parameters = {}
        for param in ctx.parameter():
            param_name = str(param.ID())
            if self.memory_manager.find(param_name) is not None:
                raise Exception(
                    "SpicySnake Error: Variable " + param_name + " already exists"
                )
            if opcionales and param.ASSIGN() is None:
                raise Exception(
                    "SpicySnake, Cannot set mandatory parameter after optional parameter"
                )
            parameter = CobraParameter__(param_name)

            if param.ASSIGN() is not None:
                parameter.kind = "optional"
                parameter.default = self.visit(param.expr())
                opcionales = True
            else:
                parameter.kind = "mandatory"
            parameters[param_name] = parameter
        local_memory = self.memory_manager.peek_memory()

        funcion = CobraVariable__(name, value, kind, parameters)
        local_memory.assign(name, funcion, None)

        return funcion

    def funcionImport(self, ctx: CobraParser.BiteContext):
        package_name = ".".join([str(x.getText()) for x in ctx.ID()])
        mod = import_module(package_name)

        global_mem = self.memory_manager.get_memory(0)

        for name, attribute in mod.__dict__.items():
            if not name.startswith("__"):
                var = CobraVariable__(name, attribute, "default")
                global_mem.assign(name, var)

        return mod

    def funcionRetornar(self, ctx: CobraParser.SpitContext):
        return self.visit(ctx.expr(), 1)

    def visitCondition_block(self, ctx: CobraParser.Condition_blockContext):

        result = {"accepted": self.visit(ctx.expr())}

        if result["accepted"] is True:
            self.memory_manager.add_memory("STRIKE_STMT")
            result["value_returned"] = self.visit(ctx.stat_block())
            self.memory_manager.pop_memory()

        return result

    # Visit a parse tree produced by TLONParser#stat_block.
    def visitStat_block(self, ctx: CobraParser.Stat_blockContext):
        value_returned = None

        for stat in ctx.stat():
            value_returned = self.visit(stat)

        return value_returned

    def visitArray(self, ctx: CobraParser.ScalesContext):
        array = []

        if len(ctx.POINTS()) > 0:
            try:
                init = self.visit(ctx.expr(0))
                end = self.visit(ctx.expr(1)) + 1
                step = 1

                if ctx.step is not None:
                    step = self.visit(ctx.expr(1))
                    end = self.visit(ctx.expr(2)) + 1

                if type(init) is float or type(end) is float or type(step) is float:
                    init = float(init)
                    step = float(step)
                    end = float(end)
                else:
                    init = int(init)
                    step = int(step)
                    end = int(end)

                array = list(arange(init, end, step))
            except Exception as e:
                print(e)
                raise Exception("Error: Variable types are not numeric.")

        else:
            items = ctx.expr()

        for item in items:
            value = self.visit(item)
            array.append(value)

        return array
