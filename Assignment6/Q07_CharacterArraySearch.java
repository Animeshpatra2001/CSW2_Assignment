/*7. Character Array and Search: Ask for a string from the user. Convert the string to a character array. Prompt the user to enter a character to search in the string. Find the first and last occurrences of the character. Display the character array and the positions found (if any).*/
package strings;

import java.util.Scanner;

public class Q07_CharacterArraySearch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();
		char[] charArray = str.toCharArray();
		System.out.print("Enter a character to search for: ");
		char searchChar = scanner.next().charAt(0);
		int firstIndex = str.indexOf(searchChar);
		int lastIndex = str.lastIndexOf(searchChar);
		System.out.println("Character array: ");
		for (char c : charArray) {
			System.out.print(c + " ");
		}
		System.out.println("\nFirst occurrence of '" + searchChar + "': " + firstIndex);
		System.out.println("Last occurrence of '" + searchChar + "': " + lastIndex);

	}

}
