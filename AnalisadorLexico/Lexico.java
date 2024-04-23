package AnalisadorLexico;

public class Lexico {

    // lista de fazeres  :
    // 1- consertar return tabela de tokens , implementar while
    // 2- identificar operadores logicos 
    // 3- criar os "estados" para validar os lexemas e seus tipos , exemplo ,ids,palavras reservadas , numint , numdouble 

    //obs : tomar cuidado com o . ele serve p separar numdouble mas tbm é simbolo especial

    private String lexema;
    private char[] CodigoFonte;
    private int ContadorGlobal;
    private String [] TabelaDeSimbolos;
    private String [] TabelaDeTokens;

    public Lexico(String  codigofonte ){
        this.CodigoFonte = codigofonte.replaceAll("\s", "").toCharArray();
        this.ContadorGlobal = 0;
        this.lexema = "";
        
    }

    private  void preencherTabelaDeTokens(String l){
        for (int i =0 ; i<this.TabelaDeTokens.length ; i++){
            if (this.TabelaDeTokens[i] == null ) {
                this.TabelaDeTokens[i] = l;
                break;
            }
        }  
    }

    
    private  int preencherTabelaDeSimbolos (String l){
        for(int i=0; i<this.TabelaDeSimbolos.length;i++){
            if (this.TabelaDeSimbolos[i] == null) {
                this.TabelaDeSimbolos[i] = l;
                return i ;
            }
        }
        return -1;
    }

    private  int consultaNatabelaDeSimbolos ( String l){ // se achar na tabela de simbolos ele retorna a posição , se não ele retorna a posição que o novo id foi colocado  
        
       boolean jaTem = false;
       for(int i=0; i<this.TabelaDeSimbolos.length;i++){
         if (l.equals(this.TabelaDeSimbolos[i]) == true) {
            jaTem = true ;
            return i;
            
         }
       }
       if (jaTem == false ) {
        return preencherTabelaDeSimbolos(l);
       }

        return -1;
    }

    

    public  String[] ReturnTabelaDeTokens(){

    while (this.ContadorGlobal < this.CodigoFonte.length) {

     if (Character.isLetter(this.CodigoFonte[this.ContadorGlobal]) == true){ 


            
     }else if(Character.isDigit(this.CodigoFonte[this.ContadorGlobal])){ 


         
     }else if (this.isSpecialSymbol(this.CodigoFonte[this.ContadorGlobal]) == true ){ 
        
         this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
         preencherTabelaDeTokens(this.lexema);
         this.lexema = "";
         this.ContadorGlobal++;
        
     }//testar se é operador logico 
        
    }
         
    //trocar por whhile e colocar esse code dentro
    return null ;
   
    }

    public boolean isSpecialSymbol(char c ){
        switch (c) {
            case '(':
            case ')':
            case '{':
            case '}':
            case '.':
            case ';':
            case ']':
            case '[':
                return true;
           
        }
     return false;
    }

    //operadores  logicos +,-,*,/,=,==,<,>,<=,>=
}



