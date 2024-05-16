/*Q3. Write a Java program illustrating nullification of references and garbage collection using the NullifiedReference class. This class comprises a constructor initializing an object with a provided name. Within the main() method, an instance of NullifiedReference is created and assigned, followed by a nullification of the object reference. Subsequently, the garbage collector is explicitly invoked. Furthermore, the program overrides the finalize() method to print the name of the object upon successful garbage collection*/
package garbageCollection;

class NullifiedReference {
	String name;

	public NullifiedReference(String name) {
		this.name = name;
	}

	protected void finalize() throws Throwable {
		System.out.println("Garbage collecting object: " + name);
	}
}

public class Q03_GarbageCollectionNullification {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		NullifiedReference n = new NullifiedReference("Object 1");
		n = null;
		System.gc();
	}
}
