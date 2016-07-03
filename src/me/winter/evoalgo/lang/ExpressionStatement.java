package me.winter.evoalgo.lang;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-07-02.</p>
 */
public class ExpressionStatement implements Statement
{
	private StatementExpression<?> expression;

	public ExpressionStatement(StatementExpression<?> expression)
	{
		this.expression = expression;
	}

	@Override
	public void run()
	{
		expression.run();
	}

	@Override
	public String toString()
	{
		return expression.toString() + ";\n";
	}
}
