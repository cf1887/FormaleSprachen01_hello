// Generated from C:/Users/Chris/IdeaProjects/FormaleSprachen01_hello/src/main/java/Homework01/ANTLR4Buch\example.g4 by ANTLR 4.8
package Homework01.ANTLR4Buch;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link exampleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface exampleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link exampleParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(exampleParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link exampleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(exampleParser.ExprContext ctx);
}