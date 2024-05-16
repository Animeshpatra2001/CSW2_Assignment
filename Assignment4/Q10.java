/*10. Implement a Java program that calculates the value of the expression (sin(x) + cos(x)) / tan(x) for a given value of x. Handle scenarios where x is close to multiples of π/2 to avoid division by zero errors.*/
package errorHandling;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter the value of x in radians: ");
			double x = scanner.nextDouble();
			if (Math.abs(x % (Math.PI / 2)) < 0.0001) {
				System.out.println("Error: Division by zero. x is close to a multiple of π/2.");
			} else {
				double result = (Math.sin(x) + Math.cos(x)) / Math.tan(x);
				System.out.println("Result: " + result);
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
