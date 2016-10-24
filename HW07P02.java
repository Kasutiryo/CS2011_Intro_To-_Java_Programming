import java.util.Scanner;
public class HW07P02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter input: ");
		String num = input.nextLine();

		while (num.length() != 10) {

			System.out.print("Please enter a combination of 10 characters!\nEnter input: ");
			num = input.nextLine();

		}

		num = num.toLowerCase();
		int index = 0;
		String output = "";

		while (index < num.length()) {

			if ((num.charAt(index) == 'a') || (num.charAt(index) == 'b') || (num.charAt(index) == 'c')) {
				output += "2";
			}
			else if ((num.charAt(index) == 'd') || (num.charAt(index) == 'e') || (num.charAt(index) == 'f')) {
				output += "3";
			}
			else if ((num.charAt(index) == 'g') || (num.charAt(index) == 'h') || (num.charAt(index) == 'i')) {
				output += "4";
			}
			else if ((num.charAt(index) == 'j') || (num.charAt(index) == 'k') || (num.charAt(index) == 'l')) {
				output += "5";
			}
			else if ((num.charAt(index) == 'm') || (num.charAt(index) == 'n') || (num.charAt(index) == 'o')) {
				output += "6";
			}
			else if ((num.charAt(index) == 'p') || (num.charAt(index) == 'q') || (num.charAt(index) == 'r') || (num.charAt(index) == 's')) {
				output += "7";
			}
			else if ((num.charAt(index) == 't') || (num.charAt(index) == 'u') || (num.charAt(index) == 'v')) {
				output += "8";
			}
			else if ((num.charAt(index) == 'w') || (num.charAt(index) == 'x') || (num.charAt(index) == 'y') || (num.charAt(index) == 'z')) {
				output += "9";
			}

			index++;
		}
		System.out.println("(" + output.substring(0,3) + ") " + output.substring(3,6) + "-" + output.substring(6));
	}

}
