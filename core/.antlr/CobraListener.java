// Generated from /home/pissarello-dev/Documentos/Code/univerity/semestre-v/lpt/Cobra/core/Cobra.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CobraParser}.
 */
public interface CobraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CobraParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(CobraParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(CobraParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#from_input}.
	 * @param ctx the parse tree
	 */
	void enterFrom_input(CobraParser.From_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#from_input}.
	 * @param ctx the parse tree
	 */
	void exitFrom_input(CobraParser.From_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#from_file}.
	 * @param ctx the parse tree
	 */
	void enterFrom_file(CobraParser.From_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#from_file}.
	 * @param ctx the parse tree
	 */
	void exitFrom_file(CobraParser.From_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CobraParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CobraParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#compound_stat}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stat(CobraParser.Compound_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#compound_stat}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stat(CobraParser.Compound_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#simple_stat}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stat(CobraParser.Simple_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#simple_stat}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stat(CobraParser.Simple_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(CobraParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(CobraParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(CobraParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(CobraParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(CobraParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(CobraParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(CobraParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(CobraParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(CobraParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(CobraParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDivModExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivModExpr(CobraParser.MultDivModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDivModExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivModExpr(CobraParser.MultDivModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(CobraParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(CobraParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(CobraParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(CobraParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(CobraParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(CobraParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(CobraParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(CobraParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(CobraParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link CobraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(CobraParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericAtom}
	 * labeled alternative in {@link CobraParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumericAtom(CobraParser.NumericAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericAtom}
	 * labeled alternative in {@link CobraParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumericAtom(CobraParser.NumericAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link CobraParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(CobraParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link CobraParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(CobraParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link CobraParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(CobraParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link CobraParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(CobraParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAtom}
	 * labeled alternative in {@link CobraParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterArrayAtom(CobraParser.ArrayAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAtom}
	 * labeled alternative in {@link CobraParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitArrayAtom(CobraParser.ArrayAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectAtom}
	 * labeled alternative in {@link CobraParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterObjectAtom(CobraParser.ObjectAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectAtom}
	 * labeled alternative in {@link CobraParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitObjectAtom(CobraParser.ObjectAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grabScaleAtom}
	 * labeled alternative in {@link CobraParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterGrabScaleAtom(CobraParser.GrabScaleAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grabScaleAtom}
	 * labeled alternative in {@link CobraParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitGrabScaleAtom(CobraParser.GrabScaleAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accessVariableAtom}
	 * labeled alternative in {@link CobraParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAccessVariableAtom(CobraParser.AccessVariableAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accessVariableAtom}
	 * labeled alternative in {@link CobraParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAccessVariableAtom(CobraParser.AccessVariableAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullAtom}
	 * labeled alternative in {@link CobraParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNullAtom(CobraParser.NullAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullAtom}
	 * labeled alternative in {@link CobraParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNullAtom(CobraParser.NullAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#scales}.
	 * @param ctx the parse tree
	 */
	void enterScales(CobraParser.ScalesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#scales}.
	 * @param ctx the parse tree
	 */
	void exitScales(CobraParser.ScalesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#matrix_row}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_row(CobraParser.Matrix_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#matrix_row}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_row(CobraParser.Matrix_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#snake}.
	 * @param ctx the parse tree
	 */
	void enterSnake(CobraParser.SnakeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#snake}.
	 * @param ctx the parse tree
	 */
	void exitSnake(CobraParser.SnakeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#grabScale}.
	 * @param ctx the parse tree
	 */
	void enterGrabScale(CobraParser.GrabScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#grabScale}.
	 * @param ctx the parse tree
	 */
	void exitGrabScale(CobraParser.GrabScaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void enterKeyvalue(CobraParser.KeyvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void exitKeyvalue(CobraParser.KeyvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CobraParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CobraParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#spit}.
	 * @param ctx the parse tree
	 */
	void enterSpit(CobraParser.SpitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#spit}.
	 * @param ctx the parse tree
	 */
	void exitSpit(CobraParser.SpitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#bite}.
	 * @param ctx the parse tree
	 */
	void enterBite(CobraParser.BiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#bite}.
	 * @param ctx the parse tree
	 */
	void exitBite(CobraParser.BiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#hiss}.
	 * @param ctx the parse tree
	 */
	void enterHiss(CobraParser.HissContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#hiss}.
	 * @param ctx the parse tree
	 */
	void exitHiss(CobraParser.HissContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CobraParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CobraParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CobraParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CobraParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#controlStructure}.
	 * @param ctx the parse tree
	 */
	void enterControlStructure(CobraParser.ControlStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#controlStructure}.
	 * @param ctx the parse tree
	 */
	void exitControlStructure(CobraParser.ControlStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CobraParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CobraParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(CobraParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(CobraParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#dataPlotting}.
	 * @param ctx the parse tree
	 */
	void enterDataPlotting(CobraParser.DataPlottingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#dataPlotting}.
	 * @param ctx the parse tree
	 */
	void exitDataPlotting(CobraParser.DataPlottingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(CobraParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(CobraParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(CobraParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(CobraParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(CobraParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(CobraParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CobraParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CobraParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#mlTraining}.
	 * @param ctx the parse tree
	 */
	void enterMlTraining(CobraParser.MlTrainingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#mlTraining}.
	 * @param ctx the parse tree
	 */
	void exitMlTraining(CobraParser.MlTrainingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#snaketronTraining}.
	 * @param ctx the parse tree
	 */
	void enterSnaketronTraining(CobraParser.SnaketronTrainingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#snaketronTraining}.
	 * @param ctx the parse tree
	 */
	void exitSnaketronTraining(CobraParser.SnaketronTrainingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(CobraParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(CobraParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#makeNest}.
	 * @param ctx the parse tree
	 */
	void enterMakeNest(CobraParser.MakeNestContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#makeNest}.
	 * @param ctx the parse tree
	 */
	void exitMakeNest(CobraParser.MakeNestContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobraParser#fileHandling}.
	 * @param ctx the parse tree
	 */
	void enterFileHandling(CobraParser.FileHandlingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#fileHandling}.
	 * @param ctx the parse tree
	 */
	void exitFileHandling(CobraParser.FileHandlingContext ctx);
}