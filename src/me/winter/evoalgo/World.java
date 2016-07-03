package me.winter.evoalgo;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-07-03.</p>
 */
public class World
{
	private static float BERRY_ODDS_AT_4_STEPS = 0.1f;
	private static float BERRY_ODDS_AT_3_STEPS = 0.2f;
	private static float BERRY_ODDS_AT_2_STEPS = 0.3f;
	private static float BERRY_ODDS_AT_1_STEP = 0.4f;

	private int baseSeed;
	private int currentGeneration;
	private List<Individual> individuals;
	private List<Point> eatenBerries;

	private Random random;

	public World(int baseSeed, int currentGeneration)
	{
		this.baseSeed = baseSeed;
		this.currentGeneration = currentGeneration;
		this.individuals = new ArrayList<>();
		this.eatenBerries = new ArrayList<>();

		this.random = new Random();
	}

	public boolean isBerry(Point point)
	{
		if(eatenBerries.contains(point))
			return false;

		if(isBerryPlant(point.x, point.y))
			return true;
		else if(true)
			return false;

		float odds = 0;

		for(int dx = -2; dx <= 2; dx++)
			for(int dy = -2; dy <= 2; dy++)
				if(isBerryPlant(point.x + dx, point.y + dy))
				{
					switch(Math.abs(dx) + Math.abs(dy))
					{
						case 4:
							odds += BERRY_ODDS_AT_4_STEPS;
							break;

						case 3:
							odds += BERRY_ODDS_AT_3_STEPS;
							break;

						case 2:
							odds += BERRY_ODDS_AT_2_STEPS;
							break;

						case 1:
							odds += BERRY_ODDS_AT_1_STEP;
							break;

						case 0:
						default: //something went wrong
							throw new IndexOutOfBoundsException("Invalid berry plant location offset: " + dx + ", " + dy + " from " + point.x + ", " + point.y);
					}
				}

		random.setSeed(getSeed(point.x, point.y));
		return random.nextFloat() < odds;
	}

	private boolean isBerryPlant(int x, int y)
	{
		random.setSeed(getSeed(x, y));
		return random.nextFloat() < 0.05;
	}

	private long getSeed(int x, int y)
	{
		return (((long)baseSeed << 8 //take the base seed, push it left or 8 bits
				| currentGeneration & 0xFF) << 12 //place the first 8 bits of the current generation, push it left again of 12 bits
				| x & 0xFFF) << 12 //place the first 12 bits of the x coordinate, push it left again
				| y & 0xFFF; //place the first 12 bits of the y coordinate
	}
}
