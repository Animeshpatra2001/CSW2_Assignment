/*Q2. Design a Java class called Rectangle with private attributes length and width. Include a 
constructor to initialize these attributes, as well as setter and getter methods for each attribute. 
Additionally, implement methods to calculate the area and perimeter of the rectangle. Write a 
main method to create an object of the Rectangle class, set values for its attributes, and display 
the area and perimeter.*/
package oops;

class Rectangle {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double calculateArea() {
		return length * width;
	}

	public double calculatePerimeter() {
		return 2 * (length + width);
	}
}

public class Q2_RectangleTester {
	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(5.0, 3.0);

		System.out.println("Area: " + rectangle.calculateArea());
		System.out.println("Perimeter: " + rectangle.calculatePerimeter());
	}
}
