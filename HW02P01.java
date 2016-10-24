import java.util.Scanner;
public class HW02P01 {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		final double pounds = 0.76;
		final double euros = 0.89;
		final double yen = 101.88;
		System.out.print("Enter a dollar amount:");
		double dollars = userInput.nextDouble();
		System.out.println("Pounds: " + (dollars * pounds));
		System.out.println("Euros: " + (dollars * euros));
		System.out.println("Yen: " + (dollars * yen));
	}
}