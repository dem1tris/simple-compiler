// Generated from C:/Users/jetbrains/dev/nsu/optjava/compiler/src/main/resources\SimpleLang.g4 by ANTLR 4.7.2
package ru.ivanishkin.optjava.compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleLangParser}.
 */
public interface SimpleLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(SimpleLangParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(SimpleLangParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimpleLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimpleLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#declElement}.
	 * @param ctx the parse tree
	 */
	void enterDeclElement(SimpleLangParser.DeclElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#declElement}.
	 * @param ctx the parse tree
	 */
	void exitDeclElement(SimpleLangParser.DeclElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(SimpleLangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(SimpleLangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(SimpleLangParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(SimpleLangParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(SimpleLangParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(SimpleLangParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SimpleLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SimpleLangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SimpleLangParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SimpleLangParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(SimpleLangParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(SimpleLangParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleLangParser.ProgramContext ctx);
}