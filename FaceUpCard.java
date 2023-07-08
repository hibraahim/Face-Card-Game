// Name: Hinda Ibraahim 
// CSCI 201 Homework 2

public class FaceUpCard extends Card {

    private boolean faceUp;

    /**
     * Create a new FaceUpCard with number and suit
     * @param number the card number
     * @param suit the card suit
     */
    public FaceUpCard(int number, String suit) {
        super(number, suit);
        faceUp = false;
    }

    /**
     * Returns whether card is face up
     */
	public boolean isFaceUp() {
		return faceUp;
	}
    	
    /**
     * Flips a card from face-down to face-up or face-up to face-down
     */
	public void flip() {
		faceUp = !faceUp;
	}

    /**  
     * Returns the card's value in the FaceUp game
     * Number cards have their number as the value
     * Ace is 11, and Jack, Queen, and King are 10
    */
    public int getCardValue() {
        if(getNumber() == 1){ //because of ace
            return 11;
        }else if(getNumber() >= 11 && getNumber() <= 13){
            return 10;
        } else{
            return getNumber(); // if not the rest then it's own number
        }
	}

    /**
     * Returns whether card is a red card, ie with suit "hearts" or "diamonds"
     * || means or 
     */
	public boolean isRedCard() {
        return (getSuit().equals("hearts") || getSuit().equals("diamonds"));
	}
	/*public static void main(String[] args) {
		FaceUpCard card = new FaceUpCard(4, "hearts"); // my own set number can check for any
        System.out.println("Card value: " + card.getCardValue()); // gets card value 
        System.out.println("Is card red? " + card.isRedCard()); // gets red card(hearts or diamonds)
        System.out.println("Face-up?  " + card.isFaceUp()); // checks if its facing up
        card.flip(); // flips the card
        System.out.println("Face-up?  " + card.isFaceUp()); // checks again if it's facing up 
	}*/
}
