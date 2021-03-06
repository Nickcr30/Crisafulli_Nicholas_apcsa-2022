//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{		
		String word2 = rhs +"";
		if (word2.length() < word.length()) {
			return 1;
		} if (word2.length() > word.length()) {
			return -1;
		}
		return 0;
	}

	public String toString()
	{
		return word;
	}
}