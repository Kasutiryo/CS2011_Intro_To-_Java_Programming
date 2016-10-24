import java.util.Scanner;

public class HW07P03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter postive numbers (-1 to end input): ");
		double nums = input.nextDouble();
		//input.next();

		int n = 0;
		double sum = 0;
		double a = 0;

		while (nums != -1) {

			//INPUT VALIDIATION

			while (nums < 0 ) {

				System.out.print("Please enter a valid POSITIVE number!\nEnter postive number: ");
				nums = input.nextDouble();
				//input.next();

			}

			n++;
			sum += nums;
			a += Math.pow(nums, 2);
			nums = input.nextDouble();
			//input.next();

		}

		double s = Math.sqrt((a - (1/n) * Math.pow(sum, 2)) / (n - 1));
		double m = sum/n;

		System.out.println("Mean: " + m);
		System.out.println("Deviation: " + s);

	}

}
