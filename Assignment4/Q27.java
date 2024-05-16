/*27. Write a program to handle ClassCastException*/
package errorHandling;

public class Q27 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			Object obj = Integer.valueOf(10);
			String str = (String) obj;
		} catch (ClassCastException e) {
			System.out.println("ClassCastException caught: " + e.getMessage());
		}
	}
}
