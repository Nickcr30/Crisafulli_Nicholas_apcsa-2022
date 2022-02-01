//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover();
		test.LetterRemover("I am Sam I am", 'a');
		out.println(test + "\n\n");
		
		test.LetterRemover("ssssssssxssssesssssesss", 's');
		out.println(test+ "\n\n");
		
		test.LetterRemover("qwertyqwertyqwerty", 'a');
		out.println(test+ "\n\n");
		
		test.LetterRemover("abababababa", 'b');
		out.println(test+ "\n\n");
		
		test.LetterRemover("abaababababa", 'x');
		out.println(test+ "\n\n");
											
	}
}