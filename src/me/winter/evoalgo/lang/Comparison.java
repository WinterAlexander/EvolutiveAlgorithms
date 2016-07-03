package me.winter.evoalgo.lang;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-06-24.</p>
 */
public abstract class Comparison extends CompoundExpression<Boolean, Double, Double>
{
	public Comparison(Expression<Double> subExpression1, Expression<Double> subExpression2)
	{
		super(subExpression1, subExpression2);
	}

	public static class Equals extends Comparison
	{
		public Equals(Expression<Double> subExpression1, Expression<Double> subExpression2)
		{
			super(subExpression1, subExpression2);
		}

		@Override
		public Boolean run()
		{
			return getSubExpression1().run().doubleValue() == getSubExpression2().run().doubleValue();
		}
	}

	public static class GreaterThan extends Comparison
	{
		public GreaterThan(Expression<Double> subExpression1, Expression<Double> subExpression2)
		{
			super(subExpression1, subExpression2);
		}

		@Override
		public Boolean run()
		{
			return getSubExpression1().run() > getSubExpression2().run();
		}
	}

	public static class LowerThan extends Comparison
	{
		public LowerThan(Expression<Double> subExpression1, Expression<Double> subExpression2)
		{
			super(subExpression1, subExpression2);
		}

		@Override
		public Boolean run()
		{
			return getSubExpression1().run() < getSubExpression2().run();
		}
	}
}
