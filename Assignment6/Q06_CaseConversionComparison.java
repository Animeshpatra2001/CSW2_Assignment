/*6. Case Conversion and Comparison: Prompt the user to input two strings. Convert both strings to lowercase and uppercase. Compare the converted strings to check case-insensitive equality. Display the converted strings and the result of the comparison.*/
package strings;

import java.util.Scanner;

public class Q06_CaseConversionComparison {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String str1 = scanner.nextLine();
		System.out.print("Enter second string: ");
		String str2 = scanner.nextLine();
		String str1Lower = str1.toLowerCase();
		String str2Lower = str2.toLowerCase();
		System.out.println("Lowercase versions: " + str1Lower + ", " + str2Lower);
		System.out.println("Uppercase versions: " + str1.toUpperCase() + ", " + str2.toUpperCase());
		boolean areEqualIgnoringCase = str1Lower.equals(str2Lower);
		System.out.println("Are the two strings equal (case insensitive)? " + areEqualIgnoringCase);

	}

}
