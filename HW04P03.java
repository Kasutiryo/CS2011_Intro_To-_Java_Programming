import java.util.Scanner;
public class HW04P03 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter year (i.e. 2012): ");
		int year = userInput.nextInt();
		System.out.println("Enter month (1-12): ");
		int month = userInput.nextInt();
		System.out.println("Enter the day of the month: ");
		int day = userInput.nextInt();
		if ((year <= 0) || (month <= 0) || (day <= 0)) {
			System.out.println("You have entered a negative number of year, month, or day. Please try again. Program will exit now.");
			System.exit(0);
		}
		if ((month > 12) || (day > 31)) {
			System.out.println("You have entered one to many days or months that are possible. Please try again. Program will not exit.");
			System.exit(0);
		}
		int k = year % 100;
		int j = year / 100;
		int h = (day + ((26*(month + 1))/10) + k + (k/4) + (j/4) + (5*j)) % 7;
		String result = "";
		switch (h) {
			case 0: result = "Saturday"; break;
			case 1: result = "Sunday"; break;
			case 2: result = "Monday"; break;
			case 3: result = "Tuesday"; break; 
			case 4: result = "Wednesday"; break;
			case 5: result = "Thursday"; break;
			case 6: result = "Firday"; break;
			default: System.out.println("Something went wrong!");
		}
		System.out.println("The day of the week is " + result);
	}
}
