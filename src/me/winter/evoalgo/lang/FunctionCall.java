package me.winter.evoalgo.lang;

import java.util.Arrays;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-06-25.</p>
 */
public class FunctionCall<R> implements StatementExpression<R>
{
	private Function<R> function;
	private Expression<?>[] parameters;

	public FunctionCall(Function<R> function, Expression<?>[] parameters)
	{
		this.function = function;
		this.parameters = parameters;
	}

	@Override
	public R run()
	{
		Object[] values = new Object[parameters.length];

		for(int i = 0; i < values.length; i++)
			values[i] = parameters[i].run();

		return function.call(values);
	}

	public Function<R> getFunction()
	{
		return function;
	}

	public Expression<?>[] getParameters()
	{
		return parameters;
	}

	@Override
	public String toString()
	{
		StringBuilder params = new StringBuilder();

		for(int i = 0; i < parameters.length; i++)
		{
			params.append(parameters[i].toString());

			if(i < parameters.length - 1)
				params.append(", ");
		}

		return function.getName() + "(" + params.toString() + ")";
	}
}
