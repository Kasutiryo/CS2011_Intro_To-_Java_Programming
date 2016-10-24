import java.util.Scanner;
public class HW05P04 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char user = userInput.next().charAt(0);

		if (Character.isDigit(user) == true) {
			System.out.println("The character is a digit");
		}
		else if (Character.isLetter(user) == true) {
			if (Character.isLowerCase(user) == true) {
				System.out.println("The character is a lowercase letter.");
			}
			else if(Character.isUpperCase(user) == true) {
				System.out.println("The character is a uppercase letter.");
			}
		}
		else {
			System.out.println("The character is a symbol or non-alphanumeric.!");
		}
	}
}
