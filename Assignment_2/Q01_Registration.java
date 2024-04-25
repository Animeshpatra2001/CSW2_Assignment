/*Q1. Write a program to create a Student class that has members, name, roll
number, and age. Design the Student class in such a way that it can take
the roll number as an integer or string. Create a driver class that creates
student objects and invokes the methods.*/
package generics;

class Student<T> {
	T name, roll, age;

	public Student(T name, T roll, T age) {
		this.name = name;
		this.roll = roll;
		this.age = age;
	}

	public String toString() {
		return name + ", roll no. " + roll + " of age " + age;
	}
}

public class Q01_Registration {
	public static void main(String[] args) {

		Student s1 = new Student("Animesh", 38, 23);
		System.out.println(s1.toString());
	}
}
