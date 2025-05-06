import Exceptions.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.nio.file.Path;
import java.util.*; // For Stack and Set

public class GreenTextLangListenerImpl extends GreenTextLangParserBaseListener {
    //This is the main structure checking for variable redeclaration
    private Stack<Set<String>> variableScopes = new Stack<>();

    // For error reporting location (optional if not throwing new SyntaxExceptions from listener)
    private final Path filePath;
    private final String sourceInput;

    public GreenTextLangListenerImpl(Path filePath, String sourceInput) {
        this.filePath = filePath; // Used for context in exceptions
        this.sourceInput = sourceInput; // Used for context in exceptions
    }

    private void addLocationToException(InterpreterException ex, ParserRuleContext ctx) {
        if (ctx != null && ctx.getStart() != null) {
            ex.setLocation(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
        }
    }

    @Override
    public void enterProgram(GreenTextLangParser.ProgramContext ctx) {
        variableScopes.clear();
        variableScopes.push(new HashSet<>()); // Initialize global scope
    }

    // Helper method to check for redeclaration and add variable
    private void checkAndAddVariable(String varName, ParserRuleContext ctx) {
        // Check all scopes in the stack for prior declaration
        for (Set<String> scope : variableScopes) {
            if (scope.contains(varName)) {
                RedeclarationException ex = new RedeclarationException(
                        "Bro, you already saw '" + varName + "'. You can't tell me that over and over. ",
                        "Variable '" + varName + "' has already been declared in this or an enclosing scope."
                );
                addLocationToException(ex, ctx);
                throw ex;
            }
        }
        // Add to the current (top-most) scope
        if (!variableScopes.isEmpty()) {
            variableScopes.peek().add(varName);
        } else {
            // This case should ideally not be reached if enterProgram initializes the stack.
            // It's a safeguard or indicates a logic error elsewhere.
            System.err.println("CRITICAL ERROR: variableScopes stack was empty during declaration of '" + varName + "'. Re-initializing global scope.");
            variableScopes.push(new HashSet<>());
            variableScopes.peek().add(varName);
        }
    }

    // --- Scope Pushing Methods ---
    @Override
    public void enterFunction_declaration(GreenTextLangParser.Function_declarationContext ctx) {
        // Note: Function names themselves might be checked for redeclaration in a global function registry,
        // this listener focuses on variable scopes *within* constructs.
        variableScopes.push(new HashSet<>());
        // Function parameters defined in function_arguments will be added to this new scope
        // when their respective enterVariable_declaration_ing methods are called.
    }

    @Override
    public void enterStruct_declaration(GreenTextLangParser.Struct_declarationContext ctx) {
        variableScopes.push(new HashSet<>());
        // Struct member declarations would be handled within their rules, adding to this new scope.
    }

    @Override
    public void enterLoop_declaration(GreenTextLangParser.Loop_declarationContext ctx) {
        variableScopes.push(new HashSet<>());
    }

    @Override
    public void enterIf_declaration(GreenTextLangParser.If_declarationContext ctx) {
        variableScopes.push(new HashSet<>());
    }

    @Override
    public void enterOr_statement(GreenTextLangParser.Or_statementContext ctx) {
        variableScopes.push(new HashSet<>()); // Each 'or' branch creates a new scope
    }

    @Override
    public void enterOr_not_statement(GreenTextLangParser.Or_not_statementContext ctx) {
        variableScopes.push(new HashSet<>()); // The 'or not' branch creates a new scope
    }

    // --- Scope Popping Methods ---
    @Override
    public void exitFunction_declaration(GreenTextLangParser.Function_declarationContext ctx) {
        if (!variableScopes.isEmpty()) {
            variableScopes.pop();
        }
    }

    @Override
    public void exitStruct_declaration(GreenTextLangParser.Struct_declarationContext ctx) {
        if (!variableScopes.isEmpty()) {
            variableScopes.pop();
        }
    }

    @Override
    public void exitLoop_declaration(GreenTextLangParser.Loop_declarationContext ctx) {
        if (!variableScopes.isEmpty()) {
            variableScopes.pop();
        }
    }

    @Override
    public void exitIf_declaration(GreenTextLangParser.If_declarationContext ctx) {
        if (!variableScopes.isEmpty()) {
            variableScopes.pop();
        }
    }

    @Override
    public void exitOr_statement(GreenTextLangParser.Or_statementContext ctx) {
        if (!variableScopes.isEmpty()) {
            variableScopes.pop();
        }
    }

    @Override
    public void exitOr_not_statement(GreenTextLangParser.Or_not_statementContext ctx) {
        if (!variableScopes.isEmpty()) {
            variableScopes.pop();
        }
    }
    @Override
    public void enterVariable_declaration(GreenTextLangParser.Variable_declarationContext ctx) {
        if (ctx.NAME() != null) {
            String varName = ctx.NAME().getText();
            checkAndAddVariable(varName, ctx);
        }
    }

    @Override
    public void enterVariable_declaration_ing(GreenTextLangParser.Variable_declaration_ingContext ctx) {
        if (ctx.NAME() != null) {
            String varName = ctx.NAME().getText();
            checkAndAddVariable(varName, ctx);
        }
    }

    @Override
    public void enterVariable_declaration_ing_without_elses(GreenTextLangParser.Variable_declaration_ing_without_elsesContext ctx) {
        // Typically for function return "variable" names.
        if (ctx.NAME() != null) {
            String varName = ctx.NAME().getText();
            checkAndAddVariable(varName, ctx);
        }
    }

    // --- Empty Line Handling ---
    @Override
    public void enterStatement_newline(GreenTextLangParser.Statement_newlineContext ctx) {
        // This rule has two alternatives:
        // 1. (compound_statement | simple_statement) NEWLINE
        // 2. NEWLINE (this is the "empty line statement")
        // If simple_statement and compound_statement are null, it means the second alternative was matched.
        if (ctx.simple_statement() == null && ctx.compound_statement() == null && ctx.NEWLINE() != null) {
            System.err.println("DEBUG: Empty line statement encountered at line " +
                    ctx.NEWLINE().getSymbol().getLine() +
                    ". Clearing all variable scopes.");
            variableScopes.clear();
            variableScopes.push(new HashSet<>()); // Re-initialize with a new global scope
        }
    }

    // Other listener methods (e.g., for expression evaluation, spit, etc.) would be added here
    // if the goal was full interpretation. For this task, we focus on scope and redeclaration.
}