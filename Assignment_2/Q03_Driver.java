/*Q3. Write a program to create a Car class with member variables model, color,
and speed. Add the respective method and constructor to it. Create a
driver class in that class and create two car objects. Compare the car
objects according to their speed and print the details of the car that has
a greater speed.
Note: Overload compareTo method of Comparable interface.*/
package generics;

class Car implements Comparable<Car> {
	String model, color;
	int speed;

	public Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}

	@Override
	public int compareTo(Car car) {
		return Integer.compare(this.speed, car.speed);
	}

	@Override
	public String toString() {
		return "Car Details: Model=" + model + ", Color=" + color + ", Speed=" + speed + " km/h";
	}
}

public class Q03_Driver {
	public static void main(String[] args) {

		Car car1 = new Car("Toyota", "Red", 180);
		Car car2 = new Car("Honda", "Blue", 200);

		int comparisonResult = car1.compareTo(car2);
		if (comparisonResult < 0) {
			System.out.println("Car 2 has a greater speed:");
			System.out.println(car2);
		} else if (comparisonResult > 0) {
			System.out.println("Car 1 has a greater speed:");
			System.out.println(car1);
		} else {
			System.out.println("Both cars have the same speed:");
			System.out.println(car1);
			System.out.println(car2);
		}
	}
}
