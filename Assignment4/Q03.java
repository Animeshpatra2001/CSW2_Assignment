/*3. Implement a custom NullPointerException class named CustomNullPointerException that mimics the behavior of the standard NullPointerException, but instead of using default error messages or null references,it takes a String message as its constructor argument. Your task is to create this custom exception class and demonstrate its usage in a Java program.*/
package errorHandling;

import java.util.*;

@SuppressWarnings("serial")
class CustomNullPointerException extends NullPointerException {
	CustomNullPointerException(String message) {
		super(message);
	}
}

public class Q03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		try {
			if (input.isEmpty()) {
				throw new CustomNullPointerException("input can't be null.");
			}
		} catch (CustomNullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}
