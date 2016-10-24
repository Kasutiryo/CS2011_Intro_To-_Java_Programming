import java.util.Scanner;
public class HW02P02 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the length, width, and height of the pyramid: ");
		System.out.print("Length: ");
		double length = userInput.nextDouble();
		System.out.print("Width: ");
		double width = userInput.nextDouble();
		System.out.print("Height: ");
		double height = userInput.nextDouble();
		System.out.println("The area is: " + (length * width));
		System.out.println("The volume is: " + (1.0/3.0)*(length * width)* height);
	}
}