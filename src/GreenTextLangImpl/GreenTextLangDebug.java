package GreenTextLangImpl;

import Values.Value;
import org.antlr.v4.runtime.tree.ParseTree;
import picocli.CommandLine;

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

        //GreenTextLangInterpreter.run(filePath, true, programMode, err, out, in);
    }
}


class GreenTextLangDebugVisitor extends GreenTextLangVisitorImpl {
    public GreenTextLangDebugVisitor(Path filePath, PrintStream out, InputStream in) {
        super(filePath, out, in);
    }

    //TODO override all visits and add breakpoint before calling super
}