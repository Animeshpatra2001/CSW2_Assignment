/*7. Create a method that takes a string input and converts it to an integer. Handle NumberFormatException using try-catch block and prompt the user to enter a valid number upon exception.*/
package errorHandling;

import java.util.Scanner;

public class Q07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String input = sc.nextLine();
		int result = convertToInteger(input);
		System.out.println("Converted number is: " + result);
	}

	@SuppressWarnings("resource")
	public static int convertToInteger(String input) {
		int number = 0;
		try {
			number = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("Error: Enter a valid number");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			String newInput = sc.nextLine();
			return convertToInteger(newInput);
		}
		return number;

	}

}
