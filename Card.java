/**
 * A card class representing a standard playing card with
 * numbers 2-10, Jack, Queen, King, Ace and four suits.
 * 
 * @author CS 201 Instructors
 *
 */
public class Card {

	// min/max for the card number range
	private static final int MIN_NUMBER = 1;
	private static final int MAX_NUMBER = 13;

	private int number;
	private String suit;

	/**
	 * Create a new card with number and suit.  If the a valid
	 * suit/number is not input, the card defaults to 1 of hearts.
	 * 
	 * @param number the card number
	 * @param suit the card suit
	 */
	public Card(int number, String suit){
		this.number = number;
		this.suit = suit.toLowerCase();

		if (!isValidSuit(suit)) {
			System.out.println(suit + "Is not a valid suit!");
			System.out.println("Must be one of: clubs, diamonds, hearts or spades");
			System.out.println("Defaulting to hearts");
			this.suit = "hearts";
		}

		if (!isValidNumber(number)) {
			System.out.println(number + "Is not a valid number!");
			System.out.println("Must be between " + MIN_NUMBER + " and " + MAX_NUMBER);
			System.out.println("Defaulting to 1");
			this.number = 1;
		}		
	}

	/** 
	 * @return the card's suit
	 */
	public String getSuit(){
		return suit;
	}

	/**
	 * @return the card's number MIN_NUMBER .. MAX_NUMBER
	 */
	public int getNumber() {
        return number;
	}
	
	/**
	 * Returns the card's rank as a string 
     * changing Jack, Queen, King, Ace appropriately
	 * 
	 * @return the card's rank
	 */
	public String getRank() {
		if (number == 1) {
			return "Ace";
		} else if (number >= 2 && number <= 10) {
			return Integer.toString(number);
		} else if (number == 11) {
			return "Jack";
		} else if (number == 12) {
			return "Queen";
		} else {
			return "King";
		}
	}
	
	/**
	 * The card's rank followed by the suit
	 */
	public String toString() {
		return getRank() + " of " + getSuit();
	}
	
	/**
	 * Make it an Ace!
	 */
	public void cheat() {
		number = 1; // ACE!
	}

	/**
	 * Check to make sure the card number is valid
	 * 
	 * @param num potential card number
	 * @return whether the card number is valid
	 */
	private boolean isValidNumber(int num) {
		return num >= MIN_NUMBER && num <= MAX_NUMBER;
	}

	/**
	 * Check to make sure the suit is valid
	 * 
	 * @param s potential suit
	 * @return whether the suit is valid
	 */
	private boolean isValidSuit(String s) {
		return s.equals("spades") ||
				s.equals("hearts") ||
				s.equals("clubs") ||
				s.equals("diamonds");
	}
}