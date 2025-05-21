package GreenTextLangImpl;

import GreenTextLangBase.GreenTextLangParser;
import Values.Value;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
//import picocli.CommandLine;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
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
    public GreenTextLangDebugVisitor(Path filePath, PrintStream out, InputStream in) {
        super(filePath, out, in);
    }

    private void breakPoint(ParserRuleContext ctx) {
        ctx.getStart().getLine();
        System.out.println("Break point: " + ctx.getStart().getLine());
        try {
            char c = (char) System.in.read();
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
     }

    //TODO add for each visit override function which waits for
    @Override
    public Value visitProgram(GreenTextLangParser.ProgramContext ctx) {
        breakPoint(ctx);
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
        breakPoint(ctx);
        return super.visitCode_block(ctx);
    }

    @Override
    public Value visitCode_blocks(GreenTextLangParser.Code_blocksContext ctx) {
        breakPoint(ctx);
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
        breakPoint(ctx);
        return super.visitIf_declaration(ctx);
    }

    @Override
    public Value visitOr_statement(GreenTextLangParser.Or_statementContext ctx) {
        breakPoint(ctx);
        return super.visitOr_statement(ctx);
    }

    @Override
    public Value visitOr_not_statement(GreenTextLangParser.Or_not_statementContext ctx) {
        breakPoint(ctx);
        return super.visitOr_not_statement(ctx);
    }

    @Override
    public Value visitExpressions(GreenTextLangParser.ExpressionsContext ctx) {
        breakPoint(ctx);
        return super.visitExpressions(ctx);
    }

    @Override
    public Value visitExpression(GreenTextLangParser.ExpressionContext ctx) {
        breakPoint(ctx);
        return super.visitExpression(ctx);
    }

    @Override
    public Value visitAlso(GreenTextLangParser.AlsoContext ctx) {
        breakPoint(ctx);
        return super.visitAlso(ctx);
    }

    @Override
    public Value visitInversion(GreenTextLangParser.InversionContext ctx) {
        breakPoint(ctx);
        return super.visitInversion(ctx);
    }

    @Override
    public Value visitComparison(GreenTextLangParser.ComparisonContext ctx) {
        breakPoint(ctx);
        return super.visitComparison(ctx);
    }

    @Override
    public Value visitSum(GreenTextLangParser.SumContext ctx) {
        breakPoint(ctx);
        return super.visitSum(ctx);
    }

    @Override
    public Value visitTerm(GreenTextLangParser.TermContext ctx) {
        breakPoint(ctx);
        return super.visitTerm(ctx);
    }

    @Override
    public Value visitFactor(GreenTextLangParser.FactorContext ctx) {
        breakPoint(ctx);
        return super.visitFactor(ctx);
    }

    @Override
    public Value visitAtom(GreenTextLangParser.AtomContext ctx) {
        breakPoint(ctx);
        return super.visitAtom(ctx);
    }

    @Override
    public Value visitLiteral(GreenTextLangParser.LiteralContext ctx) {
        breakPoint(ctx);
        return super.visitLiteral(ctx);
    }

    @Override
    public Value visitStatement(GreenTextLangParser.StatementContext ctx) {
        breakPoint(ctx);
        return super.visitStatement(ctx);
    }

    //TODO override all visits and add breakpoint before calling super
}