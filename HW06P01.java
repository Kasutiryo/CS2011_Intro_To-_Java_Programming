import java.util.Scanner;
public class HW06P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	Scanner input = new Scanner(System.in);
	System.out.print("Enter ID Number: ");
	int ID = input.nextInt();
	input.nextLine();
	System.out.print("Enter Employee Name: ");
	String firstName = input.next();
	String middleName = input.next();
	String lastName = input.next();
	System.out.print("Enter Hours Worked: ");
	double hours = input.nextDouble();
	System.out.print("Hourly Pay: ");
	double payRate = input.nextDouble();
	System.out.print("Enter Federal Tax Withholding Rate: ");
	double fedTax = input.nextDouble();
	System.out.print("Enter State Tax Withholding rate: ");
	double stateTax = input.nextDouble();
	double grossPay = hours * payRate;
	//VALIDATION
	if ((ID < 0) || (hours < 0) || (payRate < 0) || (fedTax < 0) || (stateTax < 0)) {
		System.out.println("Please enter a non-negative number for all numerical values-24! Try again.");
		System.exit(0);
	}
	
	System.out.println("\n\n---------------------------Payroll Report-----------------------------");
	
	System.out.println("Employee First Name: \t\t\t\t" + firstName + 
	"\nEmployee Middle Initital: \t\t\t" + middleName + 
	"\nEmployee Last Name: \t\t\t\t" + lastName +
	"\nEmployee ID Number: \t\t\t\t" + ID + 
	"\nHours Worked: \t\t\t\t\t" + hours +
	"\nPay Rate: \t\t\t\t\t$" + payRate +
	"\nGross Pay: \t\t\t\t\t$" + grossPay + 
	"\nDeductions: "
			+ "\n\tFederal Withholding (" + (int)(fedTax * 100)/1.0 + "%): \t\t$" + ((int)(fedTax * grossPay * 100)/100.0) 
			+ "\n\tState Withholding (" + (int)(stateTax * 100)/1.0 + "%): \t\t$" + ((int)(stateTax * grossPay * 100)/100.0)
			+ "\n\tTotal Deductions: \t\t\t$" + ((fedTax * grossPay) + (stateTax * grossPay))
	+ "\nNet Pay: \t\t\t\t\t$" + ((int)((grossPay - (fedTax * grossPay) + (stateTax * grossPay)) * 100)/100.0));
	
	System.out.println("---------------------------------------------------------------------------");
	
	
	}
}
