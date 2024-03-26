package Analisador_Lexico;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CodigoReserva {
    private static String aux[] = { "int", "float", "char", "boolean", "void", "if", "else", "for", "while", "scanf", "println", "return", "public", "private" };
           
    private static String aux2[] = { "=", "+", "-", "*", "/", "%", "&&", "||", "!", "++", "--" };
    private static String aux3[] = { ">", ">=", "<", "<=", "!=", "==" };

    public static void main(String[] args) throws FileNotFoundException {
        
        ArrayList<String> ListaDeTokens = new ArrayList<>();
        ArrayList<String> simbolos = new ArrayList<>();
        ArrayList<String> ListaDeSimb = new ArrayList<>();
        File CodigoFonte = new File ("C:\\Users\\samue\\OneDrive\\Área de Trabalho\\Codigo\\codigofonte.txt");
        @SuppressWarnings("resource") 
        Scanner input = new Scanner(CodigoFonte);
        String argumentos = "";
        String TrechoDeCodigo = "";

        while (input.hasNextLine()) { 
            TrechoDeCodigo = input.nextLine();
            argumentos += TrechoDeCodigo;
            argumentos += "\n";
            }

        lex analisador = new lex();
        char letra;
        int id = 0;

        for (int i = 0; i < argumentos.length(); i++) {
            letra = argumentos.charAt(i);
            if (letra == ' ') {
                // categorizar
                if(analisador.getLexema() == " "){
                    analisador.setLexema("");
                }
                else if (PalavraResevada(analisador.getLexema())) {
                    System.out.println(analisador.getLexema()+ 1);
                    ListaDeTokens.add("Palavra resevada: " + analisador.getLexema());
                    analisador.setLexema("");

                } else if (Num(analisador.getLexema())) {
                    if (NumInt(analisador.getLexema())) {
                        ListaDeTokens.add("Num Int: " + analisador.getLexema());

                    } else {
                        ListaDeTokens.add("Num double: " + analisador.getLexema());
                    }
                    analisador.setLexema("");
                } else if (!PalavraResevada(analisador.getLexema()) && ((analisador.getLexema().charAt(0) >= 'a'
                        && analisador.getLexema().charAt(0) <= 'z')
                        || (analisador.getLexema().charAt(0) >= 'A' && analisador.getLexema().charAt(0) <= 'Z'))) {
                    if (ListaDeSimb.contains(analisador.getLexema())) {
                        for (int j = 0; j < ListaDeSimb.size(); j++) {
                            if (ListaDeSimb.get(j).equalsIgnoreCase(analisador.getLexema())) {
                                j++;
                                ListaDeTokens.add("id " + j + ": " + analisador.getLexema());
                                break;
                            }
                        }
                    } else {
                        ListaDeSimb.add(analisador.getLexema());
                        id++;
                        ListaDeTokens.add("id " + id + ": " + analisador.getLexema());
                    }
                    analisador.setLexema("");
                } else if (analisador.getLexema().charAt(0) == '"') {
                    int cont = 0;
                    analisador.setLexema("");
                    for (int j = i; j < argumentos.length(); j++) {
                        char letraAux = argumentos.charAt(j);
                        analisador.setLetra(letraAux);
                        if (letraAux == '"') {
                            cont++;
                        } else if (cont == 2) {
                            ListaDeTokens.add("Texto : " + analisador.getLexema());
                            break;
                        }
                    }
                    analisador.setLexema("");
                } else if (analisador.getLexema().charAt(0) == '/' && analisador.getLexema().charAt(1) == '/') {// comentário
                    int j = i;
                    for (j = i; argumentos.charAt(j) != '\n'; j++) {// vai jogando pro prx até ter uma quebra de
                                                                  // linha
                    }
                    
                    analisador.setLexema("");
                } else if (Operadores(analisador.getLexema())) {
                    ListaDeTokens.add("Operador :" + analisador.getLexema());
                    analisador.setLexema("");
                } else if (SimbEspecial(analisador.getLexema())) {
                    ListaDeTokens.add("Simbolo : " + analisador.getLexema());
                    analisador.setLexema("");
                }

            }else{
                    analisador.setLetra(letra);
              
            }

        }

        input.close();
        System.out.println("Lista de Simbolos: ");
        for (int x = 0; x < ListaDeSimb.size(); x++) {
            System.out.println(ListaDeSimb.get(x));
        }

        System.out.println(" ");

        System.out.println("Tabela de tokens: ");
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

    private static boolean Operadores(String lexema) {
        for (int i = 0; i < aux3.length; i++) {
            if (aux3[i].contains(lexema) || aux2[i].contains(lexema)) {
                return true;
            }
        }
        return false;
    }

    private static boolean Num(String lexema) {
        char aux = lexema.charAt(0);
        int aux2 = 0; // valida se tem apenas 1 ponto .
        if (aux >= '0' && aux <= '9') {
            for (int i = 0; i < lexema.length(); i++) {
                aux = lexema.charAt(i);
                if (aux >= '0' && aux <= '9') {
                    // deixa parado
                } else if (aux == '.' && aux != 1) {
                    aux2++;
                } else {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    private static boolean NumInt(String lexema) {
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

    private static boolean PalavraResevada(String lexema) {
        for (int i = 0; i < aux.length; i++) {
            if (aux[i].contains(lexema)) {
                return true;
            }
        }
        return false;
    }
}

