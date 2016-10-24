import java.util.Scanner;
public class HW03P05 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the number of seconds you'd like to be converted: ");
		int seconds = userInput.nextInt();
		if ((seconds >= 60) && (seconds < 3600)) {
			System.out.println("There are " + (seconds / 60) + " mintues.");
		}
		if ((seconds >= 3600) && (seconds < 86400)) {
			System.out.println("There are " + (seconds / 3600) + " hours.");
		}
		if (seconds >= 86400) {
			System.out.println("There are " + (seconds / 84000) + " days.");
		}
	}
}