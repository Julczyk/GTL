package GreenTextLangImpl;

import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.impl.Arguments;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class GreenTextLangApp {
    public static void main(String[] args) {
        ArgumentParser parser = ArgumentParsers.newFor("GreenTextLang").build()
                .defaultHelp(true)
                .description("Interpreter of Green Text Lang.");
        parser.addArgument("filepath")
                .dest("filepath")
                .nargs("?")
                .action(Arguments.store())
                .help("input file");
        parser.addArgument("-p", "--program")
                .dest("program")
                .action(Arguments.storeTrue())
                .help("set error message to program mode");
        parser.addArgument("-d", "--debug")
                .dest("debug")
                .action(Arguments.storeTrue())
                .help("run with debug");
        parser.addArgument("-v", "--version")
                .dest("version")
                .action(Arguments.storeTrue())
                .help("Green Text Lang version");
        try {
            Namespace res = parser.parseArgs(args);
            if (res.get("version")) {
                System.out.println("Green Text Lang version: 0.1");
            } else if (res.get("filepath") != null) {
                String inputPathArg = res.getString("filepath");
                Path inputPath = Paths.get(inputPathArg).toAbsolutePath();
                File inputFile = inputPath.toFile();
                if (!inputFile.exists() || !inputFile.isFile()) {
                    System.err.println("Error: File does not exist: " + inputPath);
                    System.exit(1);
                }
                if (res.getBoolean("debug")) {
                    GreenTextLangDebug.run(inputPath, res.getBoolean("program"), System.err, System.out, System.in);
                } else {
                    GreenTextLangInterpreter.run(inputPath, false, res.getBoolean("program"), System.err, System.out, System.in);
                }
            } else if (res.get("program")) {
                System.err.println("You need to specify a program to run");
            } else if (res.get("debug")) {
                System.err.println("You need to specify a program to run");
            } else {
                parser.printHelp();
            }
        } catch (ArgumentParserException e) {
            parser.handleError(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
