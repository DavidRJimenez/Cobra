from antlr4 import FileStream, InputStream, CommonTokenStream
from core.CobraLexer import CobraLexer
from core.CobraParser import CobraParser
from core.Visitor import Visitor
import sys

from antlr4.error.ErrorListener import ErrorListener


class MyErrorListener(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        print(str(line) + ":" + str(column) + ": sintax ERROR, " + str(msg))

    def reportAmbiguity(
        self, recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs
    ):
        print("Ambiguity ERROR, " + str(configs))

    def reportAttemptingFullContext(
        self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs
    ):
        print("Attempting full context ERROR, " + str(configs))

    def reportContextSensitivity(
        self, recognizer, dfa, startIndex, stopIndex, prediction, configs
    ):
        print("Context ERROR, " + str(configs))


def main():

    print("----- Cobra v1.0 -----\n")

    visitor = Visitor()

    if len(sys.argv) > 1:
        try:
            input_stream = FileStream(sys.argv[1])
        except Exception:
            raise Exception("File not Found.")

        lexer = CobraLexer(input_stream)
        token_stream = CommonTokenStream(lexer)
        parser = CobraParser(token_stream)
        tree = parser.from_file()

        visitor.visit(tree)
    else:
        while True:
            print(">>> ", end="", flush=True)
            input_data = sys.stdin.readline().strip()
            tabs = (
                input_data.count("{")
                + input_data.count("funcion")
                - input_data.count("}")
                - input_data.count("end")
            )

            if "exit()" in input_data:
                print("Message: Console terminated")
                break

            while tabs > 0:
                print("... ", end="", flush=True)
                input_data = input_data + sys.stdin.readline()
                tabs = (
                    input_data.count("{")
                    + input_data.count("funcion")
                    - input_data.count("}")
                    - input_data.count("end")
                )

            input_stream = InputStream(input_data)

            lexer = CobraLexer(input_stream)
            token_stream = CommonTokenStream(lexer)
            parser = CobraParser(token_stream)
            parser._listeners = [MyErrorListener()]
            tree = parser.parse()

            result = None
            try:
                result = visitor.visit(tree)
            except Exception as e:
                if type(e) != AttributeError:
                    print(e)

            if result is not None:
                print(result)


if __name__ == "__main__":
    main()
