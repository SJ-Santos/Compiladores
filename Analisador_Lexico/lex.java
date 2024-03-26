package Analisador_Lexico;

public class lex {
    private String lexema = "";
    private String args = ""; 

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    public lex(){

    }

    public void setLetra(char letra){
        this.lexema += letra;
    }
}
