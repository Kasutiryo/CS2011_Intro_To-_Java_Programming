import java.util.Scanner; 
public class HW02P05 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a floating-point value: ");
		double num = userInput.nextDouble();
		System.out.println("Integer Part: " + (int)(num));
		System.out.println("Fractional Part: " + (num - (int)(num)));
	}
}