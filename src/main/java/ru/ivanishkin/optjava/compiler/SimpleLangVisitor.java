// Generated from C:/Users/jetbrains/dev/nsu/optjava/compiler/src/main/resources\SimpleLang.g4 by ANTLR 4.7.2
package ru.ivanishkin.optjava.compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(SimpleLangParser.BinopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(SimpleLangParser.MulOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(SimpleLangParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(SimpleLangParser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(SimpleLangParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#mulExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(SimpleLangParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(SimpleLangParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SimpleLangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimpleLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#declElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclElement(SimpleLangParser.DeclElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(SimpleLangParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(SimpleLangParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(SimpleLangParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(SimpleLangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SimpleLangParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(SimpleLangParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleLangParser.ProgramContext ctx);
}