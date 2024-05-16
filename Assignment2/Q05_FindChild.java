/*Q5. Write a program to create a Student class with members name, rn, and total mark. Create an array of student objects and sort it using Bubble sort according to its rn. Note: Overload compareTo method of Comparable interface.*/

package generics;

class Pupil implements Comparable<Pupil> {
	private String name;
	private int rn, totalMark;

	public Pupil(String name, int rn, int totalMark) {
		this.name = name;
		this.rn = rn;
		this.totalMark = totalMark;
	}

	public String getName() {
		return name;
	}

	public int getRn() {
		return rn;
	}

	public int getTotalMark() {
		return totalMark;
	}

	@Override
	public int compareTo(Pupil pupil) {
		return Integer.compare(this.rn, pupil.rn);
	}

	@Override
	public String toString() {
		return "Pupil{name='" + name + "', rn=" + rn + ", totalMark=" + totalMark + "}";
	}
}

public class Q05_FindChild {
	public static void main(String[] args) {

		Pupil[] pupils = { new Pupil("Animesh", 38, 90), new Pupil("Divyom", 19, 85), new Pupil("Dipti", 22, 95),
				new Pupil("Arnab", 39, 88), new Pupil("Subham", 40, 92) };

		bubbleSort(pupils);

		System.out.println("Sorted array of pupils:");
		for (Pupil pupil : pupils) {
			System.out.println(pupil);
		}
	}

	public static void bubbleSort(Pupil[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {

					Pupil temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
