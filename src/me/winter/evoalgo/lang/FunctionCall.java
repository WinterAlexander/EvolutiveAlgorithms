package me.winter.evoalgo.lang;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-06-25.</p>
 */
public class FunctionCall<R> implements Expression<R>
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
}
