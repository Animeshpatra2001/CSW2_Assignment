/*2. Read from a File: Write a Java application that opens the "diary.txt" file created in the previous question and displays its content on the console. The program should handle cases where the file does not exist by displaying an appropriate error message*/
package fileManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Q02_ReadDiary {
	public static void main(String[] args) {
		File diaryFile = new File("diary.txt");
		if (!diaryFile.exists()) {
			System.out.println("The file diary.txt does not exist.");
			return;
		}
		try (BufferedReader reader = new BufferedReader(new FileReader(diaryFile))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.err.println("Error reading from file: " + e.getMessage());
		}
	}
}