package me.winter.evoalgo.lang;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-06-25.</p>
 */
public abstract class Function<R>
{
	private String name;
	private Class<?>[] parameterTypes;

	public Function(String name, Class<?>... parameterTypes)
	{
		this.name = name;
		this.parameterTypes = parameterTypes;
	}

	public abstract R call(Object[] parameters);

	public String getName()
	{
		return name;
	}

	public Class<?>[] getParameterTypes()
	{
		return parameterTypes;
	}
}
