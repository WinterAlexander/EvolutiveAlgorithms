package me.winter.evoalgo.lang;

import java.util.Map;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-06-25.</p>
 */
public class Assignment<T> implements Expression<T>
{
	private Map<String, Object> variables;
	private String variableName;
	private Expression<T> value;

	public Assignment(Map<String, Object> variables, String variable, Expression<T> value)
	{
		this.variables = variables;
		this.variableName = variable;
		this.value = value;
	}

	@Override
	public T run()
	{
		T result = value.run();
		variables.put(variableName, result);
		return result;
	}

	public String getVariableName()
	{
		return variableName;
	}

	public void setVariableName(String variableName)
	{
		this.variableName = variableName;
	}

	public Expression<T> getValue()
	{
		return value;
	}

	public void setValue(Expression<T> value)
	{
		this.value = value;
	}
}
