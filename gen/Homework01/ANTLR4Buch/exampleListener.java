// Generated from C:/Users/Chris/IdeaProjects/FormaleSprachen01_hello/src/main/java/Homework01/ANTLR4Buch\example.g4 by ANTLR 4.8
package Homework01.ANTLR4Buch;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link exampleParser}.
 */
public interface exampleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link exampleParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(exampleParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link exampleParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(exampleParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link exampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(exampleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link exampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(exampleParser.ExprContext ctx);
}