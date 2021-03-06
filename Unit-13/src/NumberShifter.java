//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = (int) (Math.random()*10);
		}
		return array;
	}
	
	public static void shiftEm(int[] array)
	{
		int index = 0;
		for (int i = 0; i < array.length; i++){
			if (array[i] == 7) {
				int place = array[index];
				array[index] = array[i];
				array[i] = place;
				index++;
			}
		}
	}
	
	public static String printIt(int[] array) {
		String product = "[";
		for (int i = 0; i < array.length; i++) {
			product += array[i] + " ";
		}
		return product + "]";
	}
}