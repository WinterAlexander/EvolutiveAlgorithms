package me.winter.evoalgo;

/**
 * <p>Undocumented :(</p>
 *
 * <p>Created by Alexander Winter on 2016-07-02.</p>
 */
public class StringUtil
{
	private StringUtil() { }

	public static String indent(String lines, int width)
	{
		StringBuilder builder = new StringBuilder(lines);
		indent(builder, width);
		return builder.toString();
	}

	public static void indent(StringBuilder lines, int width)
	{
		String tab = "";
		int i;

		for(i = 0; i < width; i++)
			tab += " ";

		lines.insert(0, tab);

		for(i = 0; i < lines.length() - 1; i++)
			if(lines.charAt(i) == '\n')
			{
				lines.insert(i + 1, tab);
				i += 4;
			}

	}


}
