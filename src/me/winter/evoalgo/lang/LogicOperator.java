package me.winter.evoalgo.lang;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-06-25.</p>
 */
public interface LogicOperator extends Expression<Boolean>
{
	class Disjunction extends BinaryLogicOperation
	{
		public Disjunction(Expression<Boolean> subExpression1, Expression<Boolean> subExpression2)
		{
			super(subExpression1, subExpression2);
		}

		@Override
		public Boolean run()
		{
			return getSubExpression1().run() || getSubExpression2().run();
		}

		@Override
		public String toString()
		{
			return getSubExpression1().toString() + " || " + getSubExpression2().toString();
		}
	}

	class Conjunction extends BinaryLogicOperation
	{
		public Conjunction(Expression<Boolean> subExpression1, Expression<Boolean> subExpression2)
		{
			super(subExpression1, subExpression2);
		}

		@Override
		public Boolean run()
		{
			return getSubExpression1().run() && getSubExpression2().run();
		}

		@Override
		public String toString()
		{
			return getSubExpression1().toString() + " && " + getSubExpression2().toString();
		}
	}

	class Negation implements LogicOperator
	{
		private Expression<Boolean> expression;

		public Negation(Expression<Boolean> expression)
		{
			this.expression = expression;
		}

		@Override
		public Boolean run()
		{
			return !getExpression().run();
		}

		@Override
		public String toString()
		{
			return "!" + expression.toString();
		}

		public Expression<Boolean> getExpression()
		{
			return expression;
		}

		public void setExpression(Expression<Boolean> expression)
		{
			this.expression = expression;
		}
	}
}
