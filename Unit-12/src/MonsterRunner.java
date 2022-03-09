//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.print("type in the name ::");
		String name = keyboard.next();
		System.out.print("type in the size ::");
		int size = keyboard.nextInt();
		//instantiate monster one
		Monster one = new Skeleton(name, size);
		//ask for name and size
		System.out.print("type in the name ::");
		name = keyboard.next();
		System.out.print("type in the size ::");
		size = keyboard.nextInt();
		//instantiate monster two
		Monster two = new Skeleton(name, size);
		System.out.println("Monster one :: name : " + one.getName() + " size : " + one.getHowBig());
		System.out.println("Monster two :: name : " + two.getName() + " size : " + two.getHowBig());
	}
}