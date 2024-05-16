/*6. Write a Java program to handle NumberFormatException.*/
package errorHandling;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String input = sc.nextLine();
		try {
			int num = Integer.parseInt(input);
			System.out.println("The entered number is: "+num);
		} catch (NumberFormatException e) {
			System.out.println("Error: Enter a valid number");
		} finally {
			sc.close();
		}

	}

}
