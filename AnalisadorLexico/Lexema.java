package AnalisadorLexico;

public class Lexema {
    private String  tipo ;
    private String lexema ;

    

    public Lexema (String   tipo , String lexema){
        this.lexema = lexema;
        this.tipo = tipo ;
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


}
