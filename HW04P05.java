import java.util.Scanner;
public class HW04P05 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		final String PROMPT_1 = "Please enter the package you currently have (1-3): "; 
		final String PROMPT_2 = "Please enter the month which you are being billed for: ";
		final String PROMPT_3 = "Please enter the number of hours of service that was used this month: ";
		final double PACKAGE_1 = 15.95;
		final double PER_HOUR_1 = 2.00;
		final double PACKAGE_2 = 20.95;
		final double PER_HOUR_2 = 1.00;
		final double PACKAGE_3 = 30.99;
		System.out.println(PROMPT_1);
		int pkgNum = userInput.nextInt();
		//Validation for package number
		if ((pkgNum <= 0) || (pkgNum > 3)) {
			System.out.print("INVALID TRANSACTION! Program will now exit");
			System.exit(0);
		}

		System.out.println(PROMPT_2);
		int month = userInput.nextInt();
		System.out.println(PROMPT_3);
		int hours = userInput.nextInt();
		//Validation for hours
		if (hours < 0) {
			System.out.print("INVALID TRANSACTION! Program will now exit");
			System.exit(0);
		}
		if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) && (hours > 744)) {
			System.out.print("INVALID TRANSACTION! Program will now exit");
			System.exit(0);
		}
		if (((month == 4) || (month == 6) || (month == 9) || (month == 11)) && (hours > 720)) {
			System.out.print("INVALID TRANSACTION! Program will now exit");
			System.exit(0);
		}
		if ((month == 2) && (hours > 672)) {
			System.out.print("INVALID TRANSACTION! Program will now exit");
			System.exit(0);
		}
		switch (pkgNum) {
			case 1:
				double cost = 0;
				double cost_1 = PACKAGE_2;
				double cost_2 = PACKAGE_3;
				if (hours > 10) {
					cost = PACKAGE_1 + ((hours - 10) * PER_HOUR_1);
					System.out.print("The total cost for the month: $" + cost);
				}
				else {
					System.out.print("The total cost for the month: $" + PACKAGE_1);
				}
				if (hours > 20) {
					cost_1 = PACKAGE_2 + ((hours - 20) * PER_HOUR_2);
				}
				if ((cost_1 < cost) || (cost_2 < cost)) {
					System.out.println("\nYou can save by upgrading to package 3! Total amount that can be saved is: $" + (cost - cost_1));
				}
				else if (cost_2 < cost) {
					System.out.println("You can save by upgrading to package 3! Total amount that can be saved is: $" + (cost - cost_2));
				}
				break;
			case 2:
				double cost_A = PACKAGE_2;
				double cost_2_A = PACKAGE_3;
				if (hours > 20) {
					cost_A = PACKAGE_2 + ((hours - 20) * PER_HOUR_2);
					System.out.print("The total cost for the month: $" + cost_A);
				}
				else {
					System.out.print("The total cost for the month is: $" + PACKAGE_2);
				}
				if (cost_2_A < cost_A) {
					System.out.println("You can save by upgrading to package 3! Total amount that can be saved is: $" + (cost_A - cost_2_A));
				}
				break;
			case 3:
				System.out.println("The total cost for your service is: " + PACKAGE_3);
				break;
			default:
				System.out.println("Oops! Something went wrong! Please try again.");
		}
	}	
}