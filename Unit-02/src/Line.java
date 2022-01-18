//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nicholas Crisafulli
//Date - 01/21/2022

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double a = y2 - y1;
		double b = x2 - x1;
		return a/b;
	}

}