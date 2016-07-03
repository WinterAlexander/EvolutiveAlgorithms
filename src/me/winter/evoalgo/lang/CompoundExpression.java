package me.winter.evoalgo.lang;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-06-24.</p>
 */
public abstract class CompoundExpression<R, S1, S2> implements Expression<R>
{
	private Expression<S1> subExpression1;
	private Expression<S2> subExpression2;

	public CompoundExpression(Expression<S1> subExpression1, Expression<S2> subExpression2)
	{
		this.subExpression1 = subExpression1;
		this.subExpression2 = subExpression2;
	}

	public Expression<S1> getSubExpression1()
	{
		return subExpression1;
	}

	public void setSubExpression1(Expression<S1> subExpression1)
	{
		this.subExpression1 = subExpression1;
	}

	public Expression<S2> getSubExpression2()
	{
		return subExpression2;
	}

	public void setSubExpression2(Expression<S2> subExpression2)
	{
		this.subExpression2 = subExpression2;
	}
}
