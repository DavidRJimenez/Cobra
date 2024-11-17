# Generated from Cobra.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .CobraParser import CobraParser
else:
    from CobraParser import CobraParser

# This class defines a complete listener for a parse tree produced by CobraParser.
class CobraListener(ParseTreeListener):

    # Enter a parse tree produced by CobraParser#program.
    def enterProgram(self, ctx:CobraParser.ProgramContext):
        pass

    # Exit a parse tree produced by CobraParser#program.
    def exitProgram(self, ctx:CobraParser.ProgramContext):
        pass


    # Enter a parse tree produced by CobraParser#statement.
    def enterStatement(self, ctx:CobraParser.StatementContext):
        pass

    # Exit a parse tree produced by CobraParser#statement.
    def exitStatement(self, ctx:CobraParser.StatementContext):
        pass


    # Enter a parse tree produced by CobraParser#variableDeclaration.
    def enterVariableDeclaration(self, ctx:CobraParser.VariableDeclarationContext):
        pass

    # Exit a parse tree produced by CobraParser#variableDeclaration.
    def exitVariableDeclaration(self, ctx:CobraParser.VariableDeclarationContext):
        pass


    # Enter a parse tree produced by CobraParser#assignment.
    def enterAssignment(self, ctx:CobraParser.AssignmentContext):
        pass

    # Exit a parse tree produced by CobraParser#assignment.
    def exitAssignment(self, ctx:CobraParser.AssignmentContext):
        pass


    # Enter a parse tree produced by CobraParser#expression.
    def enterExpression(self, ctx:CobraParser.ExpressionContext):
        pass

    # Exit a parse tree produced by CobraParser#expression.
    def exitExpression(self, ctx:CobraParser.ExpressionContext):
        pass


    # Enter a parse tree produced by CobraParser#controlStructure.
    def enterControlStructure(self, ctx:CobraParser.ControlStructureContext):
        pass

    # Exit a parse tree produced by CobraParser#controlStructure.
    def exitControlStructure(self, ctx:CobraParser.ControlStructureContext):
        pass


    # Enter a parse tree produced by CobraParser#ifStatement.
    def enterIfStatement(self, ctx:CobraParser.IfStatementContext):
        pass

    # Exit a parse tree produced by CobraParser#ifStatement.
    def exitIfStatement(self, ctx:CobraParser.IfStatementContext):
        pass


    # Enter a parse tree produced by CobraParser#forLoop.
    def enterForLoop(self, ctx:CobraParser.ForLoopContext):
        pass

    # Exit a parse tree produced by CobraParser#forLoop.
    def exitForLoop(self, ctx:CobraParser.ForLoopContext):
        pass


    # Enter a parse tree produced by CobraParser#dataPlotting.
    def enterDataPlotting(self, ctx:CobraParser.DataPlottingContext):
        pass

    # Exit a parse tree produced by CobraParser#dataPlotting.
    def exitDataPlotting(self, ctx:CobraParser.DataPlottingContext):
        pass


    # Enter a parse tree produced by CobraParser#whileLoop.
    def enterWhileLoop(self, ctx:CobraParser.WhileLoopContext):
        pass

    # Exit a parse tree produced by CobraParser#whileLoop.
    def exitWhileLoop(self, ctx:CobraParser.WhileLoopContext):
        pass


    # Enter a parse tree produced by CobraParser#functionDeclaration.
    def enterFunctionDeclaration(self, ctx:CobraParser.FunctionDeclarationContext):
        pass

    # Exit a parse tree produced by CobraParser#functionDeclaration.
    def exitFunctionDeclaration(self, ctx:CobraParser.FunctionDeclarationContext):
        pass


    # Enter a parse tree produced by CobraParser#perceptronTraining.
    def enterPerceptronTraining(self, ctx:CobraParser.PerceptronTrainingContext):
        pass

    # Exit a parse tree produced by CobraParser#perceptronTraining.
    def exitPerceptronTraining(self, ctx:CobraParser.PerceptronTrainingContext):
        pass


    # Enter a parse tree produced by CobraParser#fileHandling.
    def enterFileHandling(self, ctx:CobraParser.FileHandlingContext):
        pass

    # Exit a parse tree produced by CobraParser#fileHandling.
    def exitFileHandling(self, ctx:CobraParser.FileHandlingContext):
        pass



del CobraParser