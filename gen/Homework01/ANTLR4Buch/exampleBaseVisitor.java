// Generated from C:/Users/Chris/IdeaProjects/FormaleSprachen01_hello/src/main/java/Homework01/ANTLR4Buch\example.g4 by ANTLR 4.8
package Homework01.ANTLR4Buch;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link exampleVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class exampleBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements exampleVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitProg(exampleParser.ProgContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpr(exampleParser.ExprContext ctx) { return visitChildren(ctx); }
}