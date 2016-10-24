import java.util.Scanner;
public class HW02P03 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter x1 and y1: ");
		double x1 = userInput.nextDouble();
		double y1 = userInput.nextDouble();
		System.out.print("Enter x2 and y2: ");
		double x2 = userInput.nextDouble();
		double y2 = userInput.nextDouble();
		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.print("The distance between point (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);
	}
}