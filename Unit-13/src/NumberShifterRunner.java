//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		
		int[] array = NumberShifter.makeLucky7Array(20);
		System.out.println(NumberShifter.printIt(array));
		NumberShifter.shiftEm(array);
		System.out.println(NumberShifter.printIt(array));
	}
}



