# Generated from Cobra.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from ..CobraParser import CobraParser
else:
    from CobraParser import CobraParser

# This class defines a complete generic visitor for a parse tree produced by CobraParser.

class CobraVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by CobraParser#program.
    def visitProgram(self, ctx:CobraParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#statement.
    def visitStatement(self, ctx:CobraParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#variableDeclaration.
    def visitVariableDeclaration(self, ctx:CobraParser.VariableDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#assignment.
    def visitAssignment(self, ctx:CobraParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#expression.
    def visitExpression(self, ctx:CobraParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#controlStructure.
    def visitControlStructure(self, ctx:CobraParser.ControlStructureContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#ifStatement.
    def visitIfStatement(self, ctx:CobraParser.IfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#forLoop.
    def visitForLoop(self, ctx:CobraParser.ForLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#dataPlotting.
    def visitDataPlotting(self, ctx:CobraParser.DataPlottingContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#whileLoop.
    def visitWhileLoop(self, ctx:CobraParser.WhileLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#functionDeclaration.
    def visitFunctionDeclaration(self, ctx:CobraParser.FunctionDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#perceptronTraining.
    def visitPerceptronTraining(self, ctx:CobraParser.PerceptronTrainingContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#fileHandling.
    def visitFileHandling(self, ctx:CobraParser.FileHandlingContext):
        return self.visitChildren(ctx)



del CobraParser