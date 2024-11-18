# Generated from Cobra.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .CobraParser import CobraParser
else:
    from CobraParser import CobraParser

# This class defines a complete generic visitor for a parse tree produced by CobraParser.

class CobraVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by CobraParser#parse.
    def visitParse(self, ctx:CobraParser.ParseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#from_input.
    def visitFrom_input(self, ctx:CobraParser.From_inputContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#from_file.
    def visitFrom_file(self, ctx:CobraParser.From_fileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#stat.
    def visitStat(self, ctx:CobraParser.StatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#compound_stat.
    def visitCompound_stat(self, ctx:CobraParser.Compound_statContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#simple_stat.
    def visitSimple_stat(self, ctx:CobraParser.Simple_statContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#notExpr.
    def visitNotExpr(self, ctx:CobraParser.NotExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#addSubExpr.
    def visitAddSubExpr(self, ctx:CobraParser.AddSubExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#unaryMinusExpr.
    def visitUnaryMinusExpr(self, ctx:CobraParser.UnaryMinusExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#atomExpr.
    def visitAtomExpr(self, ctx:CobraParser.AtomExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#orExpr.
    def visitOrExpr(self, ctx:CobraParser.OrExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#multDivModExpr.
    def visitMultDivModExpr(self, ctx:CobraParser.MultDivModExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#powExpr.
    def visitPowExpr(self, ctx:CobraParser.PowExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#relationalExpr.
    def visitRelationalExpr(self, ctx:CobraParser.RelationalExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#parenExpr.
    def visitParenExpr(self, ctx:CobraParser.ParenExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#equalityExpr.
    def visitEqualityExpr(self, ctx:CobraParser.EqualityExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#andExpr.
    def visitAndExpr(self, ctx:CobraParser.AndExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#numericAtom.
    def visitNumericAtom(self, ctx:CobraParser.NumericAtomContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#booleanAtom.
    def visitBooleanAtom(self, ctx:CobraParser.BooleanAtomContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#stringAtom.
    def visitStringAtom(self, ctx:CobraParser.StringAtomContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#arrayAtom.
    def visitArrayAtom(self, ctx:CobraParser.ArrayAtomContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#objectAtom.
    def visitObjectAtom(self, ctx:CobraParser.ObjectAtomContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#grabScaleAtom.
    def visitGrabScaleAtom(self, ctx:CobraParser.GrabScaleAtomContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#accessVariableAtom.
    def visitAccessVariableAtom(self, ctx:CobraParser.AccessVariableAtomContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#nullAtom.
    def visitNullAtom(self, ctx:CobraParser.NullAtomContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#scales.
    def visitScales(self, ctx:CobraParser.ScalesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#snake.
    def visitSnake(self, ctx:CobraParser.SnakeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#grabScale.
    def visitGrabScale(self, ctx:CobraParser.GrabScaleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#keyvalue.
    def visitKeyvalue(self, ctx:CobraParser.KeyvalueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#variable.
    def visitVariable(self, ctx:CobraParser.VariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#spit.
    def visitSpit(self, ctx:CobraParser.SpitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#bite.
    def visitBite(self, ctx:CobraParser.BiteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#hiss.
    def visitHiss(self, ctx:CobraParser.HissContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#statement.
    def visitStatement(self, ctx:CobraParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#assignment.
    def visitAssignment(self, ctx:CobraParser.AssignmentContext):
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


    # Visit a parse tree produced by CobraParser#condition_block.
    def visitCondition_block(self, ctx:CobraParser.Condition_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#parameter.
    def visitParameter(self, ctx:CobraParser.ParameterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#mlTraining.
    def visitMlTraining(self, ctx:CobraParser.MlTrainingContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#snaketronTraining.
    def visitSnaketronTraining(self, ctx:CobraParser.SnaketronTrainingContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#stat_block.
    def visitStat_block(self, ctx:CobraParser.Stat_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#makeNest.
    def visitMakeNest(self, ctx:CobraParser.MakeNestContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CobraParser#fileHandling.
    def visitFileHandling(self, ctx:CobraParser.FileHandlingContext):
        return self.visitChildren(ctx)



del CobraParser