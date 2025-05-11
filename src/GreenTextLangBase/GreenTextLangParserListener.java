// Generated from D:/mateusz/studia/4_semestr/Kompilatory/GTL/GreenTextLangParser.g4 by ANTLR 4.13.2
package GreenTextLangBase;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GreenTextLangParser}.
 */
public interface GreenTextLangParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GreenTextLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GreenTextLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#code_blocks}.
	 * @param ctx the parse tree
	 */
	void enterCode_blocks(GreenTextLangParser.Code_blocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#code_blocks}.
	 * @param ctx the parse tree
	 */
	void exitCode_blocks(GreenTextLangParser.Code_blocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(GreenTextLangParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(GreenTextLangParser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GreenTextLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GreenTextLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#statement_newline}.
	 * @param ctx the parse tree
	 */
	void enterStatement_newline(GreenTextLangParser.Statement_newlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#statement_newline}.
	 * @param ctx the parse tree
	 */
	void exitStatement_newline(GreenTextLangParser.Statement_newlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(GreenTextLangParser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(GreenTextLangParser.Simple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(GreenTextLangParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(GreenTextLangParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#spit}.
	 * @param ctx the parse tree
	 */
	void enterSpit(GreenTextLangParser.SpitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#spit}.
	 * @param ctx the parse tree
	 */
	void exitSpit(GreenTextLangParser.SpitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#swallow}.
	 * @param ctx the parse tree
	 */
	void enterSwallow(GreenTextLangParser.SwallowContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#swallow}.
	 * @param ctx the parse tree
	 */
	void exitSwallow(GreenTextLangParser.SwallowContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(GreenTextLangParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(GreenTextLangParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariable_assignment(GreenTextLangParser.Variable_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariable_assignment(GreenTextLangParser.Variable_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#parent_variable}.
	 * @param ctx the parse tree
	 */
	void enterParent_variable(GreenTextLangParser.Parent_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#parent_variable}.
	 * @param ctx the parse tree
	 */
	void exitParent_variable(GreenTextLangParser.Parent_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GreenTextLangParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GreenTextLangParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#function_call_ing}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_ing(GreenTextLangParser.Function_call_ingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#function_call_ing}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_ing(GreenTextLangParser.Function_call_ingContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(GreenTextLangParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(GreenTextLangParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#invite}.
	 * @param ctx the parse tree
	 */
	void enterInvite(GreenTextLangParser.InviteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#invite}.
	 * @param ctx the parse tree
	 */
	void exitInvite(GreenTextLangParser.InviteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(GreenTextLangParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(GreenTextLangParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#function_return}.
	 * @param ctx the parse tree
	 */
	void enterFunction_return(GreenTextLangParser.Function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#function_return}.
	 * @param ctx the parse tree
	 */
	void exitFunction_return(GreenTextLangParser.Function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void enterFunction_arguments(GreenTextLangParser.Function_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void exitFunction_arguments(GreenTextLangParser.Function_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(GreenTextLangParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(GreenTextLangParser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#loop_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLoop_declaration(GreenTextLangParser.Loop_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#loop_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLoop_declaration(GreenTextLangParser.Loop_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#if_declaration}.
	 * @param ctx the parse tree
	 */
	void enterIf_declaration(GreenTextLangParser.If_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#if_declaration}.
	 * @param ctx the parse tree
	 */
	void exitIf_declaration(GreenTextLangParser.If_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#or_statement}.
	 * @param ctx the parse tree
	 */
	void enterOr_statement(GreenTextLangParser.Or_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#or_statement}.
	 * @param ctx the parse tree
	 */
	void exitOr_statement(GreenTextLangParser.Or_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#or_not_statement}.
	 * @param ctx the parse tree
	 */
	void enterOr_not_statement(GreenTextLangParser.Or_not_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#or_not_statement}.
	 * @param ctx the parse tree
	 */
	void exitOr_not_statement(GreenTextLangParser.Or_not_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GreenTextLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GreenTextLangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#complex_type}.
	 * @param ctx the parse tree
	 */
	void enterComplex_type(GreenTextLangParser.Complex_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#complex_type}.
	 * @param ctx the parse tree
	 */
	void exitComplex_type(GreenTextLangParser.Complex_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_type(GreenTextLangParser.Primitive_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_type(GreenTextLangParser.Primitive_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#struct_type}.
	 * @param ctx the parse tree
	 */
	void enterStruct_type(GreenTextLangParser.Struct_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#struct_type}.
	 * @param ctx the parse tree
	 */
	void exitStruct_type(GreenTextLangParser.Struct_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#variable_declaration_ing_without_elses}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_ing_without_elses(GreenTextLangParser.Variable_declaration_ing_without_elsesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#variable_declaration_ing_without_elses}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_ing_without_elses(GreenTextLangParser.Variable_declaration_ing_without_elsesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#variable_declaration_ing}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_ing(GreenTextLangParser.Variable_declaration_ingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#variable_declaration_ing}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_ing(GreenTextLangParser.Variable_declaration_ingContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#type_ing}.
	 * @param ctx the parse tree
	 */
	void enterType_ing(GreenTextLangParser.Type_ingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#type_ing}.
	 * @param ctx the parse tree
	 */
	void exitType_ing(GreenTextLangParser.Type_ingContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#complex_type_ing}.
	 * @param ctx the parse tree
	 */
	void enterComplex_type_ing(GreenTextLangParser.Complex_type_ingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#complex_type_ing}.
	 * @param ctx the parse tree
	 */
	void exitComplex_type_ing(GreenTextLangParser.Complex_type_ingContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#primitive_type_ing}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_type_ing(GreenTextLangParser.Primitive_type_ingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#primitive_type_ing}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_type_ing(GreenTextLangParser.Primitive_type_ingContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#struct_type_ing}.
	 * @param ctx the parse tree
	 */
	void enterStruct_type_ing(GreenTextLangParser.Struct_type_ingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#struct_type_ing}.
	 * @param ctx the parse tree
	 */
	void exitStruct_type_ing(GreenTextLangParser.Struct_type_ingContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(GreenTextLangParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(GreenTextLangParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GreenTextLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GreenTextLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#also}.
	 * @param ctx the parse tree
	 */
	void enterAlso(GreenTextLangParser.AlsoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#also}.
	 * @param ctx the parse tree
	 */
	void exitAlso(GreenTextLangParser.AlsoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#inversion}.
	 * @param ctx the parse tree
	 */
	void enterInversion(GreenTextLangParser.InversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#inversion}.
	 * @param ctx the parse tree
	 */
	void exitInversion(GreenTextLangParser.InversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(GreenTextLangParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(GreenTextLangParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(GreenTextLangParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(GreenTextLangParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GreenTextLangParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GreenTextLangParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(GreenTextLangParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(GreenTextLangParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(GreenTextLangParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(GreenTextLangParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GreenTextLangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GreenTextLangParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#nested_name}.
	 * @param ctx the parse tree
	 */
	void enterNested_name(GreenTextLangParser.Nested_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#nested_name}.
	 * @param ctx the parse tree
	 */
	void exitNested_name(GreenTextLangParser.Nested_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenTextLangParser#separator}.
	 * @param ctx the parse tree
	 */
	void enterSeparator(GreenTextLangParser.SeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenTextLangParser#separator}.
	 * @param ctx the parse tree
	 */
	void exitSeparator(GreenTextLangParser.SeparatorContext ctx);
}