// Generated from /home/scorel/Documents/projects/CompiladoresDSL/Imp.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ImpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, OP=11, NUMBER=12, VAR=13, TYPE=14, ESPACOS=15;
	public static final int
		RULE_start = 0, RULE_command = 1, RULE_expression = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "command", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'('", "')'", "';'", "'='", "'{'", "'}'", "'if'", "'else'", 
			"'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "OP", 
			"NUMBER", "VAR", "TYPE", "ESPACOS"
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
	public String getGrammarFileName() { return "Imp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ImpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ImpParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			command();
			setState(7);
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
	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends CommandContext {
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(CommandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribContext extends CommandContext {
		public Token v;
		public ExpressionContext e;
		public TerminalNode VAR() { return getToken(ImpParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AtribContext(CommandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecContext extends CommandContext {
		public Token type;
		public Token name;
		public ExpressionContext vInic;
		public TerminalNode TYPE() { return getToken(ImpParser.TYPE, 0); }
		public TerminalNode VAR() { return getToken(ImpParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DecContext(CommandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends CommandContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public BlockContext(CommandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends CommandContext {
		public ExpressionContext e;
		public CommandContext cRep;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public WhileContext(CommandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends CommandContext {
		public ExpressionContext e;
		public CommandContext cTrue;
		public CommandContext cFalse;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public IfContext(CommandContext ctx) { copyFrom(ctx); }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(9);
				match(T__0);
				setState(10);
				match(T__1);
				setState(11);
				((PrintContext)_localctx).e = expression(0);
				setState(12);
				match(T__2);
				setState(13);
				match(T__3);
				}
				break;
			case VAR:
				_localctx = new AtribContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				((AtribContext)_localctx).v = match(VAR);
				setState(16);
				match(T__4);
				setState(17);
				((AtribContext)_localctx).e = expression(0);
				setState(18);
				match(T__3);
				}
				break;
			case T__5:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				match(T__5);
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 25922L) != 0)) {
					{
					{
					setState(21);
					command();
					}
					}
					setState(26);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(27);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				match(T__7);
				setState(29);
				match(T__1);
				setState(30);
				((IfContext)_localctx).e = expression(0);
				setState(31);
				match(T__2);
				setState(32);
				((IfContext)_localctx).cTrue = command();
				setState(33);
				match(T__8);
				setState(34);
				((IfContext)_localctx).cFalse = command();
				}
				break;
			case T__9:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				match(T__9);
				setState(37);
				match(T__1);
				setState(38);
				((WhileContext)_localctx).e = expression(0);
				setState(39);
				match(T__2);
				setState(40);
				((WhileContext)_localctx).cRep = command();
				}
				break;
			case TYPE:
				_localctx = new DecContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
				((DecContext)_localctx).type = match(TYPE);
				setState(43);
				((DecContext)_localctx).name = match(VAR);
				setState(44);
				match(T__4);
				setState(45);
				((DecContext)_localctx).vInic = expression(0);
				setState(46);
				match(T__3);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupContext extends ExpressionContext {
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ExpressionContext {
		public ExpressionContext e;
		public Token o;
		public ExpressionContext d;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP() { return getToken(ImpParser.OP, 0); }
		public OpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ExpressionContext {
		public Token n;
		public TerminalNode VAR() { return getToken(ImpParser.VAR, 0); }
		public VarContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstContext extends ExpressionContext {
		public Token n;
		public TerminalNode NUMBER() { return getToken(ImpParser.NUMBER, 0); }
		public ConstContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				((ConstContext)_localctx).n = match(NUMBER);
				}
				break;
			case VAR:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				((VarContext)_localctx).n = match(VAR);
				}
				break;
			case T__1:
				{
				_localctx = new GroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(T__1);
				setState(54);
				((GroupContext)_localctx).e = expression(0);
				setState(55);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpContext(new ExpressionContext(_parentctx, _parentState));
					((OpContext)_localctx).e = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(59);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(60);
					((OpContext)_localctx).o = match(OP);
					setState(61);
					((OpContext)_localctx).d = expression(3);
					}
					} 
				}
				setState(66);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000fD\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u0017\b\u0001\n\u0001\f\u0001\u001a\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u00011\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002:\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002?\b\u0002\n\u0002\f\u0002"+
		"B\t\u0002\u0001\u0002\u0000\u0001\u0004\u0003\u0000\u0002\u0004\u0000"+
		"\u0000I\u0000\u0006\u0001\u0000\u0000\u0000\u00020\u0001\u0000\u0000\u0000"+
		"\u00049\u0001\u0000\u0000\u0000\u0006\u0007\u0003\u0002\u0001\u0000\u0007"+
		"\b\u0005\u0000\u0000\u0001\b\u0001\u0001\u0000\u0000\u0000\t\n\u0005\u0001"+
		"\u0000\u0000\n\u000b\u0005\u0002\u0000\u0000\u000b\f\u0003\u0004\u0002"+
		"\u0000\f\r\u0005\u0003\u0000\u0000\r\u000e\u0005\u0004\u0000\u0000\u000e"+
		"1\u0001\u0000\u0000\u0000\u000f\u0010\u0005\r\u0000\u0000\u0010\u0011"+
		"\u0005\u0005\u0000\u0000\u0011\u0012\u0003\u0004\u0002\u0000\u0012\u0013"+
		"\u0005\u0004\u0000\u0000\u00131\u0001\u0000\u0000\u0000\u0014\u0018\u0005"+
		"\u0006\u0000\u0000\u0015\u0017\u0003\u0002\u0001\u0000\u0016\u0015\u0001"+
		"\u0000\u0000\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u0016\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001b\u0001"+
		"\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b1\u0005\u0007"+
		"\u0000\u0000\u001c\u001d\u0005\b\u0000\u0000\u001d\u001e\u0005\u0002\u0000"+
		"\u0000\u001e\u001f\u0003\u0004\u0002\u0000\u001f \u0005\u0003\u0000\u0000"+
		" !\u0003\u0002\u0001\u0000!\"\u0005\t\u0000\u0000\"#\u0003\u0002\u0001"+
		"\u0000#1\u0001\u0000\u0000\u0000$%\u0005\n\u0000\u0000%&\u0005\u0002\u0000"+
		"\u0000&\'\u0003\u0004\u0002\u0000\'(\u0005\u0003\u0000\u0000()\u0003\u0002"+
		"\u0001\u0000)1\u0001\u0000\u0000\u0000*+\u0005\u000e\u0000\u0000+,\u0005"+
		"\r\u0000\u0000,-\u0005\u0005\u0000\u0000-.\u0003\u0004\u0002\u0000./\u0005"+
		"\u0004\u0000\u0000/1\u0001\u0000\u0000\u00000\t\u0001\u0000\u0000\u0000"+
		"0\u000f\u0001\u0000\u0000\u00000\u0014\u0001\u0000\u0000\u00000\u001c"+
		"\u0001\u0000\u0000\u00000$\u0001\u0000\u0000\u00000*\u0001\u0000\u0000"+
		"\u00001\u0003\u0001\u0000\u0000\u000023\u0006\u0002\uffff\uffff\u0000"+
		"3:\u0005\f\u0000\u00004:\u0005\r\u0000\u000056\u0005\u0002\u0000\u0000"+
		"67\u0003\u0004\u0002\u000078\u0005\u0003\u0000\u00008:\u0001\u0000\u0000"+
		"\u000092\u0001\u0000\u0000\u000094\u0001\u0000\u0000\u000095\u0001\u0000"+
		"\u0000\u0000:@\u0001\u0000\u0000\u0000;<\n\u0002\u0000\u0000<=\u0005\u000b"+
		"\u0000\u0000=?\u0003\u0004\u0002\u0003>;\u0001\u0000\u0000\u0000?B\u0001"+
		"\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"A\u0005\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000\u0004\u0018"+
		"09@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}