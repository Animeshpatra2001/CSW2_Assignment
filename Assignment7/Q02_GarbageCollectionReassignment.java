/*Q2. Develop a Java program showcasing reference reassignment and garbage collection using the ReassigningReference class. This class features a constructor initializing an object with a given name. In the main() method, two instances of ReassigningReference are created. Then, the reference is reassigned. Subsequently, the garbage collector is explicitly invoked. Additionally, the program overrides the finalize() method to print the name of the object upon successful garbage collection.*/
package garbageCollection;

class ReassigningReference {
	String name;

	public ReassigningReference(String name) {
		this.name = name;
	}

	protected void finalize() throws Throwable {
		System.out.println("Garbage collecting object: " + name);
	}
}

public class Q02_GarbageCollectionReassignment {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ReassigningReference r1 = new ReassigningReference("Object 1");
		ReassigningReference r2 = new ReassigningReference("Object 2");
		r1 = r2;
		r2 = null;
		System.gc();
	}
}