package me.winter.evoalgo.lang;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-06-24.</p>
 */
public class IfElseStatement implements Statement
{
	private Expression<Boolean> condition;
	private Block ifBlock, elseBlock;

	public IfElseStatement(Expression<Boolean> condition, Block ifBlock, Block elseBlock)
	{
		this.condition = condition;
		this.ifBlock = ifBlock;
		this.elseBlock = elseBlock;
	}

	@Override
	public void run()
	{
		if(condition.run())
			ifBlock.run();
		else
			elseBlock.run();
	}
}
