/*7. Copy File Content: Write a Java program that copies the content from one file (source) to another (destination). The program should prompt the user for both source and destination file paths and perform the copy operation, ensuring that it doesn't overwrite an existing file without user confirmation.*/
package fileManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q07_CopyFileContent {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the source file name:");
		String sourceFileName = scanner.nextLine();
		File sourceFile = new File(sourceFileName);
		if (!sourceFile.exists()) {
			System.err.println("Source file not found.");
			return;
		}
		System.out.println("Enter the destination file name:");
		String destinationFileName = scanner.nextLine();
		File destinationFile = new File(destinationFileName);
		if (destinationFile.exists()) {
			System.out.println("Destination file already exists. Do you want to overwrite it? (yes/no)");
			String userResponse = scanner.nextLine();
			if (!userResponse.equalsIgnoreCase("yes")) {
				System.out.println("File copy cancelled.");
				return;
			}
		}
		try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
			String line;
			while ((line = reader.readLine()) != null) {
				writer.write(line);
				writer.newLine();
			}
			System.out.println("File copied successfully.");
		} catch (IOException e) {
			System.err.println("Error copying file: " + e.getMessage());
		}
	}
}