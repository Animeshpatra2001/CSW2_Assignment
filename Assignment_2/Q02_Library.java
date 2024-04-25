/*Q2. Write a program to create a Book class with member variables bookId,
bookName, and price. Add the respective method and constructor to it.
Create a driver class in that class and create two book objects. Compare
the book objects according to their price. Print the details of the book
objects.
Note: Overload toString and equals method.*/
package generics;

class Book<T> {
	T bookId, bookName, price;

	public Book(T bookId, T bookName, T price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book ID: " + bookId + ", Book Name: " + bookName + ", Price: $" + price;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			Book b = (Book) obj;
			return this.bookId == b.bookId;
		}
		return false;
	}

	public class Q2_Library {
		public static void main(String[] args) {

			Book book1 = new Book(101, "Java Programming", 25.99);
			Book book2 = new Book(102, "Python Programming", 19.99);

			System.out.println(book1.equals(book2));

			System.out.println("Book 1 details:");
			System.out.println(book1);

			System.out.println("\nBook 2 details:");
			System.out.println(book2);
		}
	}
}
