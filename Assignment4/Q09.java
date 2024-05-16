/*9. Create a program that divides two numbers input by the user. Handle the possibility of division by zero using try-catch block to catch ArithmeticException.*/
package errorHandling;

import java.util.Scanner;

public class Q09 {
	public static double divide(int numerator,int denominator) {
		if(denominator == 0) {
			throw new ArithmeticException("Divide by zero is not allwed.");
		}
		return (double) numerator/ denominator;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number as numerator: ");
		int numerator = sc.nextInt();
		System.out.println("Enter a number as denominator: ");
		int denominator = sc.nextInt();
		try {
			double result = divide(numerator,denominator);
			System.out.println("Result of division is "+result);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
