/*4. Create a Java program that uses StringBuilder to perform a series of text manipulations on a user-provided string. The program should allow users to:
a. Add a substring at a specified position.
b. Remove a range of characters from the string.
c. Modify a character at a specified index.
d. Concatenate another string at the end.
e. Display the current string after each operation.
The program should repeatedly prompt the user to choose an operation until they decide to exit. After each operation, it should display the modified string, demonstrating the mutable nature of StringBuilder.*/
package strings;

import java.util.Scanner;

public class Q04_StringBuilderUsage {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter initial string: ");
		sb.append(scanner.nextLine());
		while (true) {
			while (true) {
				System.out.println(
						"\n1. Add substring\n2. Remove characters\n3. Modify character\n4. Concatenate string\n5. Show string\n6. Exit");
				System.out.print("Choose operation: ");
				int choice = scanner.nextInt();
				scanner.nextLine();

				switch (choice) {
				case 1:
					System.out.print("Enter substring and position: ");
					String substr = scanner.nextLine();
					int pos = scanner.nextInt();
					sb.insert(pos, substr);
					break;
				case 2:
					System.out.print("Enter start and end index to remove characters: ");
					int start = scanner.nextInt();
					int end = scanner.nextInt();
					sb.delete(start, end);
					break;
				case 3:
					System.out.print("Enter index to modify and new character: ");
					int index = scanner.nextInt();
					char newChar = scanner.next().charAt(0);
					sb.setCharAt(index, newChar);
					break;
				case 4:
					System.out.print("Enter string to concatenate: ");
					String concatStr = scanner.next();
					sb.append(concatStr);
					break;
				case 5:
					System.out.println("Current string: " + sb.toString());
					break;
				case 6:
					System.out.println("Exiting program...");
					scanner.close();
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice. Please choose a valid operation.");
				}
			}
		}

	}
}
