/*2. Write a Java code snippet that comprises of a User class and an
ArrayListUser class. The User class should define private fields for 
name and age, along with a parameterized constructor and getter/setter
methods for these attributes. Create an ArrayListUser class of User 
objects. After addition of objects, the ArrayListUser class should 
retrieve and print the name and age of users. Then, it should sort the user 
according to age using getter methods and print the updated array list of 
users.*/
package genericsCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q02_User {
	private String name;
	private int age;

	public Q02_User(String name, int age) {
		this.name = name;
		this.age = age;
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
}

class ArrayListUser {
	private ArrayList<Q02_User> userList;

	public ArrayListUser() {
		this.userList = new ArrayList<>();
	}

	public void addUser(Q02_User user) {
		userList.add(user);
	}

	public void printUsers() {
		for (Q02_User user : userList) {
			System.out.println("Name: " + user.getName() + " age: " + user.getAge());
		}
	}

	public void sortUserByAge() {
		Collections.sort(userList, Comparator.comparing(Q02_User::getAge));
	}

	public static void main(String[] args) {
		ArrayListUser arrayListUser = new ArrayListUser();
		arrayListUser.addUser(new Q02_User("Animesh", 21));
		arrayListUser.addUser(new Q02_User("Omm", 54));
		arrayListUser.addUser(new Q02_User("Badri", 31));

		System.out.println("Before Sorting");
		arrayListUser.printUsers();

		arrayListUser.sortUserByAge();

		System.out.println("After Sorting");
		arrayListUser.printUsers();

	}

}
