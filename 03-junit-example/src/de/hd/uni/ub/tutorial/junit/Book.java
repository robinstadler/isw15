package de.hd.uni.ub.tutorial.junit;

public class Book {

	private String title;
	private String author;
	private double price;

	/**
	 * Constructor
	 * 
	 * @param title
	 * @param price
	 */
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	/**
	 * Check if an object is an instance of book and the values of title, author and
	 * price are equal then return true, otherwise return false
	 */
	public boolean equals(Object object) {
		if (object instanceof Book) {
			Book book = (Book) object;
			return getTitle().equals(book.getTitle())
					&& getAuthor().equals(book.getAuthor())
					&& getPrice() == book.getPrice();
		}
		return false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}