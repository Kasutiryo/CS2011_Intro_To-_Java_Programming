import java.util.Scanner;
public class HW05P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		final String MENU = "a. Convert Character into Unicode \n"
				+ "b. Convert Unicode into Character \n"
				+ "c. Exit Program";
		System.out.println(MENU);
		char user = userInput.next().charAt(0);
		user = Character.toLowerCase(user);
		if ((user == 'a') || (user == 'b') || (user == 'c'))	{
			switch (user) {
			case 'a': 
				System.out.print("Enter the character you'd like converted: ");
				char toUnicode = userInput.next().charAt(0);
				int convUni = (int)(toUnicode);
				System.out.print(convUni); break;
			case 'b':
				System.out.print("Enter the Unicode you'd like to be converted: ");
				int toChar = userInput.next().charAt(0);
				char convChar = (char)(toChar);
				System.out.print(convChar); break;
			case 'c':
				System.out.print("The program will now exit!");
				System.exit(0); break;
			default: 
				System.out.println("Oops! Something went wrong. Please try again later.");
			}
		}
		else {
			System.out.println("Please enter a valid menu option. Try again!");
			System.exit(0);
		}
	}

}
