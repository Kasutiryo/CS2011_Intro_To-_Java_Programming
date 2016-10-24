
import java.util.Scanner;
public class HW06P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 15 digit number: ");
		String num = input.next();
		if (num.length() != 15) {
			System.out.println("Oops! You have entered over or less than 15 characters. Try again");
			System.exit(0);
		}
		int x = Integer.parseInt(num.charAt(0) + "") + Integer.parseInt(num.charAt(1) + "") + Integer.parseInt(num.charAt(2) + "")
		+ Integer.parseInt(num.charAt(3) + "") + Integer.parseInt(num.charAt(4) + "") + Integer.parseInt(num.charAt(5) + "") + Integer.parseInt(num.charAt(6) + "")
		+ Integer.parseInt(num.charAt(7) + "") + Integer.parseInt(num.charAt(8) + "") + Integer.parseInt(num.charAt(9) + "")
		+ Integer.parseInt(num.charAt(10) + "") + Integer.parseInt(num.charAt(11) + "") + Integer.parseInt(num.charAt(12) + "")
		+ Integer.parseInt(num.charAt(13) + "") + Integer.parseInt(num.charAt(14) + "");
		System.out.print("The sum of the numbers given in equal to: " + x);

	}

}
