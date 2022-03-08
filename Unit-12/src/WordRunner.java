//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		String[] list = new String[size];
		for (int p = 0; p < list.length; p++) {
			list[p] = file.nextLine();
		}
		
		for (int i = 0; i < list.length; i++) {
			Word least = new Word(list[i]);
			int index = i;
			for (int j = i; j < list.length; j++) {
				Word tar = new Word(list[j]);
				if (least.compareTo(tar) == 1) {
					least = tar;
					index = j;
				} else if (least.compareTo(tar) == 0) {
					if (list[j].charAt(0) < list[i].charAt(0)) {
						least = tar;
						index = j;
					}
				}
			}
			String place = list[i];
			list[i] = least.toString();
			list[index] = place;
		}
		
		for (int l = 0; l <list.length; l++) {
			System.out.println(list[l]);
		}
		











	}
}