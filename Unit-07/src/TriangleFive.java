//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		int columns = amount;
		int letters = amount;
		char let = letter;
		
		for (int i = amount; i>0; i--) {
			for (int b = columns; b>0; b--) {
				for (int c = letters; c>0; c--) {
					output += let;
				}
				output += " ";
				if (let == 'Z') {
					let = 'A';
				} else {
					let++;
				}
				letters--;
			}
			letters = amount;
			output += "\n";
			let = letter;
			columns--;
		}
		return output + "\n";
	}
}