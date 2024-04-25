/*4. Create a class Student having member variable name, age, and mark
and required get and set methods. Create a LinkedList of Student type 
and perform the below operation on it.
(a.) Display the list
(b.) Ask the user to enter a Student object and print the existence of the 
object. Specify is the object is search according to reference or contain.
(c.) Remove a specified Student object.
(d.) Count the number of object present in the list.
(e.)Override equals method checking if the two Student objects share all 
the same values. */
package genericsCollection;

import java.util.LinkedList;
import java.util.Scanner;

class Student {
	private String name;
	private int age, mark;

	public Student(String name, int age, int mark) {
		this.name = name;
		this.age = age;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Student) {
			Student stud = (Student) o;
			return this.getName().equals(stud.getName()) && this.getAge() == stud.getAge()
					&& this.getMark() == stud.getMark();
		}
		return false;
	}
}

public class Q04_LinkedListStudent {
	public static void displayList(LinkedList<Student> list) {
		System.out.println("List of students:");
		for (Student individual : list) {
			System.out.println(
					"Name:" + individual.getName() + ", Age:" + individual.getAge() + ", Mark:" + individual.getMark());
		}
	}

	public static boolean isPresent(LinkedList<Student> list, Student target) {
		return list.contains(target);
	}

	public static void removeStudent(LinkedList<Student> list, Student target) {
		if (!isPresent(list, target)) {
			System.out.println("Student is not present in the provided list.");
		} else {
			list.remove(target);
		}
	}

	public static int numberOfStudents(LinkedList<Student> list) {
		return list.size();
	}

	public static void main(String[] args) {

		LinkedList<Student> list = new LinkedList<>();
		list.add(new Student("Deb", 19, 27));
		list.add(new Student("Virat", 35, 26));
		list.add(new Student("Rohit", 37, 30));
		list.add(new Student("Yashasvi", 21, 28));
		list.add(new Student("Shubhman", 23, 29));

		displayList(list);

		Student target = new Student("Deb", 19, 27);

		displayList(list);
		System.out.println(numberOfStudents(list));

		System.out.println(list.get(0).equals(target));

	}

}