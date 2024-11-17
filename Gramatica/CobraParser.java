// Generated from Cobra.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CobraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, ID=22, INT=23, FLOAT=24, STRING=25, 
		WS=26;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variableDeclaration = 2, RULE_assignment = 3, 
		RULE_expression = 4, RULE_controlStructure = 5, RULE_ifStatement = 6, 
		RULE_forLoop = 7, RULE_dataPlotting = 8, RULE_whileLoop = 9, RULE_functionDeclaration = 10, 
		RULE_perceptronTraining = 11, RULE_fileHandling = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variableDeclaration", "assignment", "expression", 
			"controlStructure", "ifStatement", "forLoop", "dataPlotting", "whileLoop", 
			"functionDeclaration", "perceptronTraining", "fileHandling"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'='", "';'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", 
			"'if'", "'{'", "'}'", "'for'", "'in'", "'plot'", "'while'", "'func'", 
			"','", "'train_perceptron'", "'read_file'", "'write_file'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "ID", "INT", 
			"FLOAT", "STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Cobra.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CobraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CobraParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				statement();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 33268994L) != 0) );
			setState(31);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ControlStructureContext controlStructure() {
			return getRuleContext(ControlStructureContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PerceptronTrainingContext perceptronTraining() {
			return getRuleContext(PerceptronTrainingContext.class,0);
		}
		public DataPlottingContext dataPlotting() {
			return getRuleContext(DataPlottingContext.class,0);
		}
		public FileHandlingContext fileHandling() {
			return getRuleContext(FileHandlingContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				controlStructure();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				functionDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(38);
				perceptronTraining();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(39);
				dataPlotting();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(40);
				fileHandling();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CobraParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			match(ID);
			setState(45);
			match(T__1);
			setState(46);
			expression(0);
			setState(47);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CobraParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(ID);
			setState(50);
			match(T__1);
			setState(51);
			expression(0);
			setState(52);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CobraParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CobraParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(CobraParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(55);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(56);
				match(FLOAT);
				}
				break;
			case ID:
				{
				setState(57);
				match(ID);
				}
				break;
			case T__7:
				{
				setState(58);
				match(T__7);
				setState(59);
				expression(0);
				setState(60);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(64);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(65);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(66);
					expression(6);
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ControlStructureContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ControlStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).enterControlStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).exitControlStructure(this);
		}
	}

	public final ControlStructureContext controlStructure() throws RecognitionException {
		ControlStructureContext _localctx = new ControlStructureContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_controlStructure);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				ifStatement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				forLoop();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				whileLoop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__9);
			setState(78);
			match(T__7);
			setState(79);
			expression(0);
			setState(80);
			match(T__8);
			setState(81);
			match(T__10);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33268994L) != 0)) {
				{
				{
				setState(82);
				statement();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CobraParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__12);
			setState(91);
			match(T__7);
			setState(92);
			match(ID);
			setState(93);
			match(T__13);
			setState(94);
			expression(0);
			setState(95);
			match(T__8);
			setState(96);
			match(T__10);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33268994L) != 0)) {
				{
				{
				setState(97);
				statement();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataPlottingContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CobraParser.ID, 0); }
		public TerminalNode STRING() { return getToken(CobraParser.STRING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DataPlottingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataPlotting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).enterDataPlotting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).exitDataPlotting(this);
		}
	}

	public final DataPlottingContext dataPlotting() throws RecognitionException {
		DataPlottingContext _localctx = new DataPlottingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dataPlotting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__14);
			setState(106);
			match(T__7);
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(107);
				match(ID);
				}
				break;
			case 2:
				{
				setState(108);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(109);
				expression(0);
				}
				break;
			}
			setState(112);
			match(T__8);
			setState(113);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__15);
			setState(116);
			match(T__7);
			setState(117);
			expression(0);
			setState(118);
			match(T__8);
			setState(119);
			match(T__10);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33268994L) != 0)) {
				{
				{
				setState(120);
				statement();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CobraParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CobraParser.ID, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__16);
			setState(129);
			match(ID);
			setState(130);
			match(T__7);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(131);
				match(ID);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(132);
					match(T__17);
					setState(133);
					match(ID);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(141);
			match(T__8);
			setState(142);
			match(T__10);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33268994L) != 0)) {
				{
				{
				setState(143);
				statement();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PerceptronTrainingContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CobraParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CobraParser.ID, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public PerceptronTrainingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perceptronTraining; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).enterPerceptronTraining(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).exitPerceptronTraining(this);
		}
	}

	public final PerceptronTrainingContext perceptronTraining() throws RecognitionException {
		PerceptronTrainingContext _localctx = new PerceptronTrainingContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_perceptronTraining);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__18);
			setState(152);
			match(T__7);
			setState(153);
			match(ID);
			setState(154);
			match(T__17);
			setState(155);
			match(ID);
			setState(156);
			match(T__8);
			setState(157);
			match(T__10);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33268994L) != 0)) {
				{
				{
				setState(158);
				statement();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileHandlingContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CobraParser.STRING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FileHandlingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileHandling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).enterFileHandling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobraListener ) ((CobraListener)listener).exitFileHandling(this);
		}
	}

	public final FileHandlingContext fileHandling() throws RecognitionException {
		FileHandlingContext _localctx = new FileHandlingContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fileHandling);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__19);
				setState(167);
				match(T__7);
				setState(168);
				match(STRING);
				setState(169);
				match(T__8);
				setState(170);
				match(T__2);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(T__20);
				setState(172);
				match(T__7);
				setState(173);
				match(STRING);
				setState(174);
				match(T__17);
				setState(175);
				expression(0);
				setState(176);
				match(T__8);
				setState(177);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u00b6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000"+
		"\u001d\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004?\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004D\b\u0004\n\u0004\f\u0004G\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005L\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006T\b\u0006\n\u0006"+
		"\f\u0006W\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007c\b\u0007\n\u0007\f\u0007f\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bo\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tz\b\t\n\t\f"+
		"\t}\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u0087\b\n\n\n\f\n\u008a\t\n\u0003\n\u008c\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u0091\b\n\n\n\f\n\u0094\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00a0\b\u000b\n\u000b\f\u000b\u00a3\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b4\b\f\u0001"+
		"\f\u0000\u0001\b\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u0000\u0001\u0001\u0000\u0004\u0007\u00c0\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u0004+\u0001\u0000\u0000"+
		"\u0000\u00061\u0001\u0000\u0000\u0000\b>\u0001\u0000\u0000\u0000\nK\u0001"+
		"\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000\u000eZ\u0001\u0000\u0000"+
		"\u0000\u0010i\u0001\u0000\u0000\u0000\u0012s\u0001\u0000\u0000\u0000\u0014"+
		"\u0080\u0001\u0000\u0000\u0000\u0016\u0097\u0001\u0000\u0000\u0000\u0018"+
		"\u00b3\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b"+
		"\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d"+
		"\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0001\u0000\u0000\u0000\u001f \u0005\u0000\u0000\u0001 \u0001\u0001"+
		"\u0000\u0000\u0000!*\u0003\u0004\u0002\u0000\"*\u0003\u0006\u0003\u0000"+
		"#*\u0003\b\u0004\u0000$*\u0003\n\u0005\u0000%*\u0003\u0014\n\u0000&*\u0003"+
		"\u0016\u000b\u0000\'*\u0003\u0010\b\u0000(*\u0003\u0018\f\u0000)!\u0001"+
		"\u0000\u0000\u0000)\"\u0001\u0000\u0000\u0000)#\u0001\u0000\u0000\u0000"+
		")$\u0001\u0000\u0000\u0000)%\u0001\u0000\u0000\u0000)&\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*\u0003\u0001"+
		"\u0000\u0000\u0000+,\u0005\u0001\u0000\u0000,-\u0005\u0016\u0000\u0000"+
		"-.\u0005\u0002\u0000\u0000./\u0003\b\u0004\u0000/0\u0005\u0003\u0000\u0000"+
		"0\u0005\u0001\u0000\u0000\u000012\u0005\u0016\u0000\u000023\u0005\u0002"+
		"\u0000\u000034\u0003\b\u0004\u000045\u0005\u0003\u0000\u00005\u0007\u0001"+
		"\u0000\u0000\u000067\u0006\u0004\uffff\uffff\u00007?\u0005\u0017\u0000"+
		"\u00008?\u0005\u0018\u0000\u00009?\u0005\u0016\u0000\u0000:;\u0005\b\u0000"+
		"\u0000;<\u0003\b\u0004\u0000<=\u0005\t\u0000\u0000=?\u0001\u0000\u0000"+
		"\u0000>6\u0001\u0000\u0000\u0000>8\u0001\u0000\u0000\u0000>9\u0001\u0000"+
		"\u0000\u0000>:\u0001\u0000\u0000\u0000?E\u0001\u0000\u0000\u0000@A\n\u0005"+
		"\u0000\u0000AB\u0007\u0000\u0000\u0000BD\u0003\b\u0004\u0006C@\u0001\u0000"+
		"\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000F\t\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"HL\u0003\f\u0006\u0000IL\u0003\u000e\u0007\u0000JL\u0003\u0012\t\u0000"+
		"KH\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000"+
		"\u0000L\u000b\u0001\u0000\u0000\u0000MN\u0005\n\u0000\u0000NO\u0005\b"+
		"\u0000\u0000OP\u0003\b\u0004\u0000PQ\u0005\t\u0000\u0000QU\u0005\u000b"+
		"\u0000\u0000RT\u0003\u0002\u0001\u0000SR\u0001\u0000\u0000\u0000TW\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005\f\u0000\u0000"+
		"Y\r\u0001\u0000\u0000\u0000Z[\u0005\r\u0000\u0000[\\\u0005\b\u0000\u0000"+
		"\\]\u0005\u0016\u0000\u0000]^\u0005\u000e\u0000\u0000^_\u0003\b\u0004"+
		"\u0000_`\u0005\t\u0000\u0000`d\u0005\u000b\u0000\u0000ac\u0003\u0002\u0001"+
		"\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000gh\u0005\f\u0000\u0000h\u000f\u0001\u0000\u0000\u0000"+
		"ij\u0005\u000f\u0000\u0000jn\u0005\b\u0000\u0000ko\u0005\u0016\u0000\u0000"+
		"lo\u0005\u0019\u0000\u0000mo\u0003\b\u0004\u0000nk\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pq\u0005\t\u0000\u0000qr\u0005\u0003\u0000\u0000r\u0011\u0001\u0000"+
		"\u0000\u0000st\u0005\u0010\u0000\u0000tu\u0005\b\u0000\u0000uv\u0003\b"+
		"\u0004\u0000vw\u0005\t\u0000\u0000w{\u0005\u000b\u0000\u0000xz\u0003\u0002"+
		"\u0001\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000~\u007f\u0005\f\u0000\u0000\u007f\u0013\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0005\u0011\u0000\u0000\u0081\u0082\u0005"+
		"\u0016\u0000\u0000\u0082\u008b\u0005\b\u0000\u0000\u0083\u0088\u0005\u0016"+
		"\u0000\u0000\u0084\u0085\u0005\u0012\u0000\u0000\u0085\u0087\u0005\u0016"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u0083\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0005\t\u0000"+
		"\u0000\u008e\u0092\u0005\u000b\u0000\u0000\u008f\u0091\u0003\u0002\u0001"+
		"\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005\f\u0000\u0000\u0096\u0015\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005\u0013\u0000\u0000\u0098\u0099\u0005\b\u0000\u0000\u0099"+
		"\u009a\u0005\u0016\u0000\u0000\u009a\u009b\u0005\u0012\u0000\u0000\u009b"+
		"\u009c\u0005\u0016\u0000\u0000\u009c\u009d\u0005\t\u0000\u0000\u009d\u00a1"+
		"\u0005\u000b\u0000\u0000\u009e\u00a0\u0003\u0002\u0001\u0000\u009f\u009e"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005\f\u0000\u0000\u00a5\u0017\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005"+
		"\u0014\u0000\u0000\u00a7\u00a8\u0005\b\u0000\u0000\u00a8\u00a9\u0005\u0019"+
		"\u0000\u0000\u00a9\u00aa\u0005\t\u0000\u0000\u00aa\u00b4\u0005\u0003\u0000"+
		"\u0000\u00ab\u00ac\u0005\u0015\u0000\u0000\u00ac\u00ad\u0005\b\u0000\u0000"+
		"\u00ad\u00ae\u0005\u0019\u0000\u0000\u00ae\u00af\u0005\u0012\u0000\u0000"+
		"\u00af\u00b0\u0003\b\u0004\u0000\u00b0\u00b1\u0005\t\u0000\u0000\u00b1"+
		"\u00b2\u0005\u0003\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3"+
		"\u00a6\u0001\u0000\u0000\u0000\u00b3\u00ab\u0001\u0000\u0000\u0000\u00b4"+
		"\u0019\u0001\u0000\u0000\u0000\u000e\u001d)>EKUdn{\u0088\u008b\u0092\u00a1"+
		"\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}