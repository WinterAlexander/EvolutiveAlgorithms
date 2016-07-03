package me.winter.evoalgo.lang;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-06-24.</p>
 */
public class Block
{
	private List<Statement> statements;

	public Block()
	{
		this.statements = new ArrayList<>();
	}

	public void run()
	{
		for(Statement statement : statements)
			statement.run();
	}

	public List<Statement> getStatements()
	{
		return statements;
	}
}
