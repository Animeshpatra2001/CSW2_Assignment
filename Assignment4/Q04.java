/*4. Implement a Java program that reads a file path from the command line argument and attempts to read the contents of the file. If the file path is null or points to a non-existent file, throw a custom FileNotFoundException. If the file exists but cannot be read due to permission issues, throw a custom FileReadPermissionException. Your task is to create these custom exception classes and handle them appropriately in your program.*/
package errorHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("serial")
class CustomFileNotFoundException extends Exception {
    public CustomFileNotFoundException(String message) {
        super(message);
    }
}

@SuppressWarnings("serial")
class CustomFileReadPermissionException extends Exception {
    public CustomFileReadPermissionException(String message) {
        super(message);
    }
}

public class Q04 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main <file_path>");
            return;
        }

        String filePath = args[0];
        try {
            readAndPrintFileContent(filePath);
        } catch (CustomFileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (CustomFileReadPermissionException e) {
            System.out.println("Permission issue while reading file: " + e.getMessage());
        }
    }

    public static void readAndPrintFileContent(String filePath) throws CustomFileNotFoundException, CustomFileReadPermissionException {
        if (filePath == null) {
            throw new CustomFileNotFoundException("File path is null.");
        }

        File file = new File(filePath);
        if (!file.exists()) {
            throw new CustomFileNotFoundException("File does not exist: " + filePath);
        }

        if (!file.canRead()) {
            throw new CustomFileReadPermissionException("Cannot read file due to permission issues: " + filePath);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
