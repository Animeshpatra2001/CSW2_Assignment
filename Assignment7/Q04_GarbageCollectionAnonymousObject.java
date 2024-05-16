/*Q4. Create a Java program demonstrating anonymous objects and garbage collection with the AnonymousObject class. It includes a constructor initializing an object with a name. In main(), an anonymous object is created, and the garbage collector is invoked. The finalize()method prints the object's name upon successful garbage collection*/
package garbageCollection;

class AnonymousObject {
	String name;

	public AnonymousObject(String name) {
		this.name = name;
	}

// Finalize method called by garbage collector
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collecting object: " + name);
	}
}

public class Q04_GarbageCollectionAnonymousObject {
	public static void main(String[] args) {
		new AnonymousObject("Anonymous Object") {
// Overriding finalize() method for anonymous object
			@Override
			protected void finalize() throws Throwable {
				super.finalize();
			}
		};
// Explicitly invoking the garbage collector
		System.gc();
	}
}
