package me.winter.evoalgo.lang;

import java.util.Map;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-06-25.</p>
 */
public class VariableExpression<T> implements Expression<T>
{
	private Map<String, Object> variables;
	private String variableName;

	public VariableExpression(Map<String, Object> variables, String variableName)
	{
		this.variables = variables;
		this.variableName = variableName;
	}

	@Override
	public T run()
	{
		return (T)variables.get(variableName);
	}

	public String getVariableName()
	{
		return variableName;
	}

	public void setVariableName(String variableName)
	{
		this.variableName = variableName;
	}
}
