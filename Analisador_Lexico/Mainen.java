package Analisador_Lexico;
import java.util.regex.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mainen{
    public static void main(String[] args) throws FileNotFoundException {
        String PalavraReservada[] = new String[]{"int" , "float","double" ,  "char", "boolean" , "void" , "for", "while" ,"println", "return" , "if", "else","System", "out", "scanf","new"};
        String Simbolos[] = new String[]{"main", "String" , "args", };
        String SimbolosEspeciais[] = new String[]{"(",")","[","]","{","}",".",";",";"};
        String SimbolosOperadores[] = new String[]{"+", "-" , "=", "*", "/","%","&&","||", "!",};
        String SimbolosDeComparação[] = new String[]{">","<", ">=","<=","!=","=="};
        
        File CodigoFonte = new File ("C:\\Users\\samue\\OneDrive\\Área de Trabalho\\Codigo\\codigofonte.txt");
        @SuppressWarnings("resource") 
        Scanner s = new Scanner(CodigoFonte);
        String TrechoDeCodigo = "";
        String TodoCodigo = "";
         
        while (s.hasNextLine()) { 
        TrechoDeCodigo = s.nextLine();
        TodoCodigo += TrechoDeCodigo;
        TodoCodigo += "\n";
        }
        // "(?<!\")\\s+|(?=[,;()\"'])|(?<=[,;()\"'])"
        String[] c = TodoCodigo.split("\\s+|(?<=[()\\[\\]{};])|(?=[()\\[\\]{};])|(?<=\\.)");

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        

       s.close(); 
    }
}