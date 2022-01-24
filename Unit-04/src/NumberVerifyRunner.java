//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a whole number :: ");
		int inp = keyboard.nextInt();
		System.out.println(inp + " is odd :: " + NumberVerify.isOdd(inp));
		System.out.println(inp + " is even :: " + NumberVerify.isEven(inp));
		
		System.out.print("\nEnter a whole number :: ");
		inp = keyboard.nextInt();
		System.out.println(inp + " is odd :: " + NumberVerify.isOdd(inp));
		System.out.println(inp + " is even :: " + NumberVerify.isEven(inp));
		
		System.out.print("\nEnter a whole number :: ");
		inp = keyboard.nextInt();
		System.out.println(inp + " is odd :: " + NumberVerify.isOdd(inp));
		System.out.println(inp + " is even :: " + NumberVerify.isEven(inp));
		
		System.out.print("\nEnter a whole number :: ");
		inp = keyboard.nextInt();
		System.out.println(inp + " is odd :: " + NumberVerify.isOdd(inp));
		System.out.println(inp + " is even :: " + NumberVerify.isEven(inp));
		
		System.out.print("\nEnter a whole number :: ");
		inp = keyboard.nextInt();
		System.out.println(inp + " is odd :: " + NumberVerify.isOdd(inp));
		System.out.println(inp + " is even :: " + NumberVerify.isEven(inp));
		
	}
}