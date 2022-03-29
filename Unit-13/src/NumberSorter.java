//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		if (number < 10) {
			return 1;
		} else {
			return 1 + getNumDigits(number/10);
		}
	}

	public static int[] getSortedDigitArray(int number)
	{
		int num = number;
		int[] sorted = new int[getNumDigits(number)];
		for (int i = 0; i < sorted.length; i++) {
			sorted[i] = (num % 10);
			num = num /10;
		}
		
		int index = 0;
		
		for (int j = 0; j < sorted.length; j++) {
			int min = sorted[j];
			for (int c = j; c < sorted.length; c++) {
				if (sorted[c] < min) {
					min = sorted[c];
					index = c;
				}
			}
			int place = sorted[j];
			sorted[j] = min;
			sorted[index] = place;
		}
		return sorted;
	}
}