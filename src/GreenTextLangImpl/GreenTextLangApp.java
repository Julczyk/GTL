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
                .required(true)
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
                .action(Arguments.storeTrue())
                .help("Green Text Lang version");
        try {
            Namespace res = parser.parseArgs(args);
            String inputPathArg = res.getString("filepath");
            Path inputPath = Paths.get(inputPathArg).toAbsolutePath();
            File inputFile = inputPath.toFile();
            if (!inputFile.exists() || !inputFile.isFile()) {
                System.err.println("Error: File does not exist: " + inputPath);
                System.exit(1);
            }
            GreenTextLangInterpreter.run(inputPath, res.getBoolean("debug"), res.getBoolean("program"));
        } catch (ArgumentParserException e) {
            parser.handleError(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
