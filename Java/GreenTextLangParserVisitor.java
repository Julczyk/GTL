// Generated from D:/mateusz/studia/4_semestr/Kompilatory/GTL/GreenTextLangParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GreenTextLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GreenTextLangParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GreenTextLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#code_blocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_blocks(GreenTextLangParser.Code_blocksContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(GreenTextLangParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GreenTextLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#statement_newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_newline(GreenTextLangParser.Statement_newlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_statement(GreenTextLangParser.Simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(GreenTextLangParser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#spit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpit(GreenTextLangParser.SpitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#swallow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwallow(GreenTextLangParser.SwallowContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(GreenTextLangParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#variable_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_assignment(GreenTextLangParser.Variable_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GreenTextLangParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(GreenTextLangParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GreenTextLangParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#invite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvite(GreenTextLangParser.InviteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(GreenTextLangParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(GreenTextLangParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_return(GreenTextLangParser.Function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#function_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_arguments(GreenTextLangParser.Function_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#variable_declaration_ing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration_ing(GreenTextLangParser.Variable_declaration_ingContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#type_ing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_ing(GreenTextLangParser.Type_ingContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#complex_type_ing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_type_ing(GreenTextLangParser.Complex_type_ingContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#primitive_type_ing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_type_ing(GreenTextLangParser.Primitive_type_ingContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#struct_type_ing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_type_ing(GreenTextLangParser.Struct_type_ingContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(GreenTextLangParser.Struct_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#struct_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_name(GreenTextLangParser.Struct_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#loop_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_declaration(GreenTextLangParser.Loop_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#if_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_declaration(GreenTextLangParser.If_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#or_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_statement(GreenTextLangParser.Or_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#or_not_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_not_statement(GreenTextLangParser.Or_not_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GreenTextLangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#complex_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_type(GreenTextLangParser.Complex_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_type(GreenTextLangParser.Primitive_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#struct_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_type(GreenTextLangParser.Struct_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(GreenTextLangParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GreenTextLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#bool_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expression(GreenTextLangParser.Bool_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#math_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expression(GreenTextLangParser.Math_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#math_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_literal(GreenTextLangParser.Math_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenTextLangParser#separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparator(GreenTextLangParser.SeparatorContext ctx);
}