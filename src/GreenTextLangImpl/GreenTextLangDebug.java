package GreenTextLangImpl;

import GreenTextLangBase.GreenTextLangParser;
import Values.Value;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
//import picocli.CommandLine;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GreenTextLangDebug {
    public static void run(Path filePath, boolean programMode, PrintStream err, PrintStream out, InputStream in) throws IOException {
//        String[] signals = new String[] {
//                "\u001b[s",            // save cursor position
//                "\u001b[5000;5000H",   // move to col 5000 row 5000
//                "\u001b[6n",           // request cursor position
//                "\u001b[u",            // restore cursor position
//        };
//        for (String s : signals) {
//            System.out.print(s);
//        }
//        int read = -1;
//        StringBuilder sb = new StringBuilder();
//        byte[] buff = new byte[1];
//        while ((read = System.in.read(buff, 0, 1)) != -1) {
//            sb.append((char) buff[0]);
//            //System.err.printf("Read %s chars, buf size=%s%n", read, sb.length());
//            if ('R' == buff[0]) {
//                break;
//            }
//        }
//        String size = sb.toString();
//        int rows = Integer.parseInt(size.substring(size.indexOf("\u001b[") + 2, size.indexOf(';')));
//        int cols = Integer.parseInt(size.substring(size.indexOf(';') + 1, size.indexOf('R')));
//        System.err.printf("rows = %s, cols = %s%n", rows, cols);

        GreenTextLangInterpreter.run(filePath, true, programMode, err, out, in);
    }
}


class GreenTextLangDebugVisitor extends GreenTextLangVisitorImpl {
    // 59 for output 2 for split, 59 for memory
    private final String separator = " |";
    private final int size = 59;
    private final String header = "PROGRAM OUTPUT" + " ".repeat(45) + separator + " MEMORY GLOBALS\n";
    final ByteArrayOutputStream baos = new ByteArrayOutputStream();
    final String utf8 = StandardCharsets.UTF_8.name();
    PrintStream out = new PrintStream(baos, true, utf8);

    public GreenTextLangDebugVisitor(Path filePath, PrintStream out, InputStream in) throws UnsupportedEncodingException {
        super(filePath, out, in);
        super.out = this.out;
    }

//    private void breakPoint(ParserRuleContext ctx) {
//        var mem = memory.locals;
//        if (mem!=null) {
//            System.out.println(mem.toString());
//            ctx.getStart().getLine();
//            System.out.println("Break point: " + ctx.getStart().getLine());
//            try {
//                char c = (char) System.in.read();
//            } catch (Exception e) {
//                System.out.println("Error: " + e.getMessage());
//            }
//        }
//     }
    private void print() {
        System.out.print("\u001b[2J");
        System.out.print("\u001b[H");
        System.out.print(header);
        String locals = this.memory.locals.toString();
        String globals = this.memory.globals.toString();
        String output = "";
        try {
            output = baos.toString(utf8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // TODO add clear command
        // TODO add line command
        // TODO add better structs and functions
        // TODO try not to split by name, soft split
        var localsSplit = split(locals, size);  // TODO separate scopes
        var globalsSplit = split(globals, size); //TODO pretty and remove \n from strings
        var outputSplit = split(output, size); // TODO split by \n
        int maxRows = 10;
        int row = 0;
        boolean loop = false;
        while (row < maxRows || loop) {
            loop = false;
            String toolOutput = "";
            if (row < outputSplit.size()) {
                toolOutput = outputSplit.get(row);
                loop = true;
            }
            if (toolOutput.length() != size) {
                toolOutput += " ".repeat(size - toolOutput.length());
            }
            String memory = "";
            if (row < globalsSplit.size()) {
                memory = globalsSplit.get(row);
                loop = true;
            } else if (row == globalsSplit.size()) {
                memory = " MEMORY LOCALS";
                loop = true;
            } else if (row - globalsSplit.size() - 1 < localsSplit.size()) {
                memory = localsSplit.get(row - globalsSplit.size() - 1);
                loop = true;
            }
            if (memory.length() != size) {
                memory += " ".repeat(size - memory.length());
            }
            String finalOutput = toolOutput + separator + memory;
            System.out.println(finalOutput);
            row++;
        }
        System.out.println("-".repeat(size*2 + separator.length()));
    }

    private List<String> split(String input, int size) {
        List<String> output = new ArrayList<String>();
        int index = 0;
        while (index < input.length()) {
            output.add(input.substring(index, Math.min(index + size,input.length())));
            index += size;
        }
        return output;
    }

    private void breakPoint(ParserRuleContext ctx) {
        print();
        int line = ctx.getStart().getLine();
        int posInLine = ctx.getStart().getCharPositionInLine();
        int length = ctx.getStop().getCharPositionInLine() - posInLine + 1;
        String input;
        try {
            input = Files.readString(super.filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> sourceLines = Arrays.stream(input.split("\\r?\\n")).toList();
        String codeLine = sourceLines.get(line - 1);
        codeLine += " ".repeat(size - codeLine.length()); // TODO line splitting
        String ctxName = ctx.getClass().getSimpleName();
        codeLine += separator + ctxName.substring(0, ctxName.length() - "Context".length());
        codeLine += "\n";
        codeLine += " ".repeat(posInLine) + "^".repeat(length) + " ".repeat(size - posInLine - length) + separator;
        System.out.println(codeLine);
        System.out.println("-".repeat(size*2 + separator.length()));
        try {
            System.in.read();
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }



    @Override
    public Value visitProgram(GreenTextLangParser.ProgramContext ctx) {
        //breakPoint(ctx);
        return super.visitProgram(ctx);
    }

    @Override
    public Value visitFunction_call_ing(GreenTextLangParser.Function_call_ingContext ctx) {
        breakPoint(ctx);
        return super.visitFunction_call_ing(ctx);
    }

    @Override
    public Value visitFunction_call(GreenTextLangParser.Function_callContext ctx) {
        breakPoint(ctx);
        return super.visitFunction_call(ctx);
    }

    @Override
    public Value visitFunction_declaration(GreenTextLangParser.Function_declarationContext ctx) {
        breakPoint(ctx);
        return super.visitFunction_declaration(ctx);
    }

    @Override
    public Value visitCode_block(GreenTextLangParser.Code_blockContext ctx) {
        //breakPoint(ctx);
        return super.visitCode_block(ctx);
    }

    @Override
    public Value visitCode_blocks(GreenTextLangParser.Code_blocksContext ctx) {
        //breakPoint(ctx);
        return super.visitCode_blocks(ctx);
    }

    @Override
    public Value visitSpit(GreenTextLangParser.SpitContext ctx) {
        breakPoint(ctx);
        return super.visitSpit(ctx);
    }

    @Override
    public Value visitSwallow(GreenTextLangParser.SwallowContext ctx) {
        breakPoint(ctx);
        return super.visitSwallow(ctx);
    }

    @Override
    public Value visitVariable_declaration(GreenTextLangParser.Variable_declarationContext ctx) {
        breakPoint(ctx);
        return super.visitVariable_declaration(ctx);
    }

    @Override
    public Value visitVariable_assignment(GreenTextLangParser.Variable_assignmentContext ctx) {
        breakPoint(ctx);
        return super.visitVariable_assignment(ctx);
    }

    @Override
    public Value visitLoop_declaration(GreenTextLangParser.Loop_declarationContext ctx) {
        breakPoint(ctx);
        return super.visitLoop_declaration(ctx);
    }

    @Override
    public Value visitIf_declaration(GreenTextLangParser.If_declarationContext ctx) {
        //breakPoint(ctx);
        return super.visitIf_declaration(ctx);
    }

    @Override
    public Value visitOr_statement(GreenTextLangParser.Or_statementContext ctx) {
        //breakPoint(ctx);
        return super.visitOr_statement(ctx);
    }

    @Override
    public Value visitOr_not_statement(GreenTextLangParser.Or_not_statementContext ctx) {
        //breakPoint(ctx);
        return super.visitOr_not_statement(ctx);
    }

    @Override
    public Value visitExpressions(GreenTextLangParser.ExpressionsContext ctx) {
        //breakPoint(ctx);
        return super.visitExpressions(ctx);
    }

    @Override
    public Value visitExpression(GreenTextLangParser.ExpressionContext ctx) {
        //breakPoint(ctx);
        return super.visitExpression(ctx);
    }

    @Override
    public Value visitAlso(GreenTextLangParser.AlsoContext ctx) {
        //breakPoint(ctx);
        return super.visitAlso(ctx);
    }

    @Override
    public Value visitInversion(GreenTextLangParser.InversionContext ctx) {
        //breakPoint(ctx);
        return super.visitInversion(ctx);
    }

    @Override
    public Value visitComparison(GreenTextLangParser.ComparisonContext ctx) {
        //breakPoint(ctx);
        return super.visitComparison(ctx);
    }

    @Override
    public Value visitSum(GreenTextLangParser.SumContext ctx) {
        //breakPoint(ctx);
        return super.visitSum(ctx);
    }

    @Override
    public Value visitTerm(GreenTextLangParser.TermContext ctx) {
        //breakPoint(ctx);
        return super.visitTerm(ctx);
    }

    @Override
    public Value visitFactor(GreenTextLangParser.FactorContext ctx) {
        //breakPoint(ctx);
        return super.visitFactor(ctx);
    }

    @Override
    public Value visitAtom(GreenTextLangParser.AtomContext ctx) {
        //breakPoint(ctx);
        return super.visitAtom(ctx);
    }

    @Override
    public Value visitLiteral(GreenTextLangParser.LiteralContext ctx) {
        //breakPoint(ctx);
        return super.visitLiteral(ctx);
    }

    @Override
    public Value visitStatement(GreenTextLangParser.StatementContext ctx) {
        //breakPoint(ctx);
        return super.visitStatement(ctx);
    }

    @Override
    public Value visitStruct_declaration(GreenTextLangParser.Struct_declarationContext ctx) {
        breakPoint(ctx);
        return super.visitStruct_declaration(ctx);
    }
}