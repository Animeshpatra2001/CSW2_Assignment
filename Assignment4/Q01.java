/*1. Implement a Java program to handle NullPointerException*/
package errorHandling;

public class Q01 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			String str1 = null;
			System.out.println(str1.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException found: " + e.getMessage());
		}

	}

}
