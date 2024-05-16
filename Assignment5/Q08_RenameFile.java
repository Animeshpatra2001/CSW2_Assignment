/*8. Rename a File: Develop a Java application that renames a specified file. The program should request the current file name and the new file name from the user,renaming the file accordingly and confirming the action upon completion.*/
package fileManagement;

import java.io.File;
import java.util.Scanner;

public class Q08_RenameFile {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the current file name:");
		String currentFileName = scanner.nextLine();
		File currentFile = new File(currentFileName);
		if (!currentFile.exists()) {
			System.err.println("Current file not found.");
			return;
		}
		System.out.println("Enter the new file name:");
		String newFileName = scanner.nextLine();
		File newFile = new File(newFileName);
		if (newFile.exists()) {
			System.err.println("New file name already exists.");
			return;
		}
		boolean isRenamed = currentFile.renameTo(newFile);
		if (isRenamed) {
			System.out.println("File renamed successfully.");
		} else {
			System.err.println("Error renaming file.");
		}
	}
}