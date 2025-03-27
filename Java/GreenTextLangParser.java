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
		RULE_function_declaration = 15, RULE_function_name = 16, RULE_function_return = 17, 
		RULE_function_arguments = 18, RULE_variable_declaration_ing = 19, RULE_type_ing = 20, 
		RULE_complex_type_ing = 21, RULE_primitive_type_ing = 22, RULE_struct_type_ing = 23, 
		RULE_struct_declaration = 24, RULE_struct_name = 25, RULE_loop_declaration = 26, 
		RULE_if_declaration = 27, RULE_or_statement = 28, RULE_or_not_statement = 29, 
		RULE_type = 30, RULE_complex_type = 31, RULE_primitive_type = 32, RULE_struct_type = 33, 
		RULE_expressions = 34, RULE_expression = 35, RULE_bool_expression = 36, 
		RULE_math_expression = 37, RULE_math_literal = 38, RULE_separator = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "code_blocks", "code_block", "statement", "statement_newline", 
			"simple_statement", "compound_statement", "spit", "swallow", "variable_declaration", 
			"variable_assignment", "variable", "function_call", "function", "invite", 
			"function_declaration", "function_name", "function_return", "function_arguments", 
			"variable_declaration_ing", "type_ing", "complex_type_ing", "primitive_type_ing", 
			"struct_type_ing", "struct_declaration", "struct_name", "loop_declaration", 
			"if_declaration", "or_statement", "or_not_statement", "type", "complex_type", 
			"primitive_type", "struct_type", "expressions", "expression", "bool_expression", 
			"math_expression", "math_literal", "separator"
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
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTRY:
			case END_LIFE:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==END_LIFE) {
					{
					{
					setState(80);
					match(END_LIFE);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				code_blocks();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
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
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					code_block();
					setState(91);
					match(NEWLINE);
					setState(93); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(92);
						match(END_LIFE);
						}
						}
						setState(95); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==END_LIFE );
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(102);
			code_block();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(103);
				match(NEWLINE);
				}
			}

			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==END_LIFE) {
				{
				{
				setState(106);
				match(END_LIFE);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					statement_newline();
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(120);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				compound_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(ENTRY);
				setState(124);
				simple_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
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
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				compound_statement();
				setState(129);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(ENTRY);
				setState(132);
				simple_statement();
				setState(133);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(ENTRY);
				setState(136);
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
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				spit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				swallow();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				variable_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				variable_assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				invite();
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				function_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				struct_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				loop_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
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
			setState(153);
			match(SPIT);
			setState(154);
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
			setState(156);
			match(SWALLOW);
			setState(157);
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
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				type();
				setState(160);
				match(NAME);
				setState(161);
				match(IS);
				setState(162);
				match(SOMEONE_ELSES);
				setState(163);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				type();
				setState(166);
				match(NAME);
				setState(167);
				match(IS);
				setState(168);
				expressions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				type();
				setState(171);
				match(NAME);
				setState(172);
				match(IS);
				setState(173);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				type();
				setState(176);
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
		public TerminalNode SOMEONE_ELSES() { return getToken(GreenTextLangParser.SOMEONE_ELSES, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode JOINED_BY() { return getToken(GreenTextLangParser.JOINED_BY, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TerminalNode EVOLVES() { return getToken(GreenTextLangParser.EVOLVES, 0); }
		public TerminalNode DEVOLVES() { return getToken(GreenTextLangParser.DEVOLVES, 0); }
		public TerminalNode BREEDING_LIKE() { return getToken(GreenTextLangParser.BREEDING_LIKE, 0); }
		public TerminalNode TIMES() { return getToken(GreenTextLangParser.TIMES, 0); }
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
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				variable();
				setState(181);
				match(IS);
				setState(182);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				variable();
				setState(185);
				match(IS);
				setState(186);
				match(SOMEONE_ELSES);
				setState(187);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				variable();
				setState(190);
				match(IS);
				setState(191);
				expressions();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				variable();
				setState(194);
				match(IS);
				setState(195);
				match(JOINED_BY);
				setState(196);
				math_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				variable();
				setState(199);
				match(EVOLVES);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				variable();
				setState(202);
				match(DEVOLVES);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				variable();
				setState(205);
				match(IS);
				setState(206);
				match(BREEDING_LIKE);
				setState(207);
				math_expression(0);
				setState(208);
				match(TIMES);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(210);
				variable();
				setState(211);
				match(IS);
				setState(212);
				match(FLIPPED);
				setState(213);
				math_expression(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(215);
				variable();
				setState(216);
				match(IS);
				setState(217);
				match(THE_LITERAL_OPPOSITE_OF);
				setState(218);
				math_expression(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(220);
				variable();
				setState(221);
				match(IS);
				setState(222);
				match(WHATEVER_LEFT_FROM);
				setState(223);
				math_expression(0);
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
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TerminalNode TH() { return getToken(GreenTextLangParser.TH, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
		public TerminalNode S() { return getToken(GreenTextLangParser.S, 0); }
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
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				math_expression(0);
				setState(228);
				match(TH);
				setState(229);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(NAME);
				setState(232);
				match(S);
				setState(233);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(CALL);
			setState(238);
			function();
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(239);
				match(REGARDING);
				setState(240);
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
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				variable();
				setState(245);
				match(S);
				setState(246);
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
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
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
			setState(250);
			match(INVITE);
			setState(251);
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
		enterRule(_localctx, 30, RULE_function_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			function_name();
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(254);
				function_return();
				}
				break;
			}
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(257);
				function_arguments();
				}
				break;
			}
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(260);
					statement_newline();
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(266);
			match(ENTRY);
			setState(267);
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
		enterRule(_localctx, 32, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(ENTRY);
			setState(270);
			match(BE);
			setState(271);
			match(NAME);
			setState(272);
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
		public Variable_declaration_ingContext variable_declaration_ing() {
			return getRuleContext(Variable_declaration_ingContext.class,0);
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
		enterRule(_localctx, 34, RULE_function_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(ENTRY);
			setState(275);
			variable_declaration_ing();
			setState(276);
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
		enterRule(_localctx, 36, RULE_function_arguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(ENTRY);
			setState(279);
			match(LIKES);
			setState(280);
			variable_declaration_ing();
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
					variable_declaration_ing();
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(289);
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
	public static class Variable_declaration_ingContext extends ParserRuleContext {
		public Type_ingContext type_ing() {
			return getRuleContext(Type_ingContext.class,0);
		}
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
		public TerminalNode IS() { return getToken(GreenTextLangParser.IS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 38, RULE_variable_declaration_ing);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				type_ing();
				setState(292);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				type_ing();
				setState(295);
				match(NAME);
				setState(296);
				match(IS);
				setState(297);
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
		enterRule(_localctx, 40, RULE_type_ing);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				complex_type_ing();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				primitive_type_ing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
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
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_complex_type_ing);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				primitive_type_ing();
				setState(307);
				match(MULTIPLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				primitive_type_ing();
				setState(310);
				match(ABOUT);
				setState(311);
				math_expression(0);
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
		enterRule(_localctx, 44, RULE_primitive_type_ing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
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
		enterRule(_localctx, 46, RULE_struct_type_ing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(SPOTTING);
			setState(318);
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
		enterRule(_localctx, 48, RULE_struct_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			struct_name();
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(321);
					statement_newline();
					}
					} 
				}
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(327);
			match(ENTRY);
			setState(328);
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
		enterRule(_localctx, 50, RULE_struct_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(ENTRY);
			setState(331);
			match(LOOK_AROUND);
			setState(332);
			match(NEWLINE);
			setState(333);
			match(ENTRY);
			setState(334);
			match(NAME);
			setState(335);
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
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
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
		enterRule(_localctx, 52, RULE_loop_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(ENTRY);
			setState(338);
			match(THINK_THAT);
			setState(339);
			bool_expression(0);
			setState(340);
			match(NEWLINE);
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(341);
					statement_newline();
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(347);
			match(ENTRY);
			setState(348);
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
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
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
		enterRule(_localctx, 54, RULE_if_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(ENTRY);
			setState(351);
			match(IMPLYING);
			setState(352);
			bool_expression(0);
			setState(353);
			match(NEWLINE);
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(354);
					statement_newline();
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(360);
				or_statement();
				}
				break;
			}
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(363);
				or_not_statement();
				}
				break;
			}
			setState(366);
			match(ENTRY);
			setState(367);
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
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
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
		enterRule(_localctx, 56, RULE_or_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(ENTRY);
			setState(370);
			match(OR);
			setState(371);
			bool_expression(0);
			setState(372);
			match(NEWLINE);
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(373);
					statement_newline();
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(379);
				or_statement();
				}
				break;
			}
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(382);
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
		enterRule(_localctx, 58, RULE_or_not_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(ENTRY);
			setState(386);
			match(OR_NOT);
			setState(387);
			match(NEWLINE);
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(388);
					statement_newline();
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 60, RULE_type);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				complex_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				primitive_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
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
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
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
		enterRule(_localctx, 62, RULE_complex_type);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				primitive_type();
				setState(400);
				match(MULTIPLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				primitive_type();
				setState(403);
				match(ABOUT);
				setState(404);
				math_expression(0);
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
		enterRule(_localctx, 64, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
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
		enterRule(_localctx, 66, RULE_struct_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(SPOT);
			setState(411);
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
		enterRule(_localctx, 68, RULE_expressions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			expression();
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(414);
				separator();
				setState(415);
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
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
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
		enterRule(_localctx, 70, RULE_expression);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				bool_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				math_expression(0);
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
	public static class Bool_expressionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
		public TerminalNode S() { return getToken(GreenTextLangParser.S, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public TerminalNode TH() { return getToken(GreenTextLangParser.TH, 0); }
		public TerminalNode VIBE_WITH() { return getToken(GreenTextLangParser.VIBE_WITH, 0); }
		public TerminalNode DOESNT_VIBE_WITH() { return getToken(GreenTextLangParser.DOESNT_VIBE_WITH, 0); }
		public TerminalNode BEATEN_BY() { return getToken(GreenTextLangParser.BEATEN_BY, 0); }
		public TerminalNode DOESNT_BEAT() { return getToken(GreenTextLangParser.DOESNT_BEAT, 0); }
		public TerminalNode BEATS() { return getToken(GreenTextLangParser.BEATS, 0); }
		public TerminalNode UNBEATEN_BY() { return getToken(GreenTextLangParser.UNBEATEN_BY, 0); }
		public TerminalNode NOT() { return getToken(GreenTextLangParser.NOT, 0); }
		public List<Bool_expressionContext> bool_expression() {
			return getRuleContexts(Bool_expressionContext.class);
		}
		public Bool_expressionContext bool_expression(int i) {
			return getRuleContext(Bool_expressionContext.class,i);
		}
		public TerminalNode BOOL_LITERAL() { return getToken(GreenTextLangParser.BOOL_LITERAL, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode ALSO() { return getToken(GreenTextLangParser.ALSO, 0); }
		public TerminalNode ALTERNATIVELY() { return getToken(GreenTextLangParser.ALTERNATIVELY, 0); }
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitBool_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitBool_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		return bool_expression(0);
	}

	private Bool_expressionContext bool_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, _parentState);
		Bool_expressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_bool_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(424);
				match(NAME);
				setState(425);
				match(S);
				setState(426);
				variable();
				}
				break;
			case 2:
				{
				setState(427);
				math_expression(0);
				setState(428);
				match(TH);
				setState(429);
				variable();
				}
				break;
			case 3:
				{
				setState(431);
				math_expression(0);
				setState(432);
				match(VIBE_WITH);
				setState(433);
				math_expression(0);
				}
				break;
			case 4:
				{
				setState(435);
				math_expression(0);
				setState(436);
				match(DOESNT_VIBE_WITH);
				setState(437);
				math_expression(0);
				}
				break;
			case 5:
				{
				setState(439);
				math_expression(0);
				setState(440);
				match(BEATEN_BY);
				setState(441);
				math_expression(0);
				}
				break;
			case 6:
				{
				setState(443);
				math_expression(0);
				setState(444);
				match(DOESNT_BEAT);
				setState(445);
				math_expression(0);
				}
				break;
			case 7:
				{
				setState(447);
				math_expression(0);
				setState(448);
				match(BEATS);
				setState(449);
				math_expression(0);
				}
				break;
			case 8:
				{
				setState(451);
				math_expression(0);
				setState(452);
				match(UNBEATEN_BY);
				setState(453);
				math_expression(0);
				}
				break;
			case 9:
				{
				setState(455);
				match(NOT);
				setState(456);
				bool_expression(4);
				}
				break;
			case 10:
				{
				setState(457);
				match(BOOL_LITERAL);
				}
				break;
			case 11:
				{
				setState(458);
				function_call();
				}
				break;
			case 12:
				{
				setState(459);
				match(NAME);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(471);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new Bool_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(462);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(463);
						match(ALSO);
						setState(464);
						bool_expression(8);
						}
						break;
					case 2:
						{
						_localctx = new Bool_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(465);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(466);
						match(ALTERNATIVELY);
						setState(467);
						bool_expression(7);
						}
						break;
					case 3:
						{
						_localctx = new Bool_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(468);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(469);
						_la = _input.LA(1);
						if ( !(_la==VIBE_WITH || _la==DOESNT_VIBE_WITH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(470);
						bool_expression(6);
						}
						break;
					}
					} 
				}
				setState(475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
	public static class Math_expressionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
		public TerminalNode S() { return getToken(GreenTextLangParser.S, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode FLIPPED() { return getToken(GreenTextLangParser.FLIPPED, 0); }
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public TerminalNode THE_LITERAL_OPPOSITE_OF() { return getToken(GreenTextLangParser.THE_LITERAL_OPPOSITE_OF, 0); }
		public Math_literalContext math_literal() {
			return getRuleContext(Math_literalContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode JOINED_BY() { return getToken(GreenTextLangParser.JOINED_BY, 0); }
		public TerminalNode WHATEVER_LEFT_FROM() { return getToken(GreenTextLangParser.WHATEVER_LEFT_FROM, 0); }
		public TerminalNode TH() { return getToken(GreenTextLangParser.TH, 0); }
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
		public Math_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterMath_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitMath_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitMath_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expressionContext math_expression() throws RecognitionException {
		return math_expression(0);
	}

	private Math_expressionContext math_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_expressionContext _localctx = new Math_expressionContext(_ctx, _parentState);
		Math_expressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_math_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(477);
				match(NAME);
				setState(478);
				match(S);
				setState(479);
				variable();
				}
				break;
			case 2:
				{
				setState(480);
				match(FLIPPED);
				setState(481);
				math_expression(9);
				}
				break;
			case 3:
				{
				setState(482);
				match(THE_LITERAL_OPPOSITE_OF);
				setState(483);
				math_expression(8);
				}
				break;
			case 4:
				{
				setState(484);
				math_literal();
				}
				break;
			case 5:
				{
				setState(485);
				function_call();
				}
				break;
			case 6:
				{
				setState(486);
				match(NAME);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(513);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new Math_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(489);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(490);
						match(JOINED_BY);
						setState(491);
						math_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new Math_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(492);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(493);
						match(WHATEVER_LEFT_FROM);
						setState(494);
						math_expression(5);
						}
						break;
					case 3:
						{
						_localctx = new Math_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(495);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(496);
						match(TH);
						setState(497);
						variable();
						}
						break;
					case 4:
						{
						_localctx = new Math_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(498);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(499);
						_la = _input.LA(1);
						if ( !(_la==EVOLVES || _la==DEVOLVES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 5:
						{
						_localctx = new Math_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(500);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(501);
						match(BREEDING_LIKE);
						setState(504);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(502);
							match(NEWLINE);
							setState(503);
							match(ENTRY);
							}
						}

						setState(506);
						math_expression(0);
						setState(509);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(507);
							match(NEWLINE);
							setState(508);
							match(ENTRY);
							}
						}

						setState(511);
						match(TIMES);
						}
						break;
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
	public static class Math_literalContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(GreenTextLangParser.DECIMAL_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(GreenTextLangParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(GreenTextLangParser.STRING_LITERAL, 0); }
		public Math_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterMath_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitMath_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitMath_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_literalContext math_literal() throws RecognitionException {
		Math_literalContext _localctx = new Math_literalContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_math_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 755914244096L) != 0)) ) {
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
		enterRule(_localctx, 78, RULE_separator);
		try {
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(COMMA);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				match(AND);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(522);
				match(NEWLINE);
				setState(523);
				match(ENTRY);
				setState(524);
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
		case 36:
			return bool_expression_sempred((Bool_expressionContext)_localctx, predIndex);
		case 37:
			return math_expression_sempred((Math_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bool_expression_sempred(Bool_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean math_expression_sempred(Math_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001?\u0210\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0005\u0000R\b\u0000\n\u0000\f\u0000U\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000Y\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001^\b\u0001\u000b\u0001\f\u0001_\u0005\u0001b\b\u0001\n\u0001\f\u0001"+
		"e\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001i\b\u0001\u0001\u0001\u0005"+
		"\u0001l\b\u0001\n\u0001\f\u0001o\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0005\u0002t\b\u0002\n\u0002\f\u0002w\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u007f"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008a\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0092\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0098\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00b3\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e2\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00ec\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00f2\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00f9\b\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0100\b\u000f\u0001\u000f\u0003\u000f\u0103\b\u000f\u0001\u000f\u0005"+
		"\u000f\u0106\b\u000f\n\u000f\f\u000f\u0109\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u011d\b\u0012"+
		"\n\u0012\f\u0012\u0120\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u012c\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0131\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u013a\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u0143\b\u0018\n\u0018\f\u0018\u0146\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u0157\b\u001a\n\u001a\f\u001a\u015a\t\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u0164\b\u001b\n\u001b\f\u001b\u0167\t\u001b"+
		"\u0001\u001b\u0003\u001b\u016a\b\u001b\u0001\u001b\u0003\u001b\u016d\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0177\b\u001c\n\u001c\f\u001c"+
		"\u017a\t\u001c\u0001\u001c\u0003\u001c\u017d\b\u001c\u0001\u001c\u0003"+
		"\u001c\u0180\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u0186\b\u001d\n\u001d\f\u001d\u0189\t\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u018e\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0197\b\u001f"+
		"\u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u01a2\b\"\u0001#\u0001#\u0003#\u01a6\b#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u01cd\b$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0005$\u01d8\b$\n$\f$\u01db\t$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u01e8\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01f9\b%\u0001%\u0001"+
		"%\u0001%\u0003%\u01fe\b%\u0001%\u0001%\u0005%\u0202\b%\n%\f%\u0205\t%"+
		"\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u020e\b"+
		"\'\u0001\'\u0000\u0002HJ(\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLN\u0000\u0005"+
		"\u0004\u0000\b\b\n\n\f\f\u000e\u000e\u0004\u0000\u0007\u0007\t\t\u000b"+
		"\u000b\r\r\u0001\u0000+,\u0001\u000056\u0002\u0000$%\'\'\u023c\u0000X"+
		"\u0001\u0000\u0000\u0000\u0002c\u0001\u0000\u0000\u0000\u0004u\u0001\u0000"+
		"\u0000\u0000\u0006~\u0001\u0000\u0000\u0000\b\u0089\u0001\u0000\u0000"+
		"\u0000\n\u0091\u0001\u0000\u0000\u0000\f\u0097\u0001\u0000\u0000\u0000"+
		"\u000e\u0099\u0001\u0000\u0000\u0000\u0010\u009c\u0001\u0000\u0000\u0000"+
		"\u0012\u00b2\u0001\u0000\u0000\u0000\u0014\u00e1\u0001\u0000\u0000\u0000"+
		"\u0016\u00eb\u0001\u0000\u0000\u0000\u0018\u00ed\u0001\u0000\u0000\u0000"+
		"\u001a\u00f8\u0001\u0000\u0000\u0000\u001c\u00fa\u0001\u0000\u0000\u0000"+
		"\u001e\u00fd\u0001\u0000\u0000\u0000 \u010d\u0001\u0000\u0000\u0000\""+
		"\u0112\u0001\u0000\u0000\u0000$\u0116\u0001\u0000\u0000\u0000&\u012b\u0001"+
		"\u0000\u0000\u0000(\u0130\u0001\u0000\u0000\u0000*\u0139\u0001\u0000\u0000"+
		"\u0000,\u013b\u0001\u0000\u0000\u0000.\u013d\u0001\u0000\u0000\u00000"+
		"\u0140\u0001\u0000\u0000\u00002\u014a\u0001\u0000\u0000\u00004\u0151\u0001"+
		"\u0000\u0000\u00006\u015e\u0001\u0000\u0000\u00008\u0171\u0001\u0000\u0000"+
		"\u0000:\u0181\u0001\u0000\u0000\u0000<\u018d\u0001\u0000\u0000\u0000>"+
		"\u0196\u0001\u0000\u0000\u0000@\u0198\u0001\u0000\u0000\u0000B\u019a\u0001"+
		"\u0000\u0000\u0000D\u019d\u0001\u0000\u0000\u0000F\u01a5\u0001\u0000\u0000"+
		"\u0000H\u01cc\u0001\u0000\u0000\u0000J\u01e7\u0001\u0000\u0000\u0000L"+
		"\u0206\u0001\u0000\u0000\u0000N\u020d\u0001\u0000\u0000\u0000PR\u0005"+
		"\u0004\u0000\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000VY\u0003\u0002\u0001\u0000WY\u0005\u0000"+
		"\u0000\u0001XS\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000Y\u0001"+
		"\u0001\u0000\u0000\u0000Z[\u0003\u0004\u0002\u0000[]\u0005<\u0000\u0000"+
		"\\^\u0005\u0004\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000"+
		"\u0000\u0000aZ\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000fh\u0003\u0004\u0002\u0000gi\u0005<\u0000\u0000"+
		"hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000im\u0001\u0000\u0000"+
		"\u0000jl\u0005\u0004\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\u0000\u0000\u0001"+
		"q\u0003\u0001\u0000\u0000\u0000rt\u0003\b\u0004\u0000sr\u0001\u0000\u0000"+
		"\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0003"+
		"\u0006\u0003\u0000y\u0005\u0001\u0000\u0000\u0000z\u007f\u0003\f\u0006"+
		"\u0000{|\u0005\u0001\u0000\u0000|\u007f\u0003\n\u0005\u0000}\u007f\u0005"+
		"\u0001\u0000\u0000~z\u0001\u0000\u0000\u0000~{\u0001\u0000\u0000\u0000"+
		"~}\u0001\u0000\u0000\u0000\u007f\u0007\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0003\f\u0006\u0000\u0081\u0082\u0005<\u0000\u0000\u0082\u008a\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005\u0001\u0000\u0000\u0084\u0085\u0003"+
		"\n\u0005\u0000\u0085\u0086\u0005<\u0000\u0000\u0086\u008a\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005\u0001\u0000\u0000\u0088\u008a\u0005<\u0000"+
		"\u0000\u0089\u0080\u0001\u0000\u0000\u0000\u0089\u0083\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\t\u0001\u0000\u0000\u0000"+
		"\u008b\u0092\u0003\u000e\u0007\u0000\u008c\u0092\u0003\u0010\b\u0000\u008d"+
		"\u0092\u0003\u0012\t\u0000\u008e\u0092\u0003\u0014\n\u0000\u008f\u0092"+
		"\u0003\u0018\f\u0000\u0090\u0092\u0003\u001c\u000e\u0000\u0091\u008b\u0001"+
		"\u0000\u0000\u0000\u0091\u008c\u0001\u0000\u0000\u0000\u0091\u008d\u0001"+
		"\u0000\u0000\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u000b\u0001"+
		"\u0000\u0000\u0000\u0093\u0098\u0003\u001e\u000f\u0000\u0094\u0098\u0003"+
		"0\u0018\u0000\u0095\u0098\u00034\u001a\u0000\u0096\u0098\u00036\u001b"+
		"\u0000\u0097\u0093\u0001\u0000\u0000\u0000\u0097\u0094\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\r\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0018\u0000\u0000"+
		"\u009a\u009b\u0003D\"\u0000\u009b\u000f\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005\u0019\u0000\u0000\u009d\u009e\u0003\u0016\u000b\u0000\u009e"+
		"\u0011\u0001\u0000\u0000\u0000\u009f\u00a0\u0003<\u001e\u0000\u00a0\u00a1"+
		"\u0005?\u0000\u0000\u00a1\u00a2\u0005*\u0000\u0000\u00a2\u00a3\u0005\u0011"+
		"\u0000\u0000\u00a3\u00a4\u0003\u0016\u000b\u0000\u00a4\u00b3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0003<\u001e\u0000\u00a6\u00a7\u0005?\u0000\u0000"+
		"\u00a7\u00a8\u0005*\u0000\u0000\u00a8\u00a9\u0003D\"\u0000\u00a9\u00b3"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003<\u001e\u0000\u00ab\u00ac\u0005"+
		"?\u0000\u0000\u00ac\u00ad\u0005*\u0000\u0000\u00ad\u00ae\u0003\u0016\u000b"+
		"\u0000\u00ae\u00b3\u0001\u0000\u0000\u0000\u00af\u00b0\u0003<\u001e\u0000"+
		"\u00b0\u00b1\u0005?\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2"+
		"\u009f\u0001\u0000\u0000\u0000\u00b2\u00a5\u0001\u0000\u0000\u0000\u00b2"+
		"\u00aa\u0001\u0000\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b3"+
		"\u0013\u0001\u0000\u0000\u0000\u00b4\u00b5\u0003\u0016\u000b\u0000\u00b5"+
		"\u00b6\u0005*\u0000\u0000\u00b6\u00b7\u0003\u0016\u000b\u0000\u00b7\u00e2"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0003\u0016\u000b\u0000\u00b9\u00ba"+
		"\u0005*\u0000\u0000\u00ba\u00bb\u0005\u0011\u0000\u0000\u00bb\u00bc\u0003"+
		"\u0016\u000b\u0000\u00bc\u00e2\u0001\u0000\u0000\u0000\u00bd\u00be\u0003"+
		"\u0016\u000b\u0000\u00be\u00bf\u0005*\u0000\u0000\u00bf\u00c0\u0003D\""+
		"\u0000\u00c0\u00e2\u0001\u0000\u0000\u0000\u00c1\u00c2\u0003\u0016\u000b"+
		"\u0000\u00c2\u00c3\u0005*\u0000\u0000\u00c3\u00c4\u00054\u0000\u0000\u00c4"+
		"\u00c5\u0003J%\u0000\u00c5\u00e2\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003"+
		"\u0016\u000b\u0000\u00c7\u00c8\u00055\u0000\u0000\u00c8\u00e2\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0003\u0016\u000b\u0000\u00ca\u00cb\u00056\u0000"+
		"\u0000\u00cb\u00e2\u0001\u0000\u0000\u0000\u00cc\u00cd\u0003\u0016\u000b"+
		"\u0000\u00cd\u00ce\u0005*\u0000\u0000\u00ce\u00cf\u00057\u0000\u0000\u00cf"+
		"\u00d0\u0003J%\u0000\u00d0\u00d1\u00058\u0000\u0000\u00d1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0003\u0016\u000b\u0000\u00d3\u00d4\u0005"+
		"*\u0000\u0000\u00d4\u00d5\u0005:\u0000\u0000\u00d5\u00d6\u0003J%\u0000"+
		"\u00d6\u00e2\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003\u0016\u000b\u0000"+
		"\u00d8\u00d9\u0005*\u0000\u0000\u00d9\u00da\u00059\u0000\u0000\u00da\u00db"+
		"\u0003J%\u0000\u00db\u00e2\u0001\u0000\u0000\u0000\u00dc\u00dd\u0003\u0016"+
		"\u000b\u0000\u00dd\u00de\u0005*\u0000\u0000\u00de\u00df\u0005;\u0000\u0000"+
		"\u00df\u00e0\u0003J%\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00b4"+
		"\u0001\u0000\u0000\u0000\u00e1\u00b8\u0001\u0000\u0000\u0000\u00e1\u00bd"+
		"\u0001\u0000\u0000\u0000\u00e1\u00c1\u0001\u0000\u0000\u0000\u00e1\u00c6"+
		"\u0001\u0000\u0000\u0000\u00e1\u00c9\u0001\u0000\u0000\u0000\u00e1\u00cc"+
		"\u0001\u0000\u0000\u0000\u00e1\u00d2\u0001\u0000\u0000\u0000\u00e1\u00d7"+
		"\u0001\u0000\u0000\u0000\u00e1\u00dc\u0001\u0000\u0000\u0000\u00e2\u0015"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0003J%\u0000\u00e4\u00e5\u0005\u0014"+
		"\u0000\u0000\u00e5\u00e6\u0003\u0016\u000b\u0000\u00e6\u00ec\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0005?\u0000\u0000\u00e8\u00e9\u0005\u0017\u0000"+
		"\u0000\u00e9\u00ec\u0003\u0016\u000b\u0000\u00ea\u00ec\u0005?\u0000\u0000"+
		"\u00eb\u00e3\u0001\u0000\u0000\u0000\u00eb\u00e7\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u0017\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0005\u001b\u0000\u0000\u00ee\u00f1\u0003\u001a\r\u0000\u00ef"+
		"\u00f0\u0005\u001c\u0000\u0000\u00f0\u00f2\u0003D\"\u0000\u00f1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u0019"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f9\u0005?\u0000\u0000\u00f4\u00f5\u0003"+
		"\u0016\u000b\u0000\u00f5\u00f6\u0005\u0017\u0000\u0000\u00f6\u00f7\u0003"+
		"\u001a\r\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f4\u0001\u0000\u0000\u0000\u00f9\u001b\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0005\u0005\u0000\u0000\u00fb\u00fc\u0005?\u0000"+
		"\u0000\u00fc\u001d\u0001\u0000\u0000\u0000\u00fd\u00ff\u0003 \u0010\u0000"+
		"\u00fe\u0100\u0003\"\u0011\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101"+
		"\u0103\u0003$\u0012\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0001\u0000\u0000\u0000\u0103\u0107\u0001\u0000\u0000\u0000\u0104\u0106"+
		"\u0003\b\u0004\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0109\u0001"+
		"\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001"+
		"\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u0107\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0005\u0001\u0000\u0000\u010b\u010c\u0005"+
		"\u001a\u0000\u0000\u010c\u001f\u0001\u0000\u0000\u0000\u010d\u010e\u0005"+
		"\u0001\u0000\u0000\u010e\u010f\u0005\u0006\u0000\u0000\u010f\u0110\u0005"+
		"?\u0000\u0000\u0110\u0111\u0005<\u0000\u0000\u0111!\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0005\u0001\u0000\u0000\u0113\u0114\u0003&\u0013\u0000"+
		"\u0114\u0115\u0005<\u0000\u0000\u0115#\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0005\u0001\u0000\u0000\u0117\u0118\u0005\u001d\u0000\u0000\u0118\u011e"+
		"\u0003&\u0013\u0000\u0119\u011a\u0003N\'\u0000\u011a\u011b\u0003&\u0013"+
		"\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u0119\u0001\u0000\u0000"+
		"\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0121\u0001\u0000\u0000"+
		"\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0122\u0005<\u0000\u0000"+
		"\u0122%\u0001\u0000\u0000\u0000\u0123\u0124\u0003(\u0014\u0000\u0124\u0125"+
		"\u0005?\u0000\u0000\u0125\u012c\u0001\u0000\u0000\u0000\u0126\u0127\u0003"+
		"(\u0014\u0000\u0127\u0128\u0005?\u0000\u0000\u0128\u0129\u0005*\u0000"+
		"\u0000\u0129\u012a\u0003F#\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b"+
		"\u0123\u0001\u0000\u0000\u0000\u012b\u0126\u0001\u0000\u0000\u0000\u012c"+
		"\'\u0001\u0000\u0000\u0000\u012d\u0131\u0003*\u0015\u0000\u012e\u0131"+
		"\u0003,\u0016\u0000\u012f\u0131\u0003.\u0017\u0000\u0130\u012d\u0001\u0000"+
		"\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u012f\u0001\u0000"+
		"\u0000\u0000\u0131)\u0001\u0000\u0000\u0000\u0132\u0133\u0003,\u0016\u0000"+
		"\u0133\u0134\u0005\u0013\u0000\u0000\u0134\u013a\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0003,\u0016\u0000\u0136\u0137\u0005\u0012\u0000\u0000\u0137"+
		"\u0138\u0003J%\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0132\u0001"+
		"\u0000\u0000\u0000\u0139\u0135\u0001\u0000\u0000\u0000\u013a+\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0007\u0000\u0000\u0000\u013c-\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0005\u0010\u0000\u0000\u013e\u013f\u0005?\u0000\u0000"+
		"\u013f/\u0001\u0000\u0000\u0000\u0140\u0144\u00032\u0019\u0000\u0141\u0143"+
		"\u0003\b\u0004\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143\u0146\u0001"+
		"\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001"+
		"\u0000\u0000\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0144\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u0005\u0001\u0000\u0000\u0148\u0149\u0005"+
		"\u0016\u0000\u0000\u01491\u0001\u0000\u0000\u0000\u014a\u014b\u0005\u0001"+
		"\u0000\u0000\u014b\u014c\u0005\u0015\u0000\u0000\u014c\u014d\u0005<\u0000"+
		"\u0000\u014d\u014e\u0005\u0001\u0000\u0000\u014e\u014f\u0005?\u0000\u0000"+
		"\u014f\u0150\u0005<\u0000\u0000\u01503\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0005\u0001\u0000\u0000\u0152\u0153\u0005\u001e\u0000\u0000\u0153\u0154"+
		"\u0003H$\u0000\u0154\u0158\u0005<\u0000\u0000\u0155\u0157\u0003\b\u0004"+
		"\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000"+
		"\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000"+
		"\u0000\u0159\u015b\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000"+
		"\u0000\u015b\u015c\u0005\u0001\u0000\u0000\u015c\u015d\u0005\u001f\u0000"+
		"\u0000\u015d5\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u0001\u0000\u0000"+
		"\u015f\u0160\u0005 \u0000\u0000\u0160\u0161\u0003H$\u0000\u0161\u0165"+
		"\u0005<\u0000\u0000\u0162\u0164\u0003\b\u0004\u0000\u0163\u0162\u0001"+
		"\u0000\u0000\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0169\u0001"+
		"\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u016a\u0003"+
		"8\u001c\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000"+
		"\u0000\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u016d\u0003:\u001d"+
		"\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000"+
		"\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f\u0005\u0001\u0000"+
		"\u0000\u016f\u0170\u0005!\u0000\u0000\u01707\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0005\u0001\u0000\u0000\u0172\u0173\u0005\"\u0000\u0000\u0173\u0174"+
		"\u0003H$\u0000\u0174\u0178\u0005<\u0000\u0000\u0175\u0177\u0003\b\u0004"+
		"\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177\u017a\u0001\u0000\u0000"+
		"\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000"+
		"\u0000\u0179\u017c\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000"+
		"\u0000\u017b\u017d\u00038\u001c\u0000\u017c\u017b\u0001\u0000\u0000\u0000"+
		"\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017f\u0001\u0000\u0000\u0000"+
		"\u017e\u0180\u0003:\u001d\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u017f"+
		"\u0180\u0001\u0000\u0000\u0000\u01809\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0005\u0001\u0000\u0000\u0182\u0183\u0005#\u0000\u0000\u0183\u0187\u0005"+
		"<\u0000\u0000\u0184\u0186\u0003\b\u0004\u0000\u0185\u0184\u0001\u0000"+
		"\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188;\u0001\u0000\u0000"+
		"\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018e\u0003>\u001f\u0000"+
		"\u018b\u018e\u0003@ \u0000\u018c\u018e\u0003B!\u0000\u018d\u018a\u0001"+
		"\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018c\u0001"+
		"\u0000\u0000\u0000\u018e=\u0001\u0000\u0000\u0000\u018f\u0190\u0003@ "+
		"\u0000\u0190\u0191\u0005\u0013\u0000\u0000\u0191\u0197\u0001\u0000\u0000"+
		"\u0000\u0192\u0193\u0003@ \u0000\u0193\u0194\u0005\u0012\u0000\u0000\u0194"+
		"\u0195\u0003J%\u0000\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u018f\u0001"+
		"\u0000\u0000\u0000\u0196\u0192\u0001\u0000\u0000\u0000\u0197?\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\u0007\u0001\u0000\u0000\u0199A\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\u0005\u000f\u0000\u0000\u019b\u019c\u0005?\u0000\u0000"+
		"\u019cC\u0001\u0000\u0000\u0000\u019d\u01a1\u0003F#\u0000\u019e\u019f"+
		"\u0003N\'\u0000\u019f\u01a0\u0003D\"\u0000\u01a0\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a1\u019e\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a2E\u0001\u0000\u0000\u0000\u01a3\u01a6\u0003H$\u0000\u01a4"+
		"\u01a6\u0003J%\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a6G\u0001\u0000\u0000\u0000\u01a7\u01a8\u0006$\uffff"+
		"\uffff\u0000\u01a8\u01a9\u0005?\u0000\u0000\u01a9\u01aa\u0005\u0017\u0000"+
		"\u0000\u01aa\u01cd\u0003\u0016\u000b\u0000\u01ab\u01ac\u0003J%\u0000\u01ac"+
		"\u01ad\u0005\u0014\u0000\u0000\u01ad\u01ae\u0003\u0016\u000b\u0000\u01ae"+
		"\u01cd\u0001\u0000\u0000\u0000\u01af\u01b0\u0003J%\u0000\u01b0\u01b1\u0005"+
		"+\u0000\u0000\u01b1\u01b2\u0003J%\u0000\u01b2\u01cd\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u0003J%\u0000\u01b4\u01b5\u0005,\u0000\u0000\u01b5"+
		"\u01b6\u0003J%\u0000\u01b6\u01cd\u0001\u0000\u0000\u0000\u01b7\u01b8\u0003"+
		"J%\u0000\u01b8\u01b9\u0005-\u0000\u0000\u01b9\u01ba\u0003J%\u0000\u01ba"+
		"\u01cd\u0001\u0000\u0000\u0000\u01bb\u01bc\u0003J%\u0000\u01bc\u01bd\u0005"+
		".\u0000\u0000\u01bd\u01be\u0003J%\u0000\u01be\u01cd\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0003J%\u0000\u01c0\u01c1\u0005/\u0000\u0000\u01c1"+
		"\u01c2\u0003J%\u0000\u01c2\u01cd\u0001\u0000\u0000\u0000\u01c3\u01c4\u0003"+
		"J%\u0000\u01c4\u01c5\u00050\u0000\u0000\u01c5\u01c6\u0003J%\u0000\u01c6"+
		"\u01cd\u0001\u0000\u0000\u0000\u01c7\u01c8\u00053\u0000\u0000\u01c8\u01cd"+
		"\u0003H$\u0004\u01c9\u01cd\u0005&\u0000\u0000\u01ca\u01cd\u0003\u0018"+
		"\f\u0000\u01cb\u01cd\u0005?\u0000\u0000\u01cc\u01a7\u0001\u0000\u0000"+
		"\u0000\u01cc\u01ab\u0001\u0000\u0000\u0000\u01cc\u01af\u0001\u0000\u0000"+
		"\u0000\u01cc\u01b3\u0001\u0000\u0000\u0000\u01cc\u01b7\u0001\u0000\u0000"+
		"\u0000\u01cc\u01bb\u0001\u0000\u0000\u0000\u01cc\u01bf\u0001\u0000\u0000"+
		"\u0000\u01cc\u01c3\u0001\u0000\u0000\u0000\u01cc\u01c7\u0001\u0000\u0000"+
		"\u0000\u01cc\u01c9\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cd\u01d9\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cf\n\u0007\u0000\u0000\u01cf\u01d0\u00051\u0000\u0000"+
		"\u01d0\u01d8\u0003H$\b\u01d1\u01d2\n\u0006\u0000\u0000\u01d2\u01d3\u0005"+
		"2\u0000\u0000\u01d3\u01d8\u0003H$\u0007\u01d4\u01d5\n\u0005\u0000\u0000"+
		"\u01d5\u01d6\u0007\u0002\u0000\u0000\u01d6\u01d8\u0003H$\u0006\u01d7\u01ce"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d1\u0001\u0000\u0000\u0000\u01d7\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01daI\u0001"+
		"\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01dc\u01dd\u0006"+
		"%\uffff\uffff\u0000\u01dd\u01de\u0005?\u0000\u0000\u01de\u01df\u0005\u0017"+
		"\u0000\u0000\u01df\u01e8\u0003\u0016\u000b\u0000\u01e0\u01e1\u0005:\u0000"+
		"\u0000\u01e1\u01e8\u0003J%\t\u01e2\u01e3\u00059\u0000\u0000\u01e3\u01e8"+
		"\u0003J%\b\u01e4\u01e8\u0003L&\u0000\u01e5\u01e8\u0003\u0018\f\u0000\u01e6"+
		"\u01e8\u0005?\u0000\u0000\u01e7\u01dc\u0001\u0000\u0000\u0000\u01e7\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e2\u0001\u0000\u0000\u0000\u01e7\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e8\u0203\u0001\u0000\u0000\u0000\u01e9\u01ea"+
		"\n\u0005\u0000\u0000\u01ea\u01eb\u00054\u0000\u0000\u01eb\u0202\u0003"+
		"J%\u0006\u01ec\u01ed\n\u0004\u0000\u0000\u01ed\u01ee\u0005;\u0000\u0000"+
		"\u01ee\u0202\u0003J%\u0005\u01ef\u01f0\n\n\u0000\u0000\u01f0\u01f1\u0005"+
		"\u0014\u0000\u0000\u01f1\u0202\u0003\u0016\u000b\u0000\u01f2\u01f3\n\u0007"+
		"\u0000\u0000\u01f3\u0202\u0007\u0003\u0000\u0000\u01f4\u01f5\n\u0006\u0000"+
		"\u0000\u01f5\u01f8\u00057\u0000\u0000\u01f6\u01f7\u0005<\u0000\u0000\u01f7"+
		"\u01f9\u0005\u0001\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa"+
		"\u01fd\u0003J%\u0000\u01fb\u01fc\u0005<\u0000\u0000\u01fc\u01fe\u0005"+
		"\u0001\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001"+
		"\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0200\u0005"+
		"8\u0000\u0000\u0200\u0202\u0001\u0000\u0000\u0000\u0201\u01e9\u0001\u0000"+
		"\u0000\u0000\u0201\u01ec\u0001\u0000\u0000\u0000\u0201\u01ef\u0001\u0000"+
		"\u0000\u0000\u0201\u01f2\u0001\u0000\u0000\u0000\u0201\u01f4\u0001\u0000"+
		"\u0000\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000"+
		"\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204K\u0001\u0000\u0000"+
		"\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0206\u0207\u0007\u0004\u0000"+
		"\u0000\u0207M\u0001\u0000\u0000\u0000\u0208\u020e\u0005)\u0000\u0000\u0209"+
		"\u020e\u0005(\u0000\u0000\u020a\u020b\u0005<\u0000\u0000\u020b\u020c\u0005"+
		"\u0001\u0000\u0000\u020c\u020e\u0005(\u0000\u0000\u020d\u0208\u0001\u0000"+
		"\u0000\u0000\u020d\u0209\u0001\u0000\u0000\u0000\u020d\u020a\u0001\u0000"+
		"\u0000\u0000\u020eO\u0001\u0000\u0000\u0000-SX_chmu~\u0089\u0091\u0097"+
		"\u00b2\u00e1\u00eb\u00f1\u00f8\u00ff\u0102\u0107\u011e\u012b\u0130\u0139"+
		"\u0144\u0158\u0165\u0169\u016c\u0178\u017c\u017f\u0187\u018d\u0196\u01a1"+
		"\u01a5\u01cc\u01d7\u01d9\u01e7\u01f8\u01fd\u0201\u0203\u020d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}