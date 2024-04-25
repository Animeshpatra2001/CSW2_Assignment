/*11.Given an unsorted array of integers from 1 to 10, find smallest positive 
number missing in the array. Use a hash map HashMap<Integer, 
Integer> to keep track of elements*/
package genericsCollection;

import java.util.HashMap;

public class Q11_SmallestMissingPositive {
	public static void main(String[] args) {
		int[] arr = { 3, 4, -1, 1, 7, 8, 2, 9, 10 };

		int smallestPositiveMissing = findSmallestPositiveMissing(arr);
		System.out.println("Smallest positive missing number: " + smallestPositiveMissing);
	}

	public static int findSmallestPositiveMissing(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int num : arr) {
			if (num > 0) {
				map.put(num, true);
			}
		}

		for (int i = 1; i <= arr.length + 1; i++) {
			if (!map.containsKey(i)) {
				return i;
			}
		}

		return -1;
	}
}
