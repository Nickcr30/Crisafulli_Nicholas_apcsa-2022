//? A+ Computer Science  -  www.apluscompsci.com
//Name - Nicholas Crisafulli
//Date - 01/21/2022
//Class - APCSA Period 1
//Lab  - Trap Runner

public class TrapRunner
{
	
	public static void main( String[] args )
	{
		Trap Trap = new Trap();
		
		System.out.println( Trap.area( 3, 3, 3) );
		System.out.println( Trap.area( 5, 6, 7) );
		System.out.println( Trap.area( 7, 10, 6) );
		System.out.println( Trap.area( 13, 9, 3) );
		System.out.println( Trap.area( 6, 11, 4) );
		System.out.println( Trap.area( 11, 8, 5) );
	}

}


/*
EXPECTED OUTPUT

9.0
38.5
51.0
33.0
34.0
47.5

*/