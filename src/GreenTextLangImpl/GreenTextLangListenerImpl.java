package GreenTextLangImpl;

import Exceptions.*;
import GreenTextLangBase.GreenTextLangParser;
import GreenTextLangBase.GreenTextLangParserBaseListener;
import Memory.Identifier;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Pair;

import java.io.PrintStream;
import java.nio.file.Path;
import java.util.*; // For Stack and Set

public class GreenTextLangListenerImpl extends GreenTextLangParserBaseListener {
    //This is the main structure checking for variable redeclaration
    //private Set<String> globalScope = new HashSet<>();
    public Stack<Map<Identifier, Pair<Integer, Integer>>> localScope = new Stack<>(); // working memory, available scopes
    public Map<Identifier, Pair<Integer, Integer>> globalScope = new HashMap<>();  // global statements

    // For error reporting location (optional if not throwing new SyntaxExceptions from listener)
    private final Path filePath;
    private final String sourceInput;
    PrintStream err;

    public GreenTextLangListenerImpl(Path filePath, String sourceInput, PrintStream err) {
        this.filePath = filePath; // Used for context in exceptions
        this.sourceInput = sourceInput; // Used for context in exceptions
        this.err = err;
    }

    private void addLocationToException(InterpreterException ex, ParserRuleContext ctx) {
        if (ctx != null && ctx.getStart() != null) {
            ex.setLocation(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), filePath);
        }
    }

    Pair<Integer, Integer> getLocation(ParserRuleContext ctx) {
        if (ctx != null && ctx.getStart() != null) {
            return new Pair<>(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
        } else {
            return new Pair<>(-1, -1); // Default or error location
        }
    }
    String locationof(Identifier ID, Map<Identifier, Pair<Integer, Integer>> scope) {
        if (scope.containsKey(ID)) {
            Pair<Integer, Integer> loc = scope.get(ID);
            return "[" + loc.a + ",  " + loc.b + "]";
        } else {
            return "Unknown location";
        }
    }
    private boolean isGlobal() {return localScope.size() <= 1;}

    private void beginScope() {
            localScope.push(new HashMap<>());
    }

    private void endScope() {
        if (localScope.isEmpty()) {
            err.println("CRITICAL ERROR: variableScopes stack was empty when exiting scope.");
        } else {
            localScope.pop();
        }
    }

    // Helper method to check for redeclaration and add variable
    private void checkAndAddVariable(String varName, ParserRuleContext ctx) {
        // Check only top scope in the stack for prior declaration
        var scope = localScope.peek();
        var varID = new Identifier(varName);
        if (scope.containsKey(varID)) {
            var ex = new RedeclarationException(
                    "Bro, you already saw '" + varName + "' at " + locationof(varID, scope) +". You can't tell me that over and over. ",
                    "Variable '" + varName + "' has already at " + locationof(varID, scope) + " been declared in this or an enclosing scope."
            );
            addLocationToException(ex, ctx);
            throw ex;
        }

        // Add to the current (top-most) scope
        if (!localScope.isEmpty()) {
            localScope.peek().put(varID, getLocation(ctx));
        } else {
            // This case should ideally not be reached if enterProgram initializes the stack.
            // It's a safeguard or indicates a logic error elsewhere.
            err.println("CRITICAL ERROR: variableScopes stack was empty during declaration of '" + varName + "'. Re-initializing global scope.");
            beginScope();
        }
    }

    private void checkAndAddFunction(Identifier funcId, ParserRuleContext ctx) {
        // Check only top scope in the stack for prior declaration
        // LEGACY: var func = new Pair<>(funcName, types);
        var scope = localScope.peek();
        //Identifier funcId = new Identifier(funcName, types);
        if (scope.containsKey(funcId)) {
            RedeclarationException ex = new RedeclarationException(
                    "Bro, you already ARE here, '" + funcId.toMemeString() + "' at " + locationof(funcId, scope) + ". Stop cloning urselfffff.",
                    "Function '" + funcId.toString() + "'has already been declared in this scope at " + locationof(funcId, scope) + "."
            );
            addLocationToException(ex, ctx);
            throw ex;
        }
        // Add function
        if (isGlobal()) {
            if (globalScope.containsKey(funcId)) {
                RedeclarationException ex = new RedeclarationException(
                        "Bro, you already ARE EVERYWHERE, '" + funcId.toMemeString() + "' at " + locationof(funcId, scope) + ". Stop cloning urselfffff.",
                        "Function '" + funcId.toString() + "'has already been declared in global scope at " + locationof(funcId, scope) + "."
                );
                addLocationToException(ex, ctx);
                throw ex;
            }
            //global
            globalScope.put(funcId, getLocation(ctx));
        } else {
            //local
            localScope.peek().put(funcId, getLocation(ctx));
        }
    }

    @Override
    public void enterProgram(GreenTextLangParser.ProgramContext ctx) {
        // Initialize the global scope
        globalScope = new HashMap<>();
    }

    @Override
    public void exitProgram(GreenTextLangParser.ProgramContext ctx) {
        // Clean up the global scope
        // clear list of global functions
        globalScope.clear();
    }

    @Override
    public void enterCode_block(GreenTextLangParser.Code_blockContext ctx) {
        beginScope();
    }

    @Override
    public void exitCode_block(GreenTextLangParser.Code_blockContext ctx) {
        endScope();
    }

    @Override
    public void enterFunction_declaration(GreenTextLangParser.Function_declarationContext ctx) {
        // Note: Function names themselves might be checked for redeclaration in a global function registry,
        // this listener focuses on variable scopes *within* constructs.
        Identifier funcId = new Identifier(ctx);
        checkAndAddFunction(funcId, ctx);
        beginScope();
        checkAndAddFunction(funcId, ctx);
    }
        // Function parameters defined in function_arguments will be added to this new scope
        // when their respective enterVariable_declaration_ing methods are called.
//    }

    @Override
    public void exitFunction_declaration(GreenTextLangParser.Function_declarationContext ctx) {
        endScope();
    }

    @Override
    public void enterStruct_declaration(GreenTextLangParser.Struct_declarationContext ctx) {
        beginScope();
        // Struct member declarations would be handled within their rules, adding to this new scope.
    }

    @Override
    public void exitStruct_declaration(GreenTextLangParser.Struct_declarationContext ctx) {
        endScope();
    }

    @Override
    public void enterLoop_declaration(GreenTextLangParser.Loop_declarationContext ctx) {
        beginScope();
    }

    @Override
    public void exitLoop_declaration(GreenTextLangParser.Loop_declarationContext ctx) {
        endScope();
    }

    @Override
    public void enterIf_declaration(GreenTextLangParser.If_declarationContext ctx) {
        beginScope();
    }

    @Override
    public void exitIf_declaration(GreenTextLangParser.If_declarationContext ctx) {
        endScope();
    }

    @Override
    public void enterOr_statement(GreenTextLangParser.Or_statementContext ctx) {
        endScope();
        beginScope(); // Each 'or' branch creates a new scope
    }

    @Override
    public void exitOr_statement(GreenTextLangParser.Or_statementContext ctx) {

    }

    @Override
    public void enterOr_not_statement(GreenTextLangParser.Or_not_statementContext ctx) {
        endScope();
        beginScope(); // The 'or not' branch creates a new scope
    }

    @Override
    public void exitOr_not_statement(GreenTextLangParser.Or_not_statementContext ctx) {

    }

    @Override
    public void enterVariable_declaration(GreenTextLangParser.Variable_declarationContext ctx) {
        String varName = ctx.NAME().getText();
        checkAndAddVariable(varName, ctx);
    }

    @Override
    public void enterVariable_declaration_ing(GreenTextLangParser.Variable_declaration_ingContext ctx) {
        String varName = ctx.NAME().getText();
        checkAndAddVariable(varName, ctx);
    }

    @Override
    public void enterVariable_declaration_ing_without_elses(GreenTextLangParser.Variable_declaration_ing_without_elsesContext ctx) {
        // Typically for function return "variable" names.
        String varName = ctx.NAME().getText();
        checkAndAddVariable(varName, ctx);
    }

        // This rule has two alternatives:
        // 1. (compound_statement | simple_statement) NEWLINE
        // 2. NEWLINE (this is the "empty line statement")
        // If simple_statement and compound_statement are null, it means the second alternative was matched.
//        if (ctx.simple_statement() == null && ctx.compound_statement() == null && ctx.NEWLINE() != null) {
//            err.println("DEBUG: Empty line statement encountered at line " +
//                    ctx.NEWLINE().getSymbol().getLine() +
//                    ". Clearing all variable scopes.");
//            localScopes.clear();
//            localScopes.push(new HashSet<>()); // Re-initialize with a new global scope
//        }
    //}

    // Other listener methods (e.g., for expression evaluation, spit, etc.) would be added here
    // if the goal was full interpretation. For this task, we focus on scope and redeclaration.
}