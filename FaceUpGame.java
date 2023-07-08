import java.util.Scanner;

/**
 * A class to play the FaceUp card game
 * 
 * @author CS 201 Instructors
 * 
 */

public class FaceUpGame {

	private static final int NUM_CARDS = 5;
	
	public static void playGame(int numRounds) {
		FaceUpHand cards = new FaceUpHand(NUM_CARDS);

		Scanner in = new Scanner(System.in);
		int flipsLeft = numRounds;
		
		while (flipsLeft > 0) {
			System.out.println(cards);
			System.out.println("Face up total: " + cards.faceUpTotal());
			System.out.println("Face down total: " + cards.faceDownTotal());
			System.out.println("Number of flips left: " + flipsLeft);
			System.out.print("Pick a card to flip between 1 and " + NUM_CARDS + " (-1 to end game): ");
			
			int num = in.nextInt();
			
			System.out.println();
			
			if (num == -1) {
				flipsLeft = 0;
			} else if (num < 1 || num > NUM_CARDS) {
				System.out.println(num + " is not a valid card");
			} else {
				cards.flipCard(num-1);
				flipsLeft--;
			}
		}
		
		in.close();
		
		System.out.println();
		System.out.println("----------------------");
		System.out.println("Your score: " + cards.faceUpTotal());
		System.out.println("Best possible score: " + cards.calculateOptimal());
	}
	
	public static void main(String[] args) {
		playGame(5);
	}
}
