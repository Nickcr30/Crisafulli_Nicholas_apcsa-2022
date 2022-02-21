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
		System.out.print(test.size() +"\n");
		System.out.print(test.isEmpty()+"\n\n");
		test.deal();
		test.deal();
		test.deal();
		System.out.print(test);
	}
}
