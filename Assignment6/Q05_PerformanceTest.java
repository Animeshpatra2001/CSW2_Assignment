/*5. Create a Java program that compares the performance of StringBuilder and StringBuffer when performing repeated string concatenations. The program should:
a. Prompt the user to enter a base string and the number of times it should be concatenated to itself.
b. Use StringBuilder to concatenate the string the specified number of times, tracking the time taken to complete the operation.
c. Repeat the process using StringBuffer, again tracking the time taken.
d. Output the time taken for each operation and the final length of the resulting strings to demonstrate both the time efficiency and the result of using StringBuilder and StringBuffer.
Example output of the program could look like this:
Enter the base string:
> Hello
Enter the number of concatenations:
> 10000
Using StringBuilder...
Time taken: 5 milliseconds
Final string length: 50000
Using StringBuffer...
Time taken: 6 milliseconds
Final string length: 50000
Comparison: StringBuilder was faster than StringBuffer by 1 millisecond.*/
package strings;

public class Q05_PerformanceTest {

	public static void main(String[] args) {
		final int ITERATIONS = 10000;
		String baseString = "Hello";
		// StringBuilder performance test
		long startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ITERATIONS; i++) {
			sb.append(baseString);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("StringBuilder time: " + (endTime - startTime) + " ms");
		// StringBuffer performance test
		startTime = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < ITERATIONS; i++) {
			buffer.append(baseString);
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuffer time: " + (endTime - startTime) + " ms");

	}

}
