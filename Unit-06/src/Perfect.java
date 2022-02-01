//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	   number = 0;
   }
   
   public void Perfect(int a) {
	   setNum (a);
   }
	//add a set method
   public void setNum(int a){
	   number = a;
   }
   
	public boolean isPerfect()
	{
		int sum = 0;
		for (int i=0; i<number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == number) {
			return true;
		}
		return false;
	}

	//add a toString	
	
	public String toString() {
		if(isPerfect() == true) {
			return number + " is perfect";
		}
		return number + " is not perfect.";
	}
}