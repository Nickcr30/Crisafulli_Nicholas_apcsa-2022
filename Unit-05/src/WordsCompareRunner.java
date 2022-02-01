//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare test = new WordsCompare();
		test.setWords("abe","ape");
		out.print(test);
		
		test.setWords("giraffe","gorilla");
		out.print(test);
		
		test.setWords("one","two");
		out.print(test);
		
		test.setWords("fun","funny");
		out.print(test);
		
		test.setWords("123","19");
		out.print(test);
		
		test.setWords("193","1910");
		out.print(test);
		
		test.setWords("goofy","godfather");
		out.print(test);
		
		test.setWords("funnel","fun");
		out.print(test);

	}
}