package me.winter.evoalgo.lang;

import me.winter.evoalgo.StringUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-06-24.</p>
 */
public class Block extends ArrayList<Statement> implements Statement
{
	public Block()
	{
		super();
	}

	public Block(int initialCapacity)
	{
		super(initialCapacity);
	}

	public Block(Collection<? extends Statement> c)
	{
		super(c);
	}

	@Override
	public void run()
	{
		for(Statement statement : this)
			statement.run();
	}

	@Override
	public String toString()
	{
		StringBuilder statementsOutput = new StringBuilder();

		forEach(statement -> statementsOutput.append(statement.toString()));

		StringUtil.indent(statementsOutput, 4);

		return "{\n" + statementsOutput + "}\n";
	}

}
