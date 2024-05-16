/*8. String Concatenation and Character Retrieval: Take two strings from the user. Concatenate them using the string method and the + operator, then display both results. Ask the user for an index number, then display the character at that index.*/
package strings;

import java.util.Scanner;

public class Q08_ConcatAndCharAt {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String firstStr = scanner.nextLine();
		System.out.print("Enter the second string: ");
		String secondStr = scanner.nextLine();
		String concatenatedStrMethod = firstStr.concat(secondStr);
		String concatenatedStrPlus = firstStr + secondStr;
		System.out.println("Concatenated using method: " + concatenatedStrMethod);
		System.out.println("Concatenated using + operator: " + concatenatedStrPlus);
		System.out.print("Enter an index to retrieve character from concatenated string:");
		int index = scanner.nextInt();
		if (index >= 0 && index < concatenatedStrPlus.length()) {
			System.out.println("Character at index " + index + ": " + concatenatedStrPlus.charAt(index));
		} else {
			System.out.println("Index out of range.");
		}

	}

}
