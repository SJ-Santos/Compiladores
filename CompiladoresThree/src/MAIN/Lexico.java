package MAIN;

import java.util.LinkedList;

public class Lexico {

    // Considerações :
    // 1- a maior parte do metodo retorno da tabela de tokens poderia ter utilizado´metodos auxiliares para deixar o codigo
    // com um entendimento mais facil , metade da classe é so ele , então fica facil de se perder
    // 2- ele so funciona com a linguagem que esta no main , possivelmente nao pegarira com outras
    // 3- ele poderia ser bem mais eficiente em algumas partes


    private String lexema;
    private char[] CodigoFonte;
    private int ContadorGlobal;
    private LinkedList<String> TabelaDeSimbolos;
    private LinkedList<Lexema> TabelaDeTokens;

    public Lexico(String  codigofonte ){
        this.CodigoFonte = codigofonte.replaceAll("\s", "").toCharArray();
        this.ContadorGlobal = 0;
        this.lexema = "";
        TabelaDeSimbolos = new LinkedList<String >();
        TabelaDeTokens = new LinkedList<Lexema>();

    }

    private  void preencherTabelaDeTokens(Lexema  l){
        this.TabelaDeTokens.addLast(l);

    }


    private  void  preencherTabelaDeSimbolos (String l){
        this.TabelaDeSimbolos.addLast(l);

    }

    public   int consultaNatabelaDeSimbolos ( String l){ // se achar na tabela de simbolos ele retorna a posição , se não ele retorna a posição que o novo id foi colocado

        boolean jaTem = false;
        for(int i=0; i<this.TabelaDeSimbolos.size();i++){
            if (l.equals(this.TabelaDeSimbolos.get(i)) == true) {
                jaTem = true ;
                return i+1;

            }
        }
        if (jaTem == false ) {
            preencherTabelaDeSimbolos(l);
            return this.TabelaDeSimbolos.size();
        }

        return -1;
    }



    public  LinkedList<Lexema>  ReturnTabelaDeTokens() throws Exception{
        Lexema input ;

        while (this.ContadorGlobal < this.CodigoFonte.length) {

            // palavras reservadas :
            //    int ,double, char, String ,float,boolean,void,while, main, return , println , if,else,

            if (Character.isLetter(this.CodigoFonte[this.ContadorGlobal]) == true){ //testa se é palavra reservada ou id
                // obs : essa parte das palavras reservadas emula em automato

                if (this.CodigoFonte[this.ContadorGlobal] == 'i' && this.CodigoFonte[this.ContadorGlobal+1] == 'n' && this.CodigoFonte[this.ContadorGlobal+2] == 't') { // se é int

                    this.lexema = this.lexema+ this.CodigoFonte[this.ContadorGlobal] + this.CodigoFonte[this.ContadorGlobal+1] + this.CodigoFonte[this.ContadorGlobal+2] ;
                    this.ContadorGlobal = this.ContadorGlobal+3;
                    input = new Lexema("Palavra Reservada : ", lexema);
                    preencherTabelaDeTokens(input);
                    this.lexema = "";

                }else if (this.CodigoFonte[this.ContadorGlobal] == 'd' && this.CodigoFonte[this.ContadorGlobal+1] == 'o' && this.CodigoFonte[this.ContadorGlobal+2] =='u' && this.CodigoFonte[this.ContadorGlobal+3] == 'b'&& this.CodigoFonte[this.ContadorGlobal+4] == 'l' && this.CodigoFonte[this.ContadorGlobal+5] == 'e' ) {
                    //verifica se é double

                    this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal+1] + this.CodigoFonte[this.ContadorGlobal+2] + this.CodigoFonte[this.ContadorGlobal+3]  + this.CodigoFonte[this.ContadorGlobal+4]+this.CodigoFonte[this.ContadorGlobal+5];
                    this.ContadorGlobal = this.ContadorGlobal + 6;
                    input = new Lexema("Palavra Reservada : ", lexema);
                    preencherTabelaDeTokens(input);
                    this.lexema = "";


                }else if (this.CodigoFonte[this.ContadorGlobal] == 'c' && this.CodigoFonte[this.ContadorGlobal+1] == 'h' && this.CodigoFonte[this.ContadorGlobal+2] == 'a' && this.CodigoFonte[this.ContadorGlobal+3] == 'r') { //verifica se é char

                    this.lexema = this.lexema+ this.CodigoFonte[this.ContadorGlobal]  + this.CodigoFonte[this.ContadorGlobal+1]+ this.CodigoFonte[this.ContadorGlobal+2]+this.CodigoFonte[this.ContadorGlobal+3];
                    this.ContadorGlobal = this.ContadorGlobal + 4;
                    input = new Lexema("Palavra Reservada : ", lexema);
                    preencherTabelaDeTokens(input);
                    this.lexema = "";


                }else if (this.CodigoFonte[this.ContadorGlobal] == 'S' && this.CodigoFonte[this.ContadorGlobal+1] == 't' && this.CodigoFonte[this.ContadorGlobal+2] == 'r' && this.CodigoFonte[this.ContadorGlobal+3] == 'i' && this.CodigoFonte[this.ContadorGlobal+4] == 'n' && this.CodigoFonte[this.ContadorGlobal+5] =='g') {
                    //verifica se é String

                    this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal]+ this.CodigoFonte[this.ContadorGlobal+1] + this.CodigoFonte[this.ContadorGlobal+2] + this.CodigoFonte[this.ContadorGlobal+3] + this.CodigoFonte[this.ContadorGlobal+4] + this.CodigoFonte[this.ContadorGlobal+5] ;
                    this.ContadorGlobal = this.ContadorGlobal + 6;
                    input = new Lexema("Palavra Reservada : ", lexema);
                    preencherTabelaDeTokens(input);
                    this.lexema = "";

                }else if (this.CodigoFonte[this.ContadorGlobal] == 'f' && this.CodigoFonte[this.ContadorGlobal+1] == 'l' && this.CodigoFonte[this.ContadorGlobal+2] == 'o' && this.CodigoFonte[this.ContadorGlobal+3] == 'a' && this.CodigoFonte[this.ContadorGlobal+4] == 't') { // verifica se é float

                    this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal]+ this.CodigoFonte[this.ContadorGlobal+1] + this.CodigoFonte[this.ContadorGlobal+2] + this.CodigoFonte[this.ContadorGlobal+3] + this.CodigoFonte[this.ContadorGlobal+4] ;
                    this.ContadorGlobal = this.ContadorGlobal + 5;
                    input = new Lexema("Palavra Reservada : ", lexema);
                    preencherTabelaDeTokens(input);
                    this.lexema = "";

                }else if (this.CodigoFonte[this.ContadorGlobal] == 'b' && this.CodigoFonte[this.ContadorGlobal+1] == 'o' && this.CodigoFonte[this.ContadorGlobal+2] == 'o' && this.CodigoFonte[this.ContadorGlobal+3] == 'l' && this.CodigoFonte[this.ContadorGlobal+4] == 'e' && this.CodigoFonte[this.ContadorGlobal+5] == 'a' && this.CodigoFonte[this.ContadorGlobal+6] == 'n' ) {
                    // verifica se é boolean

                    this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal]+ this.CodigoFonte[this.ContadorGlobal+1] + this.CodigoFonte[this.ContadorGlobal+2] + this.CodigoFonte[this.ContadorGlobal+3] + this.CodigoFonte[this.ContadorGlobal+4] + this.CodigoFonte[this.ContadorGlobal+5] + this.CodigoFonte[this.ContadorGlobal+6];
                    this.ContadorGlobal = this.ContadorGlobal + 7;
                    input = new Lexema("Palavra Reservada : ", lexema);
                    preencherTabelaDeTokens(input);
                    this.lexema = "";

                }else if (this.CodigoFonte[this.ContadorGlobal] == 'v' && this.CodigoFonte[this.ContadorGlobal+1] == 'o' && this.CodigoFonte[this.ContadorGlobal+2] == 'i' && this.CodigoFonte[this.ContadorGlobal+3] == 'd' ) { // verifica se é void

                    this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal]+ this.CodigoFonte[this.ContadorGlobal+1] + this.CodigoFonte[this.ContadorGlobal+2] + this.CodigoFonte[this.ContadorGlobal+3];
                    this.ContadorGlobal = this.ContadorGlobal + 4;
                    input = new Lexema("Palavra Reservada : ", lexema);
                    preencherTabelaDeTokens(input);
                    this.lexema = "";

                }else if (this.CodigoFonte[this.ContadorGlobal] == 'w' && this.CodigoFonte[this.ContadorGlobal+1] == 'h' && this.CodigoFonte[this.ContadorGlobal+2] == 'i' && this.CodigoFonte[this.ContadorGlobal+3] == 'l' && this.CodigoFonte[this.ContadorGlobal+4] == 'e' ) { // verifica se é while


                    this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal]+ this.CodigoFonte[this.ContadorGlobal+1] + this.CodigoFonte[this.ContadorGlobal+2] + this.CodigoFonte[this.ContadorGlobal+3] + this.CodigoFonte[this.ContadorGlobal+4] ;
                    this.ContadorGlobal = this.ContadorGlobal + 5;
                    input = new Lexema("Palavra Reservada : ", lexema);
                    preencherTabelaDeTokens(input);
                    this.lexema = "";

                }else if (this.CodigoFonte[this.ContadorGlobal] == 'r' && this.CodigoFonte[this.ContadorGlobal+1] == 'e' && this.CodigoFonte[this.ContadorGlobal+2] == 't' && this.CodigoFonte[this.ContadorGlobal+3] == 'u' && this.CodigoFonte[this.ContadorGlobal+4] == 'r' && this.CodigoFonte[this.ContadorGlobal+5] == 'n' ) { // verifica se é return

                    this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal]+ this.CodigoFonte[this.ContadorGlobal+1] + this.CodigoFonte[this.ContadorGlobal+2] + this.CodigoFonte[this.ContadorGlobal+3] + this.CodigoFonte[this.ContadorGlobal+4] + this.CodigoFonte[this.ContadorGlobal+5] ;
                    this.ContadorGlobal = this.ContadorGlobal + 6;
                    input = new Lexema("Palavra Reservada : ", lexema);
                    preencherTabelaDeTokens(input);
                    this.lexema = "";

                }else if (this.CodigoFonte[this.ContadorGlobal] == 'p' && this.CodigoFonte[this.ContadorGlobal+1] == 'r' && this.CodigoFonte[this.ContadorGlobal+2] == 'i' && this.CodigoFonte[this.ContadorGlobal+3] == 'n' && this.CodigoFonte[this.ContadorGlobal+4] == 't' && this.CodigoFonte[this.ContadorGlobal+5] == 'l' && this.CodigoFonte[this.ContadorGlobal+6] == 'n' ) {

                    this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal]+ this.CodigoFonte[this.ContadorGlobal+1] + this.CodigoFonte[this.ContadorGlobal+2] + this.CodigoFonte[this.ContadorGlobal+3] + this.CodigoFonte[this.ContadorGlobal+4] + this.CodigoFonte[this.ContadorGlobal+5] + this.CodigoFonte[this.ContadorGlobal+6];
                    this.ContadorGlobal = this.ContadorGlobal + 7;
                    input = new Lexema("Palavra Reservada : ", lexema);
                    preencherTabelaDeTokens(input);
                    this.lexema = "";

                }else if (this.CodigoFonte[this.ContadorGlobal] == 'e' && this.CodigoFonte[this.ContadorGlobal+1] == 'l' && this.CodigoFonte[this.ContadorGlobal+2] == 's' && this.CodigoFonte[this.ContadorGlobal+3] == 'e' ) {

                    this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal]+ this.CodigoFonte[this.ContadorGlobal+1] + this.CodigoFonte[this.ContadorGlobal+2] + this.CodigoFonte[this.ContadorGlobal+3] ;
                    this.ContadorGlobal = this.ContadorGlobal + 4;
                    input = new Lexema("Palavra Reservada : ", lexema);
                    preencherTabelaDeTokens(input);
                    this.lexema = "";

                }else if (this.CodigoFonte[this.ContadorGlobal] == 'i' && this.CodigoFonte[this.ContadorGlobal+1] == 'f') {

                    this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal]+ this.CodigoFonte[this.ContadorGlobal+1] ;
                    this.ContadorGlobal = this.ContadorGlobal + 2;
                    input = new Lexema("Palavra Reservada : ", lexema);
                    preencherTabelaDeTokens(input);
                    this.lexema = "";

                } else if (this.CodigoFonte[this.ContadorGlobal] == 'f' && this.CodigoFonte[this.ContadorGlobal+1] == 'o' && this.CodigoFonte[this.ContadorGlobal+2] == 'r') { // se é int

                    this.lexema = this.lexema+ this.CodigoFonte[this.ContadorGlobal] + this.CodigoFonte[this.ContadorGlobal+1] + this.CodigoFonte[this.ContadorGlobal+2] ;
                    this.ContadorGlobal = this.ContadorGlobal+3;
                    input = new Lexema("Palavra Reservada : ", lexema);
                    preencherTabelaDeTokens(input);
                    this.lexema = "";

                }
                else { // não é uma palavra reservada , então é ID

                    for ( int i = this.ContadorGlobal ; i< this.CodigoFonte.length ; i++ ){
                        if (Character.isDigit(this.CodigoFonte[i])) {

                            this.lexema = this.lexema + this.CodigoFonte[i];

                        }else if (Character.isLetter(this.CodigoFonte[i])) {

                            this.lexema = this.lexema + this.CodigoFonte[i];

                        }else if (this.CodigoFonte[i] == '_'){

                            this.lexema = this.lexema + this.CodigoFonte[i];

                        }else {

                            //input  = new Lexema("ID" + consultaNatabelaDeSimbolos(lexema) + " : ", "")

                            input  = new Lexema("ID" + " : ", "" , this.TabelaDeTokens.getLast().getLexema()) ;
                            preencherTabelaDeTokens(input);
                            this.ContadorGlobal = i;
                            this.lexema = "";
                            break;


                        }
                    }


                }

            } else if (this.CodigoFonte[this.ContadorGlobal] == '"') { // testa se é texto

                int contador_de_aspas = 0;

                for(int u = this.ContadorGlobal ; u <this.CodigoFonte.length ;u++ ){

                    if(this.CodigoFonte[u] == '"'){

                        contador_de_aspas++;

                        if (contador_de_aspas == 2) {

                            this.lexema = this.lexema + this.CodigoFonte[u];
                            input = new Lexema("Texto : ", this.lexema);
                            preencherTabelaDeTokens(input);
                            this.lexema = "";
                            this.ContadorGlobal = u+1;
                            break;

                        }

                        this.lexema = this.lexema + this.CodigoFonte[u];

                    }else {

                        this.lexema = this.lexema + this.CodigoFonte[u];

                    }

                }

            }else if(Character.isDigit(this.CodigoFonte[this.ContadorGlobal])){ // testa se é num double ou  num int

                boolean isDouble = false ;
                int i ;
                for( i = this.ContadorGlobal ; i < this.CodigoFonte.length ;i++){

                    if (Character.isDigit(this.CodigoFonte[i])) { // num int

                        this.lexema = this.lexema + this.CodigoFonte[i];

                    }else if (this.CodigoFonte[i] == '.') { // num double
                        isDouble = true ;
                        this.lexema = this.lexema + this.CodigoFonte[i];

                    }else {

                        break;
                    }
                }
                if (isDouble) {

                    input = new Lexema("NumDouble : ", this.lexema);
                    preencherTabelaDeTokens(input);
                    this.lexema = "";
                    this.ContadorGlobal = i ;


                }else {

                    input = new Lexema("NumInt : ", this.lexema);
                    preencherTabelaDeTokens(input);
                    this.lexema = "";
                    this.ContadorGlobal = i ;


                }


            }else if (this.isSpecialSymbol(this.CodigoFonte[this.ContadorGlobal]) ){ //testa se é simbolo especial

                this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                input = new Lexema("Simbolo Especial : ", this.lexema);
                preencherTabelaDeTokens(input);
                this.lexema = "";
                this.ContadorGlobal++;

            }else if (this.CodigoFonte[this.ContadorGlobal] == '/' && (this.CodigoFonte[this.ContadorGlobal+1] == '/' ||this.CodigoFonte[this.ContadorGlobal+1] == '*')){ // testa se é comentario

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
                            break;
                        }else {
                            this.lexema = this.lexema + this.CodigoFonte[i];

                        }

                    }

                }else if (this.CodigoFonte[this.ContadorGlobal+1] == '*') {



                    throw new Exception();

                }

            }
            else if (this.isLogicOperator(this.CodigoFonte[this.ContadorGlobal]) ){ // testa se é operador logico

                //operadores  logicos +,-,*,/,=,==,<,>,<=,>=
                if (this.CodigoFonte[this.ContadorGlobal] == '+') {

                    this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                    input = new Lexema("Operador Lógico : ", this.lexema);
                    this.preencherTabelaDeTokens(input);
                    this.ContadorGlobal ++;
                    this.lexema = "";

                }else if (this.CodigoFonte[this.ContadorGlobal] == '-') {

                    this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                    input = new Lexema("Operador Lógico : ", this.lexema);
                    this.preencherTabelaDeTokens(input);
                    this.ContadorGlobal ++;
                    this.lexema = "";

                }else if (this.CodigoFonte[this.ContadorGlobal] == '*') {

                    this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                    input = new Lexema("Operador Lógico : ", this.lexema);
                    this.preencherTabelaDeTokens(input);
                    this.ContadorGlobal ++;
                    this.lexema = "";

                }else if (this.CodigoFonte[this.ContadorGlobal] == '/'){

                    this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                    input = new Lexema("Operador Lógico : ", this.lexema);
                    this.preencherTabelaDeTokens(input);
                    this.ContadorGlobal ++;
                    this.lexema = "";

                }else if (this.CodigoFonte[this.ContadorGlobal] == '=') {

                    if (this.CodigoFonte[this.ContadorGlobal+1] == '=') {

                        this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                        this.ContadorGlobal ++;
                        this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                        this.ContadorGlobal ++;
                        input = new Lexema("Operador Lógico : ", this.lexema);
                        this.preencherTabelaDeTokens(input);
                        this.lexema = "";

                    }else {

                        this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                        input = new Lexema("Operador Lógico : ", this.lexema);
                        this.preencherTabelaDeTokens(input);
                        this.ContadorGlobal ++;
                        this.lexema = "";

                    }



                }else if (this.CodigoFonte[this.ContadorGlobal] == '<') {

                    if (this.CodigoFonte[this.ContadorGlobal+1] == '=') {

                        this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                        this.ContadorGlobal ++;
                        this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                        this.ContadorGlobal ++;
                        input = new Lexema("Operador Lógico : ", this.lexema);
                        this.preencherTabelaDeTokens(input);
                        this.lexema = "";

                    }else {

                        this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                        input = new Lexema("Operador Lógico : ", this.lexema);
                        this.preencherTabelaDeTokens(input);
                        this.ContadorGlobal ++;
                        this.lexema = "";

                    }



                }else if (this.CodigoFonte[this.ContadorGlobal] == '>') {

                    if (this.CodigoFonte[this.ContadorGlobal+1] == '=') {

                        this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                        this.ContadorGlobal ++;
                        this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                        this.ContadorGlobal ++;
                        input = new Lexema("Operador Lógico : ", this.lexema);
                        this.preencherTabelaDeTokens(input);
                        this.lexema = "";

                    }else {

                        this.lexema = this.lexema + this.CodigoFonte[this.ContadorGlobal];
                        input = new Lexema("Operador Lógico : ", this.lexema);
                        this.preencherTabelaDeTokens(input);
                        this.ContadorGlobal ++;
                        this.lexema = "";

                    }

                }

            } else if (this.CodigoFonte[this.ContadorGlobal] == '\n') {
                this.ContadorGlobal++;
            }else {
                throw new Exception();
            }




        }


        return this.TabelaDeTokens ;

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
            case ',':
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


    public LinkedList<String> returnTabelaDeSimbolos (){
        return this.TabelaDeSimbolos;
    }


}

