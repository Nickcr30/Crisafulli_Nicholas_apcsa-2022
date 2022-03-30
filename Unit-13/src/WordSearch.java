//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	int index = 0;
    	m = new String[size][size];
    	for (int r=0; r<size; r++) {
    		for(int c = 0; c<size;c++) {
    			m[r][c] = str.substring(index,index+1);
    			index++;
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		String product = "";
		if (c <= m.length-w.length()) {
			for (int i = c; i < r+w.length(); i++) {
				product += m[r][i];
			}
			if (product.equals(w)) {
				return true;
			}
		}
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String product = "";
		if (r >= w.length()-1) {
			for (int i = c; i > c-w.length(); i--) {
				product += m[r][i];
			}
			if (product.equals(w)) {
				return true;
			}
		}
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		String product = "";
		if (r >= w.length()-1) {
			for (int i = r; i > r-w.length(); i--) {
				product += m[i][c];
			}
			if (product.equals(w)) {
				return true;
			}
		}
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		String product = "";
		if (r <= m.length-w.length()) {
			for (int i = r; i < r+w.length(); i++) {
				product += m[i][c];
			}
			if (product.equals(w)) {
				return true;
			}
		}
		
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		String product = "";
		if (c <= m.length-w.length() && r >= w.length()-1) {
			int column = c;
			for (int i = r; i > r-w.length(); i--) {
				product += m[i][column];
				column++;
			}
			if (product.equals(w)) {
				return true;
			}
		}
		
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		String product = "";
		if (c >= w.length()-1 && r >= w.length()-1) {
			int column = c;
			for (int i = r; i > r-w.length(); i--) {
				product += m[i][column];
				column--;
			}
			if (product.equals(w)) {
				return true;
			}
		}
		
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		String product = "";
		if (c <= m.length-w.length() && r <= m.length-w.length()) {
			int column = c;
			for (int i = r; i < r+w.length(); i++) {
				product += m[i][column];
				column--;
			}
			if (product.equals(w)) {
				return true;
			}
		}
		
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		String product = "";
		if (c >= w.length()-1 && r <= m.length-w.length()) {
			int column = c;
			for (int i = r; i < r+w.length(); i++) {
				product += m[i][column];
				column++;
			}
			if (product.equals(w)) {
				return true;
			}
		}
		
		return false;
	}

    public String toString()
    {
 		return "";
    }
}
