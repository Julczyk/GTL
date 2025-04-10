package Exceptions;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.BitSet;

public class SyntaxError implements ANTLRErrorListener {

    private String errorMsg = "";
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int line, int charPositionInLine, String msg, RecognitionException e) {

        String sourceName = recognizer.getInputStream().getSourceName();
        if (!sourceName.isEmpty()) {
            sourceName = String.format("%s:%d:%d: ", sourceName, line, charPositionInLine);
        }

        System.err.println(sourceName+"line "+line+":"+charPositionInLine+" "+msg);
        errorMsg = errorMsg + "\n" + sourceName+"line "+line+":"+charPositionInLine+" "+msg;
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int line, int charPositionInLine, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int line, int charPositionInLine, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

    }

    @Override
    public String toString() {
        return errorMsg;
    }
}
