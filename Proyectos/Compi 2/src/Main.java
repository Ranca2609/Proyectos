import Entorno.Entorno;
import Gramatica.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import static org.antlr.v4.runtime.CharStreams.fromString;

public class Main {
   /* public static void main(String[] args) {

    */
    /*
        String input = "integer :: var1 = 5" + "\n"+
                "integer :: var1 = 5";
        CharStream cs = fromString(input);
        GramaticaLexer lexico = new GramaticaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        GramaticaParser sintactico = new GramaticaParser(tokens);
        GramaticaParser.StartContext arbol = sintactico.start();
        Visitor visitor = new Visitor(new Entorno(null));
        visitor.visit(arbol);
    }
*/
   public static void main(String[] args) {

    for (int i = 0; i<= 10; i += 2) {
        System.out.println(i);
    }

    }


}