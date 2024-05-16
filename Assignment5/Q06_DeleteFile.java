/*6. Delete a Specific File: Write a Java program where the user can enter the name of a file to be deleted from the system. The program should check if the file exists and delete it, providing a confirmation message upon successful deletion or an error message if the file does not exist.*/
package fileManagement;

import java.io.File;
import java.util.Scanner;

public class Q06_DeleteFile {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the file name to delete:");
		String fileName = scanner.nextLine();
		File file = new File(fileName);
		if (file.exists()) {
			boolean isDeleted = file.delete();
			if (isDeleted) {
				System.out.println("File deleted successfully.");
			} else {
				System.err.println("Error deleting the file.");
			}
		} else {
			System.err.println("File not found.");
		}
	}
}