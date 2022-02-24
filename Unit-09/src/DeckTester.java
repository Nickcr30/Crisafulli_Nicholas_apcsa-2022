/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] one = {"A","B","C"};
		String[] two = {"Giraffes","Lions"};
		int[] three = {2,1,6};
		Deck test = new Deck(one,two,three);
		
		String[] one1 = {"D","E","F"};
		String[] two1 = {"Wallabies","Dogs","redbacks"};
		int[] three1 = {8,9,10};
		Deck test1 = new Deck(one1,two1,three1);
		
		String[] one2 = {"G","H","I"};
		String[] two2 = {"Kangaroos"};
		int[] three2 = {3,5,7};
		Deck test2 = new Deck(one2,two2,three2);
		
		System.out.println(test.isEmpty());
		System.out.println(test.size());
		System.out.println(test.deal());
		System.out.println(test + "\n\n");
		
		System.out.println(test1.isEmpty());
		System.out.println(test1.size());
		System.out.println(test1.deal());
		System.out.println(test1 + "\n\n");
		
		System.out.println(test2.isEmpty());
		System.out.println(test2.size());
		System.out.println(test2.deal());
		System.out.println(test2 + "\n\n");
		
	}
}
