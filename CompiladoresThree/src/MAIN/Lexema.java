package MAIN;

public class Lexema {
    private String  tipo ;
    private String lexema ;
    private String isID ; // so usado em Ids

    public Lexema (String   tipo , String lexema){
        this.lexema = lexema;
        this.tipo = tipo ;
        this.isID  ="";
    }
    public Lexema(String tipo ,String lexema ,String isID){
        this.lexema = lexema;
        this.tipo = tipo;
        this.isID = isID;
    }



    public String getTipo() {
        return tipo;
    }

    public String getLexema() {
        return lexema;
    }


    public String   toString (){
        return tipo + lexema ;
    }


    public String getIsID() {
        return isID;
    }
}

