import java.util.Scanner;
public class HW02P04 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a temperature in Celsius: ");
		double Celsius = userInput.nextDouble();
		double Output = (9.0/5.0)* Celsius + 32;
		System.out.println(Celsius + " Celsius is " + Output + " Fahrenheit.");
		System.out.print("Enter a temperature in Fahrenheit: ");
		double Fahrenheit = userInput.nextDouble();
		double Output2 = (Fahrenheit - 32)*(5.0/9.0);
		System.out.print(Fahrenheit + " Fahrenheit is " + Output2 + " Celsius.");
	} 
}