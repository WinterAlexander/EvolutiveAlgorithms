package me.winter.evoalgo;

import java.awt.*;
import java.util.Random;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-07-01.</p>
 */
public class Main
{
	/**
	 * <p>Undocumented :(</p>
	 *
	 * @param args Command-line arguments
	 */
	public static void main(String[] args)
	{
		World test = new World(0, 0);

		for(int j = 0; j < 100; j++)
		{
			StringBuilder line = new StringBuilder();

			for(int i = 0; i < 100; i++)
			{
				if(test.isBerry(new Point(i, j)))
					line.append("X");
				else
					line.append("_");
			}

			System.out.println(line.toString());
		}
	}
}
