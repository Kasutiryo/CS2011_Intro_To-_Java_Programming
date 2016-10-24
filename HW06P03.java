import java.util.Scanner;
public class HW06P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your character name: ");
		String name = input.next();
		String command = input.next();
		int random = 0 + (int)(Math.random() * (100 - 0 + 1));
		switch (command) {
			
		case "/roll": System.out.print(name + " rolled a " + random + "."); break;
		case "/dance": System.out.print(name + " performs a lively dance.");
		case "/invite": System.out.print(input.next() + " has been invited to " + name + "'s party."); break;
		case "/say": System.out.print(name + " says:" + input.nextLine()); break;
		default: System.out.print("Incorrect command was entered! Try again.");
		}
	}

}