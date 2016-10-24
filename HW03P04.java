import java.util.Scanner;
public class HW03P04 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter today's day: ");
		int tDay = userInput.nextInt();
		System.out.println("Enter the number of days elapsed since today");
		int fDay = userInput.nextInt();
		String tsDay = "";
		String fsDay = "";
		if (tDay == 0) {
			tsDay = "Sunday";
		}
			else if (tDay == 1) {
				tsDay = "Monday";
			}
			else if (tDay == 2) {
				tsDay = "Tuesday";
			}
			else if (tDay == 3) {
				tsDay = "Wednesday";
			}
			else if (tDay == 4) {
				tsDay = "Thursday";
			}
			else if (tDay == 5) {
				tsDay = "Friday";
			}
			else  if (tDay == 6) {
			tsDay = "Saturday";
			}
		if (fDay == 0) {
			tsDay = "Monday";
		}
			else if (fDay == 1) {
				fsDay = "Tuesday";
			}
			else if (fDay == 2) {
				fsDay = "Wednesday";
			}
			else if (fDay == 3) {
				fsDay = "Thursday";
			}
			else if (fDay == 4) {
				fsDay = "Friday";
			}
			else if (fDay == 5) {
				fsDay = "Saturday";
			}
			else if (fDay == 6) {
			fsDay = "Sunday";
			}
		System.out.println("Today is " + tsDay + " and the future day is " + fsDay);
	}
}