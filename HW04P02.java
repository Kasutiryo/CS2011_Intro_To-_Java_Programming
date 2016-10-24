import java.util.Scanner;
public class HW04P02 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int card = 1 + (int)(Math.random() * (52 - 1 + 1));
		int suit = 1 + (int)(Math.random() * (4 - 1 + 1));
		String sResult = "";
		switch (suit) {
			case 1:  sResult = "Clubs"; break;
			case 2:  sResult = "Diamonds"; break;
			case 3:  sResult = "Hearts"; break;	
			case 4:  sResult = "Spades"; break;
			default: System.out.println("Something went wrong! Exiting program. (:"); 
			System.exit(1);
		}
		card = card % 13;
		switch (card) {
			case 1: System.out.println("You drew the Ace of " + sResult); break;
			case 11: System.out.println("You drew the Jack of " + sResult); break;
			case 12: System.out.println("You drew the Queen of " + sResult); break;
			case 0: System.out.println("You drew the King of " + sResult); break;
			default: System.out.println("You drew the " + card + " of " + sResult);
		}
	}
}