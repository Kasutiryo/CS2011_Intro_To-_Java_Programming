import java.util.Scanner;
public class HW03P01 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a floating-point number: ");
		double Output1 = userInput.nextDouble();
		if (Output1 == 0 ) {
			System.out.print("Zero. ");
		}
		else if(Output1 > 0) {
			System.out.print("Positive. ");
			if (Math.abs(Output1) < 1) {
				System.out.print("Small. ");
			}
			else if (Math.abs(Output1) > 1000000) {
				System.out.print("Large. ");
			}
		}
		else if(Output1 < 0) {
			System.out.print("Negative. ");
			if (Math.abs(Output1) < 1) {
				System.out.print("Small. ");
			}
			else if (Math.abs(Output1) > 1000000) {
				System.out.print("Large. ");
			}
		}
	}
}