import java.util.Scanner;
public class HW05P01 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the length of a hexagon: ");
		double hex = userInput.nextDouble();
		if (hex < 0) {
			System.out.println("Oops! A negative number was entered! Try again.");
			System.exit(0);
		}
		double calc = (6 * Math.pow(hex, 2))/(4*Math.tan(Math.PI/6));
		calc = (int)(calc * 1000) / 1000.0;
		System.out.println("The area is: " + calc);
	}
}