package Analisador_Lexico;

import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
    private static String PalavraReservada[] = { "int", "float","double", "char", "boolean", "void", "if", "else", "for", "while", "scanf", "println", "return", "public", "private", "System","out" };
           
    private static String Operadores[] = { "=", "+", "-", "*", "/", "%", "&&", "||", "!", "++", "--" };
    private static String Comparação[] = { ">", ">=", "<", "<=", "!=", "==" };

    public static void main(String [ ] args)  {
        
        ArrayList<String> ListaDeTokens = new ArrayList<>();
        // ArrayList<String> simbolos = new ArrayList<>();
        ArrayList<String> ListaDeSimb = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        String argumentos = " void imprimirValores ( int valores [ ] ) { for ( int i = 0 ; i < valores.length ; i ++ ) { } }   ";
        // argumentos   = input.nextLine();
        
        lex analisador = new lex();
        char letra;
        int id = 0;

        for (int i = 0; i < argumentos.length(); i++) {
            letra = argumentos.charAt(i);
            if (letra == ' ') {
                if (analisador.getLexema().contains("/*")) {
                     new Exception();
                }
                else if(analisador.getLexema() == " "){

                    analisador.setLexema(""); // isso serve para limpar o lexema , para os proximos poderem ser identificados

                }
                else if (PalavraResevada(analisador.getLexema())) { // verifica se é palavra reservada 

                    // System.out.println(analisador.getLexema() );
                    ListaDeTokens.add("Palavra resevada: " + analisador.getLexema());
                    analisador.setLexema("");

                } else if (Num(analisador.getLexema())) { // verifica se é um numero

                    if (NumInt(analisador.getLexema())) { // verifica se é um numero inteiro

                        ListaDeTokens.add("Num Int: " + analisador.getLexema());

                    } else {// verifica se é um numero double 

                        ListaDeTokens.add("Num Dec: " + analisador.getLexema());
                    }
                    analisador.setLexema("");

                } else if (!PalavraResevada(analisador.getLexema()) && ((analisador.getLexema().charAt(0) >= 'a'
                        && analisador.getLexema().charAt(0) <= 'z')
                        || (analisador.getLexema().charAt(0) >= 'A' && analisador.getLexema().charAt(0) <= 'Z'))) { //verifica se é um ID

                    if (ListaDeSimb.contains(analisador.getLexema())) { // verifica se o ID ja foi declarado

                        for (int j = 0; j < ListaDeSimb.size(); j++) { //Procura o ID e retorna o numero dela na tabela de simbolos 
                            if (ListaDeSimb.get(j).equalsIgnoreCase(analisador.getLexema())) {
                                j++;
                                ListaDeTokens.add("id " + j + ": " + analisador.getLexema());
                                break;
                            }
                        }

                    } else { // se for um simbolo novo ele  o coloca na tabela de simbolos e retorna o ID
                          
                        ListaDeSimb.add(analisador.getLexema());
                        id++;
                        ListaDeTokens.add("id " + id + ": " + analisador.getLexema());

                    }

                    analisador.setLexema("");
                } else if (analisador.getLexema().charAt(0) == '"') { //verifica se é texto entre aspas  , não esta funcionando

                    int cont = 0;
                    
                    for (int j = i; j < argumentos.length(); j++) {
                        if (cont == 2 ) {
                            ListaDeTokens.add("Texto : " + analisador.getLexema());
                            break;
                        }
                        char letraAux = argumentos.charAt(j);
                        analisador.setLetra(letraAux);
                        if (letraAux == '"' || letraAux=='"')  {
                            cont++;
                        } 
                    }
                    analisador.setLexema("");

                } else if (analisador.getLexema().charAt(0) == '/' ) {// verifica se é comentario , não funcional
                    if (analisador.getLexema().length() >1) {
                        if (analisador.getLexema().charAt(1) == '/') {
                             int j = i;
                       for (j = i; argumentos.charAt(j) != '\n'; j++) {
                                                                  
                        }
                    
                        }
                    }
                   
                    analisador.setLexema("");

                }
                else if (Operadores(analisador.getLexema())) { // verifica se é operador 

                    ListaDeTokens.add("Operador :" + analisador.getLexema());
                    analisador.setLexema("");

                } else if (SimbEspecial(analisador.getLexema())) { // verifica se é simbolo especial

                    ListaDeTokens.add("Simbolo : " + analisador.getLexema());
                    analisador.setLexema("");

                }

            }else{
                    analisador.setLetra(letra); // incrementa o lexema
              
            }

        }

        input.close(); // fecha Scanner 
        System.out.println("Lista de Simbolos: "); // imprime a lista de simbolos
        for (int x = 0; x < ListaDeSimb.size(); x++) {
            System.out.println(ListaDeSimb.get(x));
        }

        System.out.println(" ");

        System.out.println("Tabela de tokens: "); // imprime lista de tokens 
        for (int z = 0; z < ListaDeTokens.size(); z++) {
            System.out.println(ListaDeTokens.get(z));
        }
    }



    private static boolean SimbEspecial(String lexema) {
        char auxChar = lexema.charAt(0);
        if (auxChar == '(') {
            return true;
        }
        if (auxChar == ')') {
            return true;
        }
        if (auxChar == '[') {
            return true;
        }
        if (auxChar == ']') {
            return true;
        }
        if (auxChar == '{') {
            return true;
        }
        if (auxChar == '}') {
            return true;
        }
        if (auxChar == ',') {
            return true;
        }
        if (auxChar == ';') {
            return true;
        }
        if (auxChar == '.') {
            return true;
        }
        return false;
    }

    private static boolean Operadores(String lexema) { // procura na lista de Operadores 
        for (int i = 0; i < Comparação.length; i++) {
            if (Comparação[i].contains(lexema) || Operadores[i].contains(lexema)) {
                return true;
            }
        }
        return false;
    }

    private static boolean Num(String lexema) {
        char aux = lexema.charAt(0);
        int aux2 = 0; // 
        if (aux >= '0' && aux <= '9') {
            for (int i = 0; i < lexema.length(); i++) {
                aux = lexema.charAt(i);
                if (aux >= '0' && aux <= '9') {
                    // passa para o proximo laço sem fazer nada , se por exemplo for 29
                } else if (aux == '.' && aux != 1) {
                    aux2++; // saber se é decimal
                } else {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    private static boolean NumInt(String lexema) {  // verifica se é numero inteiro
        char aux;
        for (int i = 0; i < lexema.length(); i++) {
            aux = lexema.charAt(i);
            if (aux == '.') {
                return false;
            }
        }
        return true;
    }

    private static void addChar(char letra, String lexema) {
        lexema += letra;
    }

    private static boolean PalavraResevada(String lexema) { //verifica se é palavra reservada
        for (int i = 0; i < PalavraReservada.length; i++) {
            if (PalavraReservada[i].contains(lexema)) {
                return true;
            }
        }
        return false;
    }
}

