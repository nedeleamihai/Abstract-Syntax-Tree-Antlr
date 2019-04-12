// Generated from E:/LFA-TEMA/Antlr\Hello.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(HelloParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(HelloParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(HelloParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(HelloParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(HelloParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#iff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIff(HelloParser.IffContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#whhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhhile(HelloParser.WhhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr(HelloParser.AexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexpr(HelloParser.BexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(HelloParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#aval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAval(HelloParser.AvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#bval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBval(HelloParser.BvalContext ctx);
}