package GreenTextLangImpl;

import Exceptions.*;
import GreenTextLangBase.GreenTextLangLexer;
import GreenTextLangBase.GreenTextLangParser;
// Remove other Value.* imports if listener doesn't directly create/use them for this task
// For now, let's keep them as the original file had them.
import GreenTextLangBase.GreenTextLangParserBaseVisitor;
import Values.Value;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker; // Added for listener

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class GreenTextLangInterpreter {
    public static void run(Path filePath, boolean debug, boolean programMode, PrintStream err, PrintStream out, InputStream in) throws IOException {
        String input = Files.readString(filePath);
        try{
            GreenTextLangLexer lexer = new GreenTextLangLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GreenTextLangParser parser = new GreenTextLangParser(tokens);

            var error_listener = new SyntaxErrorListener(filePath, input);

            lexer.removeErrorListeners();
            lexer.addErrorListener(error_listener);

            parser.removeErrorListeners();
            //parser.setErrorHandler(new CustomErrorStrategy()); // Keep if used, but not in original snippet
            parser.addErrorListener(error_listener);

            ParseTree tree = parser.program();

            // Using Listener instead of Visitor
            GreenTextLangListenerImpl listener = new GreenTextLangListenerImpl(filePath, input, err);
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree);

            GreenTextLangParserBaseVisitor<Value> visitor;
            if (debug) {
                //out.println("Program parsed and listener processed successfully (if no exceptions).");
                visitor = new GreenTextLangDebugVisitor(filePath, out, in);
            } else {
                visitor = new GreenTextLangVisitorImpl(filePath, out, in);
            }
            visitor.visit(tree);


        } catch (SyntaxException e) {
            err.println(e.getMessage());
        } catch (RedeclarationException e) { // Catch specific semantic error
            err.println(e.getMessage());
        } catch (InterpreterException e) { // Catch other interpreter runtime errors
            err.println(e.getMessage());
        } catch (Exception e) {
            err.println("Unexpected error:");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        String test = "test.gtl";
        String world = "hello_world.gtl";
        String fib = "fibonacci.gtl";
        String fib_rec = "fibonacci_rec.gtl";
        // Example for redeclaration test
        String redeclarationTest = "tests/redeclaration_test.gtl";
        String loopTest = "tests/loop_test.gtl";
        String presentation = "tests/presentation.gtl";
        String presentation_cd = "tests/presentation_cd.gtl";
        String donut = "donut.gtl";
        String functions = "tests/functions.gtl";
        String testing_syntax_err = "tests/testing_syntax_err.gtl";
        String struct = "tests/struct_test.gtl";
        String arrays_struct = "tests/arrays_structs_test.gtl";
        Path filePath = Path.of(System.getProperty("user.dir") + "/examples/" + test); // Change to test redeclaration
        run(filePath, false, false, System.err, System.out, System.in);
    }
}

