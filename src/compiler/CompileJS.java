import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import antlr.*;

public class CompileJS extends MonitorBaseListener {

  private File out_file;


  public CompileJS(String path) throws FileNotFoundException {
    this.out_file = new File(path);
    PrintStream stream = new PrintStream(out_file);
    System.setOut(stream);
  }
   
  @Override public void enterProgram(MonitorParser.ProgramContext ctx)  { 
    
    // System.out.println("--------------------------");
    System.out.print("const { EventEmitter } = require('node:events');");
    System.out.print("const process_events = new EventEmitter();");
    // System.out.println('\n');
  }
	 
  @Override public void exitProgram(MonitorParser.ProgramContext ctx) {
    // System.out.println("--------------------------");
   }
	 
  @Override public void enterAttr(MonitorParser.AttrContext ctx) { 
    System.out.printf("%s = %s;", ctx.v.getText(), ctx.e.getText());
    // System.out.println();
  }
	 
	 
  @Override public void enterBlock(MonitorParser.BlockContext ctx) { 
    System.out.print('{');
    // System.out.println();
  }
	 
  @Override public void exitBlock(MonitorParser.BlockContext ctx) { 
    System.out.print('}');
    // System.out.println();
  }
	 
  @Override public void enterFunc(MonitorParser.FuncContext ctx) { 
    System.out.printf("async function %s%s", ctx.name.getText(), ctx.arg.getText());
  }
	 
	 
  @Override public void enterIf(MonitorParser.IfContext ctx) { 
    System.out.printf("if (%s) ", ctx.e.getText());
  }
	 

  @Override public void enterElse(MonitorParser.ElseContext ctx) { System.out.print("else "); }
	
	 
  @Override public void enterWhile(MonitorParser.WhileContext ctx) { 
    System.out.printf("while (%s)", ctx.e.getText());
    // System.out.println();
  }
     
   
  @Override public void enterDecl(MonitorParser.DeclContext ctx) { 
    System.out.printf("let %s = %s;", ctx.name.getText(), ctx.vInic.getText());
    // System.out.println();
  }
	 
	 
  @Override public void enterLog(MonitorParser.LogContext ctx) { 
    System.out.printf("console.log(%s);", ctx.e.getText());
    // System.out.println();
  }
	 
	 
  @Override public void enterEmit(MonitorParser.EmitContext ctx) { 
    if(ctx.values != null)
      System.out.printf("process_events.emit(%s, ...%s);", ctx.ev.getText(), ctx.values.getText());
    else
      System.out.printf("process_events.emit(%s, undefined);", ctx.ev.getText());
    // System.out.println();
  }
	 
  @Override public void exitEmit(MonitorParser.EmitContext ctx) { }
	 
  @Override public void enterListener(MonitorParser.ListenerContext ctx) { 
    System.out.printf("process_events.on(%s, %s);", ctx.ev.getText(), ctx.func.getText());
    // System.out.println();
  }

  @Override public void enterFuncCall(MonitorParser.FuncCallContext ctx) { 
    System.out.printf("%s%s;", ctx.func.getText(), ctx.arg.getText());
    // System.out.println();
   }
	 
  @Override public void enterEveryRule(ParserRuleContext ctx) {  }
	 
  @Override public void exitEveryRule(ParserRuleContext ctx) { }
	 
  @Override public void visitTerminal(TerminalNode node) { }
	 
  @Override public void visitErrorNode(ErrorNode node) { }
}
