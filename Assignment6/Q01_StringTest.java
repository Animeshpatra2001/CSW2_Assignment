/*1. Write a Java program that illustrates the difference between using string literals and the new keyword for creating String objects. Your program should demonstrate the memory usage implications and how string comparison behaves differently in each case.*/
package strings;

public class Q01_StringTest {

	public static void main(String[] args) {
		// Using String literals
		String s1 = "Java";
		String s2 = "Java";
		// Using new keyword
		String s3 = new String("Java");
		String s4 = new String("Java");
		// Memory and comparison
		System.out.println("s1 == s2 : " + (s1 == s2)); // true, same memory location in string pool
		System.out.println("s3 == s4 : " + (s3 == s4)); // false, different memory locations in heap
		// Using equals method for content comparison
		System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true, content is same

	}

}
