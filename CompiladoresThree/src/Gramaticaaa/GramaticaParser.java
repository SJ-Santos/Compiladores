// Generated from Gramatica.g4 by ANTLR 4.13.1
package  Gramaticaaa;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, NEWLINE=58, ID=59, NUM_INT=60, 
		NUM_DEC=61, TEXTO=62;
	public static final int
		RULE_programa = 0, RULE_declaracao = 1, RULE_printar = 2, RULE_declaracaovariavel = 3, 
		RULE_tipo = 4, RULE_declaracaofuncao = 5, RULE_parametros = 6, RULE_parametro = 7, 
		RULE_bloco = 8, RULE_expressao = 9, RULE_atribuicao = 10, RULE_atribuicaomatematica = 11, 
		RULE_comparacao = 12, RULE_operator = 13, RULE_retorno = 14, RULE_estruturacontrole = 15, 
		RULE_caselista = 16, RULE_operatorfor = 17, RULE_casedecl = 18, RULE_declaracaoestrutura = 19, 
		RULE_array = 20, RULE_arrayinicializacao = 21, RULE_expressaolista = 22, 
		RULE_expressaologica = 23, RULE_expressaorelacional = 24, RULE_expressaoaritmetica = 25, 
		RULE_expressaomultiplicativa = 26, RULE_expressaounaria = 27, RULE_expressaopostfix = 28, 
		RULE_argumentos = 29, RULE_primaria = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracao", "printar", "declaracaovariavel", "tipo", "declaracaofuncao", 
			"parametros", "parametro", "bloco", "expressao", "atribuicao", "atribuicaomatematica", 
			"comparacao", "operator", "retorno", "estruturacontrole", "caselista", 
			"operatorfor", "casedecl", "declaracaoestrutura", "array", "arrayinicializacao", 
			"expressaolista", "expressaologica", "expressaorelacional", "expressaoaritmetica", 
			"expressaomultiplicativa", "expressaounaria", "expressaopostfix", "argumentos", 
			"primaria"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println'", "'('", "')'", "';'", "'='", "'+'", "'/'", "'-'", "'*'", 
			"'[]'", "'int'", "'float'", "'double'", "'char'", "'boolean'", "'void'", 
			"','", "'{'", "'}'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&&='", 
			"'||='", "'%'", "'=='", "'>='", "'<='", "'<'", "'>'", "'return'", "'null'", 
			"'if'", "'else'", "'while'", "'for'", "'= '", "'.length'", "'++'", "'--'", 
			"'switch'", "'break'", "'continue'", "'case'", "':'", "'default'", "'struct'", 
			"'['", "']'", "'&&'", "'||'", "'!'", "'!='", "'.'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "NEWLINE", 
			"ID", "NUM_INT", "NUM_DEC", "TEXTO"
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
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GramaticaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramaticaParser.NEWLINE, i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				declaracao();
				setState(64);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(63);
					match(NEWLINE);
					}
					break;
				}
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 288855362344450050L) != 0) );
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
	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaovariavelContext declaracaovariavel() {
			return getRuleContext(DeclaracaovariavelContext.class,0);
		}
		public DeclaracaofuncaoContext declaracaofuncao() {
			return getRuleContext(DeclaracaofuncaoContext.class,0);
		}
		public DeclaracaoestruturaContext declaracaoestrutura() {
			return getRuleContext(DeclaracaoestruturaContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public EstruturacontroleContext estruturacontrole() {
			return getRuleContext(EstruturacontroleContext.class,0);
		}
		public PrintarContext printar() {
			return getRuleContext(PrintarContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				declaracaovariavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				declaracaofuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				declaracaoestrutura();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				retorno();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				estruturacontrole();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				printar();
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
	public static class PrintarContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(GramaticaParser.TEXTO, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode NUM_INT() { return getToken(GramaticaParser.NUM_INT, 0); }
		public TerminalNode NUM_DEC() { return getToken(GramaticaParser.NUM_DEC, 0); }
		public PrintarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrintar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrintar(this);
		}
	}

	public final PrintarContext printar() throws RecognitionException {
		PrintarContext _localctx = new PrintarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_printar);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(T__0);
				setState(79);
				match(T__1);
				setState(80);
				match(TEXTO);
				setState(81);
				match(T__2);
				setState(82);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(T__0);
				setState(84);
				match(T__1);
				setState(85);
				match(ID);
				setState(86);
				match(T__2);
				setState(87);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(T__0);
				setState(89);
				match(T__1);
				setState(90);
				match(NUM_INT);
				setState(91);
				match(T__2);
				setState(92);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(T__0);
				setState(94);
				match(T__1);
				setState(95);
				match(NUM_DEC);
				setState(96);
				match(T__2);
				setState(97);
				match(T__3);
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
	public static class DeclaracaovariavelContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<AtribuicaomatematicaContext> atribuicaomatematica() {
			return getRuleContexts(AtribuicaomatematicaContext.class);
		}
		public AtribuicaomatematicaContext atribuicaomatematica(int i) {
			return getRuleContext(AtribuicaomatematicaContext.class,i);
		}
		public TerminalNode TEXTO() { return getToken(GramaticaParser.TEXTO, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayinicializacaoContext arrayinicializacao() {
			return getRuleContext(ArrayinicializacaoContext.class,0);
		}
		public DeclaracaovariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaovariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaracaovariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaracaovariavel(this);
		}
	}

	public final DeclaracaovariavelContext declaracaovariavel() throws RecognitionException {
		DeclaracaovariavelContext _localctx = new DeclaracaovariavelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracaovariavel);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				tipo();
				setState(101);
				match(ID);
				setState(102);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				tipo();
				setState(105);
				match(ID);
				setState(106);
				match(T__4);
				setState(107);
				expressao();
				setState(108);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				tipo();
				setState(111);
				match(ID);
				setState(112);
				match(T__4);
				setState(113);
				match(T__1);
				setState(114);
				atribuicaomatematica();
				setState(115);
				match(T__2);
				setState(122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(116);
					atribuicaomatematica();
					}
					break;
				case 2:
					{
					setState(117);
					match(T__5);
					}
					break;
				case 3:
					{
					setState(118);
					match(T__6);
					}
					break;
				case 4:
					{
					setState(119);
					match(T__7);
					}
					break;
				case 5:
					{
					setState(120);
					match(T__8);
					}
					break;
				case 6:
					{
					}
					break;
				}
				setState(124);
				atribuicaomatematica();
				setState(125);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				tipo();
				setState(128);
				match(ID);
				setState(129);
				match(T__9);
				setState(130);
				match(T__4);
				setState(131);
				match(TEXTO);
				setState(132);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				tipo();
				setState(135);
				array();
				setState(136);
				match(T__3);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				tipo();
				setState(139);
				array();
				setState(140);
				match(T__4);
				setState(141);
				arrayinicializacao();
				setState(142);
				match(T__3);
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
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 129024L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class DeclaracaofuncaoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DeclaracaofuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaofuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaracaofuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaracaofuncao(this);
		}
	}

	public final DeclaracaofuncaoContext declaracaofuncao() throws RecognitionException {
		DeclaracaofuncaoContext _localctx = new DeclaracaofuncaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracaofuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			tipo();
			setState(149);
			match(ID);
			setState(150);
			match(T__1);
			setState(151);
			parametros();
			setState(152);
			match(T__2);
			setState(153);
			bloco();
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
	public static class ParametrosContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametros);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				parametro();
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(156);
					match(T__16);
					setState(157);
					parametros();
					}
				}

				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametro);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				tipo();
				setState(164);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				tipo();
				setState(167);
				match(ID);
				setState(168);
				match(T__9);
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
	public static class BlocoContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GramaticaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GramaticaParser.NEWLINE, i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloco);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__17);
			{
			setState(174); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(173);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(176); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
			setState(181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(178);
				declaracao();
				setState(179);
				match(NEWLINE);
				}
				}
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 288855362344450050L) != 0) );
			setState(185);
			match(T__18);
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
	public static class ExpressaoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public AtribuicaomatematicaContext atribuicaomatematica() {
			return getRuleContext(AtribuicaomatematicaContext.class,0);
		}
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public PrintarContext printar() {
			return getRuleContext(PrintarContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressao);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				atribuicaomatematica();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				comparacao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				printar();
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
	public static class AtribuicaoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode NUM_DEC() { return getToken(GramaticaParser.NUM_DEC, 0); }
		public TerminalNode NUM_INT() { return getToken(GramaticaParser.NUM_INT, 0); }
		public TerminalNode TEXTO() { return getToken(GramaticaParser.TEXTO, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atribuicao);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(ID);
				setState(194);
				match(T__4);
				setState(195);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(ID);
				setState(197);
				match(T__19);
				setState(198);
				expressao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(ID);
				setState(200);
				match(T__20);
				setState(201);
				expressao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				match(ID);
				setState(203);
				match(T__21);
				setState(204);
				expressao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				match(ID);
				setState(206);
				match(T__22);
				setState(207);
				expressao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(208);
				match(ID);
				setState(209);
				match(T__23);
				setState(210);
				expressao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(211);
				match(ID);
				setState(212);
				match(T__24);
				setState(213);
				expressao();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(214);
				match(ID);
				setState(215);
				match(T__25);
				setState(216);
				expressao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(217);
				match(ID);
				setState(218);
				match(T__4);
				setState(219);
				match(ID);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(220);
				match(ID);
				setState(221);
				match(T__19);
				setState(222);
				match(ID);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(223);
				match(ID);
				setState(224);
				match(T__20);
				setState(225);
				match(ID);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(226);
				match(ID);
				setState(227);
				match(T__21);
				setState(228);
				match(ID);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(229);
				match(ID);
				setState(230);
				match(T__22);
				setState(231);
				match(ID);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(232);
				match(ID);
				setState(233);
				match(T__23);
				setState(234);
				match(ID);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(235);
				match(ID);
				setState(236);
				match(T__24);
				setState(237);
				match(ID);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(238);
				match(ID);
				setState(239);
				match(T__25);
				setState(240);
				match(ID);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(241);
				match(ID);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(242);
				match(NUM_DEC);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(243);
				match(NUM_INT);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(244);
				match(TEXTO);
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
	public static class AtribuicaomatematicaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public List<TerminalNode> NUM_INT() { return getTokens(GramaticaParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(GramaticaParser.NUM_INT, i);
		}
		public List<TerminalNode> NUM_DEC() { return getTokens(GramaticaParser.NUM_DEC); }
		public TerminalNode NUM_DEC(int i) {
			return getToken(GramaticaParser.NUM_DEC, i);
		}
		public AtribuicaomatematicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaomatematica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAtribuicaomatematica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAtribuicaomatematica(this);
		}
	}

	public final AtribuicaomatematicaContext atribuicaomatematica() throws RecognitionException {
		AtribuicaomatematicaContext _localctx = new AtribuicaomatematicaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atribuicaomatematica);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(ID);
				setState(248);
				match(T__5);
				setState(249);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(ID);
				setState(251);
				match(T__7);
				setState(252);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(ID);
				setState(254);
				match(T__6);
				setState(255);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				match(ID);
				setState(257);
				match(T__8);
				setState(258);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				match(ID);
				setState(260);
				match(T__26);
				setState(261);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(262);
				match(ID);
				setState(263);
				match(T__5);
				setState(264);
				match(NUM_INT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(265);
				match(ID);
				setState(266);
				match(T__7);
				setState(267);
				match(NUM_INT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(268);
				match(ID);
				setState(269);
				match(T__6);
				setState(270);
				match(NUM_INT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(271);
				match(ID);
				setState(272);
				match(T__8);
				setState(273);
				match(NUM_INT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(274);
				match(ID);
				setState(275);
				match(T__26);
				setState(276);
				match(NUM_INT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(277);
				match(ID);
				setState(278);
				match(T__5);
				setState(279);
				match(NUM_DEC);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(280);
				match(ID);
				setState(281);
				match(T__7);
				setState(282);
				match(NUM_DEC);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(283);
				match(ID);
				setState(284);
				match(T__6);
				setState(285);
				match(NUM_DEC);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(286);
				match(ID);
				setState(287);
				match(T__8);
				setState(288);
				match(NUM_DEC);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(289);
				match(ID);
				setState(290);
				match(T__26);
				setState(291);
				match(NUM_DEC);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(292);
				match(NUM_INT);
				setState(293);
				match(T__5);
				setState(294);
				match(NUM_INT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(295);
				match(NUM_INT);
				setState(296);
				match(T__7);
				setState(297);
				match(NUM_INT);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(298);
				match(NUM_INT);
				setState(299);
				match(T__6);
				setState(300);
				match(NUM_INT);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(301);
				match(NUM_INT);
				setState(302);
				match(T__8);
				setState(303);
				match(NUM_INT);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(304);
				match(NUM_INT);
				setState(305);
				match(T__26);
				setState(306);
				match(NUM_INT);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(307);
				match(NUM_DEC);
				setState(308);
				match(T__5);
				setState(309);
				match(NUM_DEC);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(310);
				match(NUM_DEC);
				setState(311);
				match(T__7);
				setState(312);
				match(NUM_DEC);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(313);
				match(NUM_DEC);
				setState(314);
				match(T__6);
				setState(315);
				match(NUM_DEC);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(316);
				match(NUM_DEC);
				setState(317);
				match(T__8);
				setState(318);
				match(NUM_DEC);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(319);
				match(NUM_DEC);
				setState(320);
				match(T__26);
				setState(321);
				match(NUM_DEC);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(322);
				match(NUM_INT);
				setState(323);
				match(T__5);
				setState(324);
				match(ID);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(325);
				match(NUM_INT);
				setState(326);
				match(T__7);
				setState(327);
				match(ID);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(328);
				match(NUM_INT);
				setState(329);
				match(T__6);
				setState(330);
				match(ID);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(331);
				match(NUM_INT);
				setState(332);
				match(T__8);
				setState(333);
				match(ID);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(334);
				match(NUM_INT);
				setState(335);
				match(T__26);
				setState(336);
				match(ID);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(337);
				match(NUM_DEC);
				setState(338);
				match(T__5);
				setState(339);
				match(ID);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(340);
				match(NUM_DEC);
				setState(341);
				match(T__7);
				setState(342);
				match(ID);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(343);
				match(NUM_DEC);
				setState(344);
				match(T__6);
				setState(345);
				match(ID);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(346);
				match(NUM_DEC);
				setState(347);
				match(T__8);
				setState(348);
				match(ID);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(349);
				match(NUM_DEC);
				setState(350);
				match(T__26);
				setState(351);
				match(ID);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(352);
				match(NUM_DEC);
				setState(353);
				match(T__5);
				setState(354);
				match(NUM_INT);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(355);
				match(NUM_DEC);
				setState(356);
				match(T__7);
				setState(357);
				match(NUM_INT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(358);
				match(NUM_DEC);
				setState(359);
				match(T__6);
				setState(360);
				match(NUM_INT);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(361);
				match(NUM_DEC);
				setState(362);
				match(T__8);
				setState(363);
				match(NUM_INT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(364);
				match(NUM_DEC);
				setState(365);
				match(T__26);
				setState(366);
				match(NUM_INT);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(367);
				match(NUM_INT);
				setState(368);
				match(T__5);
				setState(369);
				match(NUM_DEC);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(370);
				match(NUM_INT);
				setState(371);
				match(T__7);
				setState(372);
				match(NUM_DEC);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(373);
				match(NUM_INT);
				setState(374);
				match(T__6);
				setState(375);
				match(NUM_DEC);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(376);
				match(NUM_INT);
				setState(377);
				match(T__8);
				setState(378);
				match(NUM_DEC);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(379);
				match(NUM_INT);
				setState(380);
				match(T__26);
				setState(381);
				match(NUM_DEC);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(382);
				match(NUM_DEC);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(383);
				match(NUM_INT);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
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
	public static class ComparacaoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public List<TerminalNode> NUM_INT() { return getTokens(GramaticaParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(GramaticaParser.NUM_INT, i);
		}
		public List<TerminalNode> NUM_DEC() { return getTokens(GramaticaParser.NUM_DEC); }
		public TerminalNode NUM_DEC(int i) {
			return getToken(GramaticaParser.NUM_DEC, i);
		}
		public ComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComparacao(this);
		}
	}

	public final ComparacaoContext comparacao() throws RecognitionException {
		ComparacaoContext _localctx = new ComparacaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comparacao);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(ID);
				setState(388);
				operator();
				setState(389);
				match(NUM_INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(ID);
				setState(392);
				operator();
				setState(393);
				match(NUM_DEC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				match(ID);
				setState(396);
				operator();
				setState(397);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				match(NUM_DEC);
				setState(400);
				operator();
				setState(401);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(403);
				match(NUM_DEC);
				setState(404);
				operator();
				setState(405);
				match(NUM_DEC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(407);
				match(NUM_DEC);
				setState(408);
				operator();
				setState(409);
				match(NUM_INT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(411);
				match(NUM_INT);
				setState(412);
				operator();
				setState(413);
				match(NUM_INT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(415);
				match(NUM_INT);
				setState(416);
				operator();
				setState(417);
				match(NUM_DEC);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(419);
				match(NUM_INT);
				setState(420);
				operator();
				setState(421);
				match(ID);
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
	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8321499136L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode NUM_INT() { return getToken(GramaticaParser.NUM_INT, 0); }
		public TerminalNode TEXTO() { return getToken(GramaticaParser.TEXTO, 0); }
		public TerminalNode NUM_DEC() { return getToken(GramaticaParser.NUM_DEC, 0); }
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_retorno);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(T__32);
				setState(428);
				match(ID);
				setState(429);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(T__32);
				setState(431);
				match(NUM_INT);
				setState(432);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				match(T__32);
				setState(434);
				match(TEXTO);
				setState(435);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				match(T__32);
				setState(437);
				match(NUM_DEC);
				setState(438);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(439);
				match(T__32);
				setState(440);
				match(T__33);
				setState(441);
				match(T__3);
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
	public static class EstruturacontroleContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(GramaticaParser.NEWLINE, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public OperatorforContext operatorfor() {
			return getRuleContext(OperatorforContext.class,0);
		}
		public List<TerminalNode> NUM_INT() { return getTokens(GramaticaParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(GramaticaParser.NUM_INT, i);
		}
		public CaselistaContext caselista() {
			return getRuleContext(CaselistaContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public EstruturacontroleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturacontrole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEstruturacontrole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEstruturacontrole(this);
		}
	}

	public final EstruturacontroleContext estruturacontrole() throws RecognitionException {
		EstruturacontroleContext _localctx = new EstruturacontroleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_estruturacontrole);
		int _la;
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(444);
					match(NEWLINE);
					}
				}

				}
				setState(447);
				match(T__34);
				setState(448);
				match(T__1);
				setState(449);
				expressao();
				setState(450);
				match(T__2);
				setState(451);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(453);
					match(NEWLINE);
					}
				}

				}
				setState(456);
				match(T__34);
				setState(457);
				match(T__1);
				setState(458);
				expressao();
				setState(459);
				match(T__2);
				setState(460);
				bloco();
				setState(461);
				match(T__35);
				setState(462);
				bloco();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(464);
					match(NEWLINE);
					}
				}

				}
				setState(467);
				match(T__36);
				setState(468);
				match(T__1);
				setState(469);
				expressao();
				setState(470);
				match(T__2);
				setState(471);
				bloco();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(473);
					match(NEWLINE);
					}
				}

				}
				setState(476);
				match(T__37);
				setState(477);
				match(T__1);
				{
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(478);
					match(T__10);
					}
				}

				setState(481);
				match(ID);
				setState(482);
				match(T__38);
				setState(483);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM_INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				setState(485);
				match(T__3);
				setState(486);
				match(ID);
				setState(487);
				operatorfor();
				setState(492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(488);
					match(ID);
					}
					break;
				case 2:
					{
					setState(489);
					match(NUM_INT);
					}
					break;
				case 3:
					{
					setState(490);
					match(ID);
					setState(491);
					match(T__39);
					}
					break;
				}
				setState(494);
				match(T__3);
				setState(499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(495);
					match(ID);
					setState(496);
					match(T__40);
					}
					break;
				case 2:
					{
					setState(497);
					match(ID);
					setState(498);
					match(T__41);
					}
					break;
				}
				setState(501);
				match(T__2);
				setState(502);
				bloco();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(504);
					match(NEWLINE);
					}
				}

				}
				setState(507);
				match(T__42);
				setState(508);
				match(T__1);
				setState(509);
				expressao();
				setState(510);
				match(T__2);
				setState(511);
				caselista();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(513);
					match(NEWLINE);
					}
				}

				}
				setState(516);
				match(T__43);
				setState(517);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(518);
					match(NEWLINE);
					}
				}

				}
				setState(521);
				match(T__44);
				setState(522);
				match(T__3);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(523);
					match(NEWLINE);
					}
				}

				}
				setState(526);
				match(T__32);
				setState(527);
				expressao();
				setState(528);
				match(T__3);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(530);
					match(NEWLINE);
					}
				}

				}
				setState(533);
				operator();
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
	public static class CaselistaContext extends ParserRuleContext {
		public List<CasedeclContext> casedecl() {
			return getRuleContexts(CasedeclContext.class);
		}
		public CasedeclContext casedecl(int i) {
			return getRuleContext(CasedeclContext.class,i);
		}
		public CaselistaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caselista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCaselista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCaselista(this);
		}
	}

	public final CaselistaContext caselista() throws RecognitionException {
		CaselistaContext _localctx = new CaselistaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_caselista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45 || _la==T__47) {
				{
				{
				setState(536);
				casedecl();
				}
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class OperatorforContext extends ParserRuleContext {
		public OperatorforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperatorfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperatorfor(this);
		}
	}

	public final OperatorforContext operatorfor() throws RecognitionException {
		OperatorforContext _localctx = new OperatorforContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operatorfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8053063712L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class CasedeclContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CasedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casedecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCasedecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCasedecl(this);
		}
	}

	public final CasedeclContext casedecl() throws RecognitionException {
		CasedeclContext _localctx = new CasedeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_casedecl);
		try {
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				match(T__45);
				setState(545);
				expressao();
				setState(546);
				match(T__46);
				setState(547);
				bloco();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				match(T__47);
				setState(550);
				match(T__46);
				setState(551);
				bloco();
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
	public static class DeclaracaoestruturaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public List<DeclaracaovariavelContext> declaracaovariavel() {
			return getRuleContexts(DeclaracaovariavelContext.class);
		}
		public DeclaracaovariavelContext declaracaovariavel(int i) {
			return getRuleContext(DeclaracaovariavelContext.class,i);
		}
		public DeclaracaoestruturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoestrutura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaracaoestrutura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaracaoestrutura(this);
		}
	}

	public final DeclaracaoestruturaContext declaracaoestrutura() throws RecognitionException {
		DeclaracaoestruturaContext _localctx = new DeclaracaoestruturaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declaracaoestrutura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(T__48);
			setState(555);
			match(ID);
			setState(556);
			match(T__17);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 129024L) != 0)) {
				{
				{
				setState(557);
				declaracaovariavel();
				}
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(563);
			match(T__18);
			setState(564);
			match(T__3);
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
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_array);
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				match(ID);
				setState(567);
				match(T__49);
				setState(568);
				expressao();
				setState(569);
				match(T__50);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				match(ID);
				setState(572);
				match(T__9);
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
	public static class ArrayinicializacaoContext extends ParserRuleContext {
		public ExpressaolistaContext expressaolista() {
			return getRuleContext(ExpressaolistaContext.class,0);
		}
		public ArrayinicializacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayinicializacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterArrayinicializacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitArrayinicializacao(this);
		}
	}

	public final ArrayinicializacaoContext arrayinicializacao() throws RecognitionException {
		ArrayinicializacaoContext _localctx = new ArrayinicializacaoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayinicializacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(T__17);
			setState(576);
			expressaolista();
			setState(577);
			match(T__18);
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
	public static class ExpressaolistaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ExpressaolistaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaolista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressaolista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressaolista(this);
		}
	}

	public final ExpressaolistaContext expressaolista() throws RecognitionException {
		ExpressaolistaContext _localctx = new ExpressaolistaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressaolista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			expressao();
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(580);
				match(T__16);
				setState(581);
				expressao();
				}
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ExpressaologicaContext extends ParserRuleContext {
		public ExpressaorelacionalContext expressaorelacional() {
			return getRuleContext(ExpressaorelacionalContext.class,0);
		}
		public ExpressaologicaContext expressaologica() {
			return getRuleContext(ExpressaologicaContext.class,0);
		}
		public ExpressaologicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaologica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressaologica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressaologica(this);
		}
	}

	public final ExpressaologicaContext expressaologica() throws RecognitionException {
		return expressaologica(0);
	}

	private ExpressaologicaContext expressaologica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaologicaContext _localctx = new ExpressaologicaContext(_ctx, _parentState);
		ExpressaologicaContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expressaologica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__7:
			case ID:
			case NUM_INT:
			case NUM_DEC:
			case TEXTO:
				{
				setState(588);
				expressaorelacional();
				}
				break;
			case T__53:
				{
				setState(589);
				match(T__53);
				setState(590);
				expressaorelacional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(601);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(599);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaologicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaologica);
						setState(593);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(594);
						match(T__51);
						setState(595);
						expressaorelacional();
						}
						break;
					case 2:
						{
						_localctx = new ExpressaologicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaologica);
						setState(596);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(597);
						match(T__52);
						setState(598);
						expressaorelacional();
						}
						break;
					}
					} 
				}
				setState(603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
	public static class ExpressaorelacionalContext extends ParserRuleContext {
		public List<ExpressaoaritmeticaContext> expressaoaritmetica() {
			return getRuleContexts(ExpressaoaritmeticaContext.class);
		}
		public ExpressaoaritmeticaContext expressaoaritmetica(int i) {
			return getRuleContext(ExpressaoaritmeticaContext.class,i);
		}
		public ExpressaorelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaorelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressaorelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressaorelacional(this);
		}
	}

	public final ExpressaorelacionalContext expressaorelacional() throws RecognitionException {
		ExpressaorelacionalContext _localctx = new ExpressaorelacionalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressaorelacional);
		try {
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				expressaoaritmetica(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				expressaoaritmetica(0);
				setState(606);
				match(T__31);
				setState(607);
				expressaoaritmetica(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
				expressaoaritmetica(0);
				setState(610);
				match(T__28);
				setState(611);
				expressaoaritmetica(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(613);
				expressaoaritmetica(0);
				setState(614);
				match(T__30);
				setState(615);
				expressaoaritmetica(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(617);
				expressaoaritmetica(0);
				setState(618);
				match(T__29);
				setState(619);
				expressaoaritmetica(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(621);
				expressaoaritmetica(0);
				setState(622);
				match(T__54);
				setState(623);
				expressaoaritmetica(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(625);
				expressaoaritmetica(0);
				setState(626);
				match(T__27);
				setState(627);
				expressaoaritmetica(0);
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
	public static class ExpressaoaritmeticaContext extends ParserRuleContext {
		public ExpressaomultiplicativaContext expressaomultiplicativa() {
			return getRuleContext(ExpressaomultiplicativaContext.class,0);
		}
		public ExpressaoaritmeticaContext expressaoaritmetica() {
			return getRuleContext(ExpressaoaritmeticaContext.class,0);
		}
		public ExpressaoaritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoaritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressaoaritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressaoaritmetica(this);
		}
	}

	public final ExpressaoaritmeticaContext expressaoaritmetica() throws RecognitionException {
		return expressaoaritmetica(0);
	}

	private ExpressaoaritmeticaContext expressaoaritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoaritmeticaContext _localctx = new ExpressaoaritmeticaContext(_ctx, _parentState);
		ExpressaoaritmeticaContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expressaoaritmetica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(632);
			expressaomultiplicativa(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(640);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoaritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoaritmetica);
						setState(634);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(635);
						match(T__5);
						setState(636);
						expressaomultiplicativa(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoaritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoaritmetica);
						setState(637);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(638);
						match(T__7);
						setState(639);
						expressaomultiplicativa(0);
						}
						break;
					}
					} 
				}
				setState(644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
	public static class ExpressaomultiplicativaContext extends ParserRuleContext {
		public ExpressaounariaContext expressaounaria() {
			return getRuleContext(ExpressaounariaContext.class,0);
		}
		public ExpressaomultiplicativaContext expressaomultiplicativa() {
			return getRuleContext(ExpressaomultiplicativaContext.class,0);
		}
		public ExpressaomultiplicativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaomultiplicativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressaomultiplicativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressaomultiplicativa(this);
		}
	}

	public final ExpressaomultiplicativaContext expressaomultiplicativa() throws RecognitionException {
		return expressaomultiplicativa(0);
	}

	private ExpressaomultiplicativaContext expressaomultiplicativa(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaomultiplicativaContext _localctx = new ExpressaomultiplicativaContext(_ctx, _parentState);
		ExpressaomultiplicativaContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expressaomultiplicativa, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(646);
			expressaounaria();
			}
			_ctx.stop = _input.LT(-1);
			setState(659);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(657);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaomultiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaomultiplicativa);
						setState(648);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(649);
						match(T__8);
						setState(650);
						expressaounaria();
						}
						break;
					case 2:
						{
						_localctx = new ExpressaomultiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaomultiplicativa);
						setState(651);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(652);
						match(T__6);
						setState(653);
						expressaounaria();
						}
						break;
					case 3:
						{
						_localctx = new ExpressaomultiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaomultiplicativa);
						setState(654);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(655);
						match(T__26);
						setState(656);
						expressaounaria();
						}
						break;
					}
					} 
				}
				setState(661);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
	public static class ExpressaounariaContext extends ParserRuleContext {
		public ExpressaopostfixContext expressaopostfix() {
			return getRuleContext(ExpressaopostfixContext.class,0);
		}
		public ExpressaounariaContext expressaounaria() {
			return getRuleContext(ExpressaounariaContext.class,0);
		}
		public ExpressaounariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaounaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressaounaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressaounaria(this);
		}
	}

	public final ExpressaounariaContext expressaounaria() throws RecognitionException {
		ExpressaounariaContext _localctx = new ExpressaounariaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expressaounaria);
		try {
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				expressaopostfix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				match(T__7);
				setState(664);
				expressaounaria();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(665);
				expressaopostfix();
				setState(666);
				match(T__40);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(668);
				expressaopostfix();
				setState(669);
				match(T__41);
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
	public static class ExpressaopostfixContext extends ParserRuleContext {
		public PrimariaContext primaria() {
			return getRuleContext(PrimariaContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public ExpressaopostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaopostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressaopostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressaopostfix(this);
		}
	}

	public final ExpressaopostfixContext expressaopostfix() throws RecognitionException {
		ExpressaopostfixContext _localctx = new ExpressaopostfixContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressaopostfix);
		try {
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				primaria();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				primaria();
				setState(675);
				match(T__49);
				setState(676);
				expressao();
				setState(677);
				match(T__50);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(679);
				primaria();
				setState(680);
				match(T__1);
				setState(681);
				argumentos();
				setState(682);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(684);
				primaria();
				setState(685);
				match(T__55);
				setState(686);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(688);
				primaria();
				setState(689);
				match(T__56);
				setState(690);
				match(ID);
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
	public static class ArgumentosContext extends ParserRuleContext {
		public ExpressaolistaContext expressaolista() {
			return getRuleContext(ExpressaolistaContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_argumentos);
		try {
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				expressaolista();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class PrimariaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode NUM_INT() { return getToken(GramaticaParser.NUM_INT, 0); }
		public TerminalNode NUM_DEC() { return getToken(GramaticaParser.NUM_DEC, 0); }
		public TerminalNode TEXTO() { return getToken(GramaticaParser.TEXTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public PrimariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrimaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrimaria(this);
		}
	}

	public final PrimariaContext primaria() throws RecognitionException {
		PrimariaContext _localctx = new PrimariaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_primaria);
		try {
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				match(ID);
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				match(NUM_INT);
				}
				break;
			case NUM_DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(700);
				match(NUM_DEC);
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(701);
				match(TEXTO);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(702);
				match(T__1);
				setState(703);
				expressao();
				setState(704);
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
		case 23:
			return expressaologica_sempred((ExpressaologicaContext)_localctx, predIndex);
		case 25:
			return expressaoaritmetica_sempred((ExpressaoaritmeticaContext)_localctx, predIndex);
		case 26:
			return expressaomultiplicativa_sempred((ExpressaomultiplicativaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressaologica_sempred(ExpressaologicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoaritmetica_sempred(ExpressaoaritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressaomultiplicativa_sempred(ExpressaomultiplicativaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u02c5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0001\u0000\u0003\u0000A\b\u0000\u0004\u0000C\b\u0000\u000b"+
		"\u0000\f\u0000D\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001M\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002c\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003{\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0091\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u009f\b\u0006\u0001\u0006\u0003\u0006\u00a2\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00ab\b\u0007\u0001\b\u0001\b\u0004\b\u00af\b\b\u000b\b\f"+
		"\b\u00b0\u0001\b\u0001\b\u0001\b\u0004\b\u00b6\b\b\u000b\b\f\b\u00b7\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c0\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00f6\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0182\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u01a8\b\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u01bb\b\u000e\u0001\u000f\u0003\u000f\u01be"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u01c7\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u01d2\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01db\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01e0\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01ed\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01f4"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01fa"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0203\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0208\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u020d\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0214\b\u000f\u0001\u000f\u0003\u000f\u0217\b\u000f"+
		"\u0001\u0010\u0005\u0010\u021a\b\u0010\n\u0010\f\u0010\u021d\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0229\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u022f\b\u0013\n"+
		"\u0013\f\u0013\u0232\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u023e\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0247\b\u0016\n"+
		"\u0016\f\u0016\u024a\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0250\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0258\b\u0017\n\u0017\f\u0017"+
		"\u025b\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u0276\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u0281\b\u0019\n\u0019\f\u0019\u0284\t\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u0292\b\u001a\n\u001a\f\u001a\u0295\t\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u02a0\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u02b5\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u02b9\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u02c3\b\u001e\u0001\u001e\u0000\u0003.24\u001f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<\u0000\u0004\u0001\u0000\u000b\u0010\u0001\u0000\u001c"+
		" \u0001\u0000;<\u0002\u0000\u0005\u0005\u001d \u0343\u0000B\u0001\u0000"+
		"\u0000\u0000\u0002L\u0001\u0000\u0000\u0000\u0004b\u0001\u0000\u0000\u0000"+
		"\u0006\u0090\u0001\u0000\u0000\u0000\b\u0092\u0001\u0000\u0000\u0000\n"+
		"\u0094\u0001\u0000\u0000\u0000\f\u00a1\u0001\u0000\u0000\u0000\u000e\u00aa"+
		"\u0001\u0000\u0000\u0000\u0010\u00ac\u0001\u0000\u0000\u0000\u0012\u00bf"+
		"\u0001\u0000\u0000\u0000\u0014\u00f5\u0001\u0000\u0000\u0000\u0016\u0181"+
		"\u0001\u0000\u0000\u0000\u0018\u01a7\u0001\u0000\u0000\u0000\u001a\u01a9"+
		"\u0001\u0000\u0000\u0000\u001c\u01ba\u0001\u0000\u0000\u0000\u001e\u0216"+
		"\u0001\u0000\u0000\u0000 \u021b\u0001\u0000\u0000\u0000\"\u021e\u0001"+
		"\u0000\u0000\u0000$\u0228\u0001\u0000\u0000\u0000&\u022a\u0001\u0000\u0000"+
		"\u0000(\u023d\u0001\u0000\u0000\u0000*\u023f\u0001\u0000\u0000\u0000,"+
		"\u0243\u0001\u0000\u0000\u0000.\u024f\u0001\u0000\u0000\u00000\u0275\u0001"+
		"\u0000\u0000\u00002\u0277\u0001\u0000\u0000\u00004\u0285\u0001\u0000\u0000"+
		"\u00006\u029f\u0001\u0000\u0000\u00008\u02b4\u0001\u0000\u0000\u0000:"+
		"\u02b8\u0001\u0000\u0000\u0000<\u02c2\u0001\u0000\u0000\u0000>@\u0003"+
		"\u0002\u0001\u0000?A\u0005:\u0000\u0000@?\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000E\u0001\u0001\u0000\u0000\u0000FM\u0003\u0006\u0003\u0000GM\u0003"+
		"\n\u0005\u0000HM\u0003&\u0013\u0000IM\u0003\u001c\u000e\u0000JM\u0003"+
		"\u001e\u000f\u0000KM\u0003\u0004\u0002\u0000LF\u0001\u0000\u0000\u0000"+
		"LG\u0001\u0000\u0000\u0000LH\u0001\u0000\u0000\u0000LI\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000M\u0003\u0001"+
		"\u0000\u0000\u0000NO\u0005\u0001\u0000\u0000OP\u0005\u0002\u0000\u0000"+
		"PQ\u0005>\u0000\u0000QR\u0005\u0003\u0000\u0000Rc\u0005\u0004\u0000\u0000"+
		"ST\u0005\u0001\u0000\u0000TU\u0005\u0002\u0000\u0000UV\u0005;\u0000\u0000"+
		"VW\u0005\u0003\u0000\u0000Wc\u0005\u0004\u0000\u0000XY\u0005\u0001\u0000"+
		"\u0000YZ\u0005\u0002\u0000\u0000Z[\u0005<\u0000\u0000[\\\u0005\u0003\u0000"+
		"\u0000\\c\u0005\u0004\u0000\u0000]^\u0005\u0001\u0000\u0000^_\u0005\u0002"+
		"\u0000\u0000_`\u0005=\u0000\u0000`a\u0005\u0003\u0000\u0000ac\u0005\u0004"+
		"\u0000\u0000bN\u0001\u0000\u0000\u0000bS\u0001\u0000\u0000\u0000bX\u0001"+
		"\u0000\u0000\u0000b]\u0001\u0000\u0000\u0000c\u0005\u0001\u0000\u0000"+
		"\u0000de\u0003\b\u0004\u0000ef\u0005;\u0000\u0000fg\u0005\u0004\u0000"+
		"\u0000g\u0091\u0001\u0000\u0000\u0000hi\u0003\b\u0004\u0000ij\u0005;\u0000"+
		"\u0000jk\u0005\u0005\u0000\u0000kl\u0003\u0012\t\u0000lm\u0005\u0004\u0000"+
		"\u0000m\u0091\u0001\u0000\u0000\u0000no\u0003\b\u0004\u0000op\u0005;\u0000"+
		"\u0000pq\u0005\u0005\u0000\u0000qr\u0005\u0002\u0000\u0000rs\u0003\u0016"+
		"\u000b\u0000sz\u0005\u0003\u0000\u0000t{\u0003\u0016\u000b\u0000u{\u0005"+
		"\u0006\u0000\u0000v{\u0005\u0007\u0000\u0000w{\u0005\b\u0000\u0000x{\u0005"+
		"\t\u0000\u0000y{\u0001\u0000\u0000\u0000zt\u0001\u0000\u0000\u0000zu\u0001"+
		"\u0000\u0000\u0000zv\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|}\u0003\u0016\u000b\u0000}~\u0005\u0004\u0000\u0000~\u0091\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0003\b\u0004\u0000\u0080\u0081\u0005;"+
		"\u0000\u0000\u0081\u0082\u0005\n\u0000\u0000\u0082\u0083\u0005\u0005\u0000"+
		"\u0000\u0083\u0084\u0005>\u0000\u0000\u0084\u0085\u0005\u0004\u0000\u0000"+
		"\u0085\u0091\u0001\u0000\u0000\u0000\u0086\u0087\u0003\b\u0004\u0000\u0087"+
		"\u0088\u0003(\u0014\u0000\u0088\u0089\u0005\u0004\u0000\u0000\u0089\u0091"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0003\b\u0004\u0000\u008b\u008c\u0003"+
		"(\u0014\u0000\u008c\u008d\u0005\u0005\u0000\u0000\u008d\u008e\u0003*\u0015"+
		"\u0000\u008e\u008f\u0005\u0004\u0000\u0000\u008f\u0091\u0001\u0000\u0000"+
		"\u0000\u0090d\u0001\u0000\u0000\u0000\u0090h\u0001\u0000\u0000\u0000\u0090"+
		"n\u0001\u0000\u0000\u0000\u0090\u007f\u0001\u0000\u0000\u0000\u0090\u0086"+
		"\u0001\u0000\u0000\u0000\u0090\u008a\u0001\u0000\u0000\u0000\u0091\u0007"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0007\u0000\u0000\u0000\u0093\t\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0003\b\u0004\u0000\u0095\u0096\u0005;"+
		"\u0000\u0000\u0096\u0097\u0005\u0002\u0000\u0000\u0097\u0098\u0003\f\u0006"+
		"\u0000\u0098\u0099\u0005\u0003\u0000\u0000\u0099\u009a\u0003\u0010\b\u0000"+
		"\u009a\u000b\u0001\u0000\u0000\u0000\u009b\u009e\u0003\u000e\u0007\u0000"+
		"\u009c\u009d\u0005\u0011\u0000\u0000\u009d\u009f\u0003\f\u0006\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1"+
		"\u009b\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\r\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003\b\u0004\u0000\u00a4\u00a5"+
		"\u0005;\u0000\u0000\u00a5\u00ab\u0001\u0000\u0000\u0000\u00a6\u00a7\u0003"+
		"\b\u0004\u0000\u00a7\u00a8\u0005;\u0000\u0000\u00a8\u00a9\u0005\n\u0000"+
		"\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a3\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a6\u0001\u0000\u0000\u0000\u00ab\u000f\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ae\u0005\u0012\u0000\u0000\u00ad\u00af\u0005:\u0000\u0000"+
		"\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b5\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003\u0002\u0001\u0000"+
		"\u00b3\u00b4\u0005:\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0013\u0000\u0000\u00ba"+
		"\u0011\u0001\u0000\u0000\u0000\u00bb\u00c0\u0003\u0014\n\u0000\u00bc\u00c0"+
		"\u0003\u0016\u000b\u0000\u00bd\u00c0\u0003\u0018\f\u0000\u00be\u00c0\u0003"+
		"\u0004\u0002\u0000\u00bf\u00bb\u0001\u0000\u0000\u0000\u00bf\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u0013\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005"+
		";\u0000\u0000\u00c2\u00c3\u0005\u0005\u0000\u0000\u00c3\u00f6\u0003\u0012"+
		"\t\u0000\u00c4\u00c5\u0005;\u0000\u0000\u00c5\u00c6\u0005\u0014\u0000"+
		"\u0000\u00c6\u00f6\u0003\u0012\t\u0000\u00c7\u00c8\u0005;\u0000\u0000"+
		"\u00c8\u00c9\u0005\u0015\u0000\u0000\u00c9\u00f6\u0003\u0012\t\u0000\u00ca"+
		"\u00cb\u0005;\u0000\u0000\u00cb\u00cc\u0005\u0016\u0000\u0000\u00cc\u00f6"+
		"\u0003\u0012\t\u0000\u00cd\u00ce\u0005;\u0000\u0000\u00ce\u00cf\u0005"+
		"\u0017\u0000\u0000\u00cf\u00f6\u0003\u0012\t\u0000\u00d0\u00d1\u0005;"+
		"\u0000\u0000\u00d1\u00d2\u0005\u0018\u0000\u0000\u00d2\u00f6\u0003\u0012"+
		"\t\u0000\u00d3\u00d4\u0005;\u0000\u0000\u00d4\u00d5\u0005\u0019\u0000"+
		"\u0000\u00d5\u00f6\u0003\u0012\t\u0000\u00d6\u00d7\u0005;\u0000\u0000"+
		"\u00d7\u00d8\u0005\u001a\u0000\u0000\u00d8\u00f6\u0003\u0012\t\u0000\u00d9"+
		"\u00da\u0005;\u0000\u0000\u00da\u00db\u0005\u0005\u0000\u0000\u00db\u00f6"+
		"\u0005;\u0000\u0000\u00dc\u00dd\u0005;\u0000\u0000\u00dd\u00de\u0005\u0014"+
		"\u0000\u0000\u00de\u00f6\u0005;\u0000\u0000\u00df\u00e0\u0005;\u0000\u0000"+
		"\u00e0\u00e1\u0005\u0015\u0000\u0000\u00e1\u00f6\u0005;\u0000\u0000\u00e2"+
		"\u00e3\u0005;\u0000\u0000\u00e3\u00e4\u0005\u0016\u0000\u0000\u00e4\u00f6"+
		"\u0005;\u0000\u0000\u00e5\u00e6\u0005;\u0000\u0000\u00e6\u00e7\u0005\u0017"+
		"\u0000\u0000\u00e7\u00f6\u0005;\u0000\u0000\u00e8\u00e9\u0005;\u0000\u0000"+
		"\u00e9\u00ea\u0005\u0018\u0000\u0000\u00ea\u00f6\u0005;\u0000\u0000\u00eb"+
		"\u00ec\u0005;\u0000\u0000\u00ec\u00ed\u0005\u0019\u0000\u0000\u00ed\u00f6"+
		"\u0005;\u0000\u0000\u00ee\u00ef\u0005;\u0000\u0000\u00ef\u00f0\u0005\u001a"+
		"\u0000\u0000\u00f0\u00f6\u0005;\u0000\u0000\u00f1\u00f6\u0005;\u0000\u0000"+
		"\u00f2\u00f6\u0005=\u0000\u0000\u00f3\u00f6\u0005<\u0000\u0000\u00f4\u00f6"+
		"\u0005>\u0000\u0000\u00f5\u00c1\u0001\u0000\u0000\u0000\u00f5\u00c4\u0001"+
		"\u0000\u0000\u0000\u00f5\u00c7\u0001\u0000\u0000\u0000\u00f5\u00ca\u0001"+
		"\u0000\u0000\u0000\u00f5\u00cd\u0001\u0000\u0000\u0000\u00f5\u00d0\u0001"+
		"\u0000\u0000\u0000\u00f5\u00d3\u0001\u0000\u0000\u0000\u00f5\u00d6\u0001"+
		"\u0000\u0000\u0000\u00f5\u00d9\u0001\u0000\u0000\u0000\u00f5\u00dc\u0001"+
		"\u0000\u0000\u0000\u00f5\u00df\u0001\u0000\u0000\u0000\u00f5\u00e2\u0001"+
		"\u0000\u0000\u0000\u00f5\u00e5\u0001\u0000\u0000\u0000\u00f5\u00e8\u0001"+
		"\u0000\u0000\u0000\u00f5\u00eb\u0001\u0000\u0000\u0000\u00f5\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f1\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f6\u0015\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005"+
		";\u0000\u0000\u00f8\u00f9\u0005\u0006\u0000\u0000\u00f9\u0182\u0005;\u0000"+
		"\u0000\u00fa\u00fb\u0005;\u0000\u0000\u00fb\u00fc\u0005\b\u0000\u0000"+
		"\u00fc\u0182\u0005;\u0000\u0000\u00fd\u00fe\u0005;\u0000\u0000\u00fe\u00ff"+
		"\u0005\u0007\u0000\u0000\u00ff\u0182\u0005;\u0000\u0000\u0100\u0101\u0005"+
		";\u0000\u0000\u0101\u0102\u0005\t\u0000\u0000\u0102\u0182\u0005;\u0000"+
		"\u0000\u0103\u0104\u0005;\u0000\u0000\u0104\u0105\u0005\u001b\u0000\u0000"+
		"\u0105\u0182\u0005;\u0000\u0000\u0106\u0107\u0005;\u0000\u0000\u0107\u0108"+
		"\u0005\u0006\u0000\u0000\u0108\u0182\u0005<\u0000\u0000\u0109\u010a\u0005"+
		";\u0000\u0000\u010a\u010b\u0005\b\u0000\u0000\u010b\u0182\u0005<\u0000"+
		"\u0000\u010c\u010d\u0005;\u0000\u0000\u010d\u010e\u0005\u0007\u0000\u0000"+
		"\u010e\u0182\u0005<\u0000\u0000\u010f\u0110\u0005;\u0000\u0000\u0110\u0111"+
		"\u0005\t\u0000\u0000\u0111\u0182\u0005<\u0000\u0000\u0112\u0113\u0005"+
		";\u0000\u0000\u0113\u0114\u0005\u001b\u0000\u0000\u0114\u0182\u0005<\u0000"+
		"\u0000\u0115\u0116\u0005;\u0000\u0000\u0116\u0117\u0005\u0006\u0000\u0000"+
		"\u0117\u0182\u0005=\u0000\u0000\u0118\u0119\u0005;\u0000\u0000\u0119\u011a"+
		"\u0005\b\u0000\u0000\u011a\u0182\u0005=\u0000\u0000\u011b\u011c\u0005"+
		";\u0000\u0000\u011c\u011d\u0005\u0007\u0000\u0000\u011d\u0182\u0005=\u0000"+
		"\u0000\u011e\u011f\u0005;\u0000\u0000\u011f\u0120\u0005\t\u0000\u0000"+
		"\u0120\u0182\u0005=\u0000\u0000\u0121\u0122\u0005;\u0000\u0000\u0122\u0123"+
		"\u0005\u001b\u0000\u0000\u0123\u0182\u0005=\u0000\u0000\u0124\u0125\u0005"+
		"<\u0000\u0000\u0125\u0126\u0005\u0006\u0000\u0000\u0126\u0182\u0005<\u0000"+
		"\u0000\u0127\u0128\u0005<\u0000\u0000\u0128\u0129\u0005\b\u0000\u0000"+
		"\u0129\u0182\u0005<\u0000\u0000\u012a\u012b\u0005<\u0000\u0000\u012b\u012c"+
		"\u0005\u0007\u0000\u0000\u012c\u0182\u0005<\u0000\u0000\u012d\u012e\u0005"+
		"<\u0000\u0000\u012e\u012f\u0005\t\u0000\u0000\u012f\u0182\u0005<\u0000"+
		"\u0000\u0130\u0131\u0005<\u0000\u0000\u0131\u0132\u0005\u001b\u0000\u0000"+
		"\u0132\u0182\u0005<\u0000\u0000\u0133\u0134\u0005=\u0000\u0000\u0134\u0135"+
		"\u0005\u0006\u0000\u0000\u0135\u0182\u0005=\u0000\u0000\u0136\u0137\u0005"+
		"=\u0000\u0000\u0137\u0138\u0005\b\u0000\u0000\u0138\u0182\u0005=\u0000"+
		"\u0000\u0139\u013a\u0005=\u0000\u0000\u013a\u013b\u0005\u0007\u0000\u0000"+
		"\u013b\u0182\u0005=\u0000\u0000\u013c\u013d\u0005=\u0000\u0000\u013d\u013e"+
		"\u0005\t\u0000\u0000\u013e\u0182\u0005=\u0000\u0000\u013f\u0140\u0005"+
		"=\u0000\u0000\u0140\u0141\u0005\u001b\u0000\u0000\u0141\u0182\u0005=\u0000"+
		"\u0000\u0142\u0143\u0005<\u0000\u0000\u0143\u0144\u0005\u0006\u0000\u0000"+
		"\u0144\u0182\u0005;\u0000\u0000\u0145\u0146\u0005<\u0000\u0000\u0146\u0147"+
		"\u0005\b\u0000\u0000\u0147\u0182\u0005;\u0000\u0000\u0148\u0149\u0005"+
		"<\u0000\u0000\u0149\u014a\u0005\u0007\u0000\u0000\u014a\u0182\u0005;\u0000"+
		"\u0000\u014b\u014c\u0005<\u0000\u0000\u014c\u014d\u0005\t\u0000\u0000"+
		"\u014d\u0182\u0005;\u0000\u0000\u014e\u014f\u0005<\u0000\u0000\u014f\u0150"+
		"\u0005\u001b\u0000\u0000\u0150\u0182\u0005;\u0000\u0000\u0151\u0152\u0005"+
		"=\u0000\u0000\u0152\u0153\u0005\u0006\u0000\u0000\u0153\u0182\u0005;\u0000"+
		"\u0000\u0154\u0155\u0005=\u0000\u0000\u0155\u0156\u0005\b\u0000\u0000"+
		"\u0156\u0182\u0005;\u0000\u0000\u0157\u0158\u0005=\u0000\u0000\u0158\u0159"+
		"\u0005\u0007\u0000\u0000\u0159\u0182\u0005;\u0000\u0000\u015a\u015b\u0005"+
		"=\u0000\u0000\u015b\u015c\u0005\t\u0000\u0000\u015c\u0182\u0005;\u0000"+
		"\u0000\u015d\u015e\u0005=\u0000\u0000\u015e\u015f\u0005\u001b\u0000\u0000"+
		"\u015f\u0182\u0005;\u0000\u0000\u0160\u0161\u0005=\u0000\u0000\u0161\u0162"+
		"\u0005\u0006\u0000\u0000\u0162\u0182\u0005<\u0000\u0000\u0163\u0164\u0005"+
		"=\u0000\u0000\u0164\u0165\u0005\b\u0000\u0000\u0165\u0182\u0005<\u0000"+
		"\u0000\u0166\u0167\u0005=\u0000\u0000\u0167\u0168\u0005\u0007\u0000\u0000"+
		"\u0168\u0182\u0005<\u0000\u0000\u0169\u016a\u0005=\u0000\u0000\u016a\u016b"+
		"\u0005\t\u0000\u0000\u016b\u0182\u0005<\u0000\u0000\u016c\u016d\u0005"+
		"=\u0000\u0000\u016d\u016e\u0005\u001b\u0000\u0000\u016e\u0182\u0005<\u0000"+
		"\u0000\u016f\u0170\u0005<\u0000\u0000\u0170\u0171\u0005\u0006\u0000\u0000"+
		"\u0171\u0182\u0005=\u0000\u0000\u0172\u0173\u0005<\u0000\u0000\u0173\u0174"+
		"\u0005\b\u0000\u0000\u0174\u0182\u0005=\u0000\u0000\u0175\u0176\u0005"+
		"<\u0000\u0000\u0176\u0177\u0005\u0007\u0000\u0000\u0177\u0182\u0005=\u0000"+
		"\u0000\u0178\u0179\u0005<\u0000\u0000\u0179\u017a\u0005\t\u0000\u0000"+
		"\u017a\u0182\u0005=\u0000\u0000\u017b\u017c\u0005<\u0000\u0000\u017c\u017d"+
		"\u0005\u001b\u0000\u0000\u017d\u0182\u0005=\u0000\u0000\u017e\u0182\u0005"+
		"=\u0000\u0000\u017f\u0182\u0005<\u0000\u0000\u0180\u0182\u0001\u0000\u0000"+
		"\u0000\u0181\u00f7\u0001\u0000\u0000\u0000\u0181\u00fa\u0001\u0000\u0000"+
		"\u0000\u0181\u00fd\u0001\u0000\u0000\u0000\u0181\u0100\u0001\u0000\u0000"+
		"\u0000\u0181\u0103\u0001\u0000\u0000\u0000\u0181\u0106\u0001\u0000\u0000"+
		"\u0000\u0181\u0109\u0001\u0000\u0000\u0000\u0181\u010c\u0001\u0000\u0000"+
		"\u0000\u0181\u010f\u0001\u0000\u0000\u0000\u0181\u0112\u0001\u0000\u0000"+
		"\u0000\u0181\u0115\u0001\u0000\u0000\u0000\u0181\u0118\u0001\u0000\u0000"+
		"\u0000\u0181\u011b\u0001\u0000\u0000\u0000\u0181\u011e\u0001\u0000\u0000"+
		"\u0000\u0181\u0121\u0001\u0000\u0000\u0000\u0181\u0124\u0001\u0000\u0000"+
		"\u0000\u0181\u0127\u0001\u0000\u0000\u0000\u0181\u012a\u0001\u0000\u0000"+
		"\u0000\u0181\u012d\u0001\u0000\u0000\u0000\u0181\u0130\u0001\u0000\u0000"+
		"\u0000\u0181\u0133\u0001\u0000\u0000\u0000\u0181\u0136\u0001\u0000\u0000"+
		"\u0000\u0181\u0139\u0001\u0000\u0000\u0000\u0181\u013c\u0001\u0000\u0000"+
		"\u0000\u0181\u013f\u0001\u0000\u0000\u0000\u0181\u0142\u0001\u0000\u0000"+
		"\u0000\u0181\u0145\u0001\u0000\u0000\u0000\u0181\u0148\u0001\u0000\u0000"+
		"\u0000\u0181\u014b\u0001\u0000\u0000\u0000\u0181\u014e\u0001\u0000\u0000"+
		"\u0000\u0181\u0151\u0001\u0000\u0000\u0000\u0181\u0154\u0001\u0000\u0000"+
		"\u0000\u0181\u0157\u0001\u0000\u0000\u0000\u0181\u015a\u0001\u0000\u0000"+
		"\u0000\u0181\u015d\u0001\u0000\u0000\u0000\u0181\u0160\u0001\u0000\u0000"+
		"\u0000\u0181\u0163\u0001\u0000\u0000\u0000\u0181\u0166\u0001\u0000\u0000"+
		"\u0000\u0181\u0169\u0001\u0000\u0000\u0000\u0181\u016c\u0001\u0000\u0000"+
		"\u0000\u0181\u016f\u0001\u0000\u0000\u0000\u0181\u0172\u0001\u0000\u0000"+
		"\u0000\u0181\u0175\u0001\u0000\u0000\u0000\u0181\u0178\u0001\u0000\u0000"+
		"\u0000\u0181\u017b\u0001\u0000\u0000\u0000\u0181\u017e\u0001\u0000\u0000"+
		"\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0180\u0001\u0000\u0000"+
		"\u0000\u0182\u0017\u0001\u0000\u0000\u0000\u0183\u0184\u0005;\u0000\u0000"+
		"\u0184\u0185\u0003\u001a\r\u0000\u0185\u0186\u0005<\u0000\u0000\u0186"+
		"\u01a8\u0001\u0000\u0000\u0000\u0187\u0188\u0005;\u0000\u0000\u0188\u0189"+
		"\u0003\u001a\r\u0000\u0189\u018a\u0005=\u0000\u0000\u018a\u01a8\u0001"+
		"\u0000\u0000\u0000\u018b\u018c\u0005;\u0000\u0000\u018c\u018d\u0003\u001a"+
		"\r\u0000\u018d\u018e\u0005;\u0000\u0000\u018e\u01a8\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0005=\u0000\u0000\u0190\u0191\u0003\u001a\r\u0000"+
		"\u0191\u0192\u0005;\u0000\u0000\u0192\u01a8\u0001\u0000\u0000\u0000\u0193"+
		"\u0194\u0005=\u0000\u0000\u0194\u0195\u0003\u001a\r\u0000\u0195\u0196"+
		"\u0005=\u0000\u0000\u0196\u01a8\u0001\u0000\u0000\u0000\u0197\u0198\u0005"+
		"=\u0000\u0000\u0198\u0199\u0003\u001a\r\u0000\u0199\u019a\u0005<\u0000"+
		"\u0000\u019a\u01a8\u0001\u0000\u0000\u0000\u019b\u019c\u0005<\u0000\u0000"+
		"\u019c\u019d\u0003\u001a\r\u0000\u019d\u019e\u0005<\u0000\u0000\u019e"+
		"\u01a8\u0001\u0000\u0000\u0000\u019f\u01a0\u0005<\u0000\u0000\u01a0\u01a1"+
		"\u0003\u001a\r\u0000\u01a1\u01a2\u0005=\u0000\u0000\u01a2\u01a8\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a4\u0005<\u0000\u0000\u01a4\u01a5\u0003\u001a"+
		"\r\u0000\u01a5\u01a6\u0005;\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a7\u0183\u0001\u0000\u0000\u0000\u01a7\u0187\u0001\u0000\u0000"+
		"\u0000\u01a7\u018b\u0001\u0000\u0000\u0000\u01a7\u018f\u0001\u0000\u0000"+
		"\u0000\u01a7\u0193\u0001\u0000\u0000\u0000\u01a7\u0197\u0001\u0000\u0000"+
		"\u0000\u01a7\u019b\u0001\u0000\u0000\u0000\u01a7\u019f\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a3\u0001\u0000\u0000\u0000\u01a8\u0019\u0001\u0000\u0000"+
		"\u0000\u01a9\u01aa\u0007\u0001\u0000\u0000\u01aa\u001b\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0005!\u0000\u0000\u01ac\u01ad\u0005;\u0000\u0000\u01ad"+
		"\u01bb\u0005\u0004\u0000\u0000\u01ae\u01af\u0005!\u0000\u0000\u01af\u01b0"+
		"\u0005<\u0000\u0000\u01b0\u01bb\u0005\u0004\u0000\u0000\u01b1\u01b2\u0005"+
		"!\u0000\u0000\u01b2\u01b3\u0005>\u0000\u0000\u01b3\u01bb\u0005\u0004\u0000"+
		"\u0000\u01b4\u01b5\u0005!\u0000\u0000\u01b5\u01b6\u0005=\u0000\u0000\u01b6"+
		"\u01bb\u0005\u0004\u0000\u0000\u01b7\u01b8\u0005!\u0000\u0000\u01b8\u01b9"+
		"\u0005\"\u0000\u0000\u01b9\u01bb\u0005\u0004\u0000\u0000\u01ba\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ba\u01ae\u0001\u0000\u0000\u0000\u01ba\u01b1\u0001"+
		"\u0000\u0000\u0000\u01ba\u01b4\u0001\u0000\u0000\u0000\u01ba\u01b7\u0001"+
		"\u0000\u0000\u0000\u01bb\u001d\u0001\u0000\u0000\u0000\u01bc\u01be\u0005"+
		":\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000"+
		"\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005#\u0000"+
		"\u0000\u01c0\u01c1\u0005\u0002\u0000\u0000\u01c1\u01c2\u0003\u0012\t\u0000"+
		"\u01c2\u01c3\u0005\u0003\u0000\u0000\u01c3\u01c4\u0003\u0010\b\u0000\u01c4"+
		"\u0217\u0001\u0000\u0000\u0000\u01c5\u01c7\u0005:\u0000\u0000\u01c6\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005#\u0000\u0000\u01c9\u01ca\u0005"+
		"\u0002\u0000\u0000\u01ca\u01cb\u0003\u0012\t\u0000\u01cb\u01cc\u0005\u0003"+
		"\u0000\u0000\u01cc\u01cd\u0003\u0010\b\u0000\u01cd\u01ce\u0005$\u0000"+
		"\u0000\u01ce\u01cf\u0003\u0010\b\u0000\u01cf\u0217\u0001\u0000\u0000\u0000"+
		"\u01d0\u01d2\u0005:\u0000\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d4\u0005%\u0000\u0000\u01d4\u01d5\u0005\u0002\u0000\u0000\u01d5\u01d6"+
		"\u0003\u0012\t\u0000\u01d6\u01d7\u0005\u0003\u0000\u0000\u01d7\u01d8\u0003"+
		"\u0010\b\u0000\u01d8\u0217\u0001\u0000\u0000\u0000\u01d9\u01db\u0005:"+
		"\u0000\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000"+
		"\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005&\u0000"+
		"\u0000\u01dd\u01df\u0005\u0002\u0000\u0000\u01de\u01e0\u0005\u000b\u0000"+
		"\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005;\u0000\u0000"+
		"\u01e2\u01e3\u0005\'\u0000\u0000\u01e3\u01e4\u0007\u0002\u0000\u0000\u01e4"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0005\u0004\u0000\u0000\u01e6"+
		"\u01e7\u0005;\u0000\u0000\u01e7\u01ec\u0003\"\u0011\u0000\u01e8\u01ed"+
		"\u0005;\u0000\u0000\u01e9\u01ed\u0005<\u0000\u0000\u01ea\u01eb\u0005;"+
		"\u0000\u0000\u01eb\u01ed\u0005(\u0000\u0000\u01ec\u01e8\u0001\u0000\u0000"+
		"\u0000\u01ec\u01e9\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01f3\u0005\u0004\u0000"+
		"\u0000\u01ef\u01f0\u0005;\u0000\u0000\u01f0\u01f4\u0005)\u0000\u0000\u01f1"+
		"\u01f2\u0005;\u0000\u0000\u01f2\u01f4\u0005*\u0000\u0000\u01f3\u01ef\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f6\u0005\u0003\u0000\u0000\u01f6\u01f7\u0003"+
		"\u0010\b\u0000\u01f7\u0217\u0001\u0000\u0000\u0000\u01f8\u01fa\u0005:"+
		"\u0000\u0000\u01f9\u01f8\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005+\u0000"+
		"\u0000\u01fc\u01fd\u0005\u0002\u0000\u0000\u01fd\u01fe\u0003\u0012\t\u0000"+
		"\u01fe\u01ff\u0005\u0003\u0000\u0000\u01ff\u0200\u0003 \u0010\u0000\u0200"+
		"\u0217\u0001\u0000\u0000\u0000\u0201\u0203\u0005:\u0000\u0000\u0202\u0201"+
		"\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0204"+
		"\u0001\u0000\u0000\u0000\u0204\u0205\u0005,\u0000\u0000\u0205\u0217\u0005"+
		"\u0004\u0000\u0000\u0206\u0208\u0005:\u0000\u0000\u0207\u0206\u0001\u0000"+
		"\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000"+
		"\u0000\u0000\u0209\u020a\u0005-\u0000\u0000\u020a\u0217\u0005\u0004\u0000"+
		"\u0000\u020b\u020d\u0005:\u0000\u0000\u020c\u020b\u0001\u0000\u0000\u0000"+
		"\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000"+
		"\u020e\u020f\u0005!\u0000\u0000\u020f\u0210\u0003\u0012\t\u0000\u0210"+
		"\u0211\u0005\u0004\u0000\u0000\u0211\u0217\u0001\u0000\u0000\u0000\u0212"+
		"\u0214\u0005:\u0000\u0000\u0213\u0212\u0001\u0000\u0000\u0000\u0213\u0214"+
		"\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0217"+
		"\u0003\u001a\r\u0000\u0216\u01bd\u0001\u0000\u0000\u0000\u0216\u01c6\u0001"+
		"\u0000\u0000\u0000\u0216\u01d1\u0001\u0000\u0000\u0000\u0216\u01da\u0001"+
		"\u0000\u0000\u0000\u0216\u01f9\u0001\u0000\u0000\u0000\u0216\u0202\u0001"+
		"\u0000\u0000\u0000\u0216\u0207\u0001\u0000\u0000\u0000\u0216\u020c\u0001"+
		"\u0000\u0000\u0000\u0216\u0213\u0001\u0000\u0000\u0000\u0217\u001f\u0001"+
		"\u0000\u0000\u0000\u0218\u021a\u0003$\u0012\u0000\u0219\u0218\u0001\u0000"+
		"\u0000\u0000\u021a\u021d\u0001\u0000\u0000\u0000\u021b\u0219\u0001\u0000"+
		"\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c!\u0001\u0000\u0000"+
		"\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e\u021f\u0007\u0003\u0000"+
		"\u0000\u021f#\u0001\u0000\u0000\u0000\u0220\u0221\u0005.\u0000\u0000\u0221"+
		"\u0222\u0003\u0012\t\u0000\u0222\u0223\u0005/\u0000\u0000\u0223\u0224"+
		"\u0003\u0010\b\u0000\u0224\u0229\u0001\u0000\u0000\u0000\u0225\u0226\u0005"+
		"0\u0000\u0000\u0226\u0227\u0005/\u0000\u0000\u0227\u0229\u0003\u0010\b"+
		"\u0000\u0228\u0220\u0001\u0000\u0000\u0000\u0228\u0225\u0001\u0000\u0000"+
		"\u0000\u0229%\u0001\u0000\u0000\u0000\u022a\u022b\u00051\u0000\u0000\u022b"+
		"\u022c\u0005;\u0000\u0000\u022c\u0230\u0005\u0012\u0000\u0000\u022d\u022f"+
		"\u0003\u0006\u0003\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022f\u0232"+
		"\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u0231"+
		"\u0001\u0000\u0000\u0000\u0231\u0233\u0001\u0000\u0000\u0000\u0232\u0230"+
		"\u0001\u0000\u0000\u0000\u0233\u0234\u0005\u0013\u0000\u0000\u0234\u0235"+
		"\u0005\u0004\u0000\u0000\u0235\'\u0001\u0000\u0000\u0000\u0236\u0237\u0005"+
		";\u0000\u0000\u0237\u0238\u00052\u0000\u0000\u0238\u0239\u0003\u0012\t"+
		"\u0000\u0239\u023a\u00053\u0000\u0000\u023a\u023e\u0001\u0000\u0000\u0000"+
		"\u023b\u023c\u0005;\u0000\u0000\u023c\u023e\u0005\n\u0000\u0000\u023d"+
		"\u0236\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e"+
		")\u0001\u0000\u0000\u0000\u023f\u0240\u0005\u0012\u0000\u0000\u0240\u0241"+
		"\u0003,\u0016\u0000\u0241\u0242\u0005\u0013\u0000\u0000\u0242+\u0001\u0000"+
		"\u0000\u0000\u0243\u0248\u0003\u0012\t\u0000\u0244\u0245\u0005\u0011\u0000"+
		"\u0000\u0245\u0247\u0003\u0012\t\u0000\u0246\u0244\u0001\u0000\u0000\u0000"+
		"\u0247\u024a\u0001\u0000\u0000\u0000\u0248\u0246\u0001\u0000\u0000\u0000"+
		"\u0248\u0249\u0001\u0000\u0000\u0000\u0249-\u0001\u0000\u0000\u0000\u024a"+
		"\u0248\u0001\u0000\u0000\u0000\u024b\u024c\u0006\u0017\uffff\uffff\u0000"+
		"\u024c\u0250\u00030\u0018\u0000\u024d\u024e\u00056\u0000\u0000\u024e\u0250"+
		"\u00030\u0018\u0000\u024f\u024b\u0001\u0000\u0000\u0000\u024f\u024d\u0001"+
		"\u0000\u0000\u0000\u0250\u0259\u0001\u0000\u0000\u0000\u0251\u0252\n\u0003"+
		"\u0000\u0000\u0252\u0253\u00054\u0000\u0000\u0253\u0258\u00030\u0018\u0000"+
		"\u0254\u0255\n\u0002\u0000\u0000\u0255\u0256\u00055\u0000\u0000\u0256"+
		"\u0258\u00030\u0018\u0000\u0257\u0251\u0001\u0000\u0000\u0000\u0257\u0254"+
		"\u0001\u0000\u0000\u0000\u0258\u025b\u0001\u0000\u0000\u0000\u0259\u0257"+
		"\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a/\u0001"+
		"\u0000\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025c\u0276\u0003"+
		"2\u0019\u0000\u025d\u025e\u00032\u0019\u0000\u025e\u025f\u0005 \u0000"+
		"\u0000\u025f\u0260\u00032\u0019\u0000\u0260\u0276\u0001\u0000\u0000\u0000"+
		"\u0261\u0262\u00032\u0019\u0000\u0262\u0263\u0005\u001d\u0000\u0000\u0263"+
		"\u0264\u00032\u0019\u0000\u0264\u0276\u0001\u0000\u0000\u0000\u0265\u0266"+
		"\u00032\u0019\u0000\u0266\u0267\u0005\u001f\u0000\u0000\u0267\u0268\u0003"+
		"2\u0019\u0000\u0268\u0276\u0001\u0000\u0000\u0000\u0269\u026a\u00032\u0019"+
		"\u0000\u026a\u026b\u0005\u001e\u0000\u0000\u026b\u026c\u00032\u0019\u0000"+
		"\u026c\u0276\u0001\u0000\u0000\u0000\u026d\u026e\u00032\u0019\u0000\u026e"+
		"\u026f\u00057\u0000\u0000\u026f\u0270\u00032\u0019\u0000\u0270\u0276\u0001"+
		"\u0000\u0000\u0000\u0271\u0272\u00032\u0019\u0000\u0272\u0273\u0005\u001c"+
		"\u0000\u0000\u0273\u0274\u00032\u0019\u0000\u0274\u0276\u0001\u0000\u0000"+
		"\u0000\u0275\u025c\u0001\u0000\u0000\u0000\u0275\u025d\u0001\u0000\u0000"+
		"\u0000\u0275\u0261\u0001\u0000\u0000\u0000\u0275\u0265\u0001\u0000\u0000"+
		"\u0000\u0275\u0269\u0001\u0000\u0000\u0000\u0275\u026d\u0001\u0000\u0000"+
		"\u0000\u0275\u0271\u0001\u0000\u0000\u0000\u02761\u0001\u0000\u0000\u0000"+
		"\u0277\u0278\u0006\u0019\uffff\uffff\u0000\u0278\u0279\u00034\u001a\u0000"+
		"\u0279\u0282\u0001\u0000\u0000\u0000\u027a\u027b\n\u0002\u0000\u0000\u027b"+
		"\u027c\u0005\u0006\u0000\u0000\u027c\u0281\u00034\u001a\u0000\u027d\u027e"+
		"\n\u0001\u0000\u0000\u027e\u027f\u0005\b\u0000\u0000\u027f\u0281\u0003"+
		"4\u001a\u0000\u0280\u027a\u0001\u0000\u0000\u0000\u0280\u027d\u0001\u0000"+
		"\u0000\u0000\u0281\u0284\u0001\u0000\u0000\u0000\u0282\u0280\u0001\u0000"+
		"\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u02833\u0001\u0000\u0000"+
		"\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0285\u0286\u0006\u001a\uffff"+
		"\uffff\u0000\u0286\u0287\u00036\u001b\u0000\u0287\u0293\u0001\u0000\u0000"+
		"\u0000\u0288\u0289\n\u0003\u0000\u0000\u0289\u028a\u0005\t\u0000\u0000"+
		"\u028a\u0292\u00036\u001b\u0000\u028b\u028c\n\u0002\u0000\u0000\u028c"+
		"\u028d\u0005\u0007\u0000\u0000\u028d\u0292\u00036\u001b\u0000\u028e\u028f"+
		"\n\u0001\u0000\u0000\u028f\u0290\u0005\u001b\u0000\u0000\u0290\u0292\u0003"+
		"6\u001b\u0000\u0291\u0288\u0001\u0000\u0000\u0000\u0291\u028b\u0001\u0000"+
		"\u0000\u0000\u0291\u028e\u0001\u0000\u0000\u0000\u0292\u0295\u0001\u0000"+
		"\u0000\u0000\u0293\u0291\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000"+
		"\u0000\u0000\u02945\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000"+
		"\u0000\u0296\u02a0\u00038\u001c\u0000\u0297\u0298\u0005\b\u0000\u0000"+
		"\u0298\u02a0\u00036\u001b\u0000\u0299\u029a\u00038\u001c\u0000\u029a\u029b"+
		"\u0005)\u0000\u0000\u029b\u02a0\u0001\u0000\u0000\u0000\u029c\u029d\u0003"+
		"8\u001c\u0000\u029d\u029e\u0005*\u0000\u0000\u029e\u02a0\u0001\u0000\u0000"+
		"\u0000\u029f\u0296\u0001\u0000\u0000\u0000\u029f\u0297\u0001\u0000\u0000"+
		"\u0000\u029f\u0299\u0001\u0000\u0000\u0000\u029f\u029c\u0001\u0000\u0000"+
		"\u0000\u02a07\u0001\u0000\u0000\u0000\u02a1\u02b5\u0003<\u001e\u0000\u02a2"+
		"\u02a3\u0003<\u001e\u0000\u02a3\u02a4\u00052\u0000\u0000\u02a4\u02a5\u0003"+
		"\u0012\t\u0000\u02a5\u02a6\u00053\u0000\u0000\u02a6\u02b5\u0001\u0000"+
		"\u0000\u0000\u02a7\u02a8\u0003<\u001e\u0000\u02a8\u02a9\u0005\u0002\u0000"+
		"\u0000\u02a9\u02aa\u0003:\u001d\u0000\u02aa\u02ab\u0005\u0003\u0000\u0000"+
		"\u02ab\u02b5\u0001\u0000\u0000\u0000\u02ac\u02ad\u0003<\u001e\u0000\u02ad"+
		"\u02ae\u00058\u0000\u0000\u02ae\u02af\u0005;\u0000\u0000\u02af\u02b5\u0001"+
		"\u0000\u0000\u0000\u02b0\u02b1\u0003<\u001e\u0000\u02b1\u02b2\u00059\u0000"+
		"\u0000\u02b2\u02b3\u0005;\u0000\u0000\u02b3\u02b5\u0001\u0000\u0000\u0000"+
		"\u02b4\u02a1\u0001\u0000\u0000\u0000\u02b4\u02a2\u0001\u0000\u0000\u0000"+
		"\u02b4\u02a7\u0001\u0000\u0000\u0000\u02b4\u02ac\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b0\u0001\u0000\u0000\u0000\u02b59\u0001\u0000\u0000\u0000\u02b6"+
		"\u02b9\u0003,\u0016\u0000\u02b7\u02b9\u0001\u0000\u0000\u0000\u02b8\u02b6"+
		"\u0001\u0000\u0000\u0000\u02b8\u02b7\u0001\u0000\u0000\u0000\u02b9;\u0001"+
		"\u0000\u0000\u0000\u02ba\u02c3\u0005;\u0000\u0000\u02bb\u02c3\u0005<\u0000"+
		"\u0000\u02bc\u02c3\u0005=\u0000\u0000\u02bd\u02c3\u0005>\u0000\u0000\u02be"+
		"\u02bf\u0005\u0002\u0000\u0000\u02bf\u02c0\u0003\u0012\t\u0000\u02c0\u02c1"+
		"\u0005\u0003\u0000\u0000\u02c1\u02c3\u0001\u0000\u0000\u0000\u02c2\u02ba"+
		"\u0001\u0000\u0000\u0000\u02c2\u02bb\u0001\u0000\u0000\u0000\u02c2\u02bc"+
		"\u0001\u0000\u0000\u0000\u02c2\u02bd\u0001\u0000\u0000\u0000\u02c2\u02be"+
		"\u0001\u0000\u0000\u0000\u02c3=\u0001\u0000\u0000\u0000.@DLbz\u0090\u009e"+
		"\u00a1\u00aa\u00b0\u00b7\u00bf\u00f5\u0181\u01a7\u01ba\u01bd\u01c6\u01d1"+
		"\u01da\u01df\u01ec\u01f3\u01f9\u0202\u0207\u020c\u0213\u0216\u021b\u0228"+
		"\u0230\u023d\u0248\u024f\u0257\u0259\u0275\u0280\u0282\u0291\u0293\u029f"+
		"\u02b4\u02b8\u02c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}