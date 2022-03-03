//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
	}

	public void loadToys( String toys )
	{
		String[] arr = toys.split(" ", 0);
		toyList = new ArrayList<Toy>(arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equals("")) {
				int count = 1;
				String toyName = arr[i];
				for (int j = i+1; j<arr.length; j++) {
					if (!arr[j].equals("") && arr[j].equals(arr[i])) {
						count++;
						arr[j] = "";
					}
				}
				
				Toy newToy = new Toy(toyName);
				newToy.setCount(count);
				toyList.add(newToy);
			}
			
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		return null;
  	}
  	
  	public Toy index (int y) {
  		return toyList.get(y);
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy mf = toyList.get(0);
  		for (int i = 1; i < toyList.size(); i++) {
  			if (toyList.get(i).getCount() > mf.getCount()) {
  				mf = toyList.get(i);
  			}
  		}
  		return "max == " + mf.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		
  	}  
  	  
	public String toString()
	{
		String product = "[" + toyList.get(0);
	   for (int i = 1; i< toyList.size(); i++) {
		   product +=  ", " + toyList.get(i);
	   }
	   product += "]";
	   return product;
	}
}