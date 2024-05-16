/*8. Write a Java program to find the quare root of integer numbers. Demonstrate the use of try-catch block to handle ArithmeticException.*/
package errorHandling;

import java.util.Scanner;

public class Q08 {
	public static double calculateSquareRoot(int number) {
		if (number < 0) {
			throw new ArithmeticException("Can not calculate squareroot of a negative number.");
		}
		return Math.sqrt(number);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		try {
			double squareRoot = calculateSquareRoot(number);
			System.out.println("Squreroot of " + number + " is " + squareRoot);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
