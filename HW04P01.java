import java.util.Scanner;
public class HW04P01 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the cost of the software: ");
		double price = userInput.nextDouble();
		System.out.println("Enter the quantity sold: ");
		double quantity = userInput.nextInt();
		double calculation = 0;
		if ( (price < 0) || (quantity < 0) ) {
			System.out.println("Please enter a positive number!");
			System.exit(1);
		}
		else if (quantity < 10){
			calculation = price * quantity;
		}
		else if ( (quantity >= 10) && (quantity < 20) ){
			calculation = (price - (price * 0.20)) * quantity;
		}
		else if ( (quantity >= 20) && (quantity < 50) ){
			calculation = (price - (price * 0.30))* quantity;
		}
		else if ( (quantity >= 50) && (quantity < 100) ){
			calculation = (price - (price * 0.40)) * quantity;
		}
		else if (quantity >= 100){
			calculation = (price - (price * 0.50)) * quantity;
		}
		System.out.println("Total cost: " + calculation);
	}
}	