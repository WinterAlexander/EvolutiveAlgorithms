package me.winter.evoalgo.lang;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-06-24.</p>
 */
public class ValueExpression<T> implements Expression<T>
{
	private T value;

	public ValueExpression(T value)
	{
		this.value = value;
	}

	@Override
	public T run()
	{
		return getValue();
	}

	public T getValue()
	{
		return value;
	}

	public void setValue(T value)
	{
		this.value = value;
	}
}
