/*Q3. Write a Java program that defines a 'Point' class with attributes 'X' and 'Y', and includes a 
parameterized constructor to initialize these attributes. Implement a copy constructor to 
create a new point object with the same attribute values. Ensure that modifications made to one 
object do not affect the other. Utilize getter and setter methods to retrieve and update the 
attribute values.*/
package oops;

class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point other) {
		this.x = other.getX();
		this.y = other.getY();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}

public class Q3_PointTester {
	public static void main(String[] args) {

		Point point1 = new Point(3.5, 4.5);

		Point point2 = new Point(point1);

		point1.setX(5.0);
		point1.setY(6.0);

		System.out.println("Point 1 - X: " + point1.getX() + ", Y: " + point1.getY());
		System.out.println("Point 2 - X: " + point2.getX() + ", Y: " + point2.getY());
	}
}
