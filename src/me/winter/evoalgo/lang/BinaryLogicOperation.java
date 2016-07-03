package me.winter.evoalgo.lang;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-06-25.</p>
 */
public abstract class BinaryLogicOperation extends CompoundExpression<Boolean, Boolean, Boolean> implements LogicOperator
{
	public BinaryLogicOperation(Expression<Boolean> subExpression1, Expression<Boolean> subExpression2)
	{
		super(subExpression1, subExpression2);
	}
}
