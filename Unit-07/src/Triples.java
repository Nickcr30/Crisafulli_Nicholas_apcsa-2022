//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int gcf = 0;
		int max = a;
		if (b > max) {
			max = b;
		} if (c > max) {
			max = c;
		}
		
		for (int i = 0; i < max; i++) {
			if ( ((double) a % i == 0) && ((double) b % i == 0) && ((double) c % i == 0)) {
				gcf = i;
			}
		}



		return gcf;
	}

	public String toString()
	{
		String output="";
		
		for (int a = 1; a<number; a++) {
			for (int b = 1; b<number; b++) {
				for (int c = 1; c < number; c++) {
					if ((a*a + b*b == c*c) && (greatestCommonFactor(a, b, c) <= 1) && ((a%2 != 0 && b%2 == 0) || (a%2 == 0 && b%2 != 0))) {
						output += a + " " + b + " " + c + "\n";
					}
				}
			}
		}


		return output+"\n";
	}
}