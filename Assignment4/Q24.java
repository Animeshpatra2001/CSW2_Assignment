/*24. Write a Java program to demonstrate a checked exception (e.g., FileNotFoundException) being thrown and caught using try-catch block*/
package errorHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q24 {
	public static void main(String[] args) {
		try {
			File file = new File("nonexistentfile.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}
	}
}
