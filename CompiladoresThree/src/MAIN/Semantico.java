package MAIN;
import java.util.LinkedList;

public class Semantico{//verificação de tipos
    private int ContadorGlobal;
    LinkedList<Lexema> lexemas;
    public Semantico(LinkedList<Lexema> input){

        lexemas = input;
        this.ContadorGlobal = 0;

    }

    public boolean Validação(){

        boolean validez = false;
        while(this.ContadorGlobal<lexemas.size()){

            if (lexemas.get(this.ContadorGlobal).getLexema().equals("int")){
                  if (lexemas.get(this.ContadorGlobal+1).getTipo().equals("ID : ")){

                      if (lexemas.get(this.ContadorGlobal+2).getLexema().equals(";")){

                          validez = true;
                          this.ContadorGlobal = this.ContadorGlobal+3;//lembrar de colocar this.contadorGlobal ++ no fim do while

                      }else if (lexemas.get(this.ContadorGlobal+2).getLexema().equals("=")){

                          this.ContadorGlobal = this.ContadorGlobal+3;
                          boolean AnteriorIsID = false;

                          while(true){

                              if ( (  (lexemas.get(this.ContadorGlobal).getTipo().equals("ID : ") && (lexemas.get(this.ContadorGlobal).getIsID().equals("int"))) || (lexemas.get(this.ContadorGlobal).getTipo().equals("NumInt : "))  ) && !AnteriorIsID){

                                  validez = true;
                                  this.ContadorGlobal++;
                                  AnteriorIsID = true;

                              }else if(isOperator(this.lexemas.get(this.ContadorGlobal).getLexema())){

                                  AnteriorIsID =false;
                                  validez = false;
                                  this.ContadorGlobal++;

                              } else if (lexemas.get(this.ContadorGlobal).getLexema().equals(";")) {
                                  this.ContadorGlobal++;
                                  break;

                              } else if (this.isSpecialSymbol(lexemas.get(this.ContadorGlobal).getLexema())) {

                                  this.ContadorGlobal++;

                              } else {
                                  validez = false;

                                  return validez;
                              }

                          }

                      }

                  }

            }else if (lexemas.get(this.ContadorGlobal).getLexema().equals("float")){

                if (lexemas.get(this.ContadorGlobal+1).getTipo().equals("ID : ")){

                    if (lexemas.get(this.ContadorGlobal+2).getLexema().equals(";")){

                        validez = true;
                        this.ContadorGlobal = this.ContadorGlobal+3;//lembrar de colocar this.contadorGlobal ++ no fim do while

                    }else if (lexemas.get(this.ContadorGlobal+2).getLexema().equals("=")){

                        this.ContadorGlobal = this.ContadorGlobal+3;
                        boolean AnteriorIsID = false;

                        while(true){

                            if ( (  (lexemas.get(this.ContadorGlobal).getTipo().equals("ID : ") && (lexemas.get(this.ContadorGlobal).getIsID().equals("float"))) || (lexemas.get(this.ContadorGlobal).getTipo().equals("NumDouble : "))  ) && !AnteriorIsID){

                                validez = true;
                                this.ContadorGlobal++;
                                AnteriorIsID = true;

                            }else if(isOperator(this.lexemas.get(this.ContadorGlobal).getLexema())){

                                AnteriorIsID =false;
                                validez = false;
                                this.ContadorGlobal++;

                            } else if (lexemas.get(this.ContadorGlobal).getLexema().equals(";")) {
                                this.ContadorGlobal++;
                                break;

                            } else if (this.isSpecialSymbol(lexemas.get(this.ContadorGlobal).getLexema())) {

                                this.ContadorGlobal++;

                            } else {
                                validez = false;

                                return validez;
                            }

                        }

                    }

                }

            }else if (lexemas.get(this.ContadorGlobal).getLexema().equals("char")){
                boolean AnteriorIsTexto = false;
                if (lexemas.get(this.ContadorGlobal+1).getTipo().equals("ID : ")){

                    if (lexemas.get(this.ContadorGlobal+2).getLexema().equals("[")){
                        if (lexemas.get(this.ContadorGlobal+3).getLexema().equals("]")){

                            if (lexemas.get(this.ContadorGlobal+4).getLexema().equals(";")){

                                validez = true;
                                this.ContadorGlobal = this.ContadorGlobal+5;

                            }else if (lexemas.get(this.ContadorGlobal+4).getLexema().equals("=")){
                                this.ContadorGlobal = this.ContadorGlobal+5;
                                   while(true){

                                     if (lexemas.get(this.ContadorGlobal).getTipo().equals("Texto : ") && !AnteriorIsTexto){
                                         validez = true;
                                         AnteriorIsTexto = true;
                                         this.ContadorGlobal++;
                                     } else if (lexemas.get(this.ContadorGlobal).getLexema().equals("+") && AnteriorIsTexto) {

                                         validez = true;
                                         this.ContadorGlobal++;
                                         AnteriorIsTexto = false;

                                     } else if (lexemas.get(this.ContadorGlobal).getLexema().equals(";")) {
                                         this.ContadorGlobal++;
                                         break;
                                     }

                                   }

                            }

                        }

                    }

                }

            }

        }


        return validez;
    }

    private boolean isOperator(String c){

        switch (c) {
            case "+":
            case "-":
            case "*":
            case "/":

                return true;

        }
        return false;


    }
    private  boolean isSpecialSymbol(String c ){
        switch (c) {
            case "(":
            case ")":

                return true;

        }
        return false;
    }



}
