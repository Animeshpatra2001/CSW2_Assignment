/*Q9. Design a Java program for managing student enrollment in a university, adhering to the 
principles of loose coupling and high cohesion. Your program should include classes for 
representing students (`Student`), courses (`Course`), and enrollment management 
(`Enrollment`). Ensure that the `Enrollment` class interacts with the other classes indirectly 
through an interface class (`EnrollmentSystem`). Implement methods for enrolling and 
dropping students from courses, and displaying enrollment details. Create a `Main` class to 
demonstrate the system's functionality, with appropriate error handling and user-friendly output 
messages. Provide comments in your code explaining how loose coupling and high cohesion 
are maintained throughout the implementation*/
package oops;

import java.util.*;

interface EnrollmentSystem {
	void enrollStudent(Child student, Course course);

	void dropStudent(Child student, Course course);

	void displayEnrollmentDetails();
}

class Child {
	private String name;

	public Child(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class Course {
	private String courseName;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}
}

class Enrollment implements EnrollmentSystem {

	private List<String> enrollments;

	public Enrollment() {
		enrollments = new ArrayList<>();
	}

	public void enrollStudent(Child student, Course course) {
		enrollments.add(student.getName() + " is enrolled in " + course.getCourseName());
	}

	public void dropStudent(Child student, Course course) {
		enrollments.remove(student.getName() + " is enrolled in " + course.getCourseName());
	}

	public void displayEnrollmentDetails() {
		System.out.println("Enrollment Details:");
		for (String enrollment : enrollments) {
			System.out.println(enrollment);
		}
	}
}

public class Q9_Registration {
	public static void main(String[] args) {

		Enrollment enrollment = new Enrollment();

		Child student1 = new Child("Animesh");
		Child student2 = new Child("Kanha");
		Course course1 = new Course("Math");
		Course course2 = new Course("Physics");

		enrollment.enrollStudent(student1, course1);
		enrollment.enrollStudent(student2, course2);

		enrollment.displayEnrollmentDetails();

		enrollment.dropStudent(student1, course1);

		enrollment.displayEnrollmentDetails();
	}
}
