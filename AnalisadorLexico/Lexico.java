package AnalisadorLexico;

import java.util.LinkedList;

public class Lexico {

    // lista de fazeres  :
        // 1- fazer a identificação de palavras reservada e ids 
        // 2- testar o codigo 
        // 3- considerar no que tornaria esse codigo mais legivel e profissional 

    //obs : tomar cuidado com o . ele serve p separar numdouble ,  se não lançar exceção 

    private String lexema;
    private char[] CodigoFonte;
    private int ContadorGlobal;
    private LinkedList<String> TabelaDeSimbolos;
    private LinkedList<String> TabelaDeTokens;

    public Lexico(String  codigofonte ){
        this.CodigoFonte = codigofonte.replaceAll("\s", "").toCharArray();
        this.ContadorGlobal = 0;
        this.lexema = "";
        TabelaDeSimbolos = new LinkedList<String >();
        TabelaDeTokens = new LinkedList<String>();
        
    }

    private  void preencherTabelaDeTokens(String l){
        for (int i =0 ; i<this.TabelaDeTokens.size() ; i++){
            if (this.TabelaDeTokens.get(i) == null ) {
                this.TabelaDeTokens.add(i, l);
                break;
            }
        }  
    }

    
    private  int preencherTabelaDeSimbolos (String l){
        for(int i=0; i<this.TabelaDeSimbolos.size();i++){
            if (this.TabelaDeSimbolos.get(i) == null) {
                this.TabelaDeSimbolos.add(i, l);
                return i ;
            }
        }
        return -1;
    }

    public   int consultaNatabelaDeSimbolos ( String l){ // se achar na tabela de simbolos ele retorna a posição , se não ele retorna a posição que o novo id foi colocado  
        
       boolean jaTem = false;
       for(int i=0; i<this.TabelaDeSimbolos.size();i++){
         if (l.equals(this.TabelaDeSimbolos.get(i)) == true) {
            jaTem = true ;
            return i;
            
         }
       }
       if (jaTem == false ) {
        return preencherTabelaDeSimbolos(l);
       }

        return -1;
    }

    

    public  LinkedList<String>  ReturnTabelaDeTokens() throws Exception{

    while (this.ContadorGlobal < this.CodigoFonte.length) {

        // palavras reservadas : 
        //    int ,double, char, String ,float,boolean,void,while, main, return , println , if,else,

     if (Character.isLetter(this.CodigoFonte[this.ContadorGlobal]) == true){ //testa se é palavra reservada ou id

      //testar todas as palavras reservadas com if e senão é um id 
            
     } else if (this.CodigoFonte[this.ContadorGlobal] == '"') { // testa se é texto 

        int contador_de_aspas = 0;
            
           for(int u = this.ContadorGlobal ; u <this.CodigoFonte.length ;u++ ){

            if(this.CodigoFonte[u] == '"'){

            contador_de_aspas++;

            if (contador_de_aspas == 2) {

                 this.lexema = this.lexema + this.CodigoFonte[u];
                 preencherTabelaDeTokens(lexema);
                 this.lexema = "";
                 this.ContadorGlobal = u;

            }

            this.lexema = this.lexema + this.CodigoFonte[u];

            }else {

                this.lexema = this.lexema + this.CodigoFonte[u];

            }

           }

    }else if(Character.isDigit(this.CodigoFonte[this.ContadorGlobal])){ // testa se é num double ou  num int 

       for(int i = this.ContadorGlobal ; i < this.CodigoFonte.length ;i++){
         
          if (Character.isDigit(this.CodigoFonte[i])) { // num int 

            this.lexema = this.lexema + this.CodigoFonte[i];

          }if (this.CodigoFonte[i] == '.') { // num double 

            this.lexema = this.lexema + this.CodigoFonte[i];

          }else {

            preencherTabelaDeTokens(lexema);
            this.lexema = "";
            this.ContadorGlobal = i ;
            break;

          }
         
       }
         
     }else if (this.isSpecialSymbol(this.CodigoFonte[this.ContadorGlobal]) ){ //testa se é simbolo especial 
        
         this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
         preencherTabelaDeTokens(this.lexema);
         this.lexema = "";
         this.ContadorGlobal++;
        
     }else if (this.isLogicOperator(this.CodigoFonte[this.ContadorGlobal]) ){ // testa se é operador logico 

        //operadores  logicos +,-,*,/,=,==,<,>,<=,>=
         if (this.CodigoFonte[this.ContadorGlobal] == '+') {

           this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
           this.preencherTabelaDeTokens(lexema);
           this.ContadorGlobal ++;
           this.lexema = "";
            
        }else if (this.CodigoFonte[this.ContadorGlobal] == '-') {

           this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
           this.preencherTabelaDeTokens(lexema);
           this.ContadorGlobal ++;
           this.lexema = "";
            
        }else if (this.CodigoFonte[this.ContadorGlobal] == '*') {

           this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
           this.preencherTabelaDeTokens(lexema);
           this.ContadorGlobal ++;
           this.lexema = "";
            
        }else if (this.CodigoFonte[this.ContadorGlobal] == '/'){

           this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
           this.preencherTabelaDeTokens(lexema);
           this.ContadorGlobal ++;
           this.lexema = "";

        }else if (this.CodigoFonte[this.ContadorGlobal] == '=') {

            if (this.CodigoFonte[this.ContadorGlobal] == '=') {

                this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                this.ContadorGlobal ++;
                this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                this.ContadorGlobal ++;
                this.preencherTabelaDeTokens(lexema);
                this.lexema = "";

            }else {
                
                this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                this.preencherTabelaDeTokens(lexema);
                this.ContadorGlobal ++;
                this.lexema = "";
                
            }

        
            
        }else if (this.CodigoFonte[this.ContadorGlobal] == '<') {

            if (this.CodigoFonte[this.ContadorGlobal] == '=') {

                this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                this.ContadorGlobal ++;
                this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                this.ContadorGlobal ++;
                this.preencherTabelaDeTokens(lexema);
                this.lexema = "";
                
            }else {

             this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
            this.preencherTabelaDeTokens(lexema);
            this.ContadorGlobal ++;
            this.lexema = "";

            }

            
            
        }else if (this.CodigoFonte[this.ContadorGlobal] == '>') {

            if (this.CodigoFonte[this.ContadorGlobal] == '=') {

                this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                this.ContadorGlobal ++;
                this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                this.ContadorGlobal ++;
                this.preencherTabelaDeTokens(lexema);
                this.lexema = "";
                
            }else {

             this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
            this.preencherTabelaDeTokens(lexema);
            this.ContadorGlobal ++;
            this.lexema = "";

            }
            
        }

     } else if (this.CodigoFonte[this.ContadorGlobal] == '/'){ // testa se é comentario 

        if (this.CodigoFonte[this.ContadorGlobal+1] == '/') {

            this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal]; // adiciona o /
            this.ContadorGlobal++;
            this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal]; // adiciona o segundo /
            this.ContadorGlobal++;

            for(int i = this.ContadorGlobal;i< this.CodigoFonte.length;i++){ // pega tudo depois dos //  e antes de um \n  e joga fora 

                if (this.CodigoFonte[i] == '\n') {
                    this.lexema = this.lexema + this.CodigoFonte[i];
                    this.ContadorGlobal = i+1 ;
                    this.lexema = "";
                }else {
                    this.lexema = this.lexema + this.CodigoFonte[i];

                }

            } 

        }else if (this.CodigoFonte[this.ContadorGlobal+1] == '*') {
           try { // trecho morto , java não deixa lançar exceção sem try e catch 

           }catch(Exception e) {
            throw new Exception();
           }
        }

     }
        //testar se é operador logico 
        
    }
         
    
    return null ;
   
    }

    private  boolean isSpecialSymbol(char c ){
        switch (c) {
            case '(':
            case ')':
            case '{':
            case '}':
            case ';':
            case ']':
            case '[':
                return true;
           
        }
     return false;
    }

    private  boolean  isLogicOperator (char c ){
        switch (c) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '=':
            case '<':
            case '>':
                return true;
           
        }
     return false;
    }

    
}



