/*Q4. Write a program to create a Child class with members name, rn, and totalMark. Create an array of Child objects and search a Child object using linear search from the array. Note: Overload compareTo method of Comparable interface.*/
package generics;

@SuppressWarnings("unused")
class Child implements Comparable<Child> {
	private String name;
	private int rn, totalMark;

	public Child(String name, int rn, int totalMark) {
		this.name = name;
		this.rn = rn;
		this.totalMark = totalMark;
	}

	@Override
	public int compareTo(Child child) {
		return Integer.compare(this.rn, child.rn);
	}

}

public class Q04_FindChild {
	public static void findChild(Child arr[], Child target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].compareTo(target) == 0)
				System.out.println("Child details present at:" + i);
		}
	}

	public static void main(String[] args) {
		Child s1 = new Child("Deb", 26, 30);
		Child s2 = new Child("Rohit", 45, 29);
		Child s3 = new Child("Virat", 18, 35);
		Child s4 = new Child("Shubhman", 77, 33);
		Child s5 = new Child("Yashasvi", 64, 31);
		Child s6 = new Child("Kuldeep", 23, 28);

		Child target = new Child("Rohit", 45, 29);

		Child Children[] = { s1, s2, s4, s6, s3, s5 };

		findChild(Children, target);

	}
}
