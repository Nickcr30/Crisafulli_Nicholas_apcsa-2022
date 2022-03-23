//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	
	public static void main( String args[] ) throws IOException
	{
		String chars = "abcdefghijklmnopqrstuvwxyz123456789";
		String[] vals = new String[400];
		for (int i = 0; i < 400; i++) {
			int random = (int) (Math.random()*35);
			String spot = chars.substring(random, random+1);
			vals[i] = spot;
		}
		
		Grid test = new Grid(20,20, vals);
		System.out.print(test + "\n");
		System.out.print(test.findMax(vals));
		
	}
}