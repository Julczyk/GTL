// Generated from D:/mateusz/studia/4_semestr/Kompilatory/GTL/GreenTextLangParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GreenTextLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ENTRY=1, COMMENT=2, COMMENT_NEWLINE=3, END_LIFE=4, INVITE=5, BE=6, SEE=7, 
		SEEING=8, TASTE=9, TASTING=10, HEAR=11, HEARING=12, SMELL=13, SMELLING=14, 
		SPOT=15, SPOTTING=16, SOMEONE_ELSES=17, ABOUT=18, MULTIPLE=19, TH=20, 
		LOOK_AROUND=21, LOSE_INTEREST=22, S=23, SPIT=24, SWALLOW=25, PROFIT=26, 
		CALL=27, REGARDING=28, LIKES=29, THINK_THAT=30, RECONSIDER=31, IMPLYING=32, 
		OR_STH=33, OR=34, OR_NOT=35, DECIMAL_LITERAL=36, FLOAT_LITERAL=37, BOOL_LITERAL=38, 
		STRING_LITERAL=39, AND=40, COMMA=41, IS=42, VIBE_WITH=43, DOESNT_VIBE_WITH=44, 
		BEATEN_BY=45, DOESNT_BEAT=46, BEATS=47, UNBEATEN_BY=48, ALSO=49, ALTERNATIVELY=50, 
		NOT=51, JOINED_BY=52, EVOLVES=53, DEVOLVES=54, BREEDING_LIKE=55, TIMES=56, 
		THE_LITERAL_OPPOSITE_OF=57, FLIPPED=58, WHATEVER_LEFT_FROM=59, NEWLINE=60, 
		WS=61, LINE_COMMENT=62, NAME=63;
	public static final int
		RULE_program = 0, RULE_code_blocks = 1, RULE_code_block = 2, RULE_statement = 3, 
		RULE_statement_newline = 4, RULE_simple_statement = 5, RULE_compound_statement = 6, 
		RULE_spit = 7, RULE_swallow = 8, RULE_variable_declaration = 9, RULE_variable_assignment = 10, 
		RULE_variable = 11, RULE_function_call = 12, RULE_function = 13, RULE_invite = 14, 
		RULE_module = 15, RULE_function_declaration = 16, RULE_function_name = 17, 
		RULE_function_return = 18, RULE_function_arguments = 19, RULE_struct_declaration = 20, 
		RULE_struct_name = 21, RULE_loop_declaration = 22, RULE_if_declaration = 23, 
		RULE_or_statement = 24, RULE_or_not_statement = 25, RULE_type = 26, RULE_complex_type = 27, 
		RULE_primitive_type = 28, RULE_struct_type = 29, RULE_variable_declaration_ing_without_elses = 30, 
		RULE_variable_declaration_ing = 31, RULE_type_ing = 32, RULE_complex_type_ing = 33, 
		RULE_primitive_type_ing = 34, RULE_struct_type_ing = 35, RULE_expressions = 36, 
		RULE_expression = 37, RULE_also = 38, RULE_inversion = 39, RULE_comparison = 40, 
		RULE_compare_sum = 41, RULE_sum = 42, RULE_term = 43, RULE_factor = 44, 
		RULE_atom = 45, RULE_literal = 46, RULE_separator = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "code_blocks", "code_block", "statement", "statement_newline", 
			"simple_statement", "compound_statement", "spit", "swallow", "variable_declaration", 
			"variable_assignment", "variable", "function_call", "function", "invite", 
			"module", "function_declaration", "function_name", "function_return", 
			"function_arguments", "struct_declaration", "struct_name", "loop_declaration", 
			"if_declaration", "or_statement", "or_not_statement", "type", "complex_type", 
			"primitive_type", "struct_type", "variable_declaration_ing_without_elses", 
			"variable_declaration_ing", "type_ing", "complex_type_ing", "primitive_type_ing", 
			"struct_type_ing", "expressions", "expression", "also", "inversion", 
			"comparison", "compare_sum", "sum", "term", "factor", "atom", "literal", 
			"separator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' >'", null, null, null, "'invite'", "'be'", "'see'", "'seeing'", 
			"'taste'", "'tasting'", "'hear'", "'hearing'", "'smell'", "'smelling'", 
			"'spot'", "'spotting'", "'someone elses'", "'about'", "'multiple'", "''th'", 
			"'look around'", "'lose interest'", "''s'", "'spit'", "'swallow'", "'profit'", 
			"'call'", "'regarding'", "'likes'", "'think that'", "'reconsider'", "'implying'", 
			"'or sth'", "'or'", "'or not'", null, null, null, null, "'and'", "','", 
			"'is'", "'vibe with'", "'doesn\\u2019t vibe with'", "'beaten by'", "'doesn\\u2019t beat'", 
			"'beats'", "'unbeaten by'", "'also'", "'alternatively'", "'not'", "'joined by'", 
			"'evolves'", "'devolves'", "'breeding like'", "'times'", "'the literal opposite of'", 
			"'flipped'", "'whatever left from'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ENTRY", "COMMENT", "COMMENT_NEWLINE", "END_LIFE", "INVITE", "BE", 
			"SEE", "SEEING", "TASTE", "TASTING", "HEAR", "HEARING", "SMELL", "SMELLING", 
			"SPOT", "SPOTTING", "SOMEONE_ELSES", "ABOUT", "MULTIPLE", "TH", "LOOK_AROUND", 
			"LOSE_INTEREST", "S", "SPIT", "SWALLOW", "PROFIT", "CALL", "REGARDING", 
			"LIKES", "THINK_THAT", "RECONSIDER", "IMPLYING", "OR_STH", "OR", "OR_NOT", 
			"DECIMAL_LITERAL", "FLOAT_LITERAL", "BOOL_LITERAL", "STRING_LITERAL", 
			"AND", "COMMA", "IS", "VIBE_WITH", "DOESNT_VIBE_WITH", "BEATEN_BY", "DOESNT_BEAT", 
			"BEATS", "UNBEATEN_BY", "ALSO", "ALTERNATIVELY", "NOT", "JOINED_BY", 
			"EVOLVES", "DEVOLVES", "BREEDING_LIKE", "TIMES", "THE_LITERAL_OPPOSITE_OF", 
			"FLIPPED", "WHATEVER_LEFT_FROM", "NEWLINE", "WS", "LINE_COMMENT", "NAME"
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
	public String getGrammarFileName() { return "GreenTextLangParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GreenTextLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Code_blocksContext code_blocks() {
			return getRuleContext(Code_blocksContext.class,0);
		}
		public List<TerminalNode> END_LIFE() { return getTokens(GreenTextLangParser.END_LIFE); }
		public TerminalNode END_LIFE(int i) {
			return getToken(GreenTextLangParser.END_LIFE, i);
		}
		public TerminalNode EOF() { return getToken(GreenTextLangParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTRY:
			case END_LIFE:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==END_LIFE) {
					{
					{
					setState(96);
					match(END_LIFE);
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
				code_blocks();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(EOF);
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
	public static class Code_blocksContext extends ParserRuleContext {
		public List<Code_blockContext> code_block() {
			return getRuleContexts(Code_blockContext.class);
		}
		public Code_blockContext code_block(int i) {
			return getRuleContext(Code_blockContext.class,i);
		}
		public TerminalNode EOF() { return getToken(GreenTextLangParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GreenTextLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GreenTextLangParser.NEWLINE, i);
		}
		public List<TerminalNode> END_LIFE() { return getTokens(GreenTextLangParser.END_LIFE); }
		public TerminalNode END_LIFE(int i) {
			return getToken(GreenTextLangParser.END_LIFE, i);
		}
		public Code_blocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_blocks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterCode_blocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitCode_blocks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitCode_blocks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blocksContext code_blocks() throws RecognitionException {
		Code_blocksContext _localctx = new Code_blocksContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code_blocks);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(106);
					code_block();
					setState(107);
					match(NEWLINE);
					setState(109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(108);
						match(END_LIFE);
						}
						}
						setState(111); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==END_LIFE );
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(118);
			code_block();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(119);
				match(NEWLINE);
				}
			}

			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==END_LIFE) {
				{
				{
				setState(122);
				match(END_LIFE);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
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
	public static class Code_blockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<Statement_newlineContext> statement_newline() {
			return getRuleContexts(Statement_newlineContext.class);
		}
		public Statement_newlineContext statement_newline(int i) {
			return getRuleContext(Statement_newlineContext.class,i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitCode_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_code_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					statement_newline();
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(136);
			statement();
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
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public TerminalNode ENTRY() { return getToken(GreenTextLangParser.ENTRY, 0); }
		public Simple_statementContext simple_statement() {
			return getRuleContext(Simple_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				compound_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(ENTRY);
				setState(140);
				simple_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(ENTRY);
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
	public static class Statement_newlineContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GreenTextLangParser.NEWLINE, 0); }
		public TerminalNode ENTRY() { return getToken(GreenTextLangParser.ENTRY, 0); }
		public Simple_statementContext simple_statement() {
			return getRuleContext(Simple_statementContext.class,0);
		}
		public Statement_newlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterStatement_newline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitStatement_newline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitStatement_newline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_newlineContext statement_newline() throws RecognitionException {
		Statement_newlineContext _localctx = new Statement_newlineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement_newline);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				compound_statement();
				setState(145);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(ENTRY);
				setState(148);
				simple_statement();
				setState(149);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(ENTRY);
				setState(152);
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
	public static class Simple_statementContext extends ParserRuleContext {
		public SpitContext spit() {
			return getRuleContext(SpitContext.class,0);
		}
		public SwallowContext swallow() {
			return getRuleContext(SwallowContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Variable_assignmentContext variable_assignment() {
			return getRuleContext(Variable_assignmentContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public InviteContext invite() {
			return getRuleContext(InviteContext.class,0);
		}
		public Simple_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterSimple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitSimple_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitSimple_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_statementContext simple_statement() throws RecognitionException {
		Simple_statementContext _localctx = new Simple_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simple_statement);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				spit();
				}
				break;
			case SWALLOW:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				swallow();
				}
				break;
			case SEE:
			case TASTE:
			case HEAR:
			case SMELL:
			case SPOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				variable_declaration();
				}
				break;
			case DECIMAL_LITERAL:
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				variable_assignment();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				function_call();
				}
				break;
			case INVITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				invite();
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
	public static class Compound_statementContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Loop_declarationContext loop_declaration() {
			return getRuleContext(Loop_declarationContext.class,0);
		}
		public If_declarationContext if_declaration() {
			return getRuleContext(If_declarationContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitCompound_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitCompound_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compound_statement);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				function_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				struct_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				loop_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				if_declaration();
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
		public TerminalNode SPIT() { return getToken(GreenTextLangParser.SPIT, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public SpitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterSpit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitSpit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitSpit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpitContext spit() throws RecognitionException {
		SpitContext _localctx = new SpitContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_spit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(SPIT);
			setState(170);
			expressions();
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
	public static class SwallowContext extends ParserRuleContext {
		public TerminalNode SWALLOW() { return getToken(GreenTextLangParser.SWALLOW, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SwallowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swallow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterSwallow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitSwallow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitSwallow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwallowContext swallow() throws RecognitionException {
		SwallowContext _localctx = new SwallowContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_swallow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(SWALLOW);
			setState(173);
			variable();
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
	public static class Variable_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
		public TerminalNode IS() { return getToken(GreenTextLangParser.IS, 0); }
		public TerminalNode SOMEONE_ELSES() { return getToken(GreenTextLangParser.SOMEONE_ELSES, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable_declaration);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				type();
				setState(176);
				match(NAME);
				setState(177);
				match(IS);
				setState(178);
				match(SOMEONE_ELSES);
				setState(179);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				type();
				setState(182);
				match(NAME);
				setState(183);
				match(IS);
				setState(184);
				expressions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				type();
				setState(187);
				match(NAME);
				setState(188);
				match(IS);
				setState(189);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				type();
				setState(192);
				match(NAME);
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
	public static class Variable_assignmentContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode IS() { return getToken(GreenTextLangParser.IS, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode SOMEONE_ELSES() { return getToken(GreenTextLangParser.SOMEONE_ELSES, 0); }
		public TerminalNode JOINED_BY() { return getToken(GreenTextLangParser.JOINED_BY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EVOLVES() { return getToken(GreenTextLangParser.EVOLVES, 0); }
		public TerminalNode DEVOLVES() { return getToken(GreenTextLangParser.DEVOLVES, 0); }
		public TerminalNode BREEDING_LIKE() { return getToken(GreenTextLangParser.BREEDING_LIKE, 0); }
		public TerminalNode TIMES() { return getToken(GreenTextLangParser.TIMES, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GreenTextLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GreenTextLangParser.NEWLINE, i);
		}
		public List<TerminalNode> ENTRY() { return getTokens(GreenTextLangParser.ENTRY); }
		public TerminalNode ENTRY(int i) {
			return getToken(GreenTextLangParser.ENTRY, i);
		}
		public TerminalNode FLIPPED() { return getToken(GreenTextLangParser.FLIPPED, 0); }
		public TerminalNode THE_LITERAL_OPPOSITE_OF() { return getToken(GreenTextLangParser.THE_LITERAL_OPPOSITE_OF, 0); }
		public TerminalNode WHATEVER_LEFT_FROM() { return getToken(GreenTextLangParser.WHATEVER_LEFT_FROM, 0); }
		public Variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterVariable_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitVariable_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitVariable_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable_assignment);
		int _la;
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				variable();
				setState(197);
				match(IS);
				setState(198);
				expressions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				variable();
				setState(201);
				match(IS);
				setState(202);
				function_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				variable();
				setState(205);
				match(IS);
				setState(206);
				match(SOMEONE_ELSES);
				setState(207);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				variable();
				setState(210);
				match(IS);
				setState(211);
				match(JOINED_BY);
				setState(212);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				variable();
				setState(215);
				match(EVOLVES);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				variable();
				setState(218);
				match(DEVOLVES);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(220);
				variable();
				setState(221);
				match(IS);
				setState(222);
				match(BREEDING_LIKE);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(223);
					match(NEWLINE);
					setState(224);
					match(ENTRY);
					}
				}

				setState(227);
				expression();
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(228);
					match(NEWLINE);
					setState(229);
					match(ENTRY);
					}
				}

				setState(232);
				match(TIMES);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(234);
				variable();
				setState(235);
				match(IS);
				setState(236);
				match(FLIPPED);
				setState(237);
				expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(239);
				variable();
				setState(240);
				match(IS);
				setState(241);
				match(THE_LITERAL_OPPOSITE_OF);
				setState(242);
				expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(244);
				variable();
				setState(245);
				match(IS);
				setState(246);
				match(WHATEVER_LEFT_FROM);
				setState(247);
				expression();
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
		public TerminalNode S() { return getToken(GreenTextLangParser.S, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode TH() { return getToken(GreenTextLangParser.TH, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(GreenTextLangParser.DECIMAL_LITERAL, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(NAME);
				setState(252);
				match(S);
				setState(253);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL_LITERAL || _la==NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(255);
				match(TH);
				setState(256);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				match(NAME);
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
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(GreenTextLangParser.CALL, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode REGARDING() { return getToken(GreenTextLangParser.REGARDING, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(CALL);
			setState(261);
			function();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGARDING) {
				{
				setState(262);
				match(REGARDING);
				setState(263);
				expressions();
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode S() { return getToken(GreenTextLangParser.S, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				variable();
				setState(268);
				match(S);
				setState(269);
				function();
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
	public static class InviteContext extends ParserRuleContext {
		public TerminalNode INVITE() { return getToken(GreenTextLangParser.INVITE, 0); }
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public InviteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterInvite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitInvite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitInvite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InviteContext invite() throws RecognitionException {
		InviteContext _localctx = new InviteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_invite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(INVITE);
			setState(274);
			module();
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
	public static class ModuleContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GreenTextLangParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GreenTextLangParser.NAME, i);
		}
		public TerminalNode S() { return getToken(GreenTextLangParser.S, 0); }
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(NAME);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==S) {
				{
				setState(277);
				match(S);
				setState(278);
				module();
				}
			}

			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(281);
					separator();
					setState(282);
					match(NAME);
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
	public static class Function_declarationContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode ENTRY() { return getToken(GreenTextLangParser.ENTRY, 0); }
		public TerminalNode PROFIT() { return getToken(GreenTextLangParser.PROFIT, 0); }
		public Function_returnContext function_return() {
			return getRuleContext(Function_returnContext.class,0);
		}
		public Function_argumentsContext function_arguments() {
			return getRuleContext(Function_argumentsContext.class,0);
		}
		public List<Statement_newlineContext> statement_newline() {
			return getRuleContexts(Statement_newlineContext.class);
		}
		public Statement_newlineContext statement_newline(int i) {
			return getRuleContext(Statement_newlineContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			function_name();
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(290);
				function_return();
				}
				break;
			}
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(293);
				function_arguments();
				}
				break;
			}
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(296);
					statement_newline();
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(302);
			match(ENTRY);
			setState(303);
			match(PROFIT);
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
	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode ENTRY() { return getToken(GreenTextLangParser.ENTRY, 0); }
		public TerminalNode BE() { return getToken(GreenTextLangParser.BE, 0); }
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(GreenTextLangParser.NEWLINE, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(ENTRY);
			setState(306);
			match(BE);
			setState(307);
			match(NAME);
			setState(308);
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
	public static class Function_returnContext extends ParserRuleContext {
		public TerminalNode ENTRY() { return getToken(GreenTextLangParser.ENTRY, 0); }
		public Variable_declaration_ing_without_elsesContext variable_declaration_ing_without_elses() {
			return getRuleContext(Variable_declaration_ing_without_elsesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GreenTextLangParser.NEWLINE, 0); }
		public Function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterFunction_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitFunction_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitFunction_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_returnContext function_return() throws RecognitionException {
		Function_returnContext _localctx = new Function_returnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(ENTRY);
			setState(311);
			variable_declaration_ing_without_elses();
			setState(312);
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
	public static class Function_argumentsContext extends ParserRuleContext {
		public TerminalNode ENTRY() { return getToken(GreenTextLangParser.ENTRY, 0); }
		public TerminalNode LIKES() { return getToken(GreenTextLangParser.LIKES, 0); }
		public List<Variable_declaration_ingContext> variable_declaration_ing() {
			return getRuleContexts(Variable_declaration_ingContext.class);
		}
		public Variable_declaration_ingContext variable_declaration_ing(int i) {
			return getRuleContext(Variable_declaration_ingContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(GreenTextLangParser.NEWLINE, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Function_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterFunction_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitFunction_arguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitFunction_arguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argumentsContext function_arguments() throws RecognitionException {
		Function_argumentsContext _localctx = new Function_argumentsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_arguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(ENTRY);
			setState(315);
			match(LIKES);
			setState(316);
			variable_declaration_ing();
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(317);
					separator();
					setState(318);
					variable_declaration_ing();
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(325);
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
	public static class Struct_declarationContext extends ParserRuleContext {
		public Struct_nameContext struct_name() {
			return getRuleContext(Struct_nameContext.class,0);
		}
		public TerminalNode ENTRY() { return getToken(GreenTextLangParser.ENTRY, 0); }
		public TerminalNode LOSE_INTEREST() { return getToken(GreenTextLangParser.LOSE_INTEREST, 0); }
		public List<Statement_newlineContext> statement_newline() {
			return getRuleContexts(Statement_newlineContext.class);
		}
		public Statement_newlineContext statement_newline(int i) {
			return getRuleContext(Statement_newlineContext.class,i);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitStruct_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitStruct_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_struct_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			struct_name();
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(328);
					statement_newline();
					}
					} 
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(334);
			match(ENTRY);
			setState(335);
			match(LOSE_INTEREST);
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
	public static class Struct_nameContext extends ParserRuleContext {
		public List<TerminalNode> ENTRY() { return getTokens(GreenTextLangParser.ENTRY); }
		public TerminalNode ENTRY(int i) {
			return getToken(GreenTextLangParser.ENTRY, i);
		}
		public TerminalNode LOOK_AROUND() { return getToken(GreenTextLangParser.LOOK_AROUND, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GreenTextLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GreenTextLangParser.NEWLINE, i);
		}
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
		public Struct_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterStruct_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitStruct_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitStruct_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_nameContext struct_name() throws RecognitionException {
		Struct_nameContext _localctx = new Struct_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_struct_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(ENTRY);
			setState(338);
			match(LOOK_AROUND);
			setState(339);
			match(NEWLINE);
			setState(340);
			match(ENTRY);
			setState(341);
			match(NAME);
			setState(342);
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
	public static class Loop_declarationContext extends ParserRuleContext {
		public List<TerminalNode> ENTRY() { return getTokens(GreenTextLangParser.ENTRY); }
		public TerminalNode ENTRY(int i) {
			return getToken(GreenTextLangParser.ENTRY, i);
		}
		public TerminalNode THINK_THAT() { return getToken(GreenTextLangParser.THINK_THAT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GreenTextLangParser.NEWLINE, 0); }
		public TerminalNode RECONSIDER() { return getToken(GreenTextLangParser.RECONSIDER, 0); }
		public List<Statement_newlineContext> statement_newline() {
			return getRuleContexts(Statement_newlineContext.class);
		}
		public Statement_newlineContext statement_newline(int i) {
			return getRuleContext(Statement_newlineContext.class,i);
		}
		public Loop_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterLoop_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitLoop_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitLoop_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_declarationContext loop_declaration() throws RecognitionException {
		Loop_declarationContext _localctx = new Loop_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_loop_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(ENTRY);
			setState(345);
			match(THINK_THAT);
			setState(346);
			expression();
			setState(347);
			match(NEWLINE);
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(348);
					statement_newline();
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(354);
			match(ENTRY);
			setState(355);
			match(RECONSIDER);
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
	public static class If_declarationContext extends ParserRuleContext {
		public List<TerminalNode> ENTRY() { return getTokens(GreenTextLangParser.ENTRY); }
		public TerminalNode ENTRY(int i) {
			return getToken(GreenTextLangParser.ENTRY, i);
		}
		public TerminalNode IMPLYING() { return getToken(GreenTextLangParser.IMPLYING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GreenTextLangParser.NEWLINE, 0); }
		public TerminalNode OR_STH() { return getToken(GreenTextLangParser.OR_STH, 0); }
		public List<Statement_newlineContext> statement_newline() {
			return getRuleContexts(Statement_newlineContext.class);
		}
		public Statement_newlineContext statement_newline(int i) {
			return getRuleContext(Statement_newlineContext.class,i);
		}
		public Or_statementContext or_statement() {
			return getRuleContext(Or_statementContext.class,0);
		}
		public Or_not_statementContext or_not_statement() {
			return getRuleContext(Or_not_statementContext.class,0);
		}
		public If_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterIf_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitIf_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitIf_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_declarationContext if_declaration() throws RecognitionException {
		If_declarationContext _localctx = new If_declarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_if_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(ENTRY);
			setState(358);
			match(IMPLYING);
			setState(359);
			expression();
			setState(360);
			match(NEWLINE);
			setState(364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(361);
					statement_newline();
					}
					} 
				}
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(367);
				or_statement();
				}
				break;
			}
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(370);
				or_not_statement();
				}
				break;
			}
			setState(373);
			match(ENTRY);
			setState(374);
			match(OR_STH);
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
	public static class Or_statementContext extends ParserRuleContext {
		public TerminalNode ENTRY() { return getToken(GreenTextLangParser.ENTRY, 0); }
		public TerminalNode OR() { return getToken(GreenTextLangParser.OR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GreenTextLangParser.NEWLINE, 0); }
		public List<Statement_newlineContext> statement_newline() {
			return getRuleContexts(Statement_newlineContext.class);
		}
		public Statement_newlineContext statement_newline(int i) {
			return getRuleContext(Statement_newlineContext.class,i);
		}
		public Or_statementContext or_statement() {
			return getRuleContext(Or_statementContext.class,0);
		}
		public Or_not_statementContext or_not_statement() {
			return getRuleContext(Or_not_statementContext.class,0);
		}
		public Or_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterOr_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitOr_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitOr_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_statementContext or_statement() throws RecognitionException {
		Or_statementContext _localctx = new Or_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_or_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(ENTRY);
			setState(377);
			match(OR);
			setState(378);
			expression();
			setState(379);
			match(NEWLINE);
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(380);
					statement_newline();
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(386);
				or_statement();
				}
				break;
			}
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(389);
				or_not_statement();
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
	public static class Or_not_statementContext extends ParserRuleContext {
		public TerminalNode ENTRY() { return getToken(GreenTextLangParser.ENTRY, 0); }
		public TerminalNode OR_NOT() { return getToken(GreenTextLangParser.OR_NOT, 0); }
		public TerminalNode NEWLINE() { return getToken(GreenTextLangParser.NEWLINE, 0); }
		public List<Statement_newlineContext> statement_newline() {
			return getRuleContexts(Statement_newlineContext.class);
		}
		public Statement_newlineContext statement_newline(int i) {
			return getRuleContext(Statement_newlineContext.class,i);
		}
		public Or_not_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_not_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterOr_not_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitOr_not_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitOr_not_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_not_statementContext or_not_statement() throws RecognitionException {
		Or_not_statementContext _localctx = new Or_not_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_or_not_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(ENTRY);
			setState(393);
			match(OR_NOT);
			setState(394);
			match(NEWLINE);
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(395);
					statement_newline();
					}
					} 
				}
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
	public static class TypeContext extends ParserRuleContext {
		public Complex_typeContext complex_type() {
			return getRuleContext(Complex_typeContext.class,0);
		}
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type);
		try {
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				complex_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				primitive_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				struct_type();
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
	public static class Complex_typeContext extends ParserRuleContext {
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public TerminalNode MULTIPLE() { return getToken(GreenTextLangParser.MULTIPLE, 0); }
		public TerminalNode ABOUT() { return getToken(GreenTextLangParser.ABOUT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SPOT() { return getToken(GreenTextLangParser.SPOT, 0); }
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
		public Complex_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterComplex_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitComplex_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitComplex_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_typeContext complex_type() throws RecognitionException {
		Complex_typeContext _localctx = new Complex_typeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_complex_type);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				primitive_type();
				setState(407);
				match(MULTIPLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				primitive_type();
				setState(410);
				match(ABOUT);
				setState(411);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				match(SPOT);
				setState(414);
				match(ABOUT);
				setState(415);
				expression();
				setState(416);
				match(NAME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(418);
				match(SPOT);
				setState(419);
				match(MULTIPLE);
				setState(420);
				match(NAME);
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
	public static class Primitive_typeContext extends ParserRuleContext {
		public TerminalNode SEE() { return getToken(GreenTextLangParser.SEE, 0); }
		public TerminalNode TASTE() { return getToken(GreenTextLangParser.TASTE, 0); }
		public TerminalNode HEAR() { return getToken(GreenTextLangParser.HEAR, 0); }
		public TerminalNode SMELL() { return getToken(GreenTextLangParser.SMELL, 0); }
		public Primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterPrimitive_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitPrimitive_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitPrimitive_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_typeContext primitive_type() throws RecognitionException {
		Primitive_typeContext _localctx = new Primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 10880L) != 0)) ) {
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
	public static class Struct_typeContext extends ParserRuleContext {
		public TerminalNode SPOT() { return getToken(GreenTextLangParser.SPOT, 0); }
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
		public Struct_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterStruct_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitStruct_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitStruct_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_typeContext struct_type() throws RecognitionException {
		Struct_typeContext _localctx = new Struct_typeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_struct_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(SPOT);
			setState(426);
			match(NAME);
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
	public static class Variable_declaration_ing_without_elsesContext extends ParserRuleContext {
		public Type_ingContext type_ing() {
			return getRuleContext(Type_ingContext.class,0);
		}
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
		public TerminalNode IS() { return getToken(GreenTextLangParser.IS, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Variable_declaration_ing_without_elsesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_ing_without_elses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterVariable_declaration_ing_without_elses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitVariable_declaration_ing_without_elses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitVariable_declaration_ing_without_elses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaration_ing_without_elsesContext variable_declaration_ing_without_elses() throws RecognitionException {
		Variable_declaration_ing_without_elsesContext _localctx = new Variable_declaration_ing_without_elsesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variable_declaration_ing_without_elses);
		try {
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				type_ing();
				setState(429);
				match(NAME);
				setState(430);
				match(IS);
				setState(431);
				expressions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				type_ing();
				setState(434);
				match(NAME);
				setState(435);
				match(IS);
				setState(436);
				function_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				type_ing();
				setState(439);
				match(NAME);
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
	public static class Variable_declaration_ingContext extends ParserRuleContext {
		public Type_ingContext type_ing() {
			return getRuleContext(Type_ingContext.class,0);
		}
		public TerminalNode SOMEONE_ELSES() { return getToken(GreenTextLangParser.SOMEONE_ELSES, 0); }
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
		public TerminalNode IS() { return getToken(GreenTextLangParser.IS, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Variable_declaration_ingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_ing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterVariable_declaration_ing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitVariable_declaration_ing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitVariable_declaration_ing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaration_ingContext variable_declaration_ing() throws RecognitionException {
		Variable_declaration_ingContext _localctx = new Variable_declaration_ingContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variable_declaration_ing);
		try {
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				type_ing();
				setState(444);
				match(SOMEONE_ELSES);
				setState(445);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				type_ing();
				setState(448);
				match(NAME);
				setState(449);
				match(IS);
				setState(450);
				expressions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				type_ing();
				setState(453);
				match(NAME);
				setState(454);
				match(IS);
				setState(455);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(457);
				type_ing();
				setState(458);
				match(NAME);
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
	public static class Type_ingContext extends ParserRuleContext {
		public Complex_type_ingContext complex_type_ing() {
			return getRuleContext(Complex_type_ingContext.class,0);
		}
		public Primitive_type_ingContext primitive_type_ing() {
			return getRuleContext(Primitive_type_ingContext.class,0);
		}
		public Struct_type_ingContext struct_type_ing() {
			return getRuleContext(Struct_type_ingContext.class,0);
		}
		public Type_ingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_ing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterType_ing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitType_ing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitType_ing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_ingContext type_ing() throws RecognitionException {
		Type_ingContext _localctx = new Type_ingContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_type_ing);
		try {
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				complex_type_ing();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				primitive_type_ing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				struct_type_ing();
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
	public static class Complex_type_ingContext extends ParserRuleContext {
		public Primitive_type_ingContext primitive_type_ing() {
			return getRuleContext(Primitive_type_ingContext.class,0);
		}
		public TerminalNode MULTIPLE() { return getToken(GreenTextLangParser.MULTIPLE, 0); }
		public TerminalNode ABOUT() { return getToken(GreenTextLangParser.ABOUT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SPOTTING() { return getToken(GreenTextLangParser.SPOTTING, 0); }
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
		public Complex_type_ingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_type_ing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterComplex_type_ing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitComplex_type_ing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitComplex_type_ing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_type_ingContext complex_type_ing() throws RecognitionException {
		Complex_type_ingContext _localctx = new Complex_type_ingContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_complex_type_ing);
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				primitive_type_ing();
				setState(468);
				match(MULTIPLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				primitive_type_ing();
				setState(471);
				match(ABOUT);
				setState(472);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(SPOTTING);
				setState(475);
				match(ABOUT);
				setState(476);
				expression();
				setState(477);
				match(NAME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				match(SPOTTING);
				setState(480);
				match(MULTIPLE);
				setState(481);
				match(NAME);
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
	public static class Primitive_type_ingContext extends ParserRuleContext {
		public TerminalNode SEEING() { return getToken(GreenTextLangParser.SEEING, 0); }
		public TerminalNode TASTING() { return getToken(GreenTextLangParser.TASTING, 0); }
		public TerminalNode HEARING() { return getToken(GreenTextLangParser.HEARING, 0); }
		public TerminalNode SMELLING() { return getToken(GreenTextLangParser.SMELLING, 0); }
		public Primitive_type_ingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type_ing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterPrimitive_type_ing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitPrimitive_type_ing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitPrimitive_type_ing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_type_ingContext primitive_type_ing() throws RecognitionException {
		Primitive_type_ingContext _localctx = new Primitive_type_ingContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_primitive_type_ing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 21760L) != 0)) ) {
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
	public static class Struct_type_ingContext extends ParserRuleContext {
		public TerminalNode SPOTTING() { return getToken(GreenTextLangParser.SPOTTING, 0); }
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
		public Struct_type_ingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_type_ing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterStruct_type_ing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitStruct_type_ing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitStruct_type_ing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_type_ingContext struct_type_ing() throws RecognitionException {
		Struct_type_ingContext _localctx = new Struct_type_ingContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_struct_type_ing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(SPOTTING);
			setState(487);
			match(NAME);
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
	public static class ExpressionsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SeparatorContext separator() {
			return getRuleContext(SeparatorContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			expression();
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(490);
				separator();
				setState(491);
				expressions();
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<AlsoContext> also() {
			return getRuleContexts(AlsoContext.class);
		}
		public AlsoContext also(int i) {
			return getRuleContext(AlsoContext.class,i);
		}
		public List<TerminalNode> ALTERNATIVELY() { return getTokens(GreenTextLangParser.ALTERNATIVELY); }
		public TerminalNode ALTERNATIVELY(int i) {
			return getToken(GreenTextLangParser.ALTERNATIVELY, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			also();
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALTERNATIVELY) {
				{
				{
				setState(496);
				match(ALTERNATIVELY);
				setState(497);
				also();
				}
				}
				setState(502);
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
	public static class AlsoContext extends ParserRuleContext {
		public List<InversionContext> inversion() {
			return getRuleContexts(InversionContext.class);
		}
		public InversionContext inversion(int i) {
			return getRuleContext(InversionContext.class,i);
		}
		public List<TerminalNode> ALSO() { return getTokens(GreenTextLangParser.ALSO); }
		public TerminalNode ALSO(int i) {
			return getToken(GreenTextLangParser.ALSO, i);
		}
		public AlsoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_also; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterAlso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitAlso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitAlso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlsoContext also() throws RecognitionException {
		AlsoContext _localctx = new AlsoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_also);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			inversion();
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALSO) {
				{
				{
				setState(504);
				match(ALSO);
				setState(505);
				inversion();
				}
				}
				setState(510);
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
	public static class InversionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(GreenTextLangParser.NOT, 0); }
		public InversionContext inversion() {
			return getRuleContext(InversionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public InversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inversion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterInversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitInversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitInversion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InversionContext inversion() throws RecognitionException {
		InversionContext _localctx = new InversionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_inversion);
		try {
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(NOT);
				setState(512);
				inversion();
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case THE_LITERAL_OPPOSITE_OF:
			case FLIPPED:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				comparison();
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
	public static class ComparisonContext extends ParserRuleContext {
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public Compare_sumContext compare_sum() {
			return getRuleContext(Compare_sumContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			sum(0);
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 554153860399104L) != 0)) {
				{
				setState(517);
				compare_sum();
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
	public static class Compare_sumContext extends ParserRuleContext {
		public TerminalNode VIBE_WITH() { return getToken(GreenTextLangParser.VIBE_WITH, 0); }
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public TerminalNode DOESNT_VIBE_WITH() { return getToken(GreenTextLangParser.DOESNT_VIBE_WITH, 0); }
		public TerminalNode BEATEN_BY() { return getToken(GreenTextLangParser.BEATEN_BY, 0); }
		public TerminalNode DOESNT_BEAT() { return getToken(GreenTextLangParser.DOESNT_BEAT, 0); }
		public TerminalNode BEATS() { return getToken(GreenTextLangParser.BEATS, 0); }
		public TerminalNode UNBEATEN_BY() { return getToken(GreenTextLangParser.UNBEATEN_BY, 0); }
		public Compare_sumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterCompare_sum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitCompare_sum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitCompare_sum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_sumContext compare_sum() throws RecognitionException {
		Compare_sumContext _localctx = new Compare_sumContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_compare_sum);
		try {
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VIBE_WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(VIBE_WITH);
				setState(521);
				sum(0);
				}
				break;
			case DOESNT_VIBE_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				match(DOESNT_VIBE_WITH);
				setState(523);
				sum(0);
				}
				break;
			case BEATEN_BY:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				match(BEATEN_BY);
				setState(525);
				sum(0);
				}
				break;
			case DOESNT_BEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(526);
				match(DOESNT_BEAT);
				setState(527);
				sum(0);
				}
				break;
			case BEATS:
				enterOuterAlt(_localctx, 5);
				{
				setState(528);
				match(BEATS);
				setState(529);
				sum(0);
				}
				break;
			case UNBEATEN_BY:
				enterOuterAlt(_localctx, 6);
				{
				setState(530);
				match(UNBEATEN_BY);
				setState(531);
				sum(0);
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
	public static class SumContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public TerminalNode JOINED_BY() { return getToken(GreenTextLangParser.JOINED_BY, 0); }
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		return sum(0);
	}

	private SumContext sum(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumContext _localctx = new SumContext(_ctx, _parentState);
		SumContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_sum, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(535);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SumContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sum);
					setState(537);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(538);
					match(JOINED_BY);
					setState(539);
					term(0);
					}
					} 
				}
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode BREEDING_LIKE() { return getToken(GreenTextLangParser.BREEDING_LIKE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(GreenTextLangParser.TIMES, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GreenTextLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GreenTextLangParser.NEWLINE, i);
		}
		public List<TerminalNode> ENTRY() { return getTokens(GreenTextLangParser.ENTRY); }
		public TerminalNode ENTRY(int i) {
			return getToken(GreenTextLangParser.ENTRY, i);
		}
		public TerminalNode WHATEVER_LEFT_FROM() { return getToken(GreenTextLangParser.WHATEVER_LEFT_FROM, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(546);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(564);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(548);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(549);
						match(BREEDING_LIKE);
						setState(552);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(550);
							match(NEWLINE);
							setState(551);
							match(ENTRY);
							}
						}

						setState(554);
						expression();
						setState(557);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(555);
							match(NEWLINE);
							setState(556);
							match(ENTRY);
							}
						}

						setState(559);
						match(TIMES);
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(561);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(562);
						match(WHATEVER_LEFT_FROM);
						setState(563);
						factor();
						}
						break;
					}
					} 
				}
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode THE_LITERAL_OPPOSITE_OF() { return getToken(GreenTextLangParser.THE_LITERAL_OPPOSITE_OF, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode FLIPPED() { return getToken(GreenTextLangParser.FLIPPED, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_factor);
		try {
			setState(574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THE_LITERAL_OPPOSITE_OF:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				match(THE_LITERAL_OPPOSITE_OF);
				setState(570);
				factor();
				}
				break;
			case FLIPPED:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				match(FLIPPED);
				setState(572);
				factor();
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				atom();
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
	public static class AtomContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_atom);
		try {
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				literal();
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(GreenTextLangParser.DECIMAL_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(GreenTextLangParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(GreenTextLangParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(GreenTextLangParser.BOOL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030792151040L) != 0)) ) {
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
	public static class SeparatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(GreenTextLangParser.COMMA, 0); }
		public TerminalNode AND() { return getToken(GreenTextLangParser.AND, 0); }
		public TerminalNode NEWLINE() { return getToken(GreenTextLangParser.NEWLINE, 0); }
		public TerminalNode ENTRY() { return getToken(GreenTextLangParser.ENTRY, 0); }
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_separator);
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				match(COMMA);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				match(AND);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				match(NEWLINE);
				setState(585);
				match(ENTRY);
				setState(586);
				match(AND);
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
		case 42:
			return sum_sempred((SumContext)_localctx, predIndex);
		case 43:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sum_sempred(SumContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001?\u024e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000\u0005\u0000b\b\u0000"+
		"\n\u0000\f\u0000e\t\u0000\u0001\u0000\u0001\u0000\u0003\u0000i\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001n\b\u0001\u000b\u0001"+
		"\f\u0001o\u0005\u0001r\b\u0001\n\u0001\f\u0001u\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001y\b\u0001\u0001\u0001\u0005\u0001|\b\u0001\n\u0001\f"+
		"\u0001\u007f\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002\u0084"+
		"\b\u0002\n\u0002\f\u0002\u0087\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008f\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u009a\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a2\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a8\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00c3\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e2\b\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00e7\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00fa\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0103\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u0109\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0110\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0118\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u011d\b\u000f\n\u000f\f\u000f\u0120\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0124\b\u0010\u0001\u0010\u0003\u0010\u0127\b"+
		"\u0010\u0001\u0010\u0005\u0010\u012a\b\u0010\n\u0010\f\u0010\u012d\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u0141\b\u0013\n\u0013\f\u0013\u0144\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u014a\b\u0014\n\u0014\f\u0014"+
		"\u014d\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u015e\b\u0016"+
		"\n\u0016\f\u0016\u0161\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u016b"+
		"\b\u0017\n\u0017\f\u0017\u016e\t\u0017\u0001\u0017\u0003\u0017\u0171\b"+
		"\u0017\u0001\u0017\u0003\u0017\u0174\b\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u017e\b\u0018\n\u0018\f\u0018\u0181\t\u0018\u0001\u0018\u0003\u0018"+
		"\u0184\b\u0018\u0001\u0018\u0003\u0018\u0187\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u018d\b\u0019\n\u0019\f\u0019"+
		"\u0190\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0195\b"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01a6\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u01ba\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u01cd\b\u001f\u0001 \u0001 \u0001 \u0003 \u01d2\b "+
		"\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01e3\b!\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0003$\u01ee\b$\u0001%\u0001"+
		"%\u0001%\u0005%\u01f3\b%\n%\f%\u01f6\t%\u0001&\u0001&\u0001&\u0005&\u01fb"+
		"\b&\n&\f&\u01fe\t&\u0001\'\u0001\'\u0001\'\u0003\'\u0203\b\'\u0001(\u0001"+
		"(\u0003(\u0207\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u0215\b)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0005*\u021d\b*\n*\f*\u0220\t*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u0229\b+\u0001+\u0001+\u0001+\u0003+\u022e"+
		"\b+\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u0235\b+\n+\f+\u0238\t+"+
		"\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u023f\b,\u0001-\u0001-\u0003"+
		"-\u0243\b-\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u024c"+
		"\b/\u0001/\u0000\u0002TV0\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^\u0000\u0004\u0002\u0000$$??\u0004\u0000\u0007\u0007\t\t\u000b\u000b"+
		"\r\r\u0004\u0000\b\b\n\n\f\f\u000e\u000e\u0001\u0000$\'\u0274\u0000h\u0001"+
		"\u0000\u0000\u0000\u0002s\u0001\u0000\u0000\u0000\u0004\u0085\u0001\u0000"+
		"\u0000\u0000\u0006\u008e\u0001\u0000\u0000\u0000\b\u0099\u0001\u0000\u0000"+
		"\u0000\n\u00a1\u0001\u0000\u0000\u0000\f\u00a7\u0001\u0000\u0000\u0000"+
		"\u000e\u00a9\u0001\u0000\u0000\u0000\u0010\u00ac\u0001\u0000\u0000\u0000"+
		"\u0012\u00c2\u0001\u0000\u0000\u0000\u0014\u00f9\u0001\u0000\u0000\u0000"+
		"\u0016\u0102\u0001\u0000\u0000\u0000\u0018\u0104\u0001\u0000\u0000\u0000"+
		"\u001a\u010f\u0001\u0000\u0000\u0000\u001c\u0111\u0001\u0000\u0000\u0000"+
		"\u001e\u0114\u0001\u0000\u0000\u0000 \u0121\u0001\u0000\u0000\u0000\""+
		"\u0131\u0001\u0000\u0000\u0000$\u0136\u0001\u0000\u0000\u0000&\u013a\u0001"+
		"\u0000\u0000\u0000(\u0147\u0001\u0000\u0000\u0000*\u0151\u0001\u0000\u0000"+
		"\u0000,\u0158\u0001\u0000\u0000\u0000.\u0165\u0001\u0000\u0000\u00000"+
		"\u0178\u0001\u0000\u0000\u00002\u0188\u0001\u0000\u0000\u00004\u0194\u0001"+
		"\u0000\u0000\u00006\u01a5\u0001\u0000\u0000\u00008\u01a7\u0001\u0000\u0000"+
		"\u0000:\u01a9\u0001\u0000\u0000\u0000<\u01b9\u0001\u0000\u0000\u0000>"+
		"\u01cc\u0001\u0000\u0000\u0000@\u01d1\u0001\u0000\u0000\u0000B\u01e2\u0001"+
		"\u0000\u0000\u0000D\u01e4\u0001\u0000\u0000\u0000F\u01e6\u0001\u0000\u0000"+
		"\u0000H\u01e9\u0001\u0000\u0000\u0000J\u01ef\u0001\u0000\u0000\u0000L"+
		"\u01f7\u0001\u0000\u0000\u0000N\u0202\u0001\u0000\u0000\u0000P\u0204\u0001"+
		"\u0000\u0000\u0000R\u0214\u0001\u0000\u0000\u0000T\u0216\u0001\u0000\u0000"+
		"\u0000V\u0221\u0001\u0000\u0000\u0000X\u023e\u0001\u0000\u0000\u0000Z"+
		"\u0242\u0001\u0000\u0000\u0000\\\u0244\u0001\u0000\u0000\u0000^\u024b"+
		"\u0001\u0000\u0000\u0000`b\u0005\u0004\u0000\u0000a`\u0001\u0000\u0000"+
		"\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fi\u0003"+
		"\u0002\u0001\u0000gi\u0005\u0000\u0000\u0001hc\u0001\u0000\u0000\u0000"+
		"hg\u0001\u0000\u0000\u0000i\u0001\u0001\u0000\u0000\u0000jk\u0003\u0004"+
		"\u0002\u0000km\u0005<\u0000\u0000ln\u0005\u0004\u0000\u0000ml\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qj\u0001\u0000\u0000\u0000"+
		"ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vx\u0003\u0004"+
		"\u0002\u0000wy\u0005<\u0000\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y}\u0001\u0000\u0000\u0000z|\u0005\u0004\u0000\u0000{z\u0001"+
		"\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0000\u0000\u0001\u0081\u0003"+
		"\u0001\u0000\u0000\u0000\u0082\u0084\u0003\b\u0004\u0000\u0083\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0003"+
		"\u0006\u0003\u0000\u0089\u0005\u0001\u0000\u0000\u0000\u008a\u008f\u0003"+
		"\f\u0006\u0000\u008b\u008c\u0005\u0001\u0000\u0000\u008c\u008f\u0003\n"+
		"\u0005\u0000\u008d\u008f\u0005\u0001\u0000\u0000\u008e\u008a\u0001\u0000"+
		"\u0000\u0000\u008e\u008b\u0001\u0000\u0000\u0000\u008e\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u0007\u0001\u0000\u0000\u0000\u0090\u0091\u0003\f\u0006"+
		"\u0000\u0091\u0092\u0005<\u0000\u0000\u0092\u009a\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005\u0001\u0000\u0000\u0094\u0095\u0003\n\u0005\u0000\u0095"+
		"\u0096\u0005<\u0000\u0000\u0096\u009a\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005\u0001\u0000\u0000\u0098\u009a\u0005<\u0000\u0000\u0099\u0090\u0001"+
		"\u0000\u0000\u0000\u0099\u0093\u0001\u0000\u0000\u0000\u0099\u0097\u0001"+
		"\u0000\u0000\u0000\u009a\t\u0001\u0000\u0000\u0000\u009b\u00a2\u0003\u000e"+
		"\u0007\u0000\u009c\u00a2\u0003\u0010\b\u0000\u009d\u00a2\u0003\u0012\t"+
		"\u0000\u009e\u00a2\u0003\u0014\n\u0000\u009f\u00a2\u0003\u0018\f\u0000"+
		"\u00a0\u00a2\u0003\u001c\u000e\u0000\u00a1\u009b\u0001\u0000\u0000\u0000"+
		"\u00a1\u009c\u0001\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000"+
		"\u00a1\u009e\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u000b\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a8\u0003 \u0010\u0000\u00a4\u00a8\u0003(\u0014\u0000\u00a5\u00a8"+
		"\u0003,\u0016\u0000\u00a6\u00a8\u0003.\u0017\u0000\u00a7\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\r\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0005\u0018\u0000\u0000\u00aa\u00ab\u0003H$\u0000\u00ab"+
		"\u000f\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0019\u0000\u0000\u00ad"+
		"\u00ae\u0003\u0016\u000b\u0000\u00ae\u0011\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u00034\u001a\u0000\u00b0\u00b1\u0005?\u0000\u0000\u00b1\u00b2\u0005"+
		"*\u0000\u0000\u00b2\u00b3\u0005\u0011\u0000\u0000\u00b3\u00b4\u0003\u0016"+
		"\u000b\u0000\u00b4\u00c3\u0001\u0000\u0000\u0000\u00b5\u00b6\u00034\u001a"+
		"\u0000\u00b6\u00b7\u0005?\u0000\u0000\u00b7\u00b8\u0005*\u0000\u0000\u00b8"+
		"\u00b9\u0003H$\u0000\u00b9\u00c3\u0001\u0000\u0000\u0000\u00ba\u00bb\u0003"+
		"4\u001a\u0000\u00bb\u00bc\u0005?\u0000\u0000\u00bc\u00bd\u0005*\u0000"+
		"\u0000\u00bd\u00be\u0003\u0018\f\u0000\u00be\u00c3\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u00034\u001a\u0000\u00c0\u00c1\u0005?\u0000\u0000\u00c1\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c2\u00af\u0001\u0000\u0000\u0000\u00c2\u00b5"+
		"\u0001\u0000\u0000\u0000\u00c2\u00ba\u0001\u0000\u0000\u0000\u00c2\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c3\u0013\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0003\u0016\u000b\u0000\u00c5\u00c6\u0005*\u0000\u0000\u00c6\u00c7\u0003"+
		"H$\u0000\u00c7\u00fa\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003\u0016\u000b"+
		"\u0000\u00c9\u00ca\u0005*\u0000\u0000\u00ca\u00cb\u0003\u0018\f\u0000"+
		"\u00cb\u00fa\u0001\u0000\u0000\u0000\u00cc\u00cd\u0003\u0016\u000b\u0000"+
		"\u00cd\u00ce\u0005*\u0000\u0000\u00ce\u00cf\u0005\u0011\u0000\u0000\u00cf"+
		"\u00d0\u0003\u0016\u000b\u0000\u00d0\u00fa\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0003\u0016\u000b\u0000\u00d2\u00d3\u0005*\u0000\u0000\u00d3\u00d4"+
		"\u00054\u0000\u0000\u00d4\u00d5\u0003J%\u0000\u00d5\u00fa\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0003\u0016\u000b\u0000\u00d7\u00d8\u00055\u0000"+
		"\u0000\u00d8\u00fa\u0001\u0000\u0000\u0000\u00d9\u00da\u0003\u0016\u000b"+
		"\u0000\u00da\u00db\u00056\u0000\u0000\u00db\u00fa\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0003\u0016\u000b\u0000\u00dd\u00de\u0005*\u0000\u0000\u00de"+
		"\u00e1\u00057\u0000\u0000\u00df\u00e0\u0005<\u0000\u0000\u00e0\u00e2\u0005"+
		"\u0001\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e6\u0003"+
		"J%\u0000\u00e4\u00e5\u0005<\u0000\u0000\u00e5\u00e7\u0005\u0001\u0000"+
		"\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u00058\u0000\u0000"+
		"\u00e9\u00fa\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003\u0016\u000b\u0000"+
		"\u00eb\u00ec\u0005*\u0000\u0000\u00ec\u00ed\u0005:\u0000\u0000\u00ed\u00ee"+
		"\u0003J%\u0000\u00ee\u00fa\u0001\u0000\u0000\u0000\u00ef\u00f0\u0003\u0016"+
		"\u000b\u0000\u00f0\u00f1\u0005*\u0000\u0000\u00f1\u00f2\u00059\u0000\u0000"+
		"\u00f2\u00f3\u0003J%\u0000\u00f3\u00fa\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0003\u0016\u000b\u0000\u00f5\u00f6\u0005*\u0000\u0000\u00f6\u00f7\u0005"+
		";\u0000\u0000\u00f7\u00f8\u0003J%\u0000\u00f8\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f9\u00c4\u0001\u0000\u0000\u0000\u00f9\u00c8\u0001\u0000\u0000"+
		"\u0000\u00f9\u00cc\u0001\u0000\u0000\u0000\u00f9\u00d1\u0001\u0000\u0000"+
		"\u0000\u00f9\u00d6\u0001\u0000\u0000\u0000\u00f9\u00d9\u0001\u0000\u0000"+
		"\u0000\u00f9\u00dc\u0001\u0000\u0000\u0000\u00f9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00f9\u00ef\u0001\u0000\u0000\u0000\u00f9\u00f4\u0001\u0000\u0000"+
		"\u0000\u00fa\u0015\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005?\u0000\u0000"+
		"\u00fc\u00fd\u0005\u0017\u0000\u0000\u00fd\u0103\u0003\u0016\u000b\u0000"+
		"\u00fe\u00ff\u0007\u0000\u0000\u0000\u00ff\u0100\u0005\u0014\u0000\u0000"+
		"\u0100\u0103\u0003\u0016\u000b\u0000\u0101\u0103\u0005?\u0000\u0000\u0102"+
		"\u00fb\u0001\u0000\u0000\u0000\u0102\u00fe\u0001\u0000\u0000\u0000\u0102"+
		"\u0101\u0001\u0000\u0000\u0000\u0103\u0017\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0005\u001b\u0000\u0000\u0105\u0108\u0003\u001a\r\u0000\u0106\u0107"+
		"\u0005\u001c\u0000\u0000\u0107\u0109\u0003H$\u0000\u0108\u0106\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u0019\u0001\u0000"+
		"\u0000\u0000\u010a\u0110\u0005?\u0000\u0000\u010b\u010c\u0003\u0016\u000b"+
		"\u0000\u010c\u010d\u0005\u0017\u0000\u0000\u010d\u010e\u0003\u001a\r\u0000"+
		"\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010a\u0001\u0000\u0000\u0000"+
		"\u010f\u010b\u0001\u0000\u0000\u0000\u0110\u001b\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0005\u0005\u0000\u0000\u0112\u0113\u0003\u001e\u000f\u0000"+
		"\u0113\u001d\u0001\u0000\u0000\u0000\u0114\u0117\u0005?\u0000\u0000\u0115"+
		"\u0116\u0005\u0017\u0000\u0000\u0116\u0118\u0003\u001e\u000f\u0000\u0117"+
		"\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118"+
		"\u011e\u0001\u0000\u0000\u0000\u0119\u011a\u0003^/\u0000\u011a\u011b\u0005"+
		"?\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u0119\u0001\u0000"+
		"\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u001f\u0001\u0000"+
		"\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0123\u0003\"\u0011"+
		"\u0000\u0122\u0124\u0003$\u0012\u0000\u0123\u0122\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0126\u0001\u0000\u0000\u0000"+
		"\u0125\u0127\u0003&\u0013\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0001\u0000\u0000\u0000\u0127\u012b\u0001\u0000\u0000\u0000\u0128"+
		"\u012a\u0003\b\u0004\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u012a\u012d"+
		"\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0001\u0000\u0000\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u012b"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u0001\u0000\u0000\u012f\u0130"+
		"\u0005\u001a\u0000\u0000\u0130!\u0001\u0000\u0000\u0000\u0131\u0132\u0005"+
		"\u0001\u0000\u0000\u0132\u0133\u0005\u0006\u0000\u0000\u0133\u0134\u0005"+
		"?\u0000\u0000\u0134\u0135\u0005<\u0000\u0000\u0135#\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0005\u0001\u0000\u0000\u0137\u0138\u0003<\u001e\u0000"+
		"\u0138\u0139\u0005<\u0000\u0000\u0139%\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0005\u0001\u0000\u0000\u013b\u013c\u0005\u001d\u0000\u0000\u013c\u0142"+
		"\u0003>\u001f\u0000\u013d\u013e\u0003^/\u0000\u013e\u013f\u0003>\u001f"+
		"\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140\u013d\u0001\u0000\u0000"+
		"\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0145\u0001\u0000\u0000"+
		"\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0146\u0005<\u0000\u0000"+
		"\u0146\'\u0001\u0000\u0000\u0000\u0147\u014b\u0003*\u0015\u0000\u0148"+
		"\u014a\u0003\b\u0004\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u014d"+
		"\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0001\u0000\u0000\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u014b"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0005\u0001\u0000\u0000\u014f\u0150"+
		"\u0005\u0016\u0000\u0000\u0150)\u0001\u0000\u0000\u0000\u0151\u0152\u0005"+
		"\u0001\u0000\u0000\u0152\u0153\u0005\u0015\u0000\u0000\u0153\u0154\u0005"+
		"<\u0000\u0000\u0154\u0155\u0005\u0001\u0000\u0000\u0155\u0156\u0005?\u0000"+
		"\u0000\u0156\u0157\u0005<\u0000\u0000\u0157+\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u0005\u0001\u0000\u0000\u0159\u015a\u0005\u001e\u0000\u0000\u015a"+
		"\u015b\u0003J%\u0000\u015b\u015f\u0005<\u0000\u0000\u015c\u015e\u0003"+
		"\b\u0004\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000"+
		"\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000"+
		"\u0000\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0005\u0001\u0000\u0000\u0163\u0164\u0005\u001f"+
		"\u0000\u0000\u0164-\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u0001\u0000"+
		"\u0000\u0166\u0167\u0005 \u0000\u0000\u0167\u0168\u0003J%\u0000\u0168"+
		"\u016c\u0005<\u0000\u0000\u0169\u016b\u0003\b\u0004\u0000\u016a\u0169"+
		"\u0001\u0000\u0000\u0000\u016b\u016e\u0001\u0000\u0000\u0000\u016c\u016a"+
		"\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u0170"+
		"\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f\u0171"+
		"\u00030\u0018\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0170\u0171\u0001"+
		"\u0000\u0000\u0000\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u0174\u0003"+
		"2\u0019\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0176\u0005\u0001"+
		"\u0000\u0000\u0176\u0177\u0005!\u0000\u0000\u0177/\u0001\u0000\u0000\u0000"+
		"\u0178\u0179\u0005\u0001\u0000\u0000\u0179\u017a\u0005\"\u0000\u0000\u017a"+
		"\u017b\u0003J%\u0000\u017b\u017f\u0005<\u0000\u0000\u017c\u017e\u0003"+
		"\b\u0004\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e\u0181\u0001\u0000"+
		"\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000"+
		"\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000"+
		"\u0000\u0000\u0182\u0184\u00030\u0018\u0000\u0183\u0182\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0186\u0001\u0000\u0000"+
		"\u0000\u0185\u0187\u00032\u0019\u0000\u0186\u0185\u0001\u0000\u0000\u0000"+
		"\u0186\u0187\u0001\u0000\u0000\u0000\u01871\u0001\u0000\u0000\u0000\u0188"+
		"\u0189\u0005\u0001\u0000\u0000\u0189\u018a\u0005#\u0000\u0000\u018a\u018e"+
		"\u0005<\u0000\u0000\u018b\u018d\u0003\b\u0004\u0000\u018c\u018b\u0001"+
		"\u0000\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u018c\u0001"+
		"\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f3\u0001\u0000"+
		"\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0195\u00036\u001b"+
		"\u0000\u0192\u0195\u00038\u001c\u0000\u0193\u0195\u0003:\u001d\u0000\u0194"+
		"\u0191\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194"+
		"\u0193\u0001\u0000\u0000\u0000\u01955\u0001\u0000\u0000\u0000\u0196\u0197"+
		"\u00038\u001c\u0000\u0197\u0198\u0005\u0013\u0000\u0000\u0198\u01a6\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u00038\u001c\u0000\u019a\u019b\u0005\u0012"+
		"\u0000\u0000\u019b\u019c\u0003J%\u0000\u019c\u01a6\u0001\u0000\u0000\u0000"+
		"\u019d\u019e\u0005\u000f\u0000\u0000\u019e\u019f\u0005\u0012\u0000\u0000"+
		"\u019f\u01a0\u0003J%\u0000\u01a0\u01a1\u0005?\u0000\u0000\u01a1\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005\u000f\u0000\u0000\u01a3\u01a4"+
		"\u0005\u0013\u0000\u0000\u01a4\u01a6\u0005?\u0000\u0000\u01a5\u0196\u0001"+
		"\u0000\u0000\u0000\u01a5\u0199\u0001\u0000\u0000\u0000\u01a5\u019d\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a2\u0001\u0000\u0000\u0000\u01a67\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a8\u0007\u0001\u0000\u0000\u01a89\u0001\u0000\u0000"+
		"\u0000\u01a9\u01aa\u0005\u000f\u0000\u0000\u01aa\u01ab\u0005?\u0000\u0000"+
		"\u01ab;\u0001\u0000\u0000\u0000\u01ac\u01ad\u0003@ \u0000\u01ad\u01ae"+
		"\u0005?\u0000\u0000\u01ae\u01af\u0005*\u0000\u0000\u01af\u01b0\u0003H"+
		"$\u0000\u01b0\u01ba\u0001\u0000\u0000\u0000\u01b1\u01b2\u0003@ \u0000"+
		"\u01b2\u01b3\u0005?\u0000\u0000\u01b3\u01b4\u0005*\u0000\u0000\u01b4\u01b5"+
		"\u0003\u0018\f\u0000\u01b5\u01ba\u0001\u0000\u0000\u0000\u01b6\u01b7\u0003"+
		"@ \u0000\u01b7\u01b8\u0005?\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ac\u0001\u0000\u0000\u0000\u01b9\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b9\u01b6\u0001\u0000\u0000\u0000\u01ba=\u0001\u0000\u0000\u0000"+
		"\u01bb\u01bc\u0003@ \u0000\u01bc\u01bd\u0005\u0011\u0000\u0000\u01bd\u01be"+
		"\u0005?\u0000\u0000\u01be\u01cd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0003"+
		"@ \u0000\u01c0\u01c1\u0005?\u0000\u0000\u01c1\u01c2\u0005*\u0000\u0000"+
		"\u01c2\u01c3\u0003H$\u0000\u01c3\u01cd\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0003@ \u0000\u01c5\u01c6\u0005?\u0000\u0000\u01c6\u01c7\u0005*\u0000"+
		"\u0000\u01c7\u01c8\u0003\u0018\f\u0000\u01c8\u01cd\u0001\u0000\u0000\u0000"+
		"\u01c9\u01ca\u0003@ \u0000\u01ca\u01cb\u0005?\u0000\u0000\u01cb\u01cd"+
		"\u0001\u0000\u0000\u0000\u01cc\u01bb\u0001\u0000\u0000\u0000\u01cc\u01bf"+
		"\u0001\u0000\u0000\u0000\u01cc\u01c4\u0001\u0000\u0000\u0000\u01cc\u01c9"+
		"\u0001\u0000\u0000\u0000\u01cd?\u0001\u0000\u0000\u0000\u01ce\u01d2\u0003"+
		"B!\u0000\u01cf\u01d2\u0003D\"\u0000\u01d0\u01d2\u0003F#\u0000\u01d1\u01ce"+
		"\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d2A\u0001\u0000\u0000\u0000\u01d3\u01d4\u0003"+
		"D\"\u0000\u01d4\u01d5\u0005\u0013\u0000\u0000\u01d5\u01e3\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d7\u0003D\"\u0000\u01d7\u01d8\u0005\u0012\u0000"+
		"\u0000\u01d8\u01d9\u0003J%\u0000\u01d9\u01e3\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\u0005\u0010\u0000\u0000\u01db\u01dc\u0005\u0012\u0000\u0000\u01dc"+
		"\u01dd\u0003J%\u0000\u01dd\u01de\u0005?\u0000\u0000\u01de\u01e3\u0001"+
		"\u0000\u0000\u0000\u01df\u01e0\u0005\u0010\u0000\u0000\u01e0\u01e1\u0005"+
		"\u0013\u0000\u0000\u01e1\u01e3\u0005?\u0000\u0000\u01e2\u01d3\u0001\u0000"+
		"\u0000\u0000\u01e2\u01d6\u0001\u0000\u0000\u0000\u01e2\u01da\u0001\u0000"+
		"\u0000\u0000\u01e2\u01df\u0001\u0000\u0000\u0000\u01e3C\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u0007\u0002\u0000\u0000\u01e5E\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e7\u0005\u0010\u0000\u0000\u01e7\u01e8\u0005?\u0000\u0000\u01e8"+
		"G\u0001\u0000\u0000\u0000\u01e9\u01ed\u0003J%\u0000\u01ea\u01eb\u0003"+
		"^/\u0000\u01eb\u01ec\u0003H$\u0000\u01ec\u01ee\u0001\u0000\u0000\u0000"+
		"\u01ed\u01ea\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000"+
		"\u01eeI\u0001\u0000\u0000\u0000\u01ef\u01f4\u0003L&\u0000\u01f0\u01f1"+
		"\u00052\u0000\u0000\u01f1\u01f3\u0003L&\u0000\u01f2\u01f0\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f6\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5K\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f7\u01fc\u0003N\'\u0000"+
		"\u01f8\u01f9\u00051\u0000\u0000\u01f9\u01fb\u0003N\'\u0000\u01fa\u01f8"+
		"\u0001\u0000\u0000\u0000\u01fb\u01fe\u0001\u0000\u0000\u0000\u01fc\u01fa"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fdM\u0001"+
		"\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01ff\u0200\u0005"+
		"3\u0000\u0000\u0200\u0203\u0003N\'\u0000\u0201\u0203\u0003P(\u0000\u0202"+
		"\u01ff\u0001\u0000\u0000\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0203"+
		"O\u0001\u0000\u0000\u0000\u0204\u0206\u0003T*\u0000\u0205\u0207\u0003"+
		"R)\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000"+
		"\u0000\u0207Q\u0001\u0000\u0000\u0000\u0208\u0209\u0005+\u0000\u0000\u0209"+
		"\u0215\u0003T*\u0000\u020a\u020b\u0005,\u0000\u0000\u020b\u0215\u0003"+
		"T*\u0000\u020c\u020d\u0005-\u0000\u0000\u020d\u0215\u0003T*\u0000\u020e"+
		"\u020f\u0005.\u0000\u0000\u020f\u0215\u0003T*\u0000\u0210\u0211\u0005"+
		"/\u0000\u0000\u0211\u0215\u0003T*\u0000\u0212\u0213\u00050\u0000\u0000"+
		"\u0213\u0215\u0003T*\u0000\u0214\u0208\u0001\u0000\u0000\u0000\u0214\u020a"+
		"\u0001\u0000\u0000\u0000\u0214\u020c\u0001\u0000\u0000\u0000\u0214\u020e"+
		"\u0001\u0000\u0000\u0000\u0214\u0210\u0001\u0000\u0000\u0000\u0214\u0212"+
		"\u0001\u0000\u0000\u0000\u0215S\u0001\u0000\u0000\u0000\u0216\u0217\u0006"+
		"*\uffff\uffff\u0000\u0217\u0218\u0003V+\u0000\u0218\u021e\u0001\u0000"+
		"\u0000\u0000\u0219\u021a\n\u0002\u0000\u0000\u021a\u021b\u00054\u0000"+
		"\u0000\u021b\u021d\u0003V+\u0000\u021c\u0219\u0001\u0000\u0000\u0000\u021d"+
		"\u0220\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021e"+
		"\u021f\u0001\u0000\u0000\u0000\u021fU\u0001\u0000\u0000\u0000\u0220\u021e"+
		"\u0001\u0000\u0000\u0000\u0221\u0222\u0006+\uffff\uffff\u0000\u0222\u0223"+
		"\u0003X,\u0000\u0223\u0236\u0001\u0000\u0000\u0000\u0224\u0225\n\u0003"+
		"\u0000\u0000\u0225\u0228\u00057\u0000\u0000\u0226\u0227\u0005<\u0000\u0000"+
		"\u0227\u0229\u0005\u0001\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000"+
		"\u022a\u022d\u0003J%\u0000\u022b\u022c\u0005<\u0000\u0000\u022c\u022e"+
		"\u0005\u0001\u0000\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022d\u022e"+
		"\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0230"+
		"\u00058\u0000\u0000\u0230\u0235\u0001\u0000\u0000\u0000\u0231\u0232\n"+
		"\u0002\u0000\u0000\u0232\u0233\u0005;\u0000\u0000\u0233\u0235\u0003X,"+
		"\u0000\u0234\u0224\u0001\u0000\u0000\u0000\u0234\u0231\u0001\u0000\u0000"+
		"\u0000\u0235\u0238\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000"+
		"\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237W\u0001\u0000\u0000\u0000"+
		"\u0238\u0236\u0001\u0000\u0000\u0000\u0239\u023a\u00059\u0000\u0000\u023a"+
		"\u023f\u0003X,\u0000\u023b\u023c\u0005:\u0000\u0000\u023c\u023f\u0003"+
		"X,\u0000\u023d\u023f\u0003Z-\u0000\u023e\u0239\u0001\u0000\u0000\u0000"+
		"\u023e\u023b\u0001\u0000\u0000\u0000\u023e\u023d\u0001\u0000\u0000\u0000"+
		"\u023fY\u0001\u0000\u0000\u0000\u0240\u0243\u0003\u0016\u000b\u0000\u0241"+
		"\u0243\u0003\\.\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0241"+
		"\u0001\u0000\u0000\u0000\u0243[\u0001\u0000\u0000\u0000\u0244\u0245\u0007"+
		"\u0003\u0000\u0000\u0245]\u0001\u0000\u0000\u0000\u0246\u024c\u0005)\u0000"+
		"\u0000\u0247\u024c\u0005(\u0000\u0000\u0248\u0249\u0005<\u0000\u0000\u0249"+
		"\u024a\u0005\u0001\u0000\u0000\u024a\u024c\u0005(\u0000\u0000\u024b\u0246"+
		"\u0001\u0000\u0000\u0000\u024b\u0247\u0001\u0000\u0000\u0000\u024b\u0248"+
		"\u0001\u0000\u0000\u0000\u024c_\u0001\u0000\u0000\u00005chosx}\u0085\u008e"+
		"\u0099\u00a1\u00a7\u00c2\u00e1\u00e6\u00f9\u0102\u0108\u010f\u0117\u011e"+
		"\u0123\u0126\u012b\u0142\u014b\u015f\u016c\u0170\u0173\u017f\u0183\u0186"+
		"\u018e\u0194\u01a5\u01b9\u01cc\u01d1\u01e2\u01ed\u01f4\u01fc\u0202\u0206"+
		"\u0214\u021e\u0228\u022d\u0234\u0236\u023e\u0242\u024b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}