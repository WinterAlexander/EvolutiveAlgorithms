package me.winter.evoalgo.lang;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-06-24.</p>
 */
public abstract class ArithmeticOperation extends CompoundExpression<Double, Double, Double>
{
	public ArithmeticOperation(Expression<Double> subExpression1, Expression<Double> subExpression2)
	{
		super(subExpression1, subExpression2);
	}

	public static class Addition extends ArithmeticOperation
	{
		public Addition(Expression<Double> subExpression1, Expression<Double> subExpression2)
		{
			super(subExpression1, subExpression2);
		}

		@Override
		public Double run()
		{
			return getSubExpression1().run() + getSubExpression2().run();
		}

		@Override
		public String toString()
		{
			return getSubExpression1().toString() + " + " + getSubExpression2().toString();
		}
	}

	public static class Subtraction extends ArithmeticOperation
	{
		public Subtraction(Expression<Double> subExpression1, Expression<Double> subExpression2)
		{
			super(subExpression1, subExpression2);
		}

		@Override
		public Double run()
		{
			return getSubExpression1().run() - getSubExpression2().run();
		}

		@Override
		public String toString()
		{
			return getSubExpression1().toString() + " - " + getSubExpression2().toString();
		}
	}

	public static class Division extends ArithmeticOperation
	{
		public Division(Expression<Double> subExpression1, Expression<Double> subExpression2)
		{
			super(subExpression1, subExpression2);
		}

		@Override
		public Double run()
		{
			return getSubExpression1().run() / getSubExpression2().run();
		}

		@Override
		public String toString()
		{
			return getSubExpression1().toString() + " / " + getSubExpression2().toString();
		}
	}

	public static class Multiplication extends ArithmeticOperation
	{
		public Multiplication(Expression<Double> subExpression1, Expression<Double> subExpression2)
		{
			super(subExpression1, subExpression2);
		}

		@Override
		public Double run()
		{
			return getSubExpression1().run() * getSubExpression2().run();
		}

		@Override
		public String toString()
		{
			return getSubExpression1().toString() + " * " + getSubExpression2().toString();
		}
	}
}