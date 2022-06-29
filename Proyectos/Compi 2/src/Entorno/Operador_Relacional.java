package Entorno;

public class Operador_Relacional {

    public Integer Identificar(String operador_relacional){
        if(operador_relacional.equals("<") || operador_relacional.equals(".lt.")){
            return 1;
        } else if (operador_relacional.equals(">") || operador_relacional.equals(".gt.")) {
            return  2;
        } else if (operador_relacional.equals("<=") || operador_relacional.equals(".le.")) {
            return  3;
        } else if (operador_relacional.equals(">=") || operador_relacional.equals(".ge.")) {
            return  4;
        } else if (operador_relacional.equals("==") || operador_relacional.equals(".eq.")) {
            return  5;
        } else if (operador_relacional.equals("/=") || operador_relacional.equals(".ne.")) {
            return  6;
        } else if (operador_relacional.equals("*")) {
            return 7;
        } else if (operador_relacional.equals("**")) {
            return 8;
        } else if (operador_relacional.equals("+")) {
            return 9;
        } else if (operador_relacional.equals("-")) {
            return 10;
        } else if (operador_relacional.equals("/")) {
            return 11;
        } else if (operador_relacional.equals(".and.")) {
            return 12;
        } else if (operador_relacional.equals(".or.")) {
            return 13;
        } else  {
            System.out.println("Error: Operacion invalida.");
        }
            return 0;
    }








}
