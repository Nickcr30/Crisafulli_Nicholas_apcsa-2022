//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		String kp = "y";
		
		while (kp.equals("y")) {
			System.out.print("Enter a word :: ");
			TriangleWord.printTriangle(keyboard.next());
			System.out.print("\n");
			System.out.print("Do you want to enter more sample input?");
			kp = keyboard.next();
			System.out.print("\n");
		}
		
	}
}