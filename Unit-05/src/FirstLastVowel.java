//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String vowels = "aeiouAEIOU";
	 
	   for (int i = 0; i<10; i++) {
			if (a.substring(0,1).equals(vowels.substring(i,i+1)) || a.substring(a.length()-1).equals(vowels.substring(i,i+1))) {
				return "yes";
			}
		}
	   return "no";
	}
}
	
		
 

