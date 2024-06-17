package AnalisadorSintatico;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        String input = "your test input here";
        MyGrammarLexer lexer = new MyGrammarLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyGrammarParser parser = new MyGrammarParser(tokens);

        // Start parsing from the rule defined as the entry point in your grammar
        parser.myStartRule();
    }
}
