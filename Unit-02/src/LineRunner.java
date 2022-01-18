//© A+ Computer Science  -  www.apluscompsci.com
//Name - Nicholas Crisafulli
//Date - 01/21/2022
//Class - APCSA Period 1
//Lab  - Line

public class LineRunner
{
   public static void main( String[] args )
   {
	   Line Line = new Line();
	   
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,9,14,2 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,7,18,3 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 6,4,2,2 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 4,4,5,3 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,1,2,9 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,7,2,9 ) );
		
	}
}