// Generated from D:/mateusz/studia/4_semestr/Kompilatory/GTL/GreenTextLangParser.g4 by ANTLR 4.13.2
package GreenTextLangBase;
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
		CALL=27, CALLING=28, REGARDING=29, LIKES=30, THINK_THAT=31, RECONSIDER=32, 
		IMPLYING=33, OR_STH=34, OR=35, OR_NOT=36, BEGIN=37, END=38, LETME=39, 
		PARENT=40, DECIMAL_LITERAL=41, FLOAT_LITERAL=42, BOOL_LITERAL=43, STRING_LITERAL=44, 
		AND=45, COMMA=46, IS=47, VIBE_WITH=48, DOESNT_VIBE_WITH=49, BEATEN_BY=50, 
		DOESNT_BEAT=51, BEATS=52, UNBEATEN_BY=53, ALSO=54, ALTERNATIVELY=55, NOT=56, 
		JOINED_BY=57, EVOLVES=58, DEVOLVES=59, BREEDING_LIKE=60, TIMES=61, THE_LITERAL_OPPOSITE_OF=62, 
		FLIPPED=63, WHATEVER_LEFT_FROM=64, NEWLINE=65, WS=66, LINE_COMMENT=67, 
		NAME=68;
	public static final int
		RULE_program = 0, RULE_code_blocks = 1, RULE_code_block = 2, RULE_statement = 3, 
		RULE_statement_newline = 4, RULE_simple_statement = 5, RULE_compound_statement = 6, 
		RULE_spit = 7, RULE_swallow = 8, RULE_variable_declaration = 9, RULE_variable_assignment = 10, 
		RULE_parent_variable = 11, RULE_variable = 12, RULE_function_call_ing = 13, 
		RULE_function_call = 14, RULE_invite = 15, RULE_function_declaration = 16, 
		RULE_function_return = 17, RULE_function_arguments = 18, RULE_struct_declaration = 19, 
		RULE_loop_declaration = 20, RULE_if_declaration = 21, RULE_or_statement = 22, 
		RULE_or_not_statement = 23, RULE_type = 24, RULE_complex_type = 25, RULE_primitive_type = 26, 
		RULE_struct_type = 27, RULE_variable_declaration_ing_without_elses = 28, 
		RULE_variable_declaration_ing = 29, RULE_type_ing = 30, RULE_complex_type_ing = 31, 
		RULE_primitive_type_ing = 32, RULE_struct_type_ing = 33, RULE_expressions = 34, 
		RULE_expression = 35, RULE_also = 36, RULE_inversion = 37, RULE_comparison = 38, 
		RULE_sum = 39, RULE_term = 40, RULE_factor = 41, RULE_atom = 42, RULE_literal = 43, 
		RULE_nested_name = 44, RULE_separator = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "code_blocks", "code_block", "statement", "statement_newline", 
			"simple_statement", "compound_statement", "spit", "swallow", "variable_declaration", 
			"variable_assignment", "parent_variable", "variable", "function_call_ing", 
			"function_call", "invite", "function_declaration", "function_return", 
			"function_arguments", "struct_declaration", "loop_declaration", "if_declaration", 
			"or_statement", "or_not_statement", "type", "complex_type", "primitive_type", 
			"struct_type", "variable_declaration_ing_without_elses", "variable_declaration_ing", 
			"type_ing", "complex_type_ing", "primitive_type_ing", "struct_type_ing", 
			"expressions", "expression", "also", "inversion", "comparison", "sum", 
			"term", "factor", "atom", "literal", "nested_name", "separator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'invite'", "'be'", "'see'", "'seeing'", 
			"'taste'", "'tasting'", "'hear'", "'hearing'", "'smell'", "'smelling'", 
			"'spot'", "'spotting'", "'someone elses'", "'about'", "'multiple'", "''th'", 
			"'look around'", "'lose interest'", "''s'", "'spit'", "'swallow'", "'profit'", 
			"'call'", "'calling'", "'regarding'", "'likes'", "'think that'", "'reconsider'", 
			"'implying'", "'or sth'", "'or'", "'or not'", "'('", "')'", "'let me'", 
			"'parent'", null, null, null, null, "'and'", "','", "'is'", "'vibe with'", 
			"'doesn't vibe with'", "'beaten by'", "'doesn't beat'", "'beats'", "'unbeaten by'", 
			"'also'", "'alternatively'", "'not'", "'joined by'", "'evolves'", "'devolves'", 
			"'breeding like'", "'times'", "'the literal opposite of'", "'flipped'", 
			"'whatever left from'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ENTRY", "COMMENT", "COMMENT_NEWLINE", "END_LIFE", "INVITE", "BE", 
			"SEE", "SEEING", "TASTE", "TASTING", "HEAR", "HEARING", "SMELL", "SMELLING", 
			"SPOT", "SPOTTING", "SOMEONE_ELSES", "ABOUT", "MULTIPLE", "TH", "LOOK_AROUND", 
			"LOSE_INTEREST", "S", "SPIT", "SWALLOW", "PROFIT", "CALL", "CALLING", 
			"REGARDING", "LIKES", "THINK_THAT", "RECONSIDER", "IMPLYING", "OR_STH", 
			"OR", "OR_NOT", "BEGIN", "END", "LETME", "PARENT", "DECIMAL_LITERAL", 
			"FLOAT_LITERAL", "BOOL_LITERAL", "STRING_LITERAL", "AND", "COMMA", "IS", 
			"VIBE_WITH", "DOESNT_VIBE_WITH", "BEATEN_BY", "DOESNT_BEAT", "BEATS", 
			"UNBEATEN_BY", "ALSO", "ALTERNATIVELY", "NOT", "JOINED_BY", "EVOLVES", 
			"DEVOLVES", "BREEDING_LIKE", "TIMES", "THE_LITERAL_OPPOSITE_OF", "FLIPPED", 
			"WHATEVER_LEFT_FROM", "NEWLINE", "WS", "LINE_COMMENT", "NAME"
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
		try {
			int _alt;
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(92);
						match(END_LIFE);
						}
						} 
					}
					setState(97);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(98);
				code_blocks();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(EOF);
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
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					code_block();
					setState(103);
					match(NEWLINE);
					setState(105); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(104);
							match(END_LIFE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(107); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(114);
			code_block();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(115);
				match(NEWLINE);
				}
			}

			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==END_LIFE) {
				{
				{
				setState(118);
				match(END_LIFE);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					statement_newline();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(132);
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
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BE:
			case LOOK_AROUND:
			case THINK_THAT:
			case IMPLYING:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				compound_statement();
				}
				break;
			case INVITE:
			case SEE:
			case TASTE:
			case HEAR:
			case SMELL:
			case SPOT:
			case SPIT:
			case SWALLOW:
			case CALL:
			case PARENT:
			case DECIMAL_LITERAL:
			case IS:
			case EVOLVES:
			case DEVOLVES:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				simple_statement();
				}
				break;
			case EOF:
			case END_LIFE:
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
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
	public static class Statement_newlineContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GreenTextLangParser.NEWLINE, 0); }
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
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BE:
			case LOOK_AROUND:
			case THINK_THAT:
			case IMPLYING:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				compound_statement();
				setState(140);
				match(NEWLINE);
				}
				break;
			case INVITE:
			case SEE:
			case TASTE:
			case HEAR:
			case SMELL:
			case SPOT:
			case SPIT:
			case SWALLOW:
			case CALL:
			case PARENT:
			case DECIMAL_LITERAL:
			case IS:
			case EVOLVES:
			case DEVOLVES:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				simple_statement();
				setState(143);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(NEWLINE);
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
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				spit();
				}
				break;
			case SWALLOW:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
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
				setState(150);
				variable_declaration();
				}
				break;
			case PARENT:
			case DECIMAL_LITERAL:
			case IS:
			case EVOLVES:
			case DEVOLVES:
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				variable_assignment();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				function_call();
				}
				break;
			case INVITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
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
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BE:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				function_declaration();
				}
				break;
			case LOOK_AROUND:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				struct_declaration();
				}
				break;
			case THINK_THAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				loop_declaration();
				}
				break;
			case IMPLYING:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				if_declaration();
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
			setState(162);
			match(SPIT);
			setState(163);
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
		public Parent_variableContext parent_variable() {
			return getRuleContext(Parent_variableContext.class,0);
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
			setState(165);
			match(SWALLOW);
			setState(166);
			parent_variable();
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
		public Parent_variableContext parent_variable() {
			return getRuleContext(Parent_variableContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public Function_call_ingContext function_call_ing() {
			return getRuleContext(Function_call_ingContext.class,0);
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
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				type();
				setState(169);
				match(NAME);
				setState(170);
				match(IS);
				setState(171);
				match(SOMEONE_ELSES);
				setState(172);
				parent_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				type();
				setState(175);
				match(NAME);
				setState(176);
				match(IS);
				setState(177);
				expressions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				type();
				setState(180);
				match(NAME);
				setState(181);
				match(IS);
				setState(182);
				function_call_ing();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				type();
				setState(185);
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
		public List<Parent_variableContext> parent_variable() {
			return getRuleContexts(Parent_variableContext.class);
		}
		public Parent_variableContext parent_variable(int i) {
			return getRuleContext(Parent_variableContext.class,i);
		}
		public TerminalNode IS() { return getToken(GreenTextLangParser.IS, 0); }
		public Function_call_ingContext function_call_ing() {
			return getRuleContext(Function_call_ingContext.class,0);
		}
		public TerminalNode SOMEONE_ELSES() { return getToken(GreenTextLangParser.SOMEONE_ELSES, 0); }
		public TerminalNode JOINED_BY() { return getToken(GreenTextLangParser.JOINED_BY, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode EVOLVES() { return getToken(GreenTextLangParser.EVOLVES, 0); }
		public TerminalNode DEVOLVES() { return getToken(GreenTextLangParser.DEVOLVES, 0); }
		public TerminalNode BREEDING_LIKE() { return getToken(GreenTextLangParser.BREEDING_LIKE, 0); }
		public TerminalNode TIMES() { return getToken(GreenTextLangParser.TIMES, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GreenTextLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GreenTextLangParser.NEWLINE, i);
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
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				parent_variable();
				setState(190);
				match(IS);
				setState(191);
				function_call_ing();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				parent_variable();
				setState(194);
				match(IS);
				setState(195);
				match(SOMEONE_ELSES);
				setState(196);
				parent_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				parent_variable();
				setState(199);
				match(IS);
				setState(200);
				match(JOINED_BY);
				setState(201);
				expressions();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				parent_variable();
				setState(204);
				match(EVOLVES);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				parent_variable();
				setState(207);
				match(DEVOLVES);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
				parent_variable();
				setState(210);
				match(IS);
				setState(211);
				match(BREEDING_LIKE);
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(212);
					match(NEWLINE);
					}
					break;
				}
				setState(215);
				expressions();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(216);
					match(NEWLINE);
					}
				}

				setState(219);
				match(TIMES);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(221);
				parent_variable();
				setState(222);
				match(IS);
				setState(223);
				match(FLIPPED);
				setState(224);
				expressions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(226);
				parent_variable();
				setState(227);
				match(IS);
				setState(228);
				match(THE_LITERAL_OPPOSITE_OF);
				setState(229);
				expressions();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(231);
				parent_variable();
				setState(232);
				match(IS);
				setState(233);
				match(WHATEVER_LEFT_FROM);
				setState(234);
				expressions();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(236);
				parent_variable();
				setState(237);
				match(IS);
				setState(238);
				expressions();
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
	public static class Parent_variableContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> PARENT() { return getTokens(GreenTextLangParser.PARENT); }
		public TerminalNode PARENT(int i) {
			return getToken(GreenTextLangParser.PARENT, i);
		}
		public Parent_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterParent_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitParent_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitParent_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parent_variableContext parent_variable() throws RecognitionException {
		Parent_variableContext _localctx = new Parent_variableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parent_variable);
		int _la;
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARENT) {
					{
					{
					setState(243);
					match(PARENT);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				variable();
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
		enterRule(_localctx, 24, RULE_variable);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(NAME);
				setState(253);
				match(S);
				setState(254);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL_LITERAL || _la==NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(256);
				match(TH);
				setState(257);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
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
	public static class Function_call_ingContext extends ParserRuleContext {
		public TerminalNode CALLING() { return getToken(GreenTextLangParser.CALLING, 0); }
		public Parent_variableContext parent_variable() {
			return getRuleContext(Parent_variableContext.class,0);
		}
		public TerminalNode REGARDING() { return getToken(GreenTextLangParser.REGARDING, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public Function_call_ingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_ing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterFunction_call_ing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitFunction_call_ing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitFunction_call_ing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_ingContext function_call_ing() throws RecognitionException {
		Function_call_ingContext _localctx = new Function_call_ingContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_call_ing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(CALLING);
			setState(262);
			parent_variable();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGARDING) {
				{
				setState(263);
				match(REGARDING);
				setState(264);
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
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(GreenTextLangParser.CALL, 0); }
		public Parent_variableContext parent_variable() {
			return getRuleContext(Parent_variableContext.class,0);
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
		enterRule(_localctx, 28, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(CALL);
			setState(268);
			parent_variable();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REGARDING) {
				{
				setState(269);
				match(REGARDING);
				setState(270);
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
	public static class InviteContext extends ParserRuleContext {
		public TerminalNode INVITE() { return getToken(GreenTextLangParser.INVITE, 0); }
		public Nested_nameContext nested_name() {
			return getRuleContext(Nested_nameContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(GreenTextLangParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GreenTextLangParser.NAME, i);
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
		enterRule(_localctx, 30, RULE_invite);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(INVITE);
			setState(274);
			nested_name();
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(275);
					separator();
					setState(276);
					match(NAME);
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public TerminalNode BE() { return getToken(GreenTextLangParser.BE, 0); }
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(GreenTextLangParser.NEWLINE, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(BE);
			setState(284);
			match(NAME);
			setState(285);
			match(NEWLINE);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 87296L) != 0)) {
				{
				setState(286);
				function_return();
				}
			}

			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIKES) {
				{
				setState(289);
				function_arguments();
				}
			}

			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -8043424433016601257L) != 0)) {
				{
				{
				setState(292);
				statement_newline();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
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
	public static class Function_returnContext extends ParserRuleContext {
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
		enterRule(_localctx, 34, RULE_function_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			variable_declaration_ing_without_elses();
			setState(301);
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
			setState(303);
			match(LIKES);
			setState(304);
			variable_declaration_ing();
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					separator();
					setState(306);
					variable_declaration_ing();
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(313);
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
		public TerminalNode LOOK_AROUND() { return getToken(GreenTextLangParser.LOOK_AROUND, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GreenTextLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GreenTextLangParser.NEWLINE, i);
		}
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
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
		enterRule(_localctx, 38, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(LOOK_AROUND);
			setState(316);
			match(NEWLINE);
			setState(317);
			match(NAME);
			setState(318);
			match(NEWLINE);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -8043424433016601257L) != 0)) {
				{
				{
				setState(319);
				statement_newline();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
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
	public static class Loop_declarationContext extends ParserRuleContext {
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
		enterRule(_localctx, 40, RULE_loop_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(THINK_THAT);
			setState(328);
			expression();
			setState(329);
			match(NEWLINE);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -8043424433016601257L) != 0)) {
				{
				{
				setState(330);
				statement_newline();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
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
		enterRule(_localctx, 42, RULE_if_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(IMPLYING);
			setState(339);
			expression();
			setState(340);
			match(NEWLINE);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -8043424433016601257L) != 0)) {
				{
				{
				setState(341);
				statement_newline();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				{
				setState(347);
				or_statement();
				}
				break;
			case OR_NOT:
				{
				setState(348);
				or_not_statement();
				}
				break;
			case OR_STH:
				break;
			default:
				break;
			}
			setState(351);
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
		enterRule(_localctx, 44, RULE_or_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(OR);
			setState(354);
			expression();
			setState(355);
			match(NEWLINE);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -8043424433016601257L) != 0)) {
				{
				{
				setState(356);
				statement_newline();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				{
				setState(362);
				or_statement();
				}
				break;
			case OR_NOT:
				{
				setState(363);
				or_not_statement();
				}
				break;
			case OR_STH:
				break;
			default:
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
		enterRule(_localctx, 46, RULE_or_not_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(OR_NOT);
			setState(367);
			match(NEWLINE);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -8043424433016601257L) != 0)) {
				{
				{
				setState(368);
				statement_newline();
				}
				}
				setState(373);
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
		enterRule(_localctx, 48, RULE_type);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				complex_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				primitive_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
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
		public Nested_nameContext nested_name() {
			return getRuleContext(Nested_nameContext.class,0);
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
		enterRule(_localctx, 50, RULE_complex_type);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				primitive_type();
				setState(380);
				match(MULTIPLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				primitive_type();
				setState(383);
				match(ABOUT);
				setState(384);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				match(SPOT);
				setState(387);
				match(ABOUT);
				setState(388);
				expression();
				setState(389);
				nested_name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				match(SPOT);
				setState(392);
				match(MULTIPLE);
				setState(393);
				nested_name();
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
		enterRule(_localctx, 52, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
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
		public Nested_nameContext nested_name() {
			return getRuleContext(Nested_nameContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_struct_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(SPOT);
			setState(399);
			nested_name();
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
		public Function_call_ingContext function_call_ing() {
			return getRuleContext(Function_call_ingContext.class,0);
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
		enterRule(_localctx, 56, RULE_variable_declaration_ing_without_elses);
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				type_ing();
				setState(402);
				match(NAME);
				setState(403);
				match(IS);
				setState(404);
				expressions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				type_ing();
				setState(407);
				match(NAME);
				setState(408);
				match(IS);
				setState(409);
				function_call_ing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				type_ing();
				setState(412);
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
		enterRule(_localctx, 58, RULE_variable_declaration_ing);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				type_ing();
				setState(417);
				match(SOMEONE_ELSES);
				setState(418);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				type_ing();
				setState(421);
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
		enterRule(_localctx, 60, RULE_type_ing);
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				complex_type_ing();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				primitive_type_ing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
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
		public Nested_nameContext nested_name() {
			return getRuleContext(Nested_nameContext.class,0);
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
		enterRule(_localctx, 62, RULE_complex_type_ing);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				primitive_type_ing();
				setState(431);
				match(MULTIPLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				primitive_type_ing();
				setState(434);
				match(ABOUT);
				setState(435);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				match(SPOTTING);
				setState(438);
				match(ABOUT);
				setState(439);
				expression();
				setState(440);
				nested_name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				match(SPOTTING);
				setState(443);
				match(MULTIPLE);
				setState(444);
				nested_name();
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
		enterRule(_localctx, 64, RULE_primitive_type_ing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
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
		public Nested_nameContext nested_name() {
			return getRuleContext(Nested_nameContext.class,0);
		}
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
		enterRule(_localctx, 66, RULE_struct_type_ing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(SPOTTING);
			setState(450);
			nested_name();
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			expression();
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(453);
					separator();
					setState(454);
					expression();
					}
					} 
				}
				setState(460);
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
		public List<TerminalNode> NEWLINE() { return getTokens(GreenTextLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GreenTextLangParser.NEWLINE, i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			also();
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(462);
						match(NEWLINE);
						}
					}

					setState(465);
					match(ALTERNATIVELY);
					setState(466);
					also();
					}
					} 
				}
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		public List<TerminalNode> NEWLINE() { return getTokens(GreenTextLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GreenTextLangParser.NEWLINE, i);
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
		enterRule(_localctx, 72, RULE_also);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			inversion();
			setState(480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
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

					setState(476);
					match(ALSO);
					setState(477);
					inversion();
					}
					} 
				}
				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 74, RULE_inversion);
		try {
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(NOT);
				setState(484);
				inversion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				comparison();
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
	public static class ComparisonContext extends ParserRuleContext {
		public List<SumContext> sum() {
			return getRuleContexts(SumContext.class);
		}
		public SumContext sum(int i) {
			return getRuleContext(SumContext.class,i);
		}
		public TerminalNode VIBE_WITH() { return getToken(GreenTextLangParser.VIBE_WITH, 0); }
		public TerminalNode DOESNT_VIBE_WITH() { return getToken(GreenTextLangParser.DOESNT_VIBE_WITH, 0); }
		public TerminalNode BEATEN_BY() { return getToken(GreenTextLangParser.BEATEN_BY, 0); }
		public TerminalNode DOESNT_BEAT() { return getToken(GreenTextLangParser.DOESNT_BEAT, 0); }
		public TerminalNode BEATS() { return getToken(GreenTextLangParser.BEATS, 0); }
		public TerminalNode UNBEATEN_BY() { return getToken(GreenTextLangParser.UNBEATEN_BY, 0); }
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
		enterRule(_localctx, 76, RULE_comparison);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				sum(0);
				setState(489);
				match(VIBE_WITH);
				setState(490);
				sum(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				sum(0);
				setState(493);
				match(DOESNT_VIBE_WITH);
				setState(494);
				sum(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				sum(0);
				setState(497);
				match(BEATEN_BY);
				setState(498);
				sum(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(500);
				sum(0);
				setState(501);
				match(DOESNT_BEAT);
				setState(502);
				sum(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(504);
				sum(0);
				setState(505);
				match(BEATS);
				setState(506);
				sum(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(508);
				sum(0);
				setState(509);
				match(UNBEATEN_BY);
				setState(510);
				sum(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(512);
				sum(0);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_sum, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(516);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(523);
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
					setState(518);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(519);
					match(JOINED_BY);
					setState(520);
					term(0);
					}
					} 
				}
				setState(525);
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
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(GreenTextLangParser.TIMES, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GreenTextLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GreenTextLangParser.NEWLINE, i);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(527);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(543);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(529);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(530);
						match(BREEDING_LIKE);
						setState(532);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
						case 1:
							{
							setState(531);
							match(NEWLINE);
							}
							break;
						}
						setState(534);
						expressions();
						setState(536);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(535);
							match(NEWLINE);
							}
						}

						setState(538);
						match(TIMES);
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(540);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(541);
						match(WHATEVER_LEFT_FROM);
						setState(542);
						factor();
						}
						break;
					}
					} 
				}
				setState(547);
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
		enterRule(_localctx, 82, RULE_factor);
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				match(THE_LITERAL_OPPOSITE_OF);
				setState(549);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				match(FLIPPED);
				setState(551);
				factor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(552);
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
	public static class AtomContext extends ParserRuleContext {
		public Parent_variableContext parent_variable() {
			return getRuleContext(Parent_variableContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(GreenTextLangParser.BEGIN, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode END() { return getToken(GreenTextLangParser.END, 0); }
		public TerminalNode NEWLINE() { return getToken(GreenTextLangParser.NEWLINE, 0); }
		public TerminalNode LETME() { return getToken(GreenTextLangParser.LETME, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
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
		enterRule(_localctx, 84, RULE_atom);
		try {
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				parent_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(557);
				match(BEGIN);
				setState(559);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(558);
					match(NEWLINE);
					}
					break;
				}
				setState(561);
				expressions();
				setState(562);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(564);
				match(LETME);
				setState(565);
				type();
				setState(566);
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
		enterRule(_localctx, 86, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32985348833280L) != 0)) ) {
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
	public static class Nested_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GreenTextLangParser.NAME, 0); }
		public TerminalNode S() { return getToken(GreenTextLangParser.S, 0); }
		public Nested_nameContext nested_name() {
			return getRuleContext(Nested_nameContext.class,0);
		}
		public Nested_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).enterNested_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenTextLangParserListener ) ((GreenTextLangParserListener)listener).exitNested_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenTextLangParserVisitor ) return ((GreenTextLangParserVisitor<? extends T>)visitor).visitNested_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nested_nameContext nested_name() throws RecognitionException {
		Nested_nameContext _localctx = new Nested_nameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_nested_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(NAME);
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(573);
				match(S);
				setState(574);
				nested_name();
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
	public static class SeparatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(GreenTextLangParser.COMMA, 0); }
		public TerminalNode AND() { return getToken(GreenTextLangParser.AND, 0); }
		public TerminalNode NEWLINE() { return getToken(GreenTextLangParser.NEWLINE, 0); }
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
		enterRule(_localctx, 90, RULE_separator);
		try {
			setState(581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				match(COMMA);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				match(AND);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(579);
				match(NEWLINE);
				setState(580);
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
		case 39:
			return sum_sempred((SumContext)_localctx, predIndex);
		case 40:
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
		"\u0004\u0001D\u0248\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0001\u0000\u0005\u0000^\b\u0000\n\u0000\f\u0000a\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000e\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001j\b\u0001\u000b\u0001\f\u0001k\u0005\u0001n\b\u0001"+
		"\n\u0001\f\u0001q\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001u\b\u0001"+
		"\u0001\u0001\u0005\u0001x\b\u0001\n\u0001\f\u0001{\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0005\u0002\u0080\b\u0002\n\u0002\f\u0002\u0083"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u008a\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0093\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u009b"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a1"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00bc\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00d6\b\n\u0001\n\u0001\n\u0003\n\u00da\b\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00f1\b\n\u0001\u000b\u0001\u000b\u0005\u000b\u00f5\b\u000b"+
		"\n\u000b\f\u000b\u00f8\t\u000b\u0001\u000b\u0003\u000b\u00fb\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0104\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u010a\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0110\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0117\b\u000f\n\u000f\f\u000f"+
		"\u011a\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0120\b\u0010\u0001\u0010\u0003\u0010\u0123\b\u0010\u0001\u0010\u0005"+
		"\u0010\u0126\b\u0010\n\u0010\f\u0010\u0129\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0135\b\u0012\n\u0012\f\u0012\u0138"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u0141\b\u0013\n\u0013\f\u0013\u0144\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u014c\b\u0014\n\u0014\f\u0014\u014f\t\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0157"+
		"\b\u0015\n\u0015\f\u0015\u015a\t\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u015e\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u0166\b\u0016\n\u0016\f\u0016\u0169\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u016d\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u0172\b\u0017\n\u0017\f\u0017\u0175\t\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u017a\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u018b\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u019f\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u01a8\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u01ad\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01be\b\u001f"+
		"\u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u01c9\b\"\n\"\f\"\u01cc\t\"\u0001#\u0001#\u0003#\u01d0\b#\u0001#\u0001"+
		"#\u0005#\u01d4\b#\n#\f#\u01d7\t#\u0001$\u0001$\u0003$\u01db\b$\u0001$"+
		"\u0001$\u0005$\u01df\b$\n$\f$\u01e2\t$\u0001%\u0001%\u0001%\u0003%\u01e7"+
		"\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0202\b&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0005\'\u020a\b\'\n\'\f\'\u020d\t\'\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0215\b(\u0001(\u0001(\u0003"+
		"(\u0219\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u0220\b(\n(\f(\u0223"+
		"\t(\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u022a\b)\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u0230\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u0239\b*\u0001+\u0001+\u0001,\u0001,\u0001,\u0003,\u0240\b,\u0001"+
		"-\u0001-\u0001-\u0001-\u0003-\u0246\b-\u0001-\u0000\u0002NP.\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\u0004\u0002\u0000))DD\u0004\u0000"+
		"\u0007\u0007\t\t\u000b\u000b\r\r\u0004\u0000\b\b\n\n\f\f\u000e\u000e\u0001"+
		"\u0000),\u0275\u0000d\u0001\u0000\u0000\u0000\u0002o\u0001\u0000\u0000"+
		"\u0000\u0004\u0081\u0001\u0000\u0000\u0000\u0006\u0089\u0001\u0000\u0000"+
		"\u0000\b\u0092\u0001\u0000\u0000\u0000\n\u009a\u0001\u0000\u0000\u0000"+
		"\f\u00a0\u0001\u0000\u0000\u0000\u000e\u00a2\u0001\u0000\u0000\u0000\u0010"+
		"\u00a5\u0001\u0000\u0000\u0000\u0012\u00bb\u0001\u0000\u0000\u0000\u0014"+
		"\u00f0\u0001\u0000\u0000\u0000\u0016\u00fa\u0001\u0000\u0000\u0000\u0018"+
		"\u0103\u0001\u0000\u0000\u0000\u001a\u0105\u0001\u0000\u0000\u0000\u001c"+
		"\u010b\u0001\u0000\u0000\u0000\u001e\u0111\u0001\u0000\u0000\u0000 \u011b"+
		"\u0001\u0000\u0000\u0000\"\u012c\u0001\u0000\u0000\u0000$\u012f\u0001"+
		"\u0000\u0000\u0000&\u013b\u0001\u0000\u0000\u0000(\u0147\u0001\u0000\u0000"+
		"\u0000*\u0152\u0001\u0000\u0000\u0000,\u0161\u0001\u0000\u0000\u0000."+
		"\u016e\u0001\u0000\u0000\u00000\u0179\u0001\u0000\u0000\u00002\u018a\u0001"+
		"\u0000\u0000\u00004\u018c\u0001\u0000\u0000\u00006\u018e\u0001\u0000\u0000"+
		"\u00008\u019e\u0001\u0000\u0000\u0000:\u01a7\u0001\u0000\u0000\u0000<"+
		"\u01ac\u0001\u0000\u0000\u0000>\u01bd\u0001\u0000\u0000\u0000@\u01bf\u0001"+
		"\u0000\u0000\u0000B\u01c1\u0001\u0000\u0000\u0000D\u01c4\u0001\u0000\u0000"+
		"\u0000F\u01cd\u0001\u0000\u0000\u0000H\u01d8\u0001\u0000\u0000\u0000J"+
		"\u01e6\u0001\u0000\u0000\u0000L\u0201\u0001\u0000\u0000\u0000N\u0203\u0001"+
		"\u0000\u0000\u0000P\u020e\u0001\u0000\u0000\u0000R\u0229\u0001\u0000\u0000"+
		"\u0000T\u0238\u0001\u0000\u0000\u0000V\u023a\u0001\u0000\u0000\u0000X"+
		"\u023c\u0001\u0000\u0000\u0000Z\u0245\u0001\u0000\u0000\u0000\\^\u0005"+
		"\u0004\u0000\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000be\u0003\u0002\u0001\u0000ce\u0005\u0000"+
		"\u0000\u0001d_\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000e\u0001"+
		"\u0001\u0000\u0000\u0000fg\u0003\u0004\u0002\u0000gi\u0005A\u0000\u0000"+
		"hj\u0005\u0004\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000"+
		"\u0000\u0000mf\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000rt\u0003\u0004\u0002\u0000su\u0005A\u0000\u0000"+
		"ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uy\u0001\u0000\u0000"+
		"\u0000vx\u0005\u0004\u0000\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\u0000\u0000\u0001"+
		"}\u0003\u0001\u0000\u0000\u0000~\u0080\u0003\b\u0004\u0000\u007f~\u0001"+
		"\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0003"+
		"\u0006\u0003\u0000\u0085\u0005\u0001\u0000\u0000\u0000\u0086\u008a\u0003"+
		"\f\u0006\u0000\u0087\u008a\u0003\n\u0005\u0000\u0088\u008a\u0001\u0000"+
		"\u0000\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u0007\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0003\f\u0006\u0000\u008c\u008d\u0005A\u0000"+
		"\u0000\u008d\u0093\u0001\u0000\u0000\u0000\u008e\u008f\u0003\n\u0005\u0000"+
		"\u008f\u0090\u0005A\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091"+
		"\u0093\u0005A\u0000\u0000\u0092\u008b\u0001\u0000\u0000\u0000\u0092\u008e"+
		"\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\t\u0001"+
		"\u0000\u0000\u0000\u0094\u009b\u0003\u000e\u0007\u0000\u0095\u009b\u0003"+
		"\u0010\b\u0000\u0096\u009b\u0003\u0012\t\u0000\u0097\u009b\u0003\u0014"+
		"\n\u0000\u0098\u009b\u0003\u001c\u000e\u0000\u0099\u009b\u0003\u001e\u000f"+
		"\u0000\u009a\u0094\u0001\u0000\u0000\u0000\u009a\u0095\u0001\u0000\u0000"+
		"\u0000\u009a\u0096\u0001\u0000\u0000\u0000\u009a\u0097\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u000b\u0001\u0000\u0000\u0000\u009c\u00a1\u0003 \u0010\u0000"+
		"\u009d\u00a1\u0003&\u0013\u0000\u009e\u00a1\u0003(\u0014\u0000\u009f\u00a1"+
		"\u0003*\u0015\u0000\u00a0\u009c\u0001\u0000\u0000\u0000\u00a0\u009d\u0001"+
		"\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\r\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0018"+
		"\u0000\u0000\u00a3\u00a4\u0003D\"\u0000\u00a4\u000f\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005\u0019\u0000\u0000\u00a6\u00a7\u0003\u0016\u000b"+
		"\u0000\u00a7\u0011\u0001\u0000\u0000\u0000\u00a8\u00a9\u00030\u0018\u0000"+
		"\u00a9\u00aa\u0005D\u0000\u0000\u00aa\u00ab\u0005/\u0000\u0000\u00ab\u00ac"+
		"\u0005\u0011\u0000\u0000\u00ac\u00ad\u0003\u0016\u000b\u0000\u00ad\u00bc"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u00030\u0018\u0000\u00af\u00b0\u0005"+
		"D\u0000\u0000\u00b0\u00b1\u0005/\u0000\u0000\u00b1\u00b2\u0003D\"\u0000"+
		"\u00b2\u00bc\u0001\u0000\u0000\u0000\u00b3\u00b4\u00030\u0018\u0000\u00b4"+
		"\u00b5\u0005D\u0000\u0000\u00b5\u00b6\u0005/\u0000\u0000\u00b6\u00b7\u0003"+
		"\u001a\r\u0000\u00b7\u00bc\u0001\u0000\u0000\u0000\u00b8\u00b9\u00030"+
		"\u0018\u0000\u00b9\u00ba\u0005D\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bb\u00a8\u0001\u0000\u0000\u0000\u00bb\u00ae\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b3\u0001\u0000\u0000\u0000\u00bb\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bc\u0013\u0001\u0000\u0000\u0000\u00bd\u00be\u0003\u0016\u000b"+
		"\u0000\u00be\u00bf\u0005/\u0000\u0000\u00bf\u00c0\u0003\u001a\r\u0000"+
		"\u00c0\u00f1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0003\u0016\u000b\u0000"+
		"\u00c2\u00c3\u0005/\u0000\u0000\u00c3\u00c4\u0005\u0011\u0000\u0000\u00c4"+
		"\u00c5\u0003\u0016\u000b\u0000\u00c5\u00f1\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0003\u0016\u000b\u0000\u00c7\u00c8\u0005/\u0000\u0000\u00c8\u00c9"+
		"\u00059\u0000\u0000\u00c9\u00ca\u0003D\"\u0000\u00ca\u00f1\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0003\u0016\u000b\u0000\u00cc\u00cd\u0005:\u0000"+
		"\u0000\u00cd\u00f1\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003\u0016\u000b"+
		"\u0000\u00cf\u00d0\u0005;\u0000\u0000\u00d0\u00f1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0003\u0016\u000b\u0000\u00d2\u00d3\u0005/\u0000\u0000\u00d3"+
		"\u00d5\u0005<\u0000\u0000\u00d4\u00d6\u0005A\u0000\u0000\u00d5\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d9\u0003D\"\u0000\u00d8\u00da\u0005A\u0000"+
		"\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0005=\u0000\u0000"+
		"\u00dc\u00f1\u0001\u0000\u0000\u0000\u00dd\u00de\u0003\u0016\u000b\u0000"+
		"\u00de\u00df\u0005/\u0000\u0000\u00df\u00e0\u0005?\u0000\u0000\u00e0\u00e1"+
		"\u0003D\"\u0000\u00e1\u00f1\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003"+
		"\u0016\u000b\u0000\u00e3\u00e4\u0005/\u0000\u0000\u00e4\u00e5\u0005>\u0000"+
		"\u0000\u00e5\u00e6\u0003D\"\u0000\u00e6\u00f1\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0003\u0016\u000b\u0000\u00e8\u00e9\u0005/\u0000\u0000\u00e9"+
		"\u00ea\u0005@\u0000\u0000\u00ea\u00eb\u0003D\"\u0000\u00eb\u00f1\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0003\u0016\u000b\u0000\u00ed\u00ee\u0005"+
		"/\u0000\u0000\u00ee\u00ef\u0003D\"\u0000\u00ef\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f0\u00bd\u0001\u0000\u0000\u0000\u00f0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00f0\u00c6\u0001\u0000\u0000\u0000\u00f0\u00cb\u0001\u0000\u0000"+
		"\u0000\u00f0\u00ce\u0001\u0000\u0000\u0000\u00f0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00f0\u00dd\u0001\u0000\u0000\u0000\u00f0\u00e2\u0001\u0000\u0000"+
		"\u0000\u00f0\u00e7\u0001\u0000\u0000\u0000\u00f0\u00ec\u0001\u0000\u0000"+
		"\u0000\u00f1\u0015\u0001\u0000\u0000\u0000\u00f2\u00fb\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f5\u0005(\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fb\u0003\u0018\f\u0000\u00fa"+
		"\u00f2\u0001\u0000\u0000\u0000\u00fa\u00f6\u0001\u0000\u0000\u0000\u00fb"+
		"\u0017\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005D\u0000\u0000\u00fd\u00fe"+
		"\u0005\u0017\u0000\u0000\u00fe\u0104\u0003\u0018\f\u0000\u00ff\u0100\u0007"+
		"\u0000\u0000\u0000\u0100\u0101\u0005\u0014\u0000\u0000\u0101\u0104\u0003"+
		"\u0018\f\u0000\u0102\u0104\u0005D\u0000\u0000\u0103\u00fc\u0001\u0000"+
		"\u0000\u0000\u0103\u00ff\u0001\u0000\u0000\u0000\u0103\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0019\u0001\u0000\u0000\u0000\u0105\u0106\u0005\u001c"+
		"\u0000\u0000\u0106\u0109\u0003\u0016\u000b\u0000\u0107\u0108\u0005\u001d"+
		"\u0000\u0000\u0108\u010a\u0003D\"\u0000\u0109\u0107\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u001b\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0005\u001b\u0000\u0000\u010c\u010f\u0003\u0016\u000b"+
		"\u0000\u010d\u010e\u0005\u001d\u0000\u0000\u010e\u0110\u0003D\"\u0000"+
		"\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000"+
		"\u0110\u001d\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0005\u0000\u0000"+
		"\u0112\u0118\u0003X,\u0000\u0113\u0114\u0003Z-\u0000\u0114\u0115\u0005"+
		"D\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0113\u0001\u0000"+
		"\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u001f\u0001\u0000"+
		"\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011c\u0005\u0006"+
		"\u0000\u0000\u011c\u011d\u0005D\u0000\u0000\u011d\u011f\u0005A\u0000\u0000"+
		"\u011e\u0120\u0003\"\u0011\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0001\u0000\u0000\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121"+
		"\u0123\u0003$\u0012\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0001\u0000\u0000\u0000\u0123\u0127\u0001\u0000\u0000\u0000\u0124\u0126"+
		"\u0003\b\u0004\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126\u0129\u0001"+
		"\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001"+
		"\u0000\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129\u0127\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0005\u001a\u0000\u0000\u012b!\u0001\u0000"+
		"\u0000\u0000\u012c\u012d\u00038\u001c\u0000\u012d\u012e\u0005A\u0000\u0000"+
		"\u012e#\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u001e\u0000\u0000\u0130"+
		"\u0136\u0003:\u001d\u0000\u0131\u0132\u0003Z-\u0000\u0132\u0133\u0003"+
		":\u001d\u0000\u0133\u0135\u0001\u0000\u0000\u0000\u0134\u0131\u0001\u0000"+
		"\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0139\u0001\u0000"+
		"\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013a\u0005A\u0000"+
		"\u0000\u013a%\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u0015\u0000\u0000"+
		"\u013c\u013d\u0005A\u0000\u0000\u013d\u013e\u0005D\u0000\u0000\u013e\u0142"+
		"\u0005A\u0000\u0000\u013f\u0141\u0003\b\u0004\u0000\u0140\u013f\u0001"+
		"\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001"+
		"\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0145\u0001"+
		"\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0146\u0005"+
		"\u0016\u0000\u0000\u0146\'\u0001\u0000\u0000\u0000\u0147\u0148\u0005\u001f"+
		"\u0000\u0000\u0148\u0149\u0003F#\u0000\u0149\u014d\u0005A\u0000\u0000"+
		"\u014a\u014c\u0003\b\u0004\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c"+
		"\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000\u014f"+
		"\u014d\u0001\u0000\u0000\u0000\u0150\u0151\u0005 \u0000\u0000\u0151)\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0005!\u0000\u0000\u0153\u0154\u0003F#"+
		"\u0000\u0154\u0158\u0005A\u0000\u0000\u0155\u0157\u0003\b\u0004\u0000"+
		"\u0156\u0155\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000"+
		"\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000"+
		"\u0159\u015d\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000"+
		"\u015b\u015e\u0003,\u0016\u0000\u015c\u015e\u0003.\u0017\u0000\u015d\u015b"+
		"\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0005\"\u0000\u0000\u0160+\u0001\u0000\u0000\u0000\u0161\u0162\u0005"+
		"#\u0000\u0000\u0162\u0163\u0003F#\u0000\u0163\u0167\u0005A\u0000\u0000"+
		"\u0164\u0166\u0003\b\u0004\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0166"+
		"\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0001\u0000\u0000\u0000\u0168\u016c\u0001\u0000\u0000\u0000\u0169"+
		"\u0167\u0001\u0000\u0000\u0000\u016a\u016d\u0003,\u0016\u0000\u016b\u016d"+
		"\u0003.\u0017\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016b\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d-\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0005$\u0000\u0000\u016f\u0173\u0005A\u0000\u0000"+
		"\u0170\u0172\u0003\b\u0004\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172"+
		"\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u0174/\u0001\u0000\u0000\u0000\u0175\u0173"+
		"\u0001\u0000\u0000\u0000\u0176\u017a\u00032\u0019\u0000\u0177\u017a\u0003"+
		"4\u001a\u0000\u0178\u017a\u00036\u001b\u0000\u0179\u0176\u0001\u0000\u0000"+
		"\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u0178\u0001\u0000\u0000"+
		"\u0000\u017a1\u0001\u0000\u0000\u0000\u017b\u017c\u00034\u001a\u0000\u017c"+
		"\u017d\u0005\u0013\u0000\u0000\u017d\u018b\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u00034\u001a\u0000\u017f\u0180\u0005\u0012\u0000\u0000\u0180\u0181"+
		"\u0003F#\u0000\u0181\u018b\u0001\u0000\u0000\u0000\u0182\u0183\u0005\u000f"+
		"\u0000\u0000\u0183\u0184\u0005\u0012\u0000\u0000\u0184\u0185\u0003F#\u0000"+
		"\u0185\u0186\u0003X,\u0000\u0186\u018b\u0001\u0000\u0000\u0000\u0187\u0188"+
		"\u0005\u000f\u0000\u0000\u0188\u0189\u0005\u0013\u0000\u0000\u0189\u018b"+
		"\u0003X,\u0000\u018a\u017b\u0001\u0000\u0000\u0000\u018a\u017e\u0001\u0000"+
		"\u0000\u0000\u018a\u0182\u0001\u0000\u0000\u0000\u018a\u0187\u0001\u0000"+
		"\u0000\u0000\u018b3\u0001\u0000\u0000\u0000\u018c\u018d\u0007\u0001\u0000"+
		"\u0000\u018d5\u0001\u0000\u0000\u0000\u018e\u018f\u0005\u000f\u0000\u0000"+
		"\u018f\u0190\u0003X,\u0000\u01907\u0001\u0000\u0000\u0000\u0191\u0192"+
		"\u0003<\u001e\u0000\u0192\u0193\u0005D\u0000\u0000\u0193\u0194\u0005/"+
		"\u0000\u0000\u0194\u0195\u0003D\"\u0000\u0195\u019f\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0003<\u001e\u0000\u0197\u0198\u0005D\u0000\u0000\u0198"+
		"\u0199\u0005/\u0000\u0000\u0199\u019a\u0003\u001a\r\u0000\u019a\u019f"+
		"\u0001\u0000\u0000\u0000\u019b\u019c\u0003<\u001e\u0000\u019c\u019d\u0005"+
		"D\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u0191\u0001\u0000"+
		"\u0000\u0000\u019e\u0196\u0001\u0000\u0000\u0000\u019e\u019b\u0001\u0000"+
		"\u0000\u0000\u019f9\u0001\u0000\u0000\u0000\u01a0\u01a1\u0003<\u001e\u0000"+
		"\u01a1\u01a2\u0005\u0011\u0000\u0000\u01a2\u01a3\u0005D\u0000\u0000\u01a3"+
		"\u01a8\u0001\u0000\u0000\u0000\u01a4\u01a5\u0003<\u001e\u0000\u01a5\u01a6"+
		"\u0005D\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a4\u0001\u0000\u0000\u0000\u01a8;\u0001\u0000"+
		"\u0000\u0000\u01a9\u01ad\u0003>\u001f\u0000\u01aa\u01ad\u0003@ \u0000"+
		"\u01ab\u01ad\u0003B!\u0000\u01ac\u01a9\u0001\u0000\u0000\u0000\u01ac\u01aa"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad=\u0001"+
		"\u0000\u0000\u0000\u01ae\u01af\u0003@ \u0000\u01af\u01b0\u0005\u0013\u0000"+
		"\u0000\u01b0\u01be\u0001\u0000\u0000\u0000\u01b1\u01b2\u0003@ \u0000\u01b2"+
		"\u01b3\u0005\u0012\u0000\u0000\u01b3\u01b4\u0003F#\u0000\u01b4\u01be\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b6\u0005\u0010\u0000\u0000\u01b6\u01b7\u0005"+
		"\u0012\u0000\u0000\u01b7\u01b8\u0003F#\u0000\u01b8\u01b9\u0003X,\u0000"+
		"\u01b9\u01be\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005\u0010\u0000\u0000"+
		"\u01bb\u01bc\u0005\u0013\u0000\u0000\u01bc\u01be\u0003X,\u0000\u01bd\u01ae"+
		"\u0001\u0000\u0000\u0000\u01bd\u01b1\u0001\u0000\u0000\u0000\u01bd\u01b5"+
		"\u0001\u0000\u0000\u0000\u01bd\u01ba\u0001\u0000\u0000\u0000\u01be?\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c0\u0007\u0002\u0000\u0000\u01c0A\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c2\u0005\u0010\u0000\u0000\u01c2\u01c3\u0003X,\u0000"+
		"\u01c3C\u0001\u0000\u0000\u0000\u01c4\u01ca\u0003F#\u0000\u01c5\u01c6"+
		"\u0003Z-\u0000\u01c6\u01c7\u0003F#\u0000\u01c7\u01c9\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c5\u0001\u0000\u0000\u0000\u01c9\u01cc\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cbE\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000"+
		"\u01cd\u01d5\u0003H$\u0000\u01ce\u01d0\u0005A\u0000\u0000\u01cf\u01ce"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d2\u00057\u0000\u0000\u01d2\u01d4\u0003"+
		"H$\u0000\u01d3\u01cf\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d6G\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d8\u01e0\u0003J%\u0000\u01d9\u01db\u0005A\u0000\u0000\u01da\u01d9"+
		"\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dc"+
		"\u0001\u0000\u0000\u0000\u01dc\u01dd\u00056\u0000\u0000\u01dd\u01df\u0003"+
		"J%\u0000\u01de\u01da\u0001\u0000\u0000\u0000\u01df\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e1I\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e4\u00058\u0000\u0000\u01e4\u01e7\u0003J%\u0000\u01e5\u01e7"+
		"\u0003L&\u0000\u01e6\u01e3\u0001\u0000\u0000\u0000\u01e6\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e7K\u0001\u0000\u0000\u0000\u01e8\u01e9\u0003N\'\u0000"+
		"\u01e9\u01ea\u00050\u0000\u0000\u01ea\u01eb\u0003N\'\u0000\u01eb\u0202"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ed\u0003N\'\u0000\u01ed\u01ee\u0005"+
		"1\u0000\u0000\u01ee\u01ef\u0003N\'\u0000\u01ef\u0202\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f1\u0003N\'\u0000\u01f1\u01f2\u00052\u0000\u0000\u01f2"+
		"\u01f3\u0003N\'\u0000\u01f3\u0202\u0001\u0000\u0000\u0000\u01f4\u01f5"+
		"\u0003N\'\u0000\u01f5\u01f6\u00053\u0000\u0000\u01f6\u01f7\u0003N\'\u0000"+
		"\u01f7\u0202\u0001\u0000\u0000\u0000\u01f8\u01f9\u0003N\'\u0000\u01f9"+
		"\u01fa\u00054\u0000\u0000\u01fa\u01fb\u0003N\'\u0000\u01fb\u0202\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fd\u0003N\'\u0000\u01fd\u01fe\u00055\u0000"+
		"\u0000\u01fe\u01ff\u0003N\'\u0000\u01ff\u0202\u0001\u0000\u0000\u0000"+
		"\u0200\u0202\u0003N\'\u0000\u0201\u01e8\u0001\u0000\u0000\u0000\u0201"+
		"\u01ec\u0001\u0000\u0000\u0000\u0201\u01f0\u0001\u0000\u0000\u0000\u0201"+
		"\u01f4\u0001\u0000\u0000\u0000\u0201\u01f8\u0001\u0000\u0000\u0000\u0201"+
		"\u01fc\u0001\u0000\u0000\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0202"+
		"M\u0001\u0000\u0000\u0000\u0203\u0204\u0006\'\uffff\uffff\u0000\u0204"+
		"\u0205\u0003P(\u0000\u0205\u020b\u0001\u0000\u0000\u0000\u0206\u0207\n"+
		"\u0002\u0000\u0000\u0207\u0208\u00059\u0000\u0000\u0208\u020a\u0003P("+
		"\u0000\u0209\u0206\u0001\u0000\u0000\u0000\u020a\u020d\u0001\u0000\u0000"+
		"\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000"+
		"\u0000\u020cO\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000"+
		"\u020e\u020f\u0006(\uffff\uffff\u0000\u020f\u0210\u0003R)\u0000\u0210"+
		"\u0221\u0001\u0000\u0000\u0000\u0211\u0212\n\u0003\u0000\u0000\u0212\u0214"+
		"\u0005<\u0000\u0000\u0213\u0215\u0005A\u0000\u0000\u0214\u0213\u0001\u0000"+
		"\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000"+
		"\u0000\u0000\u0216\u0218\u0003D\"\u0000\u0217\u0219\u0005A\u0000\u0000"+
		"\u0218\u0217\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000"+
		"\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021b\u0005=\u0000\u0000\u021b"+
		"\u0220\u0001\u0000\u0000\u0000\u021c\u021d\n\u0002\u0000\u0000\u021d\u021e"+
		"\u0005@\u0000\u0000\u021e\u0220\u0003R)\u0000\u021f\u0211\u0001\u0000"+
		"\u0000\u0000\u021f\u021c\u0001\u0000\u0000\u0000\u0220\u0223\u0001\u0000"+
		"\u0000\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000"+
		"\u0000\u0000\u0222Q\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000"+
		"\u0000\u0224\u0225\u0005>\u0000\u0000\u0225\u022a\u0003R)\u0000\u0226"+
		"\u0227\u0005?\u0000\u0000\u0227\u022a\u0003R)\u0000\u0228\u022a\u0003"+
		"T*\u0000\u0229\u0224\u0001\u0000\u0000\u0000\u0229\u0226\u0001\u0000\u0000"+
		"\u0000\u0229\u0228\u0001\u0000\u0000\u0000\u022aS\u0001\u0000\u0000\u0000"+
		"\u022b\u0239\u0003\u0016\u000b\u0000\u022c\u0239\u0003V+\u0000\u022d\u022f"+
		"\u0005%\u0000\u0000\u022e\u0230\u0005A\u0000\u0000\u022f\u022e\u0001\u0000"+
		"\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000"+
		"\u0000\u0000\u0231\u0232\u0003D\"\u0000\u0232\u0233\u0005&\u0000\u0000"+
		"\u0233\u0239\u0001\u0000\u0000\u0000\u0234\u0235\u0005\'\u0000\u0000\u0235"+
		"\u0236\u00030\u0018\u0000\u0236\u0237\u0003T*\u0000\u0237\u0239\u0001"+
		"\u0000\u0000\u0000\u0238\u022b\u0001\u0000\u0000\u0000\u0238\u022c\u0001"+
		"\u0000\u0000\u0000\u0238\u022d\u0001\u0000\u0000\u0000\u0238\u0234\u0001"+
		"\u0000\u0000\u0000\u0239U\u0001\u0000\u0000\u0000\u023a\u023b\u0007\u0003"+
		"\u0000\u0000\u023bW\u0001\u0000\u0000\u0000\u023c\u023f\u0005D\u0000\u0000"+
		"\u023d\u023e\u0005\u0017\u0000\u0000\u023e\u0240\u0003X,\u0000\u023f\u023d"+
		"\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240Y\u0001"+
		"\u0000\u0000\u0000\u0241\u0246\u0005.\u0000\u0000\u0242\u0246\u0005-\u0000"+
		"\u0000\u0243\u0244\u0005A\u0000\u0000\u0244\u0246\u0005-\u0000\u0000\u0245"+
		"\u0241\u0001\u0000\u0000\u0000\u0245\u0242\u0001\u0000\u0000\u0000\u0245"+
		"\u0243\u0001\u0000\u0000\u0000\u0246[\u0001\u0000\u0000\u00007_dkoty\u0081"+
		"\u0089\u0092\u009a\u00a0\u00bb\u00d5\u00d9\u00f0\u00f6\u00fa\u0103\u0109"+
		"\u010f\u0118\u011f\u0122\u0127\u0136\u0142\u014d\u0158\u015d\u0167\u016c"+
		"\u0173\u0179\u018a\u019e\u01a7\u01ac\u01bd\u01ca\u01cf\u01d5\u01da\u01e0"+
		"\u01e6\u0201\u020b\u0214\u0218\u021f\u0221\u0229\u022f\u0238\u023f\u0245";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}