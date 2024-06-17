package MAIN;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;

import java.util.Iterator;
import java.util.LinkedList;

public class TokenSourceCustomizado implements TokenSource{ // cria um token customizado para ser usado no analisador sintatico
    private final Iterator<Lexema> iterator;
    private Lexema currentLexema;
    private int tokenIndex = 0;

    public TokenSourceCustomizado(LinkedList<Lexema> lexemas) {
        this.iterator = lexemas.iterator();
        if (iterator.hasNext()) {
            currentLexema = iterator.next();
        }
    }

    @Override
    public Token nextToken() {
        if (currentLexema == null) {
            return new CommonToken(Token.EOF);
        }

        int tokenType = getTokenType(currentLexema.getTipo());
        CommonToken token = new CommonToken(tokenType, currentLexema.getLexema());
        token.setTokenIndex(tokenIndex++);

        if (iterator.hasNext()) {
            currentLexema = iterator.next();
        } else {
            currentLexema = null;
        }

        return token;
    }

    private int getTokenType(String tipo) { // mexer aqui
        switch (tipo) {
            case "Palavra Reservada : ":
                return 1;
            case "ID : ":
                return 2;
            case "Texto : ":
                return 3;
            case "NumDouble : ":
                return 4;
            case "NumInt : ":
                return 5;
            case "Simbolo Especial : ":
                return 6;
            case "Operador Lógico : ":
                return 7;


            default:
                throw new IllegalArgumentException("Tipo de token desconhecido: " + tipo);
        }
    }

    @Override
    public int getLine() {

        return 0;
    }

    @Override
    public int getCharPositionInLine() {
        // Implementar se você quiser suporte para informações de posição
        return 0;
    }

    @Override
    public CharStream getInputStream() {
        return null;
    }

    @Override
    public String getSourceName() {
        return "CustomTokenSource";
    }

    @Override
    public void setTokenFactory(TokenFactory<?> factory) {
        // Implementar se necessário
    }

    @Override
    public TokenFactory<?> getTokenFactory() {
        return CommonTokenFactory.DEFAULT;
    }

}


