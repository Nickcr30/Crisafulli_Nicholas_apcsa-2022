//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	private int size;
	private String name;
	//add a constructor
	public Skeleton(String nm, int sz) {
		size = sz;
		name = nm;
	}
	//add code to implement the Monster interface
	@Override
	public int getHowBig() {
		// TODO Auto-generated method stub
		return size;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public boolean isBigger(Monster other) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isSmaller(Monster other) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean namesTheSame(Monster other) {
		// TODO Auto-generated method stub
		return false;
	}
	
	//add a toString
}