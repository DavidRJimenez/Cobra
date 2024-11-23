# Generated from Cobra.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .CobraParser import CobraParser
else:
    from CobraParser import CobraParser

# This class defines a complete listener for a parse tree produced by CobraParser.
class CobraListener(ParseTreeListener):

    # Enter a parse tree produced by CobraParser#parse.
    def enterParse(self, ctx:CobraParser.ParseContext):
        pass

    # Exit a parse tree produced by CobraParser#parse.
    def exitParse(self, ctx:CobraParser.ParseContext):
        pass


    # Enter a parse tree produced by CobraParser#from_input.
    def enterFrom_input(self, ctx:CobraParser.From_inputContext):
        pass

    # Exit a parse tree produced by CobraParser#from_input.
    def exitFrom_input(self, ctx:CobraParser.From_inputContext):
        pass


    # Enter a parse tree produced by CobraParser#from_file.
    def enterFrom_file(self, ctx:CobraParser.From_fileContext):
        pass

    # Exit a parse tree produced by CobraParser#from_file.
    def exitFrom_file(self, ctx:CobraParser.From_fileContext):
        pass


    # Enter a parse tree produced by CobraParser#stat.
    def enterStat(self, ctx:CobraParser.StatContext):
        pass

    # Exit a parse tree produced by CobraParser#stat.
    def exitStat(self, ctx:CobraParser.StatContext):
        pass


    # Enter a parse tree produced by CobraParser#compound_stat.
    def enterCompound_stat(self, ctx:CobraParser.Compound_statContext):
        pass

    # Exit a parse tree produced by CobraParser#compound_stat.
    def exitCompound_stat(self, ctx:CobraParser.Compound_statContext):
        pass


    # Enter a parse tree produced by CobraParser#simple_stat.
    def enterSimple_stat(self, ctx:CobraParser.Simple_statContext):
        pass

    # Exit a parse tree produced by CobraParser#simple_stat.
    def exitSimple_stat(self, ctx:CobraParser.Simple_statContext):
        pass


    # Enter a parse tree produced by CobraParser#notExpr.
    def enterNotExpr(self, ctx:CobraParser.NotExprContext):
        pass

    # Exit a parse tree produced by CobraParser#notExpr.
    def exitNotExpr(self, ctx:CobraParser.NotExprContext):
        pass


    # Enter a parse tree produced by CobraParser#addSubExpr.
    def enterAddSubExpr(self, ctx:CobraParser.AddSubExprContext):
        pass

    # Exit a parse tree produced by CobraParser#addSubExpr.
    def exitAddSubExpr(self, ctx:CobraParser.AddSubExprContext):
        pass


    # Enter a parse tree produced by CobraParser#unaryMinusExpr.
    def enterUnaryMinusExpr(self, ctx:CobraParser.UnaryMinusExprContext):
        pass

    # Exit a parse tree produced by CobraParser#unaryMinusExpr.
    def exitUnaryMinusExpr(self, ctx:CobraParser.UnaryMinusExprContext):
        pass


    # Enter a parse tree produced by CobraParser#atomExpr.
    def enterAtomExpr(self, ctx:CobraParser.AtomExprContext):
        pass

    # Exit a parse tree produced by CobraParser#atomExpr.
    def exitAtomExpr(self, ctx:CobraParser.AtomExprContext):
        pass


    # Enter a parse tree produced by CobraParser#orExpr.
    def enterOrExpr(self, ctx:CobraParser.OrExprContext):
        pass

    # Exit a parse tree produced by CobraParser#orExpr.
    def exitOrExpr(self, ctx:CobraParser.OrExprContext):
        pass


    # Enter a parse tree produced by CobraParser#multDivModExpr.
    def enterMultDivModExpr(self, ctx:CobraParser.MultDivModExprContext):
        pass

    # Exit a parse tree produced by CobraParser#multDivModExpr.
    def exitMultDivModExpr(self, ctx:CobraParser.MultDivModExprContext):
        pass


    # Enter a parse tree produced by CobraParser#powExpr.
    def enterPowExpr(self, ctx:CobraParser.PowExprContext):
        pass

    # Exit a parse tree produced by CobraParser#powExpr.
    def exitPowExpr(self, ctx:CobraParser.PowExprContext):
        pass


    # Enter a parse tree produced by CobraParser#relationalExpr.
    def enterRelationalExpr(self, ctx:CobraParser.RelationalExprContext):
        pass

    # Exit a parse tree produced by CobraParser#relationalExpr.
    def exitRelationalExpr(self, ctx:CobraParser.RelationalExprContext):
        pass


    # Enter a parse tree produced by CobraParser#parenExpr.
    def enterParenExpr(self, ctx:CobraParser.ParenExprContext):
        pass

    # Exit a parse tree produced by CobraParser#parenExpr.
    def exitParenExpr(self, ctx:CobraParser.ParenExprContext):
        pass


    # Enter a parse tree produced by CobraParser#equalityExpr.
    def enterEqualityExpr(self, ctx:CobraParser.EqualityExprContext):
        pass

    # Exit a parse tree produced by CobraParser#equalityExpr.
    def exitEqualityExpr(self, ctx:CobraParser.EqualityExprContext):
        pass


    # Enter a parse tree produced by CobraParser#andExpr.
    def enterAndExpr(self, ctx:CobraParser.AndExprContext):
        pass

    # Exit a parse tree produced by CobraParser#andExpr.
    def exitAndExpr(self, ctx:CobraParser.AndExprContext):
        pass


    # Enter a parse tree produced by CobraParser#numericAtom.
    def enterNumericAtom(self, ctx:CobraParser.NumericAtomContext):
        pass

    # Exit a parse tree produced by CobraParser#numericAtom.
    def exitNumericAtom(self, ctx:CobraParser.NumericAtomContext):
        pass


    # Enter a parse tree produced by CobraParser#booleanAtom.
    def enterBooleanAtom(self, ctx:CobraParser.BooleanAtomContext):
        pass

    # Exit a parse tree produced by CobraParser#booleanAtom.
    def exitBooleanAtom(self, ctx:CobraParser.BooleanAtomContext):
        pass


    # Enter a parse tree produced by CobraParser#stringAtom.
    def enterStringAtom(self, ctx:CobraParser.StringAtomContext):
        pass

    # Exit a parse tree produced by CobraParser#stringAtom.
    def exitStringAtom(self, ctx:CobraParser.StringAtomContext):
        pass


    # Enter a parse tree produced by CobraParser#arrayAtom.
    def enterArrayAtom(self, ctx:CobraParser.ArrayAtomContext):
        pass

    # Exit a parse tree produced by CobraParser#arrayAtom.
    def exitArrayAtom(self, ctx:CobraParser.ArrayAtomContext):
        pass


    # Enter a parse tree produced by CobraParser#objectAtom.
    def enterObjectAtom(self, ctx:CobraParser.ObjectAtomContext):
        pass

    # Exit a parse tree produced by CobraParser#objectAtom.
    def exitObjectAtom(self, ctx:CobraParser.ObjectAtomContext):
        pass


    # Enter a parse tree produced by CobraParser#grabScaleAtoms.
    def enterGrabScaleAtoms(self, ctx:CobraParser.GrabScaleAtomsContext):
        pass

    # Exit a parse tree produced by CobraParser#grabScaleAtoms.
    def exitGrabScaleAtoms(self, ctx:CobraParser.GrabScaleAtomsContext):
        pass


    # Enter a parse tree produced by CobraParser#accessVariableAtom.
    def enterAccessVariableAtom(self, ctx:CobraParser.AccessVariableAtomContext):
        pass

    # Exit a parse tree produced by CobraParser#accessVariableAtom.
    def exitAccessVariableAtom(self, ctx:CobraParser.AccessVariableAtomContext):
        pass


    # Enter a parse tree produced by CobraParser#nullAtom.
    def enterNullAtom(self, ctx:CobraParser.NullAtomContext):
        pass

    # Exit a parse tree produced by CobraParser#nullAtom.
    def exitNullAtom(self, ctx:CobraParser.NullAtomContext):
        pass


    # Enter a parse tree produced by CobraParser#scales.
    def enterScales(self, ctx:CobraParser.ScalesContext):
        pass

    # Exit a parse tree produced by CobraParser#scales.
    def exitScales(self, ctx:CobraParser.ScalesContext):
        pass


    # Enter a parse tree produced by CobraParser#snake.
    def enterSnake(self, ctx:CobraParser.SnakeContext):
        pass

    # Exit a parse tree produced by CobraParser#snake.
    def exitSnake(self, ctx:CobraParser.SnakeContext):
        pass


    # Enter a parse tree produced by CobraParser#grabScale.
    def enterGrabScale(self, ctx:CobraParser.GrabScaleContext):
        pass

    # Exit a parse tree produced by CobraParser#grabScale.
    def exitGrabScale(self, ctx:CobraParser.GrabScaleContext):
        pass


    # Enter a parse tree produced by CobraParser#keyvalue.
    def enterKeyvalue(self, ctx:CobraParser.KeyvalueContext):
        pass

    # Exit a parse tree produced by CobraParser#keyvalue.
    def exitKeyvalue(self, ctx:CobraParser.KeyvalueContext):
        pass


    # Enter a parse tree produced by CobraParser#variable.
    def enterVariable(self, ctx:CobraParser.VariableContext):
        pass

    # Exit a parse tree produced by CobraParser#variable.
    def exitVariable(self, ctx:CobraParser.VariableContext):
        pass


    # Enter a parse tree produced by CobraParser#spit.
    def enterSpit(self, ctx:CobraParser.SpitContext):
        pass

    # Exit a parse tree produced by CobraParser#spit.
    def exitSpit(self, ctx:CobraParser.SpitContext):
        pass


    # Enter a parse tree produced by CobraParser#bite.
    def enterBite(self, ctx:CobraParser.BiteContext):
        pass

    # Exit a parse tree produced by CobraParser#bite.
    def exitBite(self, ctx:CobraParser.BiteContext):
        pass


    # Enter a parse tree produced by CobraParser#hiss.
    def enterHiss(self, ctx:CobraParser.HissContext):
        pass

    # Exit a parse tree produced by CobraParser#hiss.
    def exitHiss(self, ctx:CobraParser.HissContext):
        pass


    # Enter a parse tree produced by CobraParser#statement.
    def enterStatement(self, ctx:CobraParser.StatementContext):
        pass

    # Exit a parse tree produced by CobraParser#statement.
    def exitStatement(self, ctx:CobraParser.StatementContext):
        pass


    # Enter a parse tree produced by CobraParser#assignment.
    def enterAssignment(self, ctx:CobraParser.AssignmentContext):
        pass

    # Exit a parse tree produced by CobraParser#assignment.
    def exitAssignment(self, ctx:CobraParser.AssignmentContext):
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


    # Enter a parse tree produced by CobraParser#condition_block.
    def enterCondition_block(self, ctx:CobraParser.Condition_blockContext):
        pass

    # Exit a parse tree produced by CobraParser#condition_block.
    def exitCondition_block(self, ctx:CobraParser.Condition_blockContext):
        pass


    # Enter a parse tree produced by CobraParser#parameter.
    def enterParameter(self, ctx:CobraParser.ParameterContext):
        pass

    # Exit a parse tree produced by CobraParser#parameter.
    def exitParameter(self, ctx:CobraParser.ParameterContext):
        pass


    # Enter a parse tree produced by CobraParser#mlTraining.
    def enterMlTraining(self, ctx:CobraParser.MlTrainingContext):
        pass

    # Exit a parse tree produced by CobraParser#mlTraining.
    def exitMlTraining(self, ctx:CobraParser.MlTrainingContext):
        pass


    # Enter a parse tree produced by CobraParser#snaketronTraining.
    def enterSnaketronTraining(self, ctx:CobraParser.SnaketronTrainingContext):
        pass

    # Exit a parse tree produced by CobraParser#snaketronTraining.
    def exitSnaketronTraining(self, ctx:CobraParser.SnaketronTrainingContext):
        pass


    # Enter a parse tree produced by CobraParser#stat_block.
    def enterStat_block(self, ctx:CobraParser.Stat_blockContext):
        pass

    # Exit a parse tree produced by CobraParser#stat_block.
    def exitStat_block(self, ctx:CobraParser.Stat_blockContext):
        pass


    # Enter a parse tree produced by CobraParser#makeNest.
    def enterMakeNest(self, ctx:CobraParser.MakeNestContext):
        pass

    # Exit a parse tree produced by CobraParser#makeNest.
    def exitMakeNest(self, ctx:CobraParser.MakeNestContext):
        pass


    # Enter a parse tree produced by CobraParser#fileHandling.
    def enterFileHandling(self, ctx:CobraParser.FileHandlingContext):
        pass

    # Exit a parse tree produced by CobraParser#fileHandling.
    def exitFileHandling(self, ctx:CobraParser.FileHandlingContext):
        pass



del CobraParser