/*3. Append Content to an Existing File: Write a Java program that adds a new diary entry to the "diary.txt" file without overwriting its existing content. The program should ask the user for the new entry and append it to the file along with a timestamp.*/
package fileManagement;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Q03_AppendDiary {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your diary entry:");
		String entry = scanner.nextLine();
		File diaryFile = new File("diary.txt");
		if (!diaryFile.exists()) {
			System.out.println("The file diary.txt does not exist. Creating a new file.");
			try {
				diaryFile.createNewFile();
			} catch (IOException e) {
				System.err.println("Error creating file: " + e.getMessage());
				return;
			}
		}
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(diaryFile, true))) {
			writer.write(getCurrentDate());
			writer.newLine();
			writer.write(entry);
			System.out.println("Your diary entry has been successfully appended to diary.txt");
		} catch (IOException e) {
			System.err.println("Error writing to file: " + e.getMessage());
		}
	}

	private static String getCurrentDate() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
}