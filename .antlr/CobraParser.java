// Generated from /home/pissarello-dev/Documentos/Code/univerity/semestre-v/lpt/Cobra/Cobra.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CobraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, COIL=4, FANG=5, SLITHERPLOT=6, TRAINSNAKETRON=7, 
		STRIKE=8, MAKENEST=9, IN=10, TRAIL=11, HISS=12, BITE=13, FROM=14, SCALES=15, 
		YAY=16, NAY=17, SPIT=18, SNAKE=19, SNAKENT=20, LBRACKET=21, RBRACKET=22, 
		LBRACE=23, LPAREN=24, RPAREN=25, RBRACE=26, POINT=27, COMMA=28, COLON=29, 
		POW=30, MINUS=31, NOT=32, MULT=33, DIV=34, MOD=35, PLUS=36, GT=37, LT=38, 
		GTEQ=39, LTEQ=40, EQ=41, NEQ=42, AND=43, OR=44, ASSIGN=45, ELSTRIKE=46, 
		ELSE=47, ID=48, INT=49, FLOAT=50, STRING=51, NEWLINE=52, WS=53;
	public static final int
		RULE_parse = 0, RULE_from_input = 1, RULE_from_file = 2, RULE_stat = 3, 
		RULE_compound_stat = 4, RULE_simple_stat = 5, RULE_expr = 6, RULE_atom = 7, 
		RULE_scales = 8, RULE_snake = 9, RULE_grabScale = 10, RULE_keyvalue = 11, 
		RULE_variable = 12, RULE_spit = 13, RULE_bite = 14, RULE_hiss = 15, RULE_statement = 16, 
		RULE_assignment = 17, RULE_controlStructure = 18, RULE_ifStatement = 19, 
		RULE_forLoop = 20, RULE_dataPlotting = 21, RULE_whileLoop = 22, RULE_functionDeclaration = 23, 
		RULE_condition_block = 24, RULE_parameter = 25, RULE_mlTraining = 26, 
		RULE_snaketronTraining = 27, RULE_stat_block = 28, RULE_makeNest = 29, 
		RULE_fileHandling = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "from_input", "from_file", "stat", "compound_stat", "simple_stat", 
			"expr", "atom", "scales", "snake", "grabScale", "keyvalue", "variable", 
			"spit", "bite", "hiss", "statement", "assignment", "controlStructure", 
			"ifStatement", "forLoop", "dataPlotting", "whileLoop", "functionDeclaration", 
			"condition_block", "parameter", "mlTraining", "snaketronTraining", "stat_block", 
			"makeNest", "fileHandling"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'read_file'", "';'", "'write_file'", "'coil'", "'fang'", "'slitherplot'", 
			"'TrainSnaketron'", "'strike'", "'MakeNest'", "'in'", "'trail'", "'hiss'", 
			"'bite'", "'from'", "'scales'", "'yay'", "'nay'", "'spit'", "'snake'", 
			"'snakent'", "'['", "']'", "'{'", "'('", "')'", "'}'", "'.'", "','", 
			"':'", "'^'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'<'", 
			"'>='", "'<='", "'=='", "'!='", "'and'", "'or'", "'='", "'elstrike'", 
			"'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "COIL", "FANG", "SLITHERPLOT", "TRAINSNAKETRON", 
			"STRIKE", "MAKENEST", "IN", "TRAIL", "HISS", "BITE", "FROM", "SCALES", 
			"YAY", "NAY", "SPIT", "SNAKE", "SNAKENT", "LBRACKET", "RBRACKET", "LBRACE", 
			"LPAREN", "RPAREN", "RBRACE", "POINT", "COMMA", "COLON", "POW", "MINUS", 
			"NOT", "MULT", "DIV", "MOD", "PLUS", "GT", "LT", "GTEQ", "LTEQ", "EQ", 
			"NEQ", "AND", "OR", "ASSIGN", "ELSTRIKE", "ELSE", "ID", "INT", "FLOAT", 
			"STRING", "NEWLINE", "WS"
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
	public static class ParseContext extends ParserRuleContext {
		public From_inputContext from_input() {
			return getRuleContext(From_inputContext.class,0);
		}
		public From_fileContext from_file() {
			return getRuleContext(From_fileContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				from_input();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				from_file();
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
	public static class From_inputContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CobraParser.NEWLINE, 0); }
		public From_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_input; }
	}

	public final From_inputContext from_input() throws RecognitionException {
		From_inputContext _localctx = new From_inputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_from_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			stat();
			setState(67);
			match(NEWLINE);
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
	public static class From_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CobraParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CobraParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CobraParser.NEWLINE, i);
		}
		public From_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_file; }
	}

	public final From_fileContext from_file() throws RecognitionException {
		From_fileContext _localctx = new From_fileContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_from_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725724290055162L) != 0)) {
				{
				setState(71);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__2:
				case COIL:
				case FANG:
				case SLITHERPLOT:
				case TRAINSNAKETRON:
				case STRIKE:
				case MAKENEST:
				case TRAIL:
				case HISS:
				case BITE:
				case FROM:
				case YAY:
				case NAY:
				case SPIT:
				case SNAKENT:
				case LBRACKET:
				case LBRACE:
				case ID:
				case INT:
				case FLOAT:
				case STRING:
					{
					setState(69);
					stat();
					}
					break;
				case NEWLINE:
					{
					setState(70);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
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
	public static class StatContext extends ParserRuleContext {
		public Simple_statContext simple_stat() {
			return getRuleContext(Simple_statContext.class,0);
		}
		public Compound_statContext compound_stat() {
			return getRuleContext(Compound_statContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HISS:
			case BITE:
			case FROM:
			case YAY:
			case NAY:
			case SPIT:
			case SNAKENT:
			case LBRACKET:
			case LBRACE:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				simple_stat();
				}
				break;
			case T__0:
			case T__2:
			case COIL:
			case FANG:
			case SLITHERPLOT:
			case TRAINSNAKETRON:
			case STRIKE:
			case MAKENEST:
			case TRAIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				compound_stat();
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
	public static class Compound_statContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public SnaketronTrainingContext snaketronTraining() {
			return getRuleContext(SnaketronTrainingContext.class,0);
		}
		public MakeNestContext makeNest() {
			return getRuleContext(MakeNestContext.class,0);
		}
		public FileHandlingContext fileHandling() {
			return getRuleContext(FileHandlingContext.class,0);
		}
		public DataPlottingContext dataPlotting() {
			return getRuleContext(DataPlottingContext.class,0);
		}
		public Compound_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stat; }
	}

	public final Compound_statContext compound_stat() throws RecognitionException {
		Compound_statContext _localctx = new Compound_statContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compound_stat);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				ifStatement();
				}
				break;
			case COIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				whileLoop();
				}
				break;
			case TRAIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				forLoop();
				}
				break;
			case FANG:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				functionDeclaration();
				}
				break;
			case TRAINSNAKETRON:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				snaketronTraining();
				}
				break;
			case MAKENEST:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				makeNest();
				}
				break;
			case T__0:
			case T__2:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				fileHandling();
				}
				break;
			case SLITHERPLOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(89);
				dataPlotting();
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
	public static class Simple_statContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public HissContext hiss() {
			return getRuleContext(HissContext.class,0);
		}
		public BiteContext bite() {
			return getRuleContext(BiteContext.class,0);
		}
		public SpitContext spit() {
			return getRuleContext(SpitContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Simple_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stat; }
	}

	public final Simple_statContext simple_stat() throws RecognitionException {
		Simple_statContext _localctx = new Simple_statContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simple_stat);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				hiss();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				bite();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				spit();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				atom();
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(CobraParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CobraParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CobraParser.MINUS, 0); }
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinusExprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(CobraParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(CobraParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultDivModExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(CobraParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CobraParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CobraParser.MOD, 0); }
		public MultDivModExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode POW() { return getToken(CobraParser.POW, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(CobraParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(CobraParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(CobraParser.LT, 0); }
		public TerminalNode GT() { return getToken(CobraParser.GT, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(CobraParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CobraParser.RPAREN, 0); }
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(CobraParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(CobraParser.NEQ, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(CobraParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(100);
				match(MINUS);
				setState(101);
				expr(10);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(NOT);
				setState(103);
				expr(9);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(LPAREN);
				setState(105);
				expr(0);
				setState(106);
				match(RPAREN);
				}
				break;
			case YAY:
			case NAY:
			case SNAKENT:
			case LBRACKET:
			case LBRACE:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(132);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						((PowExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(112);
						match(POW);
						setState(113);
						((PowExprContext)_localctx).right = expr(11);
						}
						break;
					case 2:
						{
						_localctx = new MultDivModExprContext(new ExprContext(_parentctx, _parentState));
						((MultDivModExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(115);
						((MultDivModExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129542144L) != 0)) ) {
							((MultDivModExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(116);
						((MultDivModExprContext)_localctx).right = expr(9);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						((AddSubExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(118);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(119);
						((AddSubExprContext)_localctx).right = expr(8);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						((RelationalExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(121);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061584302080L) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(122);
						((RelationalExprContext)_localctx).right = expr(7);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						((EqualityExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(124);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(125);
						((EqualityExprContext)_localctx).right = expr(6);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						((AndExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(127);
						((AndExprContext)_localctx).op = match(AND);
						setState(128);
						((AndExprContext)_localctx).right = expr(5);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						((OrExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(130);
						((OrExprContext)_localctx).op = match(OR);
						setState(131);
						((OrExprContext)_localctx).right = expr(4);
						}
						break;
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode YAY() { return getToken(CobraParser.YAY, 0); }
		public TerminalNode NAY() { return getToken(CobraParser.NAY, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAtomContext extends AtomContext {
		public ScalesContext scales() {
			return getRuleContext(ScalesContext.class,0);
		}
		public ArrayAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(CobraParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccessVariableAtomContext extends AtomContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AccessVariableAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GrabScaleAtomsContext extends AtomContext {
		public GrabScaleContext grabScale() {
			return getRuleContext(GrabScaleContext.class,0);
		}
		public GrabScaleAtomsContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericAtomContext extends AtomContext {
		public TerminalNode INT() { return getToken(CobraParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CobraParser.FLOAT, 0); }
		public NumericAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectAtomContext extends AtomContext {
		public SnakeContext snake() {
			return getRuleContext(SnakeContext.class,0);
		}
		public ObjectAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullAtomContext extends AtomContext {
		public TerminalNode SNAKENT() { return getToken(CobraParser.SNAKENT, 0); }
		public NullAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atom);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new NumericAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				_la = _input.LA(1);
				if ( !(_la==YAY || _la==NAY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new ArrayAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				scales();
				}
				break;
			case 5:
				_localctx = new ObjectAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				snake();
				}
				break;
			case 6:
				_localctx = new GrabScaleAtomsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				grabScale();
				}
				break;
			case 7:
				_localctx = new AccessVariableAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
				variable();
				}
				break;
			case 8:
				_localctx = new NullAtomContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				match(SNAKENT);
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
	public static class ScalesContext extends ParserRuleContext {
		public ExprContext start;
		public ExprContext step;
		public ExprContext end;
		public TerminalNode LBRACKET() { return getToken(CobraParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(CobraParser.RBRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ScalesContext> scales() {
			return getRuleContexts(ScalesContext.class);
		}
		public ScalesContext scales(int i) {
			return getRuleContext(ScalesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CobraParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CobraParser.COMMA, i);
		}
		public List<TerminalNode> COLON() { return getTokens(CobraParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CobraParser.COLON, i);
		}
		public ScalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scales; }
	}

	public final ScalesContext scales() throws RecognitionException {
		ScalesContext _localctx = new ScalesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_scales);
		try {
			int _alt;
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(LBRACKET);
				setState(150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(148);
					expr(0);
					}
					break;
				case 2:
					{
					setState(149);
					scales();
					}
					break;
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(152);
						match(COMMA);
						setState(155);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
						case 1:
							{
							setState(153);
							expr(0);
							}
							break;
						case 2:
							{
							setState(154);
							scales();
							}
							break;
						}
						}
						} 
					}
					setState(161);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(162);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(LBRACKET);
				setState(165);
				((ScalesContext)_localctx).start = expr(0);
				setState(166);
				match(COLON);
				setState(170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(167);
					((ScalesContext)_localctx).step = expr(0);
					setState(168);
					match(COLON);
					}
					break;
				}
				setState(172);
				((ScalesContext)_localctx).end = expr(0);
				setState(173);
				match(RBRACKET);
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
	public static class SnakeContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CobraParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CobraParser.RBRACE, 0); }
		public List<KeyvalueContext> keyvalue() {
			return getRuleContexts(KeyvalueContext.class);
		}
		public KeyvalueContext keyvalue(int i) {
			return getRuleContext(KeyvalueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CobraParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CobraParser.COMMA, i);
		}
		public SnakeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_snake; }
	}

	public final SnakeContext snake() throws RecognitionException {
		SnakeContext _localctx = new SnakeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_snake);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(LBRACE);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(178);
				keyvalue();
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(179);
					match(COMMA);
					setState(180);
					keyvalue();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(188);
			match(RBRACE);
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
	public static class GrabScaleContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(CobraParser.LBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(CobraParser.RBRACKET, 0); }
		public GrabScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grabScale; }
	}

	public final GrabScaleContext grabScale() throws RecognitionException {
		GrabScaleContext _localctx = new GrabScaleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_grabScale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			variable();
			setState(191);
			match(LBRACKET);
			setState(192);
			expr(0);
			setState(193);
			match(RBRACKET);
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
	public static class KeyvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CobraParser.ID, 0); }
		public TerminalNode COLON() { return getToken(CobraParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public KeyvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyvalue; }
	}

	public final KeyvalueContext keyvalue() throws RecognitionException {
		KeyvalueContext _localctx = new KeyvalueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_keyvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(ID);
			setState(196);
			match(COLON);
			setState(197);
			expr(0);
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
	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CobraParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CobraParser.ID, i);
		}
		public List<TerminalNode> POINT() { return getTokens(CobraParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(CobraParser.POINT, i);
		}
		public TerminalNode LPAREN() { return getToken(CobraParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CobraParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CobraParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CobraParser.COMMA, i);
		}
		public TerminalNode RBRACKET() { return getToken(CobraParser.RBRACKET, 0); }
		public TerminalNode LBRACKET() { return getToken(CobraParser.LBRACKET, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable);
		int _la;
		try {
			int _alt;
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(ID);
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(200);
						match(POINT);
						setState(201);
						match(ID);
						}
						} 
					}
					setState(206);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(207);
					match(LPAREN);
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222131121618944L) != 0)) {
						{
						setState(208);
						expr(0);
						setState(213);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(209);
							match(COMMA);
							setState(210);
							expr(0);
							}
							}
							setState(215);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(218);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(ID);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POINT) {
					{
					{
					setState(222);
					match(POINT);
					setState(223);
					match(ID);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				match(RBRACKET);
				setState(230);
				expr(0);
				setState(231);
				match(LBRACKET);
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
	public static class SpitContext extends ParserRuleContext {
		public TerminalNode SPIT() { return getToken(CobraParser.SPIT, 0); }
		public TerminalNode LBRACE() { return getToken(CobraParser.LBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CobraParser.RBRACE, 0); }
		public TerminalNode NEWLINE() { return getToken(CobraParser.NEWLINE, 0); }
		public SpitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spit; }
	}

	public final SpitContext spit() throws RecognitionException {
		SpitContext _localctx = new SpitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_spit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(SPIT);
			setState(236);
			match(LBRACE);
			setState(237);
			expr(0);
			setState(238);
			match(RBRACE);
			setState(239);
			match(NEWLINE);
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
	public static class BiteContext extends ParserRuleContext {
		public TerminalNode BITE() { return getToken(CobraParser.BITE, 0); }
		public List<TerminalNode> ID() { return getTokens(CobraParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CobraParser.ID, i);
		}
		public List<TerminalNode> POINT() { return getTokens(CobraParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(CobraParser.POINT, i);
		}
		public TerminalNode FROM() { return getToken(CobraParser.FROM, 0); }
		public BiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bite; }
	}

	public final BiteContext bite() throws RecognitionException {
		BiteContext _localctx = new BiteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bite);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(BITE);
				setState(242);
				match(ID);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POINT) {
					{
					{
					setState(243);
					match(POINT);
					setState(244);
					match(ID);
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(FROM);
				setState(251);
				match(ID);
				setState(252);
				match(BITE);
				setState(253);
				match(ID);
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
	public static class HissContext extends ParserRuleContext {
		public TerminalNode HISS() { return getToken(CobraParser.HISS, 0); }
		public TerminalNode LPAREN() { return getToken(CobraParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CobraParser.RPAREN, 0); }
		public HissContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hiss; }
	}

	public final HissContext hiss() throws RecognitionException {
		HissContext _localctx = new HissContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_hiss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(HISS);
			setState(257);
			match(LPAREN);
			setState(258);
			expr(0);
			setState(259);
			match(RPAREN);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ControlStructureContext controlStructure() {
			return getRuleContext(ControlStructureContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public SnaketronTrainingContext snaketronTraining() {
			return getRuleContext(SnaketronTrainingContext.class,0);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				assignment();
				}
				break;
			case COIL:
			case STRIKE:
			case TRAIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				controlStructure();
				}
				break;
			case FANG:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				functionDeclaration();
				}
				break;
			case TRAINSNAKETRON:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				snaketronTraining();
				}
				break;
			case SLITHERPLOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				dataPlotting();
				}
				break;
			case T__0:
			case T__2:
				enterOuterAlt(_localctx, 6);
				{
				setState(266);
				fileHandling();
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
	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CobraParser.ASSIGN, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			variable();
			setState(270);
			match(ASSIGN);
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(271);
				assignment();
				}
				break;
			case 2:
				{
				setState(272);
				expr(0);
				}
				break;
			}
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
	}

	public final ControlStructureContext controlStructure() throws RecognitionException {
		ControlStructureContext _localctx = new ControlStructureContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_controlStructure);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				ifStatement();
				}
				break;
			case TRAIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				forLoop();
				}
				break;
			case COIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
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
		public TerminalNode STRIKE() { return getToken(CobraParser.STRIKE, 0); }
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CobraParser.ELSE, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public List<TerminalNode> ELSTRIKE() { return getTokens(CobraParser.ELSTRIKE); }
		public TerminalNode ELSTRIKE(int i) {
			return getToken(CobraParser.ELSTRIKE, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(STRIKE);
			setState(281);
			condition_block();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSTRIKE) {
				{
				{
				setState(282);
				match(ELSTRIKE);
				setState(283);
				condition_block();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(289);
			match(ELSE);
			setState(290);
			stat_block();
			}
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
		public TerminalNode TRAIL() { return getToken(CobraParser.TRAIL, 0); }
		public TerminalNode ID() { return getToken(CobraParser.ID, 0); }
		public TerminalNode IN() { return getToken(CobraParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(TRAIL);
			setState(293);
			match(ID);
			setState(294);
			match(IN);
			setState(295);
			expr(0);
			setState(296);
			stat_block();
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
		public TerminalNode SLITHERPLOT() { return getToken(CobraParser.SLITHERPLOT, 0); }
		public TerminalNode LPAREN() { return getToken(CobraParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CobraParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(CobraParser.ID, 0); }
		public TerminalNode STRING() { return getToken(CobraParser.STRING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DataPlottingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataPlotting; }
	}

	public final DataPlottingContext dataPlotting() throws RecognitionException {
		DataPlottingContext _localctx = new DataPlottingContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dataPlotting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(SLITHERPLOT);
			setState(299);
			match(LPAREN);
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(300);
				match(ID);
				}
				break;
			case 2:
				{
				setState(301);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(302);
				expr(0);
				}
				break;
			}
			setState(305);
			match(RPAREN);
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
		public TerminalNode COIL() { return getToken(CobraParser.COIL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(COIL);
			setState(308);
			expr(0);
			setState(309);
			stat_block();
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
		public TerminalNode FANG() { return getToken(CobraParser.FANG, 0); }
		public TerminalNode ID() { return getToken(CobraParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CobraParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CobraParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(CobraParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CobraParser.RBRACE, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CobraParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CobraParser.COMMA, i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(FANG);
			setState(312);
			match(ID);
			setState(313);
			match(LPAREN);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(314);
				parameter();
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(315);
					match(COMMA);
					setState(316);
					parameter();
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(324);
			match(RPAREN);
			setState(325);
			match(LBRACE);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222124662684666L) != 0)) {
				{
				{
				setState(326);
				stat();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			match(RBRACE);
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
	public static class Condition_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CobraParser.NEWLINE, 0); }
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_condition_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			expr(0);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(335);
				match(NEWLINE);
				}
			}

			setState(338);
			stat_block();
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
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CobraParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CobraParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(ID);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(341);
				match(ASSIGN);
				setState(342);
				expr(0);
				}
			}

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
	public static class MlTrainingContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(CobraParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CobraParser.LPAREN, i);
		}
		public List<TerminalNode> ID() { return getTokens(CobraParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CobraParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(CobraParser.COMMA, 0); }
		public TerminalNode LBRACE() { return getToken(CobraParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CobraParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MlTrainingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlTraining; }
	}

	public final MlTrainingContext mlTraining() throws RecognitionException {
		MlTrainingContext _localctx = new MlTrainingContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mlTraining);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(LPAREN);
			setState(346);
			match(ID);
			setState(347);
			match(COMMA);
			setState(348);
			match(ID);
			setState(349);
			match(LPAREN);
			setState(350);
			match(LBRACE);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976713210L) != 0)) {
				{
				{
				setState(351);
				statement();
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			match(RBRACE);
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
	public static class SnaketronTrainingContext extends ParserRuleContext {
		public TerminalNode TRAINSNAKETRON() { return getToken(CobraParser.TRAINSNAKETRON, 0); }
		public MlTrainingContext mlTraining() {
			return getRuleContext(MlTrainingContext.class,0);
		}
		public SnaketronTrainingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_snaketronTraining; }
	}

	public final SnaketronTrainingContext snaketronTraining() throws RecognitionException {
		SnaketronTrainingContext _localctx = new SnaketronTrainingContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_snaketronTraining);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(TRAINSNAKETRON);
			setState(360);
			mlTraining();
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
	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CobraParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CobraParser.RBRACE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CobraParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CobraParser.NEWLINE, i);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_stat_block);
		int _la;
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(LBRACE);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725724290055162L) != 0)) {
					{
					setState(365);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__2:
					case COIL:
					case FANG:
					case SLITHERPLOT:
					case TRAINSNAKETRON:
					case STRIKE:
					case MAKENEST:
					case TRAIL:
					case HISS:
					case BITE:
					case FROM:
					case YAY:
					case NAY:
					case SPIT:
					case SNAKENT:
					case LBRACKET:
					case LBRACE:
					case ID:
					case INT:
					case FLOAT:
					case STRING:
						{
						setState(363);
						stat();
						}
						break;
					case NEWLINE:
						{
						setState(364);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(370);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				stat();
				setState(372);
				match(NEWLINE);
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
	public static class MakeNestContext extends ParserRuleContext {
		public TerminalNode MAKENEST() { return getToken(CobraParser.MAKENEST, 0); }
		public MlTrainingContext mlTraining() {
			return getRuleContext(MlTrainingContext.class,0);
		}
		public MakeNestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_makeNest; }
	}

	public final MakeNestContext makeNest() throws RecognitionException {
		MakeNestContext _localctx = new MakeNestContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_makeNest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(MAKENEST);
			setState(377);
			mlTraining();
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
		public TerminalNode LPAREN() { return getToken(CobraParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(CobraParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(CobraParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(CobraParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FileHandlingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileHandling; }
	}

	public final FileHandlingContext fileHandling() throws RecognitionException {
		FileHandlingContext _localctx = new FileHandlingContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fileHandling);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(T__0);
				setState(380);
				match(LPAREN);
				setState(381);
				match(STRING);
				setState(382);
				match(RPAREN);
				setState(383);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(T__2);
				setState(385);
				match(LPAREN);
				setState(386);
				match(STRING);
				setState(387);
				match(COMMA);
				setState(388);
				expr(0);
				setState(389);
				match(RPAREN);
				setState(390);
				match(T__1);
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
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u018b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0001\u0000\u0003\u0000A\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002H\b\u0002\n\u0002\f\u0002"+
		"K\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"Q\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004[\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005b\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006n\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0085\b\u0006\n\u0006"+
		"\f\u0006\u0088\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0092\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u0097\b\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u009c\b\b\u0005\b\u009e\b\b\n\b\f\b\u00a1\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ab\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00b0\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b6"+
		"\b\t\n\t\f\t\u00b9\t\t\u0003\t\u00bb\b\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u00cb\b\f\n\f\f\f\u00ce\t\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00d4\b\f\n\f\f\f\u00d7\t\f\u0003\f\u00d9\b"+
		"\f\u0001\f\u0003\f\u00dc\b\f\u0001\f\u0001\f\u0001\f\u0005\f\u00e1\b\f"+
		"\n\f\f\f\u00e4\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ea\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00f6\b\u000e\n\u000e\f\u000e\u00f9\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ff\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u010c\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0112\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0117\b"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u011d"+
		"\b\u0013\n\u0013\f\u0013\u0120\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0130\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u013e\b\u0017\n\u0017\f\u0017\u0141\t\u0017\u0003"+
		"\u0017\u0143\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0148"+
		"\b\u0017\n\u0017\f\u0017\u014b\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0151\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0158\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u0161\b\u001a\n\u001a\f\u001a\u0164\t\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u016e\b\u001c\n\u001c\f\u001c\u0171\t\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0177\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0189\b\u001e\u0001\u001e\u0001\u009f"+
		"\u0001\f\u001f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<\u0000\u0006\u0001\u0000!#\u0002"+
		"\u0000\u001f\u001f$$\u0001\u0000%(\u0001\u0000)*\u0001\u000012\u0001\u0000"+
		"\u0010\u0011\u01af\u0000@\u0001\u0000\u0000\u0000\u0002B\u0001\u0000\u0000"+
		"\u0000\u0004I\u0001\u0000\u0000\u0000\u0006P\u0001\u0000\u0000\u0000\b"+
		"Z\u0001\u0000\u0000\u0000\na\u0001\u0000\u0000\u0000\fm\u0001\u0000\u0000"+
		"\u0000\u000e\u0091\u0001\u0000\u0000\u0000\u0010\u00af\u0001\u0000\u0000"+
		"\u0000\u0012\u00b1\u0001\u0000\u0000\u0000\u0014\u00be\u0001\u0000\u0000"+
		"\u0000\u0016\u00c3\u0001\u0000\u0000\u0000\u0018\u00e9\u0001\u0000\u0000"+
		"\u0000\u001a\u00eb\u0001\u0000\u0000\u0000\u001c\u00fe\u0001\u0000\u0000"+
		"\u0000\u001e\u0100\u0001\u0000\u0000\u0000 \u010b\u0001\u0000\u0000\u0000"+
		"\"\u010d\u0001\u0000\u0000\u0000$\u0116\u0001\u0000\u0000\u0000&\u0118"+
		"\u0001\u0000\u0000\u0000(\u0124\u0001\u0000\u0000\u0000*\u012a\u0001\u0000"+
		"\u0000\u0000,\u0133\u0001\u0000\u0000\u0000.\u0137\u0001\u0000\u0000\u0000"+
		"0\u014e\u0001\u0000\u0000\u00002\u0154\u0001\u0000\u0000\u00004\u0159"+
		"\u0001\u0000\u0000\u00006\u0167\u0001\u0000\u0000\u00008\u0176\u0001\u0000"+
		"\u0000\u0000:\u0178\u0001\u0000\u0000\u0000<\u0188\u0001\u0000\u0000\u0000"+
		">A\u0003\u0002\u0001\u0000?A\u0003\u0004\u0002\u0000@>\u0001\u0000\u0000"+
		"\u0000@?\u0001\u0000\u0000\u0000A\u0001\u0001\u0000\u0000\u0000BC\u0003"+
		"\u0006\u0003\u0000CD\u00054\u0000\u0000D\u0003\u0001\u0000\u0000\u0000"+
		"EH\u0003\u0006\u0003\u0000FH\u00054\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001\u0000"+
		"\u0000\u0000LM\u0005\u0000\u0000\u0001M\u0005\u0001\u0000\u0000\u0000"+
		"NQ\u0003\n\u0005\u0000OQ\u0003\b\u0004\u0000PN\u0001\u0000\u0000\u0000"+
		"PO\u0001\u0000\u0000\u0000Q\u0007\u0001\u0000\u0000\u0000R[\u0003&\u0013"+
		"\u0000S[\u0003,\u0016\u0000T[\u0003(\u0014\u0000U[\u0003.\u0017\u0000"+
		"V[\u00036\u001b\u0000W[\u0003:\u001d\u0000X[\u0003<\u001e\u0000Y[\u0003"+
		"*\u0015\u0000ZR\u0001\u0000\u0000\u0000ZS\u0001\u0000\u0000\u0000ZT\u0001"+
		"\u0000\u0000\u0000ZU\u0001\u0000\u0000\u0000ZV\u0001\u0000\u0000\u0000"+
		"ZW\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000"+
		"\u0000[\t\u0001\u0000\u0000\u0000\\b\u0003\"\u0011\u0000]b\u0003\u001e"+
		"\u000f\u0000^b\u0003\u001c\u000e\u0000_b\u0003\u001a\r\u0000`b\u0003\u000e"+
		"\u0007\u0000a\\\u0001\u0000\u0000\u0000a]\u0001\u0000\u0000\u0000a^\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000"+
		"b\u000b\u0001\u0000\u0000\u0000cd\u0006\u0006\uffff\uffff\u0000de\u0005"+
		"\u001f\u0000\u0000en\u0003\f\u0006\nfg\u0005 \u0000\u0000gn\u0003\f\u0006"+
		"\thi\u0005\u0018\u0000\u0000ij\u0003\f\u0006\u0000jk\u0005\u0019\u0000"+
		"\u0000kn\u0001\u0000\u0000\u0000ln\u0003\u000e\u0007\u0000mc\u0001\u0000"+
		"\u0000\u0000mf\u0001\u0000\u0000\u0000mh\u0001\u0000\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000n\u0086\u0001\u0000\u0000\u0000op\n\u000b\u0000\u0000"+
		"pq\u0005\u001e\u0000\u0000q\u0085\u0003\f\u0006\u000brs\n\b\u0000\u0000"+
		"st\u0007\u0000\u0000\u0000t\u0085\u0003\f\u0006\tuv\n\u0007\u0000\u0000"+
		"vw\u0007\u0001\u0000\u0000w\u0085\u0003\f\u0006\bxy\n\u0006\u0000\u0000"+
		"yz\u0007\u0002\u0000\u0000z\u0085\u0003\f\u0006\u0007{|\n\u0005\u0000"+
		"\u0000|}\u0007\u0003\u0000\u0000}\u0085\u0003\f\u0006\u0006~\u007f\n\u0004"+
		"\u0000\u0000\u007f\u0080\u0005+\u0000\u0000\u0080\u0085\u0003\f\u0006"+
		"\u0005\u0081\u0082\n\u0003\u0000\u0000\u0082\u0083\u0005,\u0000\u0000"+
		"\u0083\u0085\u0003\f\u0006\u0004\u0084o\u0001\u0000\u0000\u0000\u0084"+
		"r\u0001\u0000\u0000\u0000\u0084u\u0001\u0000\u0000\u0000\u0084x\u0001"+
		"\u0000\u0000\u0000\u0084{\u0001\u0000\u0000\u0000\u0084~\u0001\u0000\u0000"+
		"\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\r\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0089\u0092\u0007\u0004\u0000\u0000\u008a\u0092\u0007\u0005\u0000\u0000"+
		"\u008b\u0092\u00053\u0000\u0000\u008c\u0092\u0003\u0010\b\u0000\u008d"+
		"\u0092\u0003\u0012\t\u0000\u008e\u0092\u0003\u0014\n\u0000\u008f\u0092"+
		"\u0003\u0018\f\u0000\u0090\u0092\u0005\u0014\u0000\u0000\u0091\u0089\u0001"+
		"\u0000\u0000\u0000\u0091\u008a\u0001\u0000\u0000\u0000\u0091\u008b\u0001"+
		"\u0000\u0000\u0000\u0091\u008c\u0001\u0000\u0000\u0000\u0091\u008d\u0001"+
		"\u0000\u0000\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u000f\u0001"+
		"\u0000\u0000\u0000\u0093\u0096\u0005\u0015\u0000\u0000\u0094\u0097\u0003"+
		"\f\u0006\u0000\u0095\u0097\u0003\u0010\b\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009f\u0001\u0000"+
		"\u0000\u0000\u0098\u009b\u0005\u001c\u0000\u0000\u0099\u009c\u0003\f\u0006"+
		"\u0000\u009a\u009c\u0003\u0010\b\u0000\u009b\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000"+
		"\u009d\u0098\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005\u0016\u0000\u0000\u00a3\u00b0\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0005\u0015\u0000\u0000\u00a5\u00a6\u0003\f\u0006\u0000\u00a6"+
		"\u00aa\u0005\u001d\u0000\u0000\u00a7\u00a8\u0003\f\u0006\u0000\u00a8\u00a9"+
		"\u0005\u001d\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a7"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003\f\u0006\u0000\u00ad\u00ae\u0005"+
		"\u0016\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u0093\u0001"+
		"\u0000\u0000\u0000\u00af\u00a4\u0001\u0000\u0000\u0000\u00b0\u0011\u0001"+
		"\u0000\u0000\u0000\u00b1\u00ba\u0005\u0017\u0000\u0000\u00b2\u00b7\u0003"+
		"\u0016\u000b\u0000\u00b3\u00b4\u0005\u001c\u0000\u0000\u00b4\u00b6\u0003"+
		"\u0016\u000b\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b2\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005"+
		"\u001a\u0000\u0000\u00bd\u0013\u0001\u0000\u0000\u0000\u00be\u00bf\u0003"+
		"\u0018\f\u0000\u00bf\u00c0\u0005\u0015\u0000\u0000\u00c0\u00c1\u0003\f"+
		"\u0006\u0000\u00c1\u00c2\u0005\u0016\u0000\u0000\u00c2\u0015\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u00050\u0000\u0000\u00c4\u00c5\u0005\u001d\u0000"+
		"\u0000\u00c5\u00c6\u0003\f\u0006\u0000\u00c6\u0017\u0001\u0000\u0000\u0000"+
		"\u00c7\u00cc\u00050\u0000\u0000\u00c8\u00c9\u0005\u001b\u0000\u0000\u00c9"+
		"\u00cb\u00050\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00ce"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd\u00db\u0001\u0000\u0000\u0000\u00ce\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d8\u0005\u0018\u0000\u0000\u00d0\u00d5"+
		"\u0003\f\u0006\u0000\u00d1\u00d2\u0005\u001c\u0000\u0000\u00d2\u00d4\u0003"+
		"\f\u0006\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d0\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00dc\u0005\u0019"+
		"\u0000\u0000\u00db\u00cf\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u00ea\u0001\u0000\u0000\u0000\u00dd\u00e2\u00050\u0000"+
		"\u0000\u00de\u00df\u0005\u001b\u0000\u0000\u00df\u00e1\u00050\u0000\u0000"+
		"\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0005\u0016\u0000\u0000\u00e6\u00e7\u0003\f\u0006\u0000\u00e7"+
		"\u00e8\u0005\u0015\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9"+
		"\u00c7\u0001\u0000\u0000\u0000\u00e9\u00dd\u0001\u0000\u0000\u0000\u00ea"+
		"\u0019\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0012\u0000\u0000\u00ec"+
		"\u00ed\u0005\u0017\u0000\u0000\u00ed\u00ee\u0003\f\u0006\u0000\u00ee\u00ef"+
		"\u0005\u001a\u0000\u0000\u00ef\u00f0\u00054\u0000\u0000\u00f0\u001b\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0005\r\u0000\u0000\u00f2\u00f7\u00050"+
		"\u0000\u0000\u00f3\u00f4\u0005\u001b\u0000\u0000\u00f4\u00f6\u00050\u0000"+
		"\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00ff\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0005\u000e\u0000\u0000\u00fb\u00fc\u00050\u0000\u0000"+
		"\u00fc\u00fd\u0005\r\u0000\u0000\u00fd\u00ff\u00050\u0000\u0000\u00fe"+
		"\u00f1\u0001\u0000\u0000\u0000\u00fe\u00fa\u0001\u0000\u0000\u0000\u00ff"+
		"\u001d\u0001\u0000\u0000\u0000\u0100\u0101\u0005\f\u0000\u0000\u0101\u0102"+
		"\u0005\u0018\u0000\u0000\u0102\u0103\u0003\f\u0006\u0000\u0103\u0104\u0005"+
		"\u0019\u0000\u0000\u0104\u001f\u0001\u0000\u0000\u0000\u0105\u010c\u0003"+
		"\"\u0011\u0000\u0106\u010c\u0003$\u0012\u0000\u0107\u010c\u0003.\u0017"+
		"\u0000\u0108\u010c\u00036\u001b\u0000\u0109\u010c\u0003*\u0015\u0000\u010a"+
		"\u010c\u0003<\u001e\u0000\u010b\u0105\u0001\u0000\u0000\u0000\u010b\u0106"+
		"\u0001\u0000\u0000\u0000\u010b\u0107\u0001\u0000\u0000\u0000\u010b\u0108"+
		"\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010a"+
		"\u0001\u0000\u0000\u0000\u010c!\u0001\u0000\u0000\u0000\u010d\u010e\u0003"+
		"\u0018\f\u0000\u010e\u0111\u0005-\u0000\u0000\u010f\u0112\u0003\"\u0011"+
		"\u0000\u0110\u0112\u0003\f\u0006\u0000\u0111\u010f\u0001\u0000\u0000\u0000"+
		"\u0111\u0110\u0001\u0000\u0000\u0000\u0112#\u0001\u0000\u0000\u0000\u0113"+
		"\u0117\u0003&\u0013\u0000\u0114\u0117\u0003(\u0014\u0000\u0115\u0117\u0003"+
		",\u0016\u0000\u0116\u0113\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000"+
		"\u0000\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117%\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0005\b\u0000\u0000\u0119\u011e\u00030\u0018\u0000"+
		"\u011a\u011b\u0005.\u0000\u0000\u011b\u011d\u00030\u0018\u0000\u011c\u011a"+
		"\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c"+
		"\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0121"+
		"\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0005/\u0000\u0000\u0122\u0123\u00038\u001c\u0000\u0123\'\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0005\u000b\u0000\u0000\u0125\u0126\u00050\u0000"+
		"\u0000\u0126\u0127\u0005\n\u0000\u0000\u0127\u0128\u0003\f\u0006\u0000"+
		"\u0128\u0129\u00038\u001c\u0000\u0129)\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0005\u0006\u0000\u0000\u012b\u012f\u0005\u0018\u0000\u0000\u012c\u0130"+
		"\u00050\u0000\u0000\u012d\u0130\u00053\u0000\u0000\u012e\u0130\u0003\f"+
		"\u0006\u0000\u012f\u012c\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000"+
		"\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0005\u0019\u0000\u0000\u0132+\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0005\u0004\u0000\u0000\u0134\u0135\u0003\f\u0006\u0000"+
		"\u0135\u0136\u00038\u001c\u0000\u0136-\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0005\u0005\u0000\u0000\u0138\u0139\u00050\u0000\u0000\u0139\u0142\u0005"+
		"\u0018\u0000\u0000\u013a\u013f\u00032\u0019\u0000\u013b\u013c\u0005\u001c"+
		"\u0000\u0000\u013c\u013e\u00032\u0019\u0000\u013d\u013b\u0001\u0000\u0000"+
		"\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000"+
		"\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u013a\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0005\u0019\u0000\u0000\u0145\u0149\u0005\u0017\u0000"+
		"\u0000\u0146\u0148\u0003\u0006\u0003\u0000\u0147\u0146\u0001\u0000\u0000"+
		"\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014c\u0001\u0000\u0000"+
		"\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u014d\u0005\u001a\u0000"+
		"\u0000\u014d/\u0001\u0000\u0000\u0000\u014e\u0150\u0003\f\u0006\u0000"+
		"\u014f\u0151\u00054\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152"+
		"\u0153\u00038\u001c\u0000\u01531\u0001\u0000\u0000\u0000\u0154\u0157\u0005"+
		"0\u0000\u0000\u0155\u0156\u0005-\u0000\u0000\u0156\u0158\u0003\f\u0006"+
		"\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000"+
		"\u0000\u01583\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u0018\u0000\u0000"+
		"\u015a\u015b\u00050\u0000\u0000\u015b\u015c\u0005\u001c\u0000\u0000\u015c"+
		"\u015d\u00050\u0000\u0000\u015d\u015e\u0005\u0018\u0000\u0000\u015e\u0162"+
		"\u0005\u0017\u0000\u0000\u015f\u0161\u0003 \u0010\u0000\u0160\u015f\u0001"+
		"\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u0001"+
		"\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0166\u0005"+
		"\u001a\u0000\u0000\u01665\u0001\u0000\u0000\u0000\u0167\u0168\u0005\u0007"+
		"\u0000\u0000\u0168\u0169\u00034\u001a\u0000\u01697\u0001\u0000\u0000\u0000"+
		"\u016a\u016f\u0005\u0017\u0000\u0000\u016b\u016e\u0003\u0006\u0003\u0000"+
		"\u016c\u016e\u00054\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d"+
		"\u016c\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000\u016f"+
		"\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170"+
		"\u0172\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172"+
		"\u0177\u0005\u001a\u0000\u0000\u0173\u0174\u0003\u0006\u0003\u0000\u0174"+
		"\u0175\u00054\u0000\u0000\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u016a"+
		"\u0001\u0000\u0000\u0000\u0176\u0173\u0001\u0000\u0000\u0000\u01779\u0001"+
		"\u0000\u0000\u0000\u0178\u0179\u0005\t\u0000\u0000\u0179\u017a\u00034"+
		"\u001a\u0000\u017a;\u0001\u0000\u0000\u0000\u017b\u017c\u0005\u0001\u0000"+
		"\u0000\u017c\u017d\u0005\u0018\u0000\u0000\u017d\u017e\u00053\u0000\u0000"+
		"\u017e\u017f\u0005\u0019\u0000\u0000\u017f\u0189\u0005\u0002\u0000\u0000"+
		"\u0180\u0181\u0005\u0003\u0000\u0000\u0181\u0182\u0005\u0018\u0000\u0000"+
		"\u0182\u0183\u00053\u0000\u0000\u0183\u0184\u0005\u001c\u0000\u0000\u0184"+
		"\u0185\u0003\f\u0006\u0000\u0185\u0186\u0005\u0019\u0000\u0000\u0186\u0187"+
		"\u0005\u0002\u0000\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u017b"+
		"\u0001\u0000\u0000\u0000\u0188\u0180\u0001\u0000\u0000\u0000\u0189=\u0001"+
		"\u0000\u0000\u0000(@GIPZam\u0084\u0086\u0091\u0096\u009b\u009f\u00aa\u00af"+
		"\u00b7\u00ba\u00cc\u00d5\u00d8\u00db\u00e2\u00e9\u00f7\u00fe\u010b\u0111"+
		"\u0116\u011e\u012f\u013f\u0142\u0149\u0150\u0157\u0162\u016d\u016f\u0176"+
		"\u0188";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}