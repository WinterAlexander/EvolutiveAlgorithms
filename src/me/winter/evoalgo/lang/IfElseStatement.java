package me.winter.evoalgo.lang;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-06-24.</p>
 */
public class IfElseStatement implements Statement
{
	private Expression<Boolean> condition;
	private Statement ifStatement, elseStatement;

	public IfElseStatement(Expression<Boolean> condition, Statement ifStatement)
	{
		this(condition, ifStatement, new Block());
	}

	public IfElseStatement(Expression<Boolean> condition, Statement ifStatement, Statement elseStatement)
	{
		this.condition = condition;
		this.ifStatement = ifStatement;
		this.elseStatement = elseStatement;
	}

	@Override
	public void run()
	{
		if(condition.run())
			ifStatement.run();
		else
			elseStatement.run();
	}

	@Override
	public String toString()
	{
		return "if(" + condition.toString() + ")\n" + ifStatement.toString() +
				(elseStatement instanceof Block && ((Block)elseStatement).size() == 0 ? "" : "else\n" + elseStatement.toString());
	}

	public Statement getIfStatement()
	{
		return ifStatement;
	}

	public void setIfStatement(Statement ifStatement)
	{
		this.ifStatement = ifStatement;
	}

	public Statement getElseStatement()
	{
		return elseStatement;
	}

	public void setElseStatement(Statement elseStatement)
	{
		this.elseStatement = elseStatement;
	}
}
