import java.util.Scanner;

public class HW07P05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		final String MENU = "--------------------------------"
				+ "\n|    Binary Number Converter   |"
				+ "\n--------------------------------"
				+ "\n| 1. Convert Binary to Decimal |"
				+ "\n| 2. Convert Decimal to Binary |"
				+ "\n| 3. Exit the Program          |"
				+ "\n--------------------------------"
				+ "\nEnter your menu choice (1 - 3): ";
		System.out.print(MENU);
		int fstChoice = input.nextInt();
		//input.next();

		while (fstChoice != 3) {

			switch (fstChoice) {
			case 1: 
				System.out.print("Enter the binary string: ");
				String binary = input.next();
				int i = 0;
				int power = (int)Math.pow(2, i);
				int sum = 0;
				while (i < binary.length()) {
					if(binary.charAt((binary.length() - 1 )- i) == '1') {
						sum += power;
					}
					i++;
					power = (int)Math.pow(2, i);
				}
				System.out.println(binary + " in the decimal is " + sum);
				break;
			case 2: 
				System.out.println("Enter the decimal number: ");
				int decimal = input.nextInt();
				int cpyDecimal = decimal;
				String output = "";
				while (decimal != 0) {
					output += decimal % 2;
					decimal /= 2;
				}
				System.out.println(cpyDecimal + " in binary is " + output);
				break;
			default: 
				System.out.println("Please enter a valid menu option!\n");
			}
			System.out.print(MENU);
			fstChoice = input.nextInt();

		}
		System.out.print("Program is now exiting!");
	}

}
