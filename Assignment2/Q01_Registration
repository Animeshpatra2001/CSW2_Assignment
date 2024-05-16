/*Q1. Write a program to create a Student class that has members, name, rollnumber, and age. Design the Student class in such a way that it can take the roll number as an integer or string. Create a driver class that creates student objects and invokes the methods.*/
package generics;

class Student<T> {
	String name;
	T roll;
	int age;

	public Student(String name, T roll, int age) {
		this.name = name;
		this.roll = roll;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ", roll no. " + roll + " of age " + age;
	}
}

public class Q01_Registration {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Student s1 = new Student("Animesh", 38, 23);
		Student s2 = new Student("Animesh", "38", 23);
		System.out.println(s1);
		System.out.println(s2);
	}
}
