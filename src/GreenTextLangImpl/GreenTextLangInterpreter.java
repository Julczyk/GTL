package GreenTextLangImpl;

import Exceptions.*;
import GreenTextLangBase.GreenTextLangLexer;
import GreenTextLangBase.GreenTextLangParser;
// Remove other Value.* imports if listener doesn't directly create/use them for this task
// For now, let's keep them as the original file had them.
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker; // Added for listener

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class GreenTextLangInterpreter {
    public static void run(Path filePath, boolean debug, boolean programMode) throws IOException {
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
            GreenTextLangListenerImpl listener = new GreenTextLangListenerImpl(filePath, input);
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree);
            if (debug) {
                System.out.println("Program parsed and listener processed successfully (if no exceptions).");
            }

            GreenTextLangVisitorImpl visitor = new GreenTextLangVisitorImpl(filePath);
            visitor.visit(tree);


        } catch (SyntaxException e) {
            System.err.println(e.getMessage());
        } catch (RedeclarationException e) { // Catch specific semantic error
            System.err.println(e.getMessage());
        } catch (InterpreterException e) { // Catch other interpreter runtime errors
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error:");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        String test = "test.gtl";
        String world = "hello_world.gtl";
        String fib = "fibonacci.gtl";
        String fib_rec = "fibonacci_rec.gtl";
        String syntaxTest = "invalid_missing_assignment.gtl";
        // Example for redeclaration test
        String redeclarationTest = "redeclaration_test.gtl";
        String funcTest = "func.gtl";
        String loopTest = "loop_test.gtl";
        String ifTest = "if_test.gtl";
        String typeTest = "type_test.gtl";
        String presentation = "presentation.gtl";
        String presentation_cd = "presentation_cd.gtl";
        String donut = "donut.gtl";
        if (args.length == 0) {
            Path filePath = Path.of(System.getProperty("user.dir") + "/examples/" + donut); // Change to test redeclaration
            run(filePath, true, false);
        } else { // TODO windows always runs this main
            Path inputPath = Paths.get(args[0]).toAbsolutePath();
            File inputFile = inputPath.toFile();
            if (!inputFile.exists() || !inputFile.isFile()) {
                System.err.println("Error: File does not exist: " + inputPath);
            } else {
                GreenTextLangInterpreter.run(inputPath, false, false);
            }
            Scanner terminalInput = new Scanner(System.in);
            System.out.print("Press enter to terminate.");
            String input = terminalInput.nextLine();
        }
    }
}

