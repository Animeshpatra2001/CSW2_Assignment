/*13. Design a Java program that evaluates the value of the function (sin(x) * cos(x)) / (sin(x) + cos(x)) for a given value of x. Handle potential arithmetic exceptions that may arise due to invalid mathematical operations.*/
package errorHandling;

import java.util.Scanner;

public class Q13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter the value of x: ");
			double x = scanner.nextDouble();
			double numerator = Math.sin(x) * Math.cos(x);
			double denominator = Math.sin(x) + Math.cos(x);
			if (denominator == 0) {
				System.out.println("Error: Division by zero is not allowed.");
			} else {
				double result = numerator / denominator;
				System.out.println(
						"Value of the function (sin(x) * cos(x)) / (sin(x) + cos(x)) for x = " + x + " is: " + result);
			}
		} catch (Exception e) {
			System.out.println("Error: Invalid input or mathematical operation.");
		} finally {
			scanner.close();
		}
	}
}
