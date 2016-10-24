import java.util.Scanner;
public class HW04P04 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		final String MENU = "1. Compute the Surface Area of a Sphere.\n"
							+ "2. Compute the Volume of a Sphere.\n"
							+ "3. Compute the Surface Area of a Rectangular Prism.\n"
							+ "4. Compute the Volume of a Rectangular Prism.\n"
							+ "5. Exit the program";
		final int SA_SPHERE = 1;
		final int VOL_SPHERE = 2;
		final int SA_REC_PRISM = 3;
		final int VOL_REC_PRISM = 4;
		final int EXIT = 5;
		System.out.println(MENU);
		int menu = userInput.nextInt();
		if (menu < 0){
					System.out.print("NO NEGATIVE NUMBERS! Program will now exit");
					System.exit(0);
				}
		if ((menu <= 0) || (menu > 5)){
					System.out.print("INVALID MENU OPTION! Program will now exit");
					System.exit(0);
				}
		
		
		double result = 0;
		switch (menu) {
			case SA_SPHERE: 
				System.out.println("Enter the radius of the sphere: ");
				double radius = userInput.nextInt();
				
				if (radius < 0){
					System.out.print("NO NEGATIVE NUMBERS! Program will now exit");
					System.exit(0);
				}
				
				result = 4.0 * Math.PI * Math.pow(radius, 2);
				System.out.println("The Surface Area of the Sphere is: " + result);
				break;
			case VOL_SPHERE: 
				System.out.println("Enter the radius of the sphere: ");
				double radius2 = userInput.nextInt();
				
				if (radius2 < 0){
					System.out.print("NO NEGATIVE NUMBERS! Program will now exit");
					System.exit(0);
				}
				
				result = ((4.0/3.0) * Math.PI * Math.pow(radius2, 3));
				System.out.println("The Volume of the Sphere is: " + result);
				break;
			case SA_REC_PRISM: 
				System.out.println("Enter the length, width and height respectively, of the prism: ");
				int length = userInput.nextInt();
				int width = userInput.nextInt();
				int height = userInput.nextInt();
				
				if ((length < 0) || (width < 0) || (height < 0)) {
					System.out.print("NO NEGATIVE NUMBERS! Program will now exit");
					System.exit(0);
				}
				
				result = (2 * length * width) + (2 * height * width) + (2 * length * height);
				System.out.println("The Surface Area of the Rectangular Prism is: " + result);
				break;
			case VOL_REC_PRISM: 
				System.out.println("Enter the length, width and height respectively, of the prism: ");
				int length2 = userInput.nextInt();
				int width2 = userInput.nextInt();
				int height2 = userInput.nextInt();
				
				if ((length2 < 0) || (width2 < 0) || (height2 < 0)) {
					System.out.print("NO NEGATIVE NUMBERS! Program will now exit");
					System.exit(0);
				}
				
				result = length2 * width2 * height2;
				System.out.println("The Volume of the Rectangular Prism is " + result);
				break;
			case EXIT: 
				System.out.println("Program wil now exit.");
				System.exit(0);
			default: 
				System.out.println("Oops! Something went wrong. Try again later.");
				System.exit(1);
		}
	}
}
