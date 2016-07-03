package me.winter.evoalgo.lang;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-06-25.</p>
 */
public abstract class Function<R>
{
	private Class<?>[] parameterTypes;

	public Function(Class<?>... parameterTypes)
	{
		this.parameterTypes = parameterTypes;
	}

	public abstract R call(Object[] parameters);

	public Class<?>[] getParameterTypes()
	{
		return parameterTypes;
	}
}
