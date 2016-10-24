import java.util.Scanner;
public class HW06P04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter input: ");
		String num = input.next();
		String output = "(";
		//VALIDATION
		if (num.length() > 10) { 
			System.out.println("Oops! You have entered text with over 10 character! Please try again.");
			System.exit(0);
		}
		num = num.toLowerCase();
		//CREATION OF NUMBER FROM LETTERS
		//INDEX 0
		if ((num.charAt(0) == 'a') || (num.charAt(0) == 'b') || (num.charAt(0) == 'c')) {
			output += "2";
		}
		else if ((num.charAt(0) == 'd') || (num.charAt(0) == 'e') || (num.charAt(0) == 'f')) {
			output += "3";
		}
		else if ((num.charAt(0) == 'g') || (num.charAt(0) == 'h') || (num.charAt(0) == 'i')) {
			output += "4";
		}
		else if ((num.charAt(0) == 'j') || (num.charAt(0) == 'k') || (num.charAt(0) == 'l')) {
			output += "5";
		}
		else if ((num.charAt(0) == 'm') || (num.charAt(0) == 'n') || (num.charAt(0) == 'o')) {
			output += "6";
		}
		else if ((num.charAt(0) == 'p') || (num.charAt(0) == 'q') || (num.charAt(0) == 'r') || (num.charAt(0) == 's')) {
			output += "7";
		}
		else if ((num.charAt(0) == 't') || (num.charAt(0) == 'u') || (num.charAt(0) == 'v')) {
			output += "8";
		}
		else if ((num.charAt(0) == 'w') || (num.charAt(0) == 'x') || (num.charAt(0) == 'y') || (num.charAt(0) == 'z')) {
			output += "9";
		}
		//INDEX 1
		if ((num.charAt(1) == 'a') || (num.charAt(1) == 'b') || (num.charAt(1) == 'c')) {
			output += "2";
		}
		else if ((num.charAt(1) == 'd') || (num.charAt(1) == 'e') || (num.charAt(1) == 'f')) {
			output += "3";
		}
		else if ((num.charAt(1) == 'g') || (num.charAt(1) == 'h') || (num.charAt(1) == 'i')) {
			output += "4";
		}
		else if ((num.charAt(1) == 'j') || (num.charAt(1) == 'k') || (num.charAt(1) == 'l')) {
			output += "5";
		}
		else if ((num.charAt(1) == 'm') || (num.charAt(1) == 'n') || (num.charAt(1) == 'o')) {
			output += "6";
		}
		else if ((num.charAt(1) == 'p') || (num.charAt(1) == 'q') || (num.charAt(1) == 'r') || (num.charAt(1) == 's')) {
			output += "7";
		}
		else if ((num.charAt(1) == 't') || (num.charAt(1) == 'u') || (num.charAt(1) == 'v')) {
			output += "8";
		}
		else if ((num.charAt(1) == 'w') || (num.charAt(1) == 'x') || (num.charAt(1) == 'y') || (num.charAt(1) == 'z')) {
			output += "9";
		}
		//INDEX 2
		if ((num.charAt(2) == 'a') || (num.charAt(2) == 'b') || (num.charAt(2) == 'c')) {
			output += "2) ";
		}
		else if ((num.charAt(2) == 'd') || (num.charAt(2) == 'e') || (num.charAt(2) == 'f')) {
			output += "3) ";
		}
		else if ((num.charAt(2) == 'g') || (num.charAt(2) == 'h') || (num.charAt(2) == 'i')) {
			output += "4) ";
		}
		else if ((num.charAt(2) == 'j') || (num.charAt(2) == 'k') || (num.charAt(2) == 'l')) {
			output += "5) ";
		}
		else if ((num.charAt(2) == 'm') || (num.charAt(2) == 'n') || (num.charAt(2) == 'o')) {
			output += "6) ";
		}
		else if ((num.charAt(2) == 'p') || (num.charAt(2) == 'q') || (num.charAt(2) == 'r') || (num.charAt(2) == 's')) {
			output += "7) ";
		}
		else if ((num.charAt(2) == 't') || (num.charAt(2) == 'u') || (num.charAt(2) == 'v')) {
			output += "8) ";
		}
		else if ((num.charAt(2) == 'w') || (num.charAt(2) == 'x') || (num.charAt(2) == 'y') || (num.charAt(2) == 'z')) {
			output += "9) ";
		}
		//INDEX 3
		if ((num.charAt(3) == 'a') || (num.charAt(3) == 'b') || (num.charAt(3) == 'c')) {
			output += "2";
		}
		else if ((num.charAt(3) == 'd') || (num.charAt(3) == 'e') || (num.charAt(3) == 'f')) {
			output += "3";
		}
		else if ((num.charAt(3) == 'g') || (num.charAt(3) == 'h') || (num.charAt(3) == 'i')) {
			output += "4";
		}
		else if ((num.charAt(3) == 'j') || (num.charAt(3) == 'k') || (num.charAt(3) == 'l')) {
			output += "5";
		}
		else if ((num.charAt(3) == 'm') || (num.charAt(3) == 'n') || (num.charAt(3) == 'o')) {
			output += "6";
		}
		else if ((num.charAt(3) == 'p') || (num.charAt(3) == 'q') || (num.charAt(3) == 'r') || (num.charAt(3) == 's')) {
			output += "7";
		}
		else if ((num.charAt(3) == 't') || (num.charAt(3) == 'u') || (num.charAt(3) == 'v')) {
			output += "8";
		}
		else if ((num.charAt(3) == 'w') || (num.charAt(3) == 'x') || (num.charAt(3) == 'y') || (num.charAt(3) == 'z')) {
			output += "9";
		}
		//INDEX 4
		if ((num.charAt(4) == 'a') || (num.charAt(4) == 'b') || (num.charAt(4) == 'c')) {
			output += "2";
		}
		else if ((num.charAt(4) == 'd') || (num.charAt(4) == 'e') || (num.charAt(4) == 'f')) {
			output += "3";
		}
		else if ((num.charAt(4) == 'g') || (num.charAt(4) == 'h') || (num.charAt(4) == 'i')) {
			output += "4";
		}
		else if ((num.charAt(4) == 'j') || (num.charAt(4) == 'k') || (num.charAt(4) == 'l')) {
			output += "5";
		}
		else if ((num.charAt(4) == 'm') || (num.charAt(4) == 'n') || (num.charAt(4) == 'o')) {
			output += "6";
		}
		else if ((num.charAt(4) == 'p') || (num.charAt(4) == 'q') || (num.charAt(4) == 'r') || (num.charAt(4) == 's')) {
			output += "7";
		}
		else if ((num.charAt(4) == 't') || (num.charAt(4) == 'u') || (num.charAt(4) == 'v')) {
			output += "8";
		}
		else if ((num.charAt(4) == 'w') || (num.charAt(4) == 'x') || (num.charAt(4) == 'y') || (num.charAt(4) == 'z')) {
			output += "9";
		}
		//INDEX 5
		if ((num.charAt(5) == 'a') || (num.charAt(5) == 'b') || (num.charAt(5) == 'c')) {
			output += "2-";
		}
		else if ((num.charAt(5) == 'd') || (num.charAt(5) == 'e') || (num.charAt(5) == 'f')) {
			output += "3-";
		}
		else if ((num.charAt(5) == 'g') || (num.charAt(5) == 'h') || (num.charAt(5) == 'i')) {
			output += "4-";
		}
		else if ((num.charAt(5) == 'j') || (num.charAt(5) == 'k') || (num.charAt(5) == 'l')) {
			output += "5-";
		}
		else if ((num.charAt(5) == 'm') || (num.charAt(5) == 'n') || (num.charAt(5) == 'o')) {
			output += "6-";
		}
		else if ((num.charAt(5) == 'p') || (num.charAt(5) == 'q') || (num.charAt(5) == 'r') || (num.charAt(5) == 's')) {
			output += "7-";
		}
		else if ((num.charAt(5) == 't') || (num.charAt(5) == 'u') || (num.charAt(5) == 'v')) {
			output += "8-";
		}
		else if ((num.charAt(5) == 'w') || (num.charAt(5) == 'x') || (num.charAt(5) == 'y') || (num.charAt(5) == 'z')) {
			output += "9-";
		}
		//INDEX 6
		if ((num.charAt(6) == 'a') || (num.charAt(6) == 'b') || (num.charAt(6) == 'c')) {
			output += "2";
		}
		else if ((num.charAt(6) == 'd') || (num.charAt(6) == 'e') || (num.charAt(6) == 'f')) {
			output += "3";
		}
		else if ((num.charAt(6) == 'g') || (num.charAt(6) == 'h') || (num.charAt(6) == 'i')) {
			output += "4";
		}
		else if ((num.charAt(6) == 'j') || (num.charAt(6) == 'k') || (num.charAt(6) == 'l')) {
			output += "5";
		}
		else if ((num.charAt(6) == 'm') || (num.charAt(6) == 'n') || (num.charAt(6) == 'o')) {
			output += "6";
		}
		else if ((num.charAt(6) == 'p') || (num.charAt(6) == 'q') || (num.charAt(6) == 'r') || (num.charAt(6) == 's')) {
			output += "7";
		}
		else if ((num.charAt(6) == 't') || (num.charAt(6) == 'u') || (num.charAt(6) == 'v')) {
			output += "8";
		}
		else if ((num.charAt(6) == 'w') || (num.charAt(6) == 'x') || (num.charAt(6) == 'y') || (num.charAt(6) == 'z')) {
			output += "9";
		}
		//INDEX 7
		if ((num.charAt(7) == 'a') || (num.charAt(7) == 'b') || (num.charAt(7) == 'c')) {
			output += "2";
		}
		else if ((num.charAt(7) == 'd') || (num.charAt(7) == 'e') || (num.charAt(7) == 'f')) {
			output += "3";
		}
		else if ((num.charAt(7) == 'g') || (num.charAt(7) == 'h') || (num.charAt(7) == 'i')) {
			output += "4";
		}
		else if ((num.charAt(7) == 'j') || (num.charAt(7) == 'k') || (num.charAt(7) == 'l')) {
			output += "5";
		}
		else if ((num.charAt(7) == 'm') || (num.charAt(7) == 'n') || (num.charAt(7) == 'o')) {
			output += "6";
		}
		else if ((num.charAt(7) == 'p') || (num.charAt(7) == 'q') || (num.charAt(7) == 'r') || (num.charAt(7) == 's')) {
			output += "7";
		}
		else if ((num.charAt(7) == 't') || (num.charAt(7) == 'u') || (num.charAt(7) == 'v')) {
			output += "8";
		}
		else if ((num.charAt(7) == 'w') || (num.charAt(7) == 'x') || (num.charAt(7) == 'y') || (num.charAt(7) == 'z')) {
			output += "9";
		}
		//INDEX 8
		if ((num.charAt(8) == '8') || (num.charAt(8) == 'b') || (num.charAt(8) == 'c')) {
			output += "2";
		}
		else if ((num.charAt(8) == 'd') || (num.charAt(8) == 'e') || (num.charAt(8) == 'f')) {
			output += "3";
		}
		else if ((num.charAt(8) == 'g') || (num.charAt(8) == 'h') || (num.charAt(8) == 'i')) {
			output += "4";
		}
		else if ((num.charAt(8) == 'j') || (num.charAt(8) == 'k') || (num.charAt(8) == 'l')) {
			output += "5";
		}
		else if ((num.charAt(8) == 'm') || (num.charAt(8) == 'n') || (num.charAt(8) == 'o')) {
			output += "6";
		}
		else if ((num.charAt(8) == 'p') || (num.charAt(8) == 'q') || (num.charAt(8) == 'r') || (num.charAt(8) == 's')) {
			output += "7";
		}
		else if ((num.charAt(8) == 't') || (num.charAt(8) == 'u') || (num.charAt(8) == 'v')) {
			output += "8";
		}
		else if ((num.charAt(8) == 'w') || (num.charAt(8) == 'x') || (num.charAt(8) == 'y') || (num.charAt(8) == 'z')) {
			output += "9";
		}
		//INDEX 9
		if ((num.charAt(9) == 'a') || (num.charAt(9) == 'b') || (num.charAt(9) == 'c')) {
			output += "2";
		}
		else if ((num.charAt(9) == 'd') || (num.charAt(9) == 'e') || (num.charAt(9) == 'f')) {
			output += "3";
		}
		else if ((num.charAt(9) == 'g') || (num.charAt(9) == 'h') || (num.charAt(9) == 'i')) {
			output += "4";
		}
		else if ((num.charAt(9) == 'j') || (num.charAt(9) == 'k') || (num.charAt(9) == 'l')) {
			output += "5";
		}
		else if ((num.charAt(9) == 'm') || (num.charAt(9) == 'n') || (num.charAt(9) == 'o')) {
			output += "6";
		}
		else if ((num.charAt(9) == 'p') || (num.charAt(9) == 'q') || (num.charAt(9) == 'r') || (num.charAt(9) == 's')) {
			output += "7";
		}
		else if ((num.charAt(9) == 't') || (num.charAt(9) == 'u') || (num.charAt(9) == 'v')) {
			output += "8";
		}
		else if ((num.charAt(9) == 'w') || (num.charAt(9) == 'x') || (num.charAt(9) == 'y') || (num.charAt(9) == 'z')) {
			output += "9";
		}
		System.out.print("Phone Number: " + output);
	}
}
