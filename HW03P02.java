import java.util.Scanner;
public class HW03P02 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a, b, and c respectively: ");
		double a = userInput.nextDouble();
		double b = userInput.nextDouble();
		double c = userInput.nextDouble();
		double discriminant = Math.pow(b, 2) - (4 * a * c);
		if (discriminant == 0) {
			System.out.print("The equation has one root: " + (-b / 2 * a));
		}
		else if (discriminant < 0) {
			System.out.print("The equation has no real roots.");
		}
		else {
			System.out.print(" The equation has two roots " + ((-b + Math.sqrt(discriminant))/ (2 * a)) + " and " + ((-b - Math.sqrt(discriminant))/ (2 * a)));
		}
	}
}