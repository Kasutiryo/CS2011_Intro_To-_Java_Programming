
public class HW07P04 {

	public static void main(String[] args) {

		int i = 1;
		double PI = 0;
		int x = 10000;

		while (i <= 100000) {

			PI += 4 * Math.pow(-1, i + 1) / (2 * i - 1);

			if (i == x) {
				System.out.println("When i = " + x + " , PI = " + PI);
				x += 10000;
			}

			i++;
		}
	}

}
