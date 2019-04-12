// Generated from E:/LFA-TEMA/Antlr\Hello.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(HelloParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(HelloParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(HelloParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(HelloParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(HelloParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(HelloParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(HelloParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(HelloParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(HelloParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(HelloParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#iff}.
	 * @param ctx the parse tree
	 */
	void enterIff(HelloParser.IffContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#iff}.
	 * @param ctx the parse tree
	 */
	void exitIff(HelloParser.IffContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#whhile}.
	 * @param ctx the parse tree
	 */
	void enterWhhile(HelloParser.WhhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#whhile}.
	 * @param ctx the parse tree
	 */
	void exitWhhile(HelloParser.WhhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexpr(HelloParser.AexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexpr(HelloParser.AexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexpr(HelloParser.BexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexpr(HelloParser.BexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(HelloParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(HelloParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#aval}.
	 * @param ctx the parse tree
	 */
	void enterAval(HelloParser.AvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#aval}.
	 * @param ctx the parse tree
	 */
	void exitAval(HelloParser.AvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#bval}.
	 * @param ctx the parse tree
	 */
	void enterBval(HelloParser.BvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#bval}.
	 * @param ctx the parse tree
	 */
	void exitBval(HelloParser.BvalContext ctx);
}