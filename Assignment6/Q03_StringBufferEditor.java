/*3. Write a Java program that uses StringBuffer to construct a simple text editor which can perform the following operations:
a. Append a given string to the existing text.
b. Insert a given string at a specified index within the existing text.
c. Delete a portion of text between two specified indices.
d. Reverse the entire text.
e. Replace a portion of the text between two specified indices with a given string.
Your program should display a menu with options to perform each of the above operations. After each operation, print the current state of the text. Also, display the current capacity and length of the StringBuffer after each operation to showcase its dynamic nature.*/

package strings;

import java.util.Scanner;

public class Q03_StringBufferEditor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\n1. Append \n2. Insert \n3. Delete \n4. Reverse \n5. Replace \n6. Exit");
			System.out.print("Choose an operation: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // consume newline
			switch (choice) {
			case 1:
				System.out.print("Enter string to append: ");
				buffer.append(scanner.nextLine());
				break;
			case 2:
				System.out.print("Enter index and string to insert: ");
				int insertIndex = scanner.nextInt();
				scanner.nextLine();
				buffer.insert(insertIndex, scanner.nextLine());
				break;
			case 3:
				System.out.print("Enter start and end indices to delete: ");
				int start = scanner.nextInt();
				int end = scanner.nextInt();
				buffer.delete(start, end);
				break;
			case 4:
				buffer.reverse();
				break;
			case 5:
				System.out.print("Enter start, end index, and replacement string: ");
				start = scanner.nextInt();
				end = scanner.nextInt();
				scanner.nextLine();
				buffer.replace(start, end, scanner.nextLine());
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Invalid choice!");
			}
			System.out.println("Current Buffer: " + buffer);
			System.out.println("Length: " + buffer.length() + ", Capacity: " + buffer.capacity());
		}

	}

}
