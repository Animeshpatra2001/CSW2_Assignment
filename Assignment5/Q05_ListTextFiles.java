/*5. Filter and List Specific File Types: Create a Java application that lists all the ".txt" files in a given directory. The program should prompt the user for the directory path and then display a list of all text files found in that directory.*/
package fileManagement;

import java.io.File;
import java.util.Scanner;

public class Q05_ListTextFiles {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the directory path:");
		String directoryPath = scanner.nextLine();
		File directory = new File(directoryPath);
		if (!directory.exists()) {
			System.out.println("The directory does not exist.");
			return;
		}
		if (!directory.isDirectory()) {
			System.out.println("The given path is not a directory.");
			return;
		}
		File[] files = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));
		for (File file : files) {
			System.out.println("File: " + file.getName());
		}
	}
}