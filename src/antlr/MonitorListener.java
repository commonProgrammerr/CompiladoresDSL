// Generated from Monitor.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MonitorParser}.
 */
public interface MonitorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MonitorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MonitorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MonitorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attr}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterAttr(MonitorParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attr}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitAttr(MonitorParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Block}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MonitorParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MonitorParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Func}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterFunc(MonitorParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Func}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitFunc(MonitorParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterIf(MonitorParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitIf(MonitorParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Else}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterElse(MonitorParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Else}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitElse(MonitorParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterWhile(MonitorParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitWhile(MonitorParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Decl}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterDecl(MonitorParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decl}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitDecl(MonitorParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Log}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterLog(MonitorParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Log}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitLog(MonitorParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Emit}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterEmit(MonitorParser.EmitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Emit}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitEmit(MonitorParser.EmitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Listener}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterListener(MonitorParser.ListenerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Listener}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitListener(MonitorParser.ListenerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(MonitorParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(MonitorParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Group}
	 * labeled alternative in {@link MonitorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGroup(MonitorParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Group}
	 * labeled alternative in {@link MonitorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGroup(MonitorParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Op}
	 * labeled alternative in {@link MonitorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOp(MonitorParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Op}
	 * labeled alternative in {@link MonitorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOp(MonitorParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link MonitorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(MonitorParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link MonitorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(MonitorParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Const}
	 * labeled alternative in {@link MonitorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConst(MonitorParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Const}
	 * labeled alternative in {@link MonitorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConst(MonitorParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link MonitorParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MonitorParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitorParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MonitorParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MonitorParser#arr}.
	 * @param ctx the parse tree
	 */
	void enterArr(MonitorParser.ArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitorParser#arr}.
	 * @param ctx the parse tree
	 */
	void exitArr(MonitorParser.ArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MonitorParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(MonitorParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitorParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(MonitorParser.ArgsContext ctx);
}