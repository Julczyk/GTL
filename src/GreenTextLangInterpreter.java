import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class GreenTextLangInterpreter {
    public static void main(String[] args) throws IOException {
        String world = "hello_world.gtl";
        String fib = "fibonacci.gtl";
        String input = Files.readString(Path.of(System.getProperty("user.dir") + "/examples/" + world));

        // Assuming ANTLR setup and parser generation is done
        GreenTextLangLexer lexer = new GreenTextLangLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GreenTextLangParser parser = new GreenTextLangParser(tokens);

        ParseTree tree = parser.program();
        GreenTextLangVisitorImpl visitor = new GreenTextLangVisitorImpl();
        visitor.visit(tree);
    }
}

class GreenTextLangVisitorImpl extends GreenTextLangParserBaseVisitor<Void> {
    @Override
    public Void visitSpit(GreenTextLangParser.SpitContext ctx) {
        // Extracts and prints the string from the spit statement
        String text = ctx.expressions().getText();
        System.out.println(text.substring(1, text.length() - 1)); // Remove quotes
        return null;
    }
}