/*2. You are given a string containing alpha-numeric characters. Design a Java program that displays the numeric characters if it is preceded by a vowel and consonant in the given string. If such numeric characters are not present in the given string, display appropriate message. If the input string is null or empty, throw a NullPointerException with an appropriate error message. Ensure that the program handles any potential exceptions gracefully*/
package errorHandling;

import java.util.Scanner;

public class Q02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphanumeric string: ");
		String str2 = sc.nextLine();
		try {
			if (str2 == null || str2.isEmpty()) {
				throw new NullPointerException("Input string is null or empty");
			}
			boolean found = false;
			for (int i = 2; i < str2.length(); i++) {
				char currentChar = str2.charAt(i);
				char prevChar = str2.charAt(i - 1);
				char prevPrevChar = str2.charAt(i - 2);
				if (Character.isDigit(currentChar) && !isVowel(prevChar) && Character.isLetter(prevChar)
						&& isVowel(prevPrevChar)) {
					System.out.println("Numeric character preceed by a vowel and consonant: " + currentChar);
					found = true;
				}
			}
			if (!found) {
				System.out.println("No numeric character preceed by a vowel and consonant");
			}
		} catch (NullPointerException e) {
			System.out.println("NullPointerException found: " + e.getMessage());
		}

	}

	private static boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		return false;

	}

}
