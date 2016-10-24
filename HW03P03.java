public class HW03P03 {
	public static void main(String[] args) {
		double random = 1 + (int)(Math.random() * (12 - 1 + 1));
		if (random == 1) {
			System.out.print("January");
		}
		else if (random == 2) {
			System.out.print("Feburary");
		}
		else if (random == 3) {
			System.out.print("March");
		}
		else if (random == 4) {
			System.out.print("May");
		}
		else if (random == 5) {
			System.out.print("April");
		}
		else if (random == 6) {
			System.out.print("June");
		}
		else if (random == 7) {
			System.out.print("July");
		}
		else if (random == 8) {
			System.out.print("August");
		}
		else if (random == 9) {
			System.out.print("September");
		}
		else if (random == 10) {
			System.out.print("October");
		}
		else if (random == 11) {
			System.out.print("November");
		}
		else {
			System.out.print("December");
		}
	}
}