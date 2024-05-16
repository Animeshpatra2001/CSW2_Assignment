/*26. Implement try-catch-finally blocks to handle ClassNotFoundException and MethodNotFoundException*/
package errorHandling;

public class Q26 {
	public static void main(String[] args) {
		try {
			throw new ClassNotFoundException("Class not found exception occurred.");
		} catch (ClassNotFoundException e) {
			System.err.println("ClassNotFoundException caught: " + e.getMessage());
		} finally {
			System.out.println("Inside finally block. This block always executes.");
		}
		try {
			throw new MethodNotFoundException("Method not found exception occurred.");
		} catch (MethodNotFoundException e) {
			System.err.println("MethodNotFoundException caught: " + e.getMessage());
		} finally {
			System.out.println("Inside finally block. This block always executes.");
		}
	}
}

@SuppressWarnings("serial")
class MethodNotFoundException extends Exception {
	public MethodNotFoundException(String message) {
		super(message);
	}
}
