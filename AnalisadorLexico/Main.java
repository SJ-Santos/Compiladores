package AnalisadorLexico;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
       
        String CodigoFonte = " int main() { \n"+
            "int numero1 = 123;\n"+
            "int numero2 = 456;\n"+
            "int resultado = numero1 + numero2;\n"+
            "return resultado;\n"+
            "}\n"+
            "float calcularMedia(float nota1, float nota2) {\n"+
            "float media = (nota1 + nota2) / 2.0;\n"+
            "if (media >= 6.0) {\n"+
            "println(\"Aprovado!\");\n"+
            "} else {\n"+
            "println(\"Reprovado.\");\n"+
            "}\n"+
            "return media;\n"+
            "}\n"+
            "void saudacao() {\n"+
            "char mensagem[] = \"OlÃ¡, mundo!\";\n"+
            "int numero = 42;\n"+
            "println(mensagem);\n"+
            "println(\"O nÃºmero Ã©: \" + numero);\n"+
            "}\n"+
            "// Este Ã© um comentÃ¡rio de linha.\n"+
            "int dobrar(int x) {\n"+
            "/* Este Ã© um comentÃ¡rio\n"+
            "de mÃºltiplas linhas. */\n"+
            "return x * 2;\n"+
            "}\n"+
            "void imprimirValores(int valores[]) {\n"+
            "for (int i = 0; i < valores.length; i++) {\n"+
            "println(\"Valor[\" + i + \"] = \" + valores[i]);\n"+
            "}\n"+
            "}\n";

            Lexico a = new Lexico(CodigoFonte);

            LinkedList<Lexema >  b = a.ReturnTabelaDeTokens();
              
            for(int i =0 ; i < b.size();i++){
                System.out.println(b.get(i));
            }
    
}}
