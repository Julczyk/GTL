import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;


public class GreenTextLangInterpreter {
    public static void main(String[] args) {
        String input = " > be me\n > spit \"Hello, World!\"\n > profit"; // Example program

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