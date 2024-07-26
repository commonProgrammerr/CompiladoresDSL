// Generated from Monitor.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MonitorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MonitorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MonitorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MonitorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attr}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(MonitorParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MonitorParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Func}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(MonitorParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(MonitorParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Else}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(MonitorParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(MonitorParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decl}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(MonitorParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Log}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(MonitorParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Emit}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmit(MonitorParser.EmitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Listener}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListener(MonitorParser.ListenerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link MonitorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(MonitorParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Group}
	 * labeled alternative in {@link MonitorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(MonitorParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Op}
	 * labeled alternative in {@link MonitorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(MonitorParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link MonitorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(MonitorParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Const}
	 * labeled alternative in {@link MonitorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(MonitorParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonitorParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MonitorParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonitorParser#arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr(MonitorParser.ArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonitorParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(MonitorParser.ArgsContext ctx);
}