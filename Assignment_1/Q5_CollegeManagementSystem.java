/*Q5. Developing a Simple College Management System in Java
Create a Java program for managing colleges and students. The provided classes model the 
relationship between colleges and students.
The College class represents a college with attributes collegeName and collegeLocation. The 
Student class represents a student with attributes studentId, studentName, and a reference
to a College object. Enhance the Student class by adding a constructor that assigns a student 
ID, name, and college information. Additionally, add a method named displayStudentInfo()
that prints the student's ID, name, and the college information in which they are enrolled.
In the Main class, instantiate at least two College objects and at least two Student objects. 
Enroll each student in one of the colleges. Then, display the information of all colleges and all 
students using the appropriate methods.
*/

package oops;

class College {
	private String collegeName;
	private String collegeLocation;

	public College(String name, String location) {
		this.collegeName = name;
		this.collegeLocation = location;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public String getcollegeLocation() {
		return collegeLocation;
	}
	public void displayCollegeInfo() {
		System.out.println("College Name: " + collegeName);
		System.out.println("College Location: " + collegeLocation);
	}
}

class Student {
	private int studentId;
	private String studentName;
	private College college;

	public Student(int id, String name, College college) {
		this.studentId = id;
		this.studentName = name;
		this.college = college;
	}

	public void displayStudentInfo() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Name: " + studentName);
		System.out.println("College Name: " + college.getCollegeName());
		System.out.println("College Location: " + college.getcollegeLocation());
	}
}

public class Q5_CollegeManagementSystem {
	public static void main(String[] args) {

		College college1 = new College("ITER College", "BBSR");
		College college2 = new College("Adyant College", "BBSR");

		Student student1 = new Student(38, "Animesh", college1);
		Student student2 = new Student(26, "Omm", college2);

		System.out.println("College 1 Information:");
		college1.displayCollegeInfo();
		System.out.println();

		System.out.println("College 2 Information:");
		college2.displayCollegeInfo();
		System.out.println();

		System.out.println("Student 1 Information:");
		student1.displayStudentInfo();
		System.out.println();

		System.out.println("Student 2 Information:");
		student2.displayStudentInfo();
	}
}
