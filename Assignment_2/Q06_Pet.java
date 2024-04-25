/*Q6. Write a program to create an Animal class with member variables name,
color, types (pet/wild). Override the hashCode method to print the
unique id for the object. Create the objects of the Animal class and
print its hashcode.*/
package generics;

class Animal {
	private String name;
	private String color;
	private String type;

	public Animal(String name, String color, String type) {
		this.name = name;
		this.color = color;
		this.type = type;
	}

	@Override
	public int hashCode() {

		String combined = name + color + type;
		return combined.hashCode();
	}

	@Override
	public String toString() {
		return "Animal{name='" + name + "', color='" + color + "', type='" + type + "'}";
	}
}

public class Q06_Pet {
	public static void main(String[] args) {

		Animal cat = new Animal("Fluffy", "White", "Pet");
		Animal lion = new Animal("Simba", "Brown", "Wild");

		System.out.println("Hash code of cat: " + cat.hashCode());
		System.out.println("Hash code of lion: " + lion.hashCode());

		System.out.println("Details of cat: " + cat);
		System.out.println("Details of lion: " + lion);
	}
}
