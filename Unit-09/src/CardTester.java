/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card test = new Card("Jack","clubs",11);
		Card joer = new Card("Queen","hearts",12);
		Card test2 = new Card("Jack","clubs",11);
		
		System.out.print(test.rank() + "\n");
		System.out.print(test.suit() + "\n");
		System.out.print(test.pointValue() + "\n");
		System.out.print(test.matches(joer) + "\n");
		System.out.print(test.matches(test2) + "\n");
		System.out.print(test + "\n\n");
		
		System.out.print(joer.rank() + "\n");
		System.out.print(joer.suit() + "\n");
		System.out.print(joer.pointValue() + "\n");
		System.out.print(joer.matches(test) + "\n");
		System.out.print(joer.matches(test2) + "\n");
		System.out.print(joer + "\n\n");
		
		System.out.print(test2.rank() + "\n");
		System.out.print(test2.suit() + "\n");
		System.out.print(test2.pointValue() + "\n");
		System.out.print(test2.matches(test) + "\n");
		System.out.print(test2.matches(joer) + "\n");
		System.out.print(test2 + "\n\n");
		
		
	}
}
