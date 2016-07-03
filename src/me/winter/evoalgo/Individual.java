package me.winter.evoalgo;

import me.winter.evoalgo.lang.Block;
import me.winter.evoalgo.lang.Function;

import java.awt.*;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-07-02.</p>
 */
public class Individual
{
	private World world;

	private Block brain;
	private int generationId;
	private Point location;

	public void tick()
	{
		brain.run();
	}

	public class MoveFunction extends Function<Void>
	{
		public MoveFunction()
		{
			super("move", Double.class);
		}

		@Override
		public Void call(Object[] parameters)
		{
			int value = ((Double)parameters[0]).intValue();

			switch(value % 4)
			{
				case 0:
					location.x++;
					break;

				case 1:
					location.y++;
					break;

				case 2:
					location.x--;
					break;

				case 3:
					location.y--;
					break;
			}
			return null;
		}
	}

	public class BerryDistanceFunction extends Function<Double>
	{
		public BerryDistanceFunction()
		{
			super("berrydistance");
		}

		@Override
		public Double call(Object[] parameters)
		{
			return 0.0;
		}
	}

}
