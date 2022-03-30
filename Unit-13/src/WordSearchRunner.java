//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearchRunner
{
    public static void main(String[] args) throws Exception
    {
    	  WordSearch ms = new WordSearch(8,"APPLEXYPXLHJKEEDEGGLLXXCGFPDGOGNMYNTAHUUPUQDGBTSBTHIGHMSILKXLTHIS");
    	  String[] words = "APPLE AXE APEX CAT HEX EGG HAT COMPUTER GUM THIS TUG THIGH".split(" ");
    	  System.out.println( ms );
    	  System.out.println(ms.checkRight("APPLE",0,0));
    	  System.out.println(ms.checkDown("AXE",0,0));
    	  System.out.println(ms.checkLeft("HAT",4,5));
    	  System.out.println(ms.checkUp("MGE",4,0));
    	  System.out.println(ms.checkDiagUpRight("ITQTG",7,0));
    	  System.out.println(ms.checkDiagUpLeft("IMBAD",7,7));
    	  System.out.println(ms.checkDiagDownLeft("TQTI",4,3));
    	  System.out.println(ms.checkDiagDownRight("ABMI",4,4));
    	  for( String s : words )
    	  {
    	  	  if( ms.isFound( s) )
    	  	  {
    	  	  	  System.out.println( s + " was found in the matrix.");
    	  	  }
    	  	  else
    	  	  {
    	  	     System.out.println( s + " was not found in the matrix.");
    	  	  }
    	  }
    }
}
