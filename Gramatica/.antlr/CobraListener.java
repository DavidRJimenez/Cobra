// Generated from /home/pissarello-dev/Documentos/Code/univerity/semestre-v/lpt/Cobra/Gramatica/Cobra.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CobraParser}.
 */
public interface CobraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CobraParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CobraParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CobraParser.ProgramContext ctx);
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
	 * Enter a parse tree produced by {@link CobraParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(CobraParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(CobraParser.VariableDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link CobraParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CobraParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CobraParser.ExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link CobraParser#perceptronTraining}.
	 * @param ctx the parse tree
	 */
	void enterPerceptronTraining(CobraParser.PerceptronTrainingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobraParser#perceptronTraining}.
	 * @param ctx the parse tree
	 */
	void exitPerceptronTraining(CobraParser.PerceptronTrainingContext ctx);
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