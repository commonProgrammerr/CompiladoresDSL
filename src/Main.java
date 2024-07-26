import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import antlr.*;
import compiler.*;
import java.io.*;
import java.util.*;

public class Main {
      
   public static void main(String args[]) throws Exception {
         var input = CharStreams.fromFileName(args[0]);
         MonitorLexer lexer = new MonitorLexer(input);
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         MonitorParser parser = new MonitorParser(tokens);
         MonitorParser.ProgramContext t = parser.program();
         if (t==null) {
            System.out.println("T é nulo!!!!!");
            System.exit(0);
         }
         
         ParseTreeWalker.DEFAULT.walk(new CompileJS(args[0] + ".js"),t);
   }
}