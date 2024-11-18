__author__ = 'MateoPissarello'

import sys
from antlr4 import FileStream, CommonTokenStream
from antlr4.InputStream import InputStream
from CobraLexer import CobraLexer
from CobraParser import CobraParser
from Visitor import Visitor

if __name__ == '__main__':
    if len(sys.argv) > 1:
        input_stream = FileStream(sys.argv[1])
    else:
        input_stream = InputStream(sys.stdin.readline())

    lexer = CobraLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = CobraParser(token_stream)
    tree = parser.prog()

    visitor = Visitor()
    visitor.visit(tree)