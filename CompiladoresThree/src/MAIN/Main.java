package MAIN;

import Gramaticaaa.GramaticaLexer;
import Gramaticaaa.GramaticaParser;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.antlr.v4.runtime.CharStreams.fromStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String CodigoFonte =
                " int main() { \n"+
                        "int numero1=123;\n"+
                        "int numero2=456;\n"+
                        "int resultado=numero1+numero2;\n"+
                        "return resultado;\n"+
                        "}\n"+
                        "float calcularMedia(float nota1, float nota2) {\n"+
                        "float media=(nota1+nota2)/2.0;\n"+
                        "if (media>=6.0) {\n"+
                        "println(\"Aprovado!\");\n"+
                        "} else {\n"+
                        "println(\"Reprovado.\");\n"+
                        "}\n"+
                        "return media;\n"+
                        "}\n"+
                        "void saudacao() {\n"+
                        "char mensagem[]=\"OlÃ¡, mundo!\";\n"+
                        "int numero=42;\n"+
                        "println(mensagem);\n"+
                        "println(\"O nÃºmero Ã©: \" + numero);\n"+
                        "}\n"+
                        "// Este Ã© um comentÃ¡rio de linha.\n"+
                        "int dobrar(int x) {\n"+
                        " \n"+
                        "\n"+
                        "return x * 2;\n"+
                        "}\n"+
                        "void imprimirValores(int valores[]) {\n"+
                        "for (int i = 0; i < valoreslength; i++) {\n"+
                        "println(\"Valor[\" + i + \"] = \" + valores[i]);\n"+
                        "}\n"+
                        "}\n"
                ;
        InputStream input  = new ByteArrayInputStream(CodigoFonte.getBytes(StandardCharsets.UTF_8));
        CharStream input2 = fromStream(input);
        GramaticaLexer lexico = new GramaticaLexer(input2);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        GramaticaParser sintatico = new GramaticaParser(tokens);
        GramaticaParser.ProgramaContext arvore  = sintatico.programa();
        Lexico a = new Lexico(CodigoFonte);

        while(true){

            System.out.println("Aperte 1 para gerar a arvore sintatica  e 2 para iniciar a analise semântica e 3 para parar o loop");
            int b = s.nextInt();

            if (b == 1){
                System.out.println(arvore.toStringTree(sintatico));
            }else if (b == 2 && arvore != null){
                String we = " char mensagem[]=\"OlÃ¡, mundo!\";\n"
                           +"float y = j ; "+
                            "float x = 2.0 + 3.0/4.0 * 5.0 ;"
                           +"int x ;"
                           +"int x = 15;"
                             ;
                Lexico xyz = new Lexico(we);
               Semantico x = new Semantico(xyz.ReturnTabelaDeTokens());
               boolean rt = x.Validação();
                System.out.println(rt);


            }else if (b == 3){
                break;
            }else {
                System.out.println("Input incorreto");
            }

        }








    }
}

