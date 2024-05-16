/*23. Write a program that reads data from a file and performs some processing. Handle checked IOException by using try-catch block to catch and handle the exception.*/
package errorHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q23 {
	public static void main(String[] args) {
		String filename = "data.txt";
		try {
			FileReader fileReader = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println("Processing data: " + line);
			}
			bufferedReader.close();
			System.out.println("File processing completed successfully.");
		} catch (IOException e) {
			System.err.println("An error occurred while processing the file: " + e.getMessage());
			e.printStackTrace();
		}
	}
}