// Generated from /home/fearestempest/Documentos/Universidad/Lenguajes/Proyecto_3/Cobra.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, COIL=5, FANG=6, SLITHERPLOT=7, TRAINSNAKETRON=8, 
		STRIKE=9, MAKENEST=10, IN=11, TRAIL=12, HISS=13, BITE=14, FROM=15, SCALES=16, 
		YAY=17, NAY=18, SPIT=19, SNAKE=20, SNAKENT=21, LBRACKET=22, RBRACKET=23, 
		LBRACE=24, LPAREN=25, RPAREN=26, RBRACE=27, POINT=28, COMMA=29, COLON=30, 
		POW=31, MINUS=32, NOT=33, MULT=34, DIV=35, MOD=36, PLUS=37, GT=38, LT=39, 
		GTEQ=40, LTEQ=41, EQ=42, NEQ=43, AND=44, OR=45, ID=46, INT=47, FLOAT=48, 
		STRING=49, NEWLINE=50, WS=51;
	public static final int
		RULE_parse = 0, RULE_from_input = 1, RULE_from_file = 2, RULE_stat = 3, 
		RULE_compound_stat = 4, RULE_simple_stat = 5, RULE_expr = 6, RULE_atom = 7, 
		RULE_scales = 8, RULE_snake = 9, RULE_grabScale = 10, RULE_keyvalue = 11, 
		RULE_variable = 12, RULE_spit = 13, RULE_bite = 14, RULE_hiss = 15, RULE_statement = 16, 
		RULE_assignment = 17, RULE_expression = 18, RULE_controlStructure = 19, 
		RULE_ifStatement = 20, RULE_forLoop = 21, RULE_dataPlotting = 22, RULE_whileLoop = 23, 
		RULE_functionDeclaration = 24, RULE_mlTraining = 25, RULE_snaketronTraining = 26, 
		RULE_makeNest = 27, RULE_fileHandling = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "from_input", "from_file", "stat", "compound_stat", "simple_stat", 
			"expr", "atom", "scales", "snake", "grabScale", "keyvalue", "variable", 
			"spit", "bite", "hiss", "statement", "assignment", "expression", "controlStructure", 
			"ifStatement", "forLoop", "dataPlotting", "whileLoop", "functionDeclaration", 
			"mlTraining", "snaketronTraining", "makeNest", "fileHandling"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'read_file'", "';'", "'write_file'", "'coil'", "'fang'", 
			"'slitherplot'", "'TrainSnaketron'", "'strike'", "'MakeNest'", "'in'", 
			"'trail'", "'hiss'", "'bite'", "'from'", "'scales'", "'yay'", "'nay'", 
			"'spit'", "'snake'", "'snakent'", "'['", "']'", "'{'", "'('", "')'", 
			"'}'", "'.'", "','", "':'", "'^'", "'-'", "'!'", "'*'", "'/'", "'%'", 
			"'+'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'and'", "'or'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "COIL", "FANG", "SLITHERPLOT", "TRAINSNAKETRON", 
			"STRIKE", "MAKENEST", "IN", "TRAIL", "HISS", "BITE", "FROM", "SCALES", 
			"YAY", "NAY", "SPIT", "SNAKE", "SNAKENT", "LBRACKET", "RBRACKET", "LBRACE", 
			"LPAREN", "RPAREN", "RBRACE", "POINT", "COMMA", "COLON", "POW", "MINUS", 
			"NOT", "MULT", "DIV", "MOD", "PLUS", "GT", "LT", "GTEQ", "LTEQ", "EQ", 
			"NEQ", "AND", "OR", "ID", "INT", "FLOAT", "STRING", "NEWLINE", "WS"
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
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				from_input();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
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
			setState(62);
			stat();
			setState(63);
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2181431093557236L) != 0)) {
				{
				setState(67);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__3:
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
					setState(65);
					stat();
					}
					break;
				case NEWLINE:
					{
					setState(66);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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
			setState(76);
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
				setState(74);
				simple_stat();
				}
				break;
			case T__1:
			case T__3:
			case COIL:
			case FANG:
			case SLITHERPLOT:
			case TRAINSNAKETRON:
			case STRIKE:
			case MAKENEST:
			case TRAIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
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
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				ifStatement();
				}
				break;
			case COIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				whileLoop();
				}
				break;
			case TRAIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				forLoop();
				}
				break;
			case FANG:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				functionDeclaration();
				}
				break;
			case TRAINSNAKETRON:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				snaketronTraining();
				}
				break;
			case MAKENEST:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				makeNest();
				}
				break;
			case T__1:
			case T__3:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				fileHandling();
				}
				break;
			case SLITHERPLOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				hiss();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				bite();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				spit();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
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
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(96);
				match(MINUS);
				setState(97);
				expr(10);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(NOT);
				setState(99);
				expr(9);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(LPAREN);
				setState(101);
				expr(0);
				setState(102);
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
				setState(104);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						((PowExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(108);
						match(POW);
						setState(109);
						((PowExprContext)_localctx).right = expr(11);
						}
						break;
					case 2:
						{
						_localctx = new MultDivModExprContext(new ExprContext(_parentctx, _parentState));
						((MultDivModExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(110);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(111);
						((MultDivModExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
							((MultDivModExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(112);
						((MultDivModExprContext)_localctx).right = expr(9);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						((AddSubExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(114);
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
						setState(115);
						((AddSubExprContext)_localctx).right = expr(8);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						((RelationalExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(116);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(117);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(118);
						((RelationalExprContext)_localctx).right = expr(7);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						((EqualityExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(120);
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
						setState(121);
						((EqualityExprContext)_localctx).right = expr(6);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						((AndExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(123);
						((AndExprContext)_localctx).op = match(AND);
						setState(124);
						((AndExprContext)_localctx).right = expr(5);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						((OrExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(126);
						((OrExprContext)_localctx).op = match(OR);
						setState(127);
						((OrExprContext)_localctx).right = expr(4);
						}
						break;
					}
					} 
				}
				setState(132);
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
	public static class NumericAtomContext extends AtomContext {
		public TerminalNode INT() { return getToken(CobraParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CobraParser.FLOAT, 0); }
		public NumericAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GrabScaleAtomContext extends AtomContext {
		public GrabScaleContext grabScale() {
			return getRuleContext(GrabScaleContext.class,0);
		}
		public GrabScaleAtomContext(AtomContext ctx) { copyFrom(ctx); }
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
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new NumericAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
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
				setState(134);
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
				setState(135);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new ArrayAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				scales();
				}
				break;
			case 5:
				_localctx = new ObjectAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				snake();
				}
				break;
			case 6:
				_localctx = new GrabScaleAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				grabScale();
				}
				break;
			case 7:
				_localctx = new AccessVariableAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				variable();
				}
				break;
			case 8:
				_localctx = new NullAtomContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
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
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(LBRACKET);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055544104583168L) != 0)) {
					{
					setState(144);
					expr(0);
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(145);
						match(COMMA);
						setState(146);
						expr(0);
						}
						}
						setState(151);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(154);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(LBRACKET);
				setState(156);
				((ScalesContext)_localctx).start = expr(0);
				setState(157);
				match(COLON);
				setState(161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(158);
					((ScalesContext)_localctx).step = expr(0);
					setState(159);
					match(COLON);
					}
					break;
				}
				setState(163);
				((ScalesContext)_localctx).end = expr(0);
				setState(164);
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
			setState(168);
			match(LBRACE);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(169);
				keyvalue();
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(170);
					match(COMMA);
					setState(171);
					keyvalue();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(179);
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
			setState(181);
			variable();
			setState(182);
			match(LBRACKET);
			setState(183);
			expr(0);
			setState(184);
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
			setState(186);
			match(ID);
			setState(187);
			match(COLON);
			setState(188);
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
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(ID);
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(191);
						match(POINT);
						setState(192);
						match(ID);
						}
						} 
					}
					setState(197);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(198);
					match(LPAREN);
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055544104583168L) != 0)) {
						{
						setState(199);
						expr(0);
						setState(204);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(200);
							match(COMMA);
							setState(201);
							expr(0);
							}
							}
							setState(206);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(209);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(ID);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POINT) {
					{
					{
					setState(213);
					match(POINT);
					setState(214);
					match(ID);
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				match(RBRACKET);
				setState(221);
				expr(0);
				setState(222);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			setState(226);
			match(SPIT);
			setState(227);
			expression(0);
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
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(BITE);
				setState(230);
				match(ID);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POINT) {
					{
					{
					setState(231);
					match(POINT);
					setState(232);
					match(ID);
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(FROM);
				setState(239);
				match(ID);
				setState(240);
				match(BITE);
				setState(241);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(244);
			match(HISS);
			setState(245);
			match(LPAREN);
			setState(246);
			expression(0);
			setState(247);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				controlStructure();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				snaketronTraining();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				dataPlotting();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(255);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CobraParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(258);
			match(ID);
			setState(259);
			match(T__0);
			setState(260);
			expression(0);
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
		public TerminalNode LPAREN() { return getToken(CobraParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CobraParser.RPAREN, 0); }
		public TerminalNode PLUS() { return getToken(CobraParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CobraParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(CobraParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CobraParser.DIV, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(263);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(264);
				match(FLOAT);
				}
				break;
			case ID:
				{
				setState(265);
				match(ID);
				}
				break;
			case LPAREN:
				{
				setState(266);
				match(LPAREN);
				setState(267);
				expression(0);
				setState(268);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(272);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(273);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 193273528320L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(274);
					expression(6);
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
	}

	public final ControlStructureContext controlStructure() throws RecognitionException {
		ControlStructureContext _localctx = new ControlStructureContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_controlStructure);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				ifStatement();
				}
				break;
			case TRAIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				forLoop();
				}
				break;
			case COIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
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
		public TerminalNode LPAREN() { return getToken(CobraParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CobraParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(CobraParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CobraParser.RBRACE, 0); }
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(STRIKE);
			setState(286);
			match(LPAREN);
			setState(287);
			expression(0);
			setState(288);
			match(RPAREN);
			setState(289);
			match(LBRACE);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 492581242803188L) != 0)) {
				{
				{
				setState(290);
				statement();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
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
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode TRAIL() { return getToken(CobraParser.TRAIL, 0); }
		public TerminalNode LPAREN() { return getToken(CobraParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(CobraParser.ID, 0); }
		public TerminalNode IN() { return getToken(CobraParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CobraParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(CobraParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CobraParser.RBRACE, 0); }
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
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(TRAIL);
			setState(299);
			match(LPAREN);
			setState(300);
			match(ID);
			setState(301);
			match(IN);
			setState(302);
			expression(0);
			setState(303);
			match(RPAREN);
			setState(304);
			match(LBRACE);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 492581242803188L) != 0)) {
				{
				{
				setState(305);
				statement();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
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
	public static class DataPlottingContext extends ParserRuleContext {
		public TerminalNode SLITHERPLOT() { return getToken(CobraParser.SLITHERPLOT, 0); }
		public TerminalNode LPAREN() { return getToken(CobraParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CobraParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(CobraParser.ID, 0); }
		public TerminalNode STRING() { return getToken(CobraParser.STRING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DataPlottingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataPlotting; }
	}

	public final DataPlottingContext dataPlotting() throws RecognitionException {
		DataPlottingContext _localctx = new DataPlottingContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dataPlotting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(SLITHERPLOT);
			setState(314);
			match(LPAREN);
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(315);
				match(ID);
				}
				break;
			case 2:
				{
				setState(316);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(317);
				expression(0);
				}
				break;
			}
			setState(320);
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
		public TerminalNode LPAREN() { return getToken(CobraParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CobraParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(CobraParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CobraParser.RBRACE, 0); }
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
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(COIL);
			setState(323);
			match(LPAREN);
			setState(324);
			expression(0);
			setState(325);
			match(RPAREN);
			setState(326);
			match(LBRACE);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 492581242803188L) != 0)) {
				{
				{
				setState(327);
				statement();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FANG() { return getToken(CobraParser.FANG, 0); }
		public List<TerminalNode> ID() { return getTokens(CobraParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CobraParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(CobraParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CobraParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(CobraParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CobraParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 48, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(FANG);
			setState(336);
			match(ID);
			setState(337);
			match(LPAREN);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(338);
				match(ID);
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(339);
					match(COMMA);
					setState(340);
					match(ID);
					}
					}
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(348);
			match(RPAREN);
			setState(349);
			match(LBRACE);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 492581242803188L) != 0)) {
				{
				{
				setState(350);
				statement();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
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
		enterRule(_localctx, 50, RULE_mlTraining);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(LPAREN);
			setState(359);
			match(ID);
			setState(360);
			match(COMMA);
			setState(361);
			match(ID);
			setState(362);
			match(LPAREN);
			setState(363);
			match(LBRACE);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 492581242803188L) != 0)) {
				{
				{
				setState(364);
				statement();
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
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
		enterRule(_localctx, 52, RULE_snaketronTraining);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(TRAINSNAKETRON);
			setState(373);
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
		enterRule(_localctx, 54, RULE_makeNest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(MAKENEST);
			setState(376);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FileHandlingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileHandling; }
	}

	public final FileHandlingContext fileHandling() throws RecognitionException {
		FileHandlingContext _localctx = new FileHandlingContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fileHandling);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(T__1);
				setState(379);
				match(LPAREN);
				setState(380);
				match(STRING);
				setState(381);
				match(RPAREN);
				setState(382);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(T__3);
				setState(384);
				match(LPAREN);
				setState(385);
				match(STRING);
				setState(386);
				match(COMMA);
				setState(387);
				expression(0);
				setState(388);
				match(RPAREN);
				setState(389);
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
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
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
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00013\u018a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0003\u0000=\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002"+
		"D\b\u0002\n\u0002\f\u0002G\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003M\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"W\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005^\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006j\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u0081\b\u0006\n\u0006\f\u0006\u0084\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u008e\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0094\b\b"+
		"\n\b\f\b\u0097\t\b\u0003\b\u0099\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00a2\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a7"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00ad\b\t\n\t\f\t\u00b0\t"+
		"\t\u0003\t\u00b2\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u00c2\b\f\n\f\f\f\u00c5\t\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0005\f\u00cb\b\f\n\f\f\f\u00ce\t\f\u0003\f\u00d0\b\f\u0001\f\u0003\f"+
		"\u00d3\b\f\u0001\f\u0001\f\u0001\f\u0005\f\u00d8\b\f\n\f\f\f\u00db\t\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e1\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ea\b"+
		"\u000e\n\u000e\f\u000e\u00ed\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00f3\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0101\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u010f\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0114\b"+
		"\u0012\n\u0012\f\u0012\u0117\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u011c\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0124\b\u0014\n\u0014\f\u0014\u0127"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0133"+
		"\b\u0015\n\u0015\f\u0015\u0136\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u013f\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u0149\b\u0017\n\u0017\f\u0017\u014c"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0156\b\u0018\n\u0018\f\u0018"+
		"\u0159\t\u0018\u0003\u0018\u015b\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0160\b\u0018\n\u0018\f\u0018\u0163\t\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u016e\b\u0019\n\u0019\f\u0019\u0171"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0188\b\u001c\u0001"+
		"\u001c\u0000\u0002\f$\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0007\u0001"+
		"\u0000\"$\u0002\u0000  %%\u0001\u0000&)\u0001\u0000*+\u0001\u0000/0\u0001"+
		"\u0000\u0011\u0012\u0003\u0000  \"#%%\u01b0\u0000<\u0001\u0000\u0000\u0000"+
		"\u0002>\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000\u0000\u0006L"+
		"\u0001\u0000\u0000\u0000\bV\u0001\u0000\u0000\u0000\n]\u0001\u0000\u0000"+
		"\u0000\fi\u0001\u0000\u0000\u0000\u000e\u008d\u0001\u0000\u0000\u0000"+
		"\u0010\u00a6\u0001\u0000\u0000\u0000\u0012\u00a8\u0001\u0000\u0000\u0000"+
		"\u0014\u00b5\u0001\u0000\u0000\u0000\u0016\u00ba\u0001\u0000\u0000\u0000"+
		"\u0018\u00e0\u0001\u0000\u0000\u0000\u001a\u00e2\u0001\u0000\u0000\u0000"+
		"\u001c\u00f2\u0001\u0000\u0000\u0000\u001e\u00f4\u0001\u0000\u0000\u0000"+
		" \u0100\u0001\u0000\u0000\u0000\"\u0102\u0001\u0000\u0000\u0000$\u010e"+
		"\u0001\u0000\u0000\u0000&\u011b\u0001\u0000\u0000\u0000(\u011d\u0001\u0000"+
		"\u0000\u0000*\u012a\u0001\u0000\u0000\u0000,\u0139\u0001\u0000\u0000\u0000"+
		".\u0142\u0001\u0000\u0000\u00000\u014f\u0001\u0000\u0000\u00002\u0166"+
		"\u0001\u0000\u0000\u00004\u0174\u0001\u0000\u0000\u00006\u0177\u0001\u0000"+
		"\u0000\u00008\u0187\u0001\u0000\u0000\u0000:=\u0003\u0002\u0001\u0000"+
		";=\u0003\u0004\u0002\u0000<:\u0001\u0000\u0000\u0000<;\u0001\u0000\u0000"+
		"\u0000=\u0001\u0001\u0000\u0000\u0000>?\u0003\u0006\u0003\u0000?@\u0005"+
		"2\u0000\u0000@\u0003\u0001\u0000\u0000\u0000AD\u0003\u0006\u0003\u0000"+
		"BD\u00052\u0000\u0000CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u0000"+
		"\u0000\u0001I\u0005\u0001\u0000\u0000\u0000JM\u0003\n\u0005\u0000KM\u0003"+
		"\b\u0004\u0000LJ\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000M\u0007"+
		"\u0001\u0000\u0000\u0000NW\u0003(\u0014\u0000OW\u0003.\u0017\u0000PW\u0003"+
		"*\u0015\u0000QW\u00030\u0018\u0000RW\u00034\u001a\u0000SW\u00036\u001b"+
		"\u0000TW\u00038\u001c\u0000UW\u0003,\u0016\u0000VN\u0001\u0000\u0000\u0000"+
		"VO\u0001\u0000\u0000\u0000VP\u0001\u0000\u0000\u0000VQ\u0001\u0000\u0000"+
		"\u0000VR\u0001\u0000\u0000\u0000VS\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000VU\u0001\u0000\u0000\u0000W\t\u0001\u0000\u0000\u0000X^\u0003"+
		"\"\u0011\u0000Y^\u0003\u001e\u000f\u0000Z^\u0003\u001c\u000e\u0000[^\u0003"+
		"\u001a\r\u0000\\^\u0003\u000e\u0007\u0000]X\u0001\u0000\u0000\u0000]Y"+
		"\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000]\\\u0001\u0000\u0000\u0000^\u000b\u0001\u0000\u0000\u0000_`\u0006"+
		"\u0006\uffff\uffff\u0000`a\u0005 \u0000\u0000aj\u0003\f\u0006\nbc\u0005"+
		"!\u0000\u0000cj\u0003\f\u0006\tde\u0005\u0019\u0000\u0000ef\u0003\f\u0006"+
		"\u0000fg\u0005\u001a\u0000\u0000gj\u0001\u0000\u0000\u0000hj\u0003\u000e"+
		"\u0007\u0000i_\u0001\u0000\u0000\u0000ib\u0001\u0000\u0000\u0000id\u0001"+
		"\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000j\u0082\u0001\u0000\u0000"+
		"\u0000kl\n\u000b\u0000\u0000lm\u0005\u001f\u0000\u0000m\u0081\u0003\f"+
		"\u0006\u000bno\n\b\u0000\u0000op\u0007\u0000\u0000\u0000p\u0081\u0003"+
		"\f\u0006\tqr\n\u0007\u0000\u0000rs\u0007\u0001\u0000\u0000s\u0081\u0003"+
		"\f\u0006\btu\n\u0006\u0000\u0000uv\u0007\u0002\u0000\u0000v\u0081\u0003"+
		"\f\u0006\u0007wx\n\u0005\u0000\u0000xy\u0007\u0003\u0000\u0000y\u0081"+
		"\u0003\f\u0006\u0006z{\n\u0004\u0000\u0000{|\u0005,\u0000\u0000|\u0081"+
		"\u0003\f\u0006\u0005}~\n\u0003\u0000\u0000~\u007f\u0005-\u0000\u0000\u007f"+
		"\u0081\u0003\f\u0006\u0004\u0080k\u0001\u0000\u0000\u0000\u0080n\u0001"+
		"\u0000\u0000\u0000\u0080q\u0001\u0000\u0000\u0000\u0080t\u0001\u0000\u0000"+
		"\u0000\u0080w\u0001\u0000\u0000\u0000\u0080z\u0001\u0000\u0000\u0000\u0080"+
		"}\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\r\u0001"+
		"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u008e\u0007"+
		"\u0004\u0000\u0000\u0086\u008e\u0007\u0005\u0000\u0000\u0087\u008e\u0005"+
		"1\u0000\u0000\u0088\u008e\u0003\u0010\b\u0000\u0089\u008e\u0003\u0012"+
		"\t\u0000\u008a\u008e\u0003\u0014\n\u0000\u008b\u008e\u0003\u0018\f\u0000"+
		"\u008c\u008e\u0005\u0015\u0000\u0000\u008d\u0085\u0001\u0000\u0000\u0000"+
		"\u008d\u0086\u0001\u0000\u0000\u0000\u008d\u0087\u0001\u0000\u0000\u0000"+
		"\u008d\u0088\u0001\u0000\u0000\u0000\u008d\u0089\u0001\u0000\u0000\u0000"+
		"\u008d\u008a\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u000f\u0001\u0000\u0000\u0000"+
		"\u008f\u0098\u0005\u0016\u0000\u0000\u0090\u0095\u0003\f\u0006\u0000\u0091"+
		"\u0092\u0005\u001d\u0000\u0000\u0092\u0094\u0003\f\u0006\u0000\u0093\u0091"+
		"\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0099"+
		"\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0090"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0001\u0000\u0000\u0000\u009a\u00a7\u0005\u0017\u0000\u0000\u009b\u009c"+
		"\u0005\u0016\u0000\u0000\u009c\u009d\u0003\f\u0006\u0000\u009d\u00a1\u0005"+
		"\u001e\u0000\u0000\u009e\u009f\u0003\f\u0006\u0000\u009f\u00a0\u0005\u001e"+
		"\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0003\f\u0006\u0000\u00a4\u00a5\u0005\u0017\u0000"+
		"\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u008f\u0001\u0000\u0000"+
		"\u0000\u00a6\u009b\u0001\u0000\u0000\u0000\u00a7\u0011\u0001\u0000\u0000"+
		"\u0000\u00a8\u00b1\u0005\u0018\u0000\u0000\u00a9\u00ae\u0003\u0016\u000b"+
		"\u0000\u00aa\u00ab\u0005\u001d\u0000\u0000\u00ab\u00ad\u0003\u0016\u000b"+
		"\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b1\u00a9\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u001b\u0000"+
		"\u0000\u00b4\u0013\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003\u0018\f\u0000"+
		"\u00b6\u00b7\u0005\u0016\u0000\u0000\u00b7\u00b8\u0003\f\u0006\u0000\u00b8"+
		"\u00b9\u0005\u0017\u0000\u0000\u00b9\u0015\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0005.\u0000\u0000\u00bb\u00bc\u0005\u001e\u0000\u0000\u00bc\u00bd"+
		"\u0003\f\u0006\u0000\u00bd\u0017\u0001\u0000\u0000\u0000\u00be\u00c3\u0005"+
		".\u0000\u0000\u00bf\u00c0\u0005\u001c\u0000\u0000\u00c0\u00c2\u0005.\u0000"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00d2\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c6\u00cf\u0005\u0019\u0000\u0000\u00c7\u00cc\u0003\f\u0006\u0000"+
		"\u00c8\u00c9\u0005\u001d\u0000\u0000\u00c9\u00cb\u0003\f\u0006\u0000\u00ca"+
		"\u00c8\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf"+
		"\u00c7\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0005\u001a\u0000\u0000\u00d2"+
		"\u00c6\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3"+
		"\u00e1\u0001\u0000\u0000\u0000\u00d4\u00d9\u0005.\u0000\u0000\u00d5\u00d6"+
		"\u0005\u001c\u0000\u0000\u00d6\u00d8\u0005.\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00dc\u0001"+
		"\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005"+
		"\u0017\u0000\u0000\u00dd\u00de\u0003\f\u0006\u0000\u00de\u00df\u0005\u0016"+
		"\u0000\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00be\u0001\u0000"+
		"\u0000\u0000\u00e0\u00d4\u0001\u0000\u0000\u0000\u00e1\u0019\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0005\u0013\u0000\u0000\u00e3\u00e4\u0003$\u0012"+
		"\u0000\u00e4\u001b\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u000e\u0000"+
		"\u0000\u00e6\u00eb\u0005.\u0000\u0000\u00e7\u00e8\u0005\u001c\u0000\u0000"+
		"\u00e8\u00ea\u0005.\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea"+
		"\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ec\u00f3\u0001\u0000\u0000\u0000\u00ed"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u000f\u0000\u0000\u00ef"+
		"\u00f0\u0005.\u0000\u0000\u00f0\u00f1\u0005\u000e\u0000\u0000\u00f1\u00f3"+
		"\u0005.\u0000\u0000\u00f2\u00e5\u0001\u0000\u0000\u0000\u00f2\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f3\u001d\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005"+
		"\r\u0000\u0000\u00f5\u00f6\u0005\u0019\u0000\u0000\u00f6\u00f7\u0003$"+
		"\u0012\u0000\u00f7\u00f8\u0005\u001a\u0000\u0000\u00f8\u001f\u0001\u0000"+
		"\u0000\u0000\u00f9\u0101\u0003\"\u0011\u0000\u00fa\u0101\u0003$\u0012"+
		"\u0000\u00fb\u0101\u0003&\u0013\u0000\u00fc\u0101\u00030\u0018\u0000\u00fd"+
		"\u0101\u00034\u001a\u0000\u00fe\u0101\u0003,\u0016\u0000\u00ff\u0101\u0003"+
		"8\u001c\u0000\u0100\u00f9\u0001\u0000\u0000\u0000\u0100\u00fa\u0001\u0000"+
		"\u0000\u0000\u0100\u00fb\u0001\u0000\u0000\u0000\u0100\u00fc\u0001\u0000"+
		"\u0000\u0000\u0100\u00fd\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101!\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0005.\u0000\u0000\u0103\u0104\u0005\u0001\u0000\u0000"+
		"\u0104\u0105\u0003$\u0012\u0000\u0105#\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0006\u0012\uffff\uffff\u0000\u0107\u010f\u0005/\u0000\u0000\u0108\u010f"+
		"\u00050\u0000\u0000\u0109\u010f\u0005.\u0000\u0000\u010a\u010b\u0005\u0019"+
		"\u0000\u0000\u010b\u010c\u0003$\u0012\u0000\u010c\u010d\u0005\u001a\u0000"+
		"\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u0106\u0001\u0000\u0000"+
		"\u0000\u010e\u0108\u0001\u0000\u0000\u0000\u010e\u0109\u0001\u0000\u0000"+
		"\u0000\u010e\u010a\u0001\u0000\u0000\u0000\u010f\u0115\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\n\u0005\u0000\u0000\u0111\u0112\u0007\u0006\u0000\u0000"+
		"\u0112\u0114\u0003$\u0012\u0006\u0113\u0110\u0001\u0000\u0000\u0000\u0114"+
		"\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0116%\u0001\u0000\u0000\u0000\u0117\u0115"+
		"\u0001\u0000\u0000\u0000\u0118\u011c\u0003(\u0014\u0000\u0119\u011c\u0003"+
		"*\u0015\u0000\u011a\u011c\u0003.\u0017\u0000\u011b\u0118\u0001\u0000\u0000"+
		"\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011a\u0001\u0000\u0000"+
		"\u0000\u011c\'\u0001\u0000\u0000\u0000\u011d\u011e\u0005\t\u0000\u0000"+
		"\u011e\u011f\u0005\u0019\u0000\u0000\u011f\u0120\u0003$\u0012\u0000\u0120"+
		"\u0121\u0005\u001a\u0000\u0000\u0121\u0125\u0005\u0018\u0000\u0000\u0122"+
		"\u0124\u0003 \u0010\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124\u0127"+
		"\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0001\u0000\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u001b\u0000\u0000\u0129)\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0005\f\u0000\u0000\u012b\u012c\u0005\u0019"+
		"\u0000\u0000\u012c\u012d\u0005.\u0000\u0000\u012d\u012e\u0005\u000b\u0000"+
		"\u0000\u012e\u012f\u0003$\u0012\u0000\u012f\u0130\u0005\u001a\u0000\u0000"+
		"\u0130\u0134\u0005\u0018\u0000\u0000\u0131\u0133\u0003 \u0010\u0000\u0132"+
		"\u0131\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134"+
		"\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135"+
		"\u0137\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0005\u001b\u0000\u0000\u0138+\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0005\u0007\u0000\u0000\u013a\u013e\u0005\u0019\u0000\u0000\u013b\u013f"+
		"\u0005.\u0000\u0000\u013c\u013f\u00051\u0000\u0000\u013d\u013f\u0003$"+
		"\u0012\u0000\u013e\u013b\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000"+
		"\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0005\u001a\u0000\u0000\u0141-\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u0005\u0005\u0000\u0000\u0143\u0144\u0005\u0019\u0000"+
		"\u0000\u0144\u0145\u0003$\u0012\u0000\u0145\u0146\u0005\u001a\u0000\u0000"+
		"\u0146\u014a\u0005\u0018\u0000\u0000\u0147\u0149\u0003 \u0010\u0000\u0148"+
		"\u0147\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a"+
		"\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b"+
		"\u014d\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0005\u001b\u0000\u0000\u014e/\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0005\u0006\u0000\u0000\u0150\u0151\u0005.\u0000\u0000\u0151\u015a\u0005"+
		"\u0019\u0000\u0000\u0152\u0157\u0005.\u0000\u0000\u0153\u0154\u0005\u001d"+
		"\u0000\u0000\u0154\u0156\u0005.\u0000\u0000\u0155\u0153\u0001\u0000\u0000"+
		"\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000"+
		"\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u0152\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000"+
		"\u0000\u015c\u015d\u0005\u001a\u0000\u0000\u015d\u0161\u0005\u0018\u0000"+
		"\u0000\u015e\u0160\u0003 \u0010\u0000\u015f\u015e\u0001\u0000\u0000\u0000"+
		"\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000"+
		"\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0164\u0001\u0000\u0000\u0000"+
		"\u0163\u0161\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u001b\u0000\u0000"+
		"\u01651\u0001\u0000\u0000\u0000\u0166\u0167\u0005\u0019\u0000\u0000\u0167"+
		"\u0168\u0005.\u0000\u0000\u0168\u0169\u0005\u001d\u0000\u0000\u0169\u016a"+
		"\u0005.\u0000\u0000\u016a\u016b\u0005\u0019\u0000\u0000\u016b\u016f\u0005"+
		"\u0018\u0000\u0000\u016c\u016e\u0003 \u0010\u0000\u016d\u016c\u0001\u0000"+
		"\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000"+
		"\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0172\u0001\u0000"+
		"\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0173\u0005\u001b"+
		"\u0000\u0000\u01733\u0001\u0000\u0000\u0000\u0174\u0175\u0005\b\u0000"+
		"\u0000\u0175\u0176\u00032\u0019\u0000\u01765\u0001\u0000\u0000\u0000\u0177"+
		"\u0178\u0005\n\u0000\u0000\u0178\u0179\u00032\u0019\u0000\u01797\u0001"+
		"\u0000\u0000\u0000\u017a\u017b\u0005\u0002\u0000\u0000\u017b\u017c\u0005"+
		"\u0019\u0000\u0000\u017c\u017d\u00051\u0000\u0000\u017d\u017e\u0005\u001a"+
		"\u0000\u0000\u017e\u0188\u0005\u0003\u0000\u0000\u017f\u0180\u0005\u0004"+
		"\u0000\u0000\u0180\u0181\u0005\u0019\u0000\u0000\u0181\u0182\u00051\u0000"+
		"\u0000\u0182\u0183\u0005\u001d\u0000\u0000\u0183\u0184\u0003$\u0012\u0000"+
		"\u0184\u0185\u0005\u001a\u0000\u0000\u0185\u0186\u0005\u0003\u0000\u0000"+
		"\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u017a\u0001\u0000\u0000\u0000"+
		"\u0187\u017f\u0001\u0000\u0000\u0000\u01889\u0001\u0000\u0000\u0000%<"+
		"CELV]i\u0080\u0082\u008d\u0095\u0098\u00a1\u00a6\u00ae\u00b1\u00c3\u00cc"+
		"\u00cf\u00d2\u00d9\u00e0\u00eb\u00f2\u0100\u010e\u0115\u011b\u0125\u0134"+
		"\u013e\u014a\u0157\u015a\u0161\u016f\u0187";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}