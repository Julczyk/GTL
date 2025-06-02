package GreenTextLangImpl;

import GreenTextLangBase.GreenTextLangParser;
import Memory.Identifier;
import Values.Value;
import org.antlr.v4.runtime.ParserRuleContext;
//import picocli.CommandLine;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class GreenTextLangDebug {
    public static void run(Path filePath, boolean programMode, PrintStream err, PrintStream out, InputStream in) throws IOException {
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
    Scanner terminalInput = new Scanner(System.in);
    int line = 0;
    int goToLine = line;
    String tempOut ="";
    String tempOut2 ="";

    public GreenTextLangDebugVisitor(Path filePath, PrintStream out, InputStream in) throws UnsupportedEncodingException {
        super(filePath, out, in);
        super.out = this.out;
    }

    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }

    private void print() {
        clearConsole();
        tempOut += header;
        String output = "";
        try {
            output = baos.toString(utf8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        var localsSplit = localsSplit(this.memory.locals, size);
        var globalsSplit = memorySplit(this.memory.globals, size);
        var outputSplit = softSplit(output, size);
        int row = 0;
        boolean loop = true;
        while (loop) {
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
            if (loop == false) {
                break;
            }
            String finalOutput = toolOutput + separator + memory;
            tempOut += finalOutput + "\n";
            row++;
        }
    }

    private List<String> localsSplit(Stack<HashMap<Identifier, Value>> locals, int size) {
        int charCount = String.valueOf(locals.size()).length() + 1;
        List<String> result = new ArrayList<>();
        for (int j = 0; j < locals.size(); j++) {
            var temp = memorySplit(locals.get(j), size - charCount);
            if (temp.isEmpty()) {
                continue;
            }
            String number = String.valueOf(j);
            number += " ".repeat(charCount - number.length());
            temp.set(0, number + temp.get(0));
            String buffer = " ".repeat(charCount);
            for (int i = 1; i < temp.size(); i++) {
                temp.set(i, buffer + temp.get(i));
            }
            result.addAll(temp);
        }
        return result;
    }

    private List<String> memorySplit(HashMap<Identifier, Value> memory, int size) {
        List<String> temp = new ArrayList<>();
        for (var entry : memory.entrySet()) {
            temp.add(entry.getKey().toString() + "=" + entry.getValue().toString());
        }
        List<String> result = new ArrayList<>();
        for (var t : temp) {
            result.addAll(hardSplit(t, size));
        }
        return result;
    }

    private List<String> softSplit(String input, int size) {
        List<String> temp = Arrays.asList(input.split("\\r?\\n"));
        List<String> result = new ArrayList<>();
        for (var t : temp) {
            result.addAll(hardSplit(t, size));
        }
        return result;
    }

    private List<String> hardSplit(String input, int size) {
        List<String> output = new ArrayList<String>();
        int index = 0;
        while (index < input.length()) {
            output.add(input.substring(index, Math.min(index + size,input.length())));
            index += size;
        }
        return output;
    }

    private void breakPoint(ParserRuleContext ctx) {
        breakPoint(ctx, null);
    }

    private void breakPoint(ParserRuleContext ctx, Value ret) {
        int line = ctx.getStart().getLine();
        this.line = line;
        if (goToLine > this.line && ! (ctx instanceof GreenTextLangParser.SwallowContext)) {
            return;
        } else {
            goToLine = this.line;
        }
        int posInLine = ctx.getStart().getCharPositionInLine();
        int length = ctx.getStop().getCharPositionInLine() - posInLine + 1;
        int lineCount = Math.toIntExact(Arrays.stream(ctx.getText().split("\\r?\\n")).count());
        String input;
        try {
            input = Files.readString(super.filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        print();

        List<String> sourceLines = Arrays.stream(input.split("\\r?\\n")).toList();
        List<String> codeLines = new ArrayList<>();
        String lineCode = sourceLines.get(line - 1);
        var codeLine = hardSplit(lineCode, size);
        var underline = hardSplit(" ".repeat(posInLine) + "^".repeat(length), size);
        for (int i = 0; i < codeLine.size(); i++) {
            codeLines.add(codeLine.get(i));
            String under = underline.get(i);
            if (under.contains("^")) {
                codeLines.add(underline.get(i));
            }
        }
        for (int i = 1; i < lineCount; i++) {
            String code = sourceLines.get(i + line - 1);
            codeLines.addAll(hardSplit(code, size));
        }

        List<String> additionalInfo = new ArrayList<>();
        String ctxName = ctx.getClass().getSimpleName();
        additionalInfo.add(ctxName.substring(0, ctxName.length() - "Context".length()));
        additionalInfo.addAll(hardSplit((ret == null ? "" : ret.toString() + ", type: " + ret.type), size));

        int row = 0;
        boolean loop = true;
        while (loop) {
            loop = false;
            String toolOutput = "";
            if (row < codeLines.size()) {
                toolOutput = codeLines.get(row);
                loop = true;
            }
            if (toolOutput.length() != size) {
                toolOutput += " ".repeat(size - toolOutput.length());
            }
            String addInfo = "";
            if (row < additionalInfo.size()) {
                addInfo = additionalInfo.get(row);
                loop = true;
            }
            if (addInfo.length() != size) {
                addInfo += " ".repeat(size - addInfo.length());
            }
            String finalOutput = toolOutput + separator + addInfo;
            if (loop == false) {
                break;
            }
            tempOut2 += finalOutput + "\n";
            row++;
        }
        int rows = tempOut.split("\n").length + tempOut2.split("\n").length;
        int filler = 27 - rows;
        System.out.print(tempOut);
        if (filler > 0) System.out.print((" ".repeat(size) + separator + "\n").repeat(filler));
        System.out.println("-".repeat(size*2 + separator.length()));
        System.out.print(tempOut2);
        System.out.println("-".repeat(size*2 + separator.length()));
        tempOut = "";
        tempOut2 = "";

        if (ctx instanceof GreenTextLangParser.SwallowContext) {
            System.out.print("PROGRAM: ");
            return;
        }

        do {
            String command = terminalInput.nextLine();
            if (command == "") break;
            else if (command.matches("\\d+")) {
                this.goToLine += Integer.parseInt(command);
                break;
            } else if (command.matches("line \\d+")) {
                this.goToLine += Integer.parseInt(command.substring(5));
                break;
            } else if (command.matches("clear")) {
                this.baos.reset();
            } else {
                System.out.println("Unknown command: " + command);
            }
        } while (true);
    }

    @Override
    public Value visitProgram(GreenTextLangParser.ProgramContext ctx) {
        //breakPoint(ctx);
        return super.visitProgram(ctx);
    }

    @Override
    public Value visitFunction_call_ing(GreenTextLangParser.Function_call_ingContext ctx) {
        breakPoint(ctx);
        Value ret = super.visitFunction_call_ing(ctx);
        breakPoint(ctx, ret);
        return ret;
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
        if (ctx.expression(1) == null) {
            return super.visitExpressions(ctx);
        }
        breakPoint(ctx);
        Value ret = super.visitExpressions(ctx);
        breakPoint(ctx, ret);
        return ret;
    }

    @Override
    public Value visitExpression(GreenTextLangParser.ExpressionContext ctx) {
        breakPoint(ctx);
        Value ret = super.visitExpression(ctx);
        breakPoint(ctx, ret);
        return ret;
    }

    @Override
    public Value visitAlso(GreenTextLangParser.AlsoContext ctx) {
        if (ctx.inversion(1) == null) {
            return super.visitAlso(ctx);
        }
        breakPoint(ctx);
        Value ret = super.visitAlso(ctx);
        breakPoint(ctx, ret);
        return ret;
    }

    @Override
    public Value visitInversion(GreenTextLangParser.InversionContext ctx) {
        if (ctx.NOT() == null) {
            return super.visitInversion(ctx);
        }
        breakPoint(ctx);
        Value ret = super.visitInversion(ctx);
        breakPoint(ctx, ret);
        return ret;
    }

    @Override
    public Value visitComparison(GreenTextLangParser.ComparisonContext ctx) {
        if (ctx.sum(1) == null) {
            return super.visitComparison(ctx);
        }
        breakPoint(ctx);
        Value ret = super.visitComparison(ctx);
        breakPoint(ctx, ret);
        return ret;
    }

    @Override
    public Value visitSum(GreenTextLangParser.SumContext ctx) {
        if (ctx.JOINED_BY() == null) {
            return super.visitSum(ctx);
        }
        breakPoint(ctx);
        Value ret = super.visitSum(ctx);
        breakPoint(ctx, ret);
        return ret;
    }

    @Override
    public Value visitTerm(GreenTextLangParser.TermContext ctx) {
        if (ctx.term() == null) {
            return super.visitTerm(ctx);
        }
        breakPoint(ctx);
        Value ret = super.visitTerm(ctx);
        breakPoint(ctx, ret);
        return ret;
    }

    @Override
    public Value visitFactor(GreenTextLangParser.FactorContext ctx) {
        if (ctx.factor() == null) {
            return super.visitFactor(ctx);
        }
        breakPoint(ctx);
        Value ret = super.visitFactor(ctx);
        breakPoint(ctx, ret);
        return ret;
    }

    @Override
    public Value visitAtom(GreenTextLangParser.AtomContext ctx) {
        Value ret = super.visitAtom(ctx);
        breakPoint(ctx, ret);
        return ret;
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