/*Q1. Write a Java program illustrating garbage collection through an UnreachableObject class. This class will include a constructor initializing an object with a given name, a show() method creating an instance of UnreachableObject class and then invoking display(), a display() method creating an UnreachableObject instance, and a main() method calling show() followed by an explicit invocation of the garbage collector. Additionally, the program will override the finalize() method to print the object's name upon successful garbage collection.*/
package garbageCollection;

class UnreachableObject {
	String name;

	public UnreachableObject(String name) {
		this.name = name;
	}

	@SuppressWarnings("unused")
	void display() {
		System.out.println("Displaying object: " + name);
		UnreachableObject u = new UnreachableObject("New Object");
	}

	protected void finalize() throws Throwable {
		System.out.println("Garbage collecting object: " + name);
	}
}

public class Q01_GarbageCollection {
	static void show(String name) {
		UnreachableObject u = new UnreachableObject(name);
		u.display();
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		show("Show Object");
		UnreachableObject u = null;
		System.gc();
	}
}
