//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		for (int i = 1; i <= word.length(); i++) {
			int count = 0;
			while ( count != i ) {
				System.out.print(word.substring(0,i));
				count++;
			}
			System.out.print("\n");
		}
	}
}