import java.util.Scanner;
public class HW07P01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter two integers.\nEnter A: ");
		int a = input.nextInt();

		System.out.print("Enter B: ");
		int b = input.nextInt();

		int sum_even = 0;
		long product = 1; //long so that it works with very large numbers
		int sum_squares = 0;
		String powers = "";

		while (a <= b) {

			if (a % 2 == 0) {
				sum_even += a;
			}

			product *= a;

			sum_squares += Math.pow(a, 2);

			double powerOfTwo = a;
			int stop = 0;

			while (stop != 1) {

				if (powerOfTwo > 2) {
					powerOfTwo /= 2;
				}

				else if (powerOfTwo < 2) {
					stop = 1;
				}

				else if (powerOfTwo == 2) {
					powers += a + " ";
					stop = 1;

				}

			}

			a++;

		}

		System.out.print("The sum of all even integers is: " + sum_even + 
				"\nThe product of all integers is: " + product + 
				"\nThe sum of all the squares is: " + sum_squares + 
				"\nAll of the powers of 2 between a and b are: " + powers);
	}

}

