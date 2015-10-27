package de.uhd.bookexample.client;

/**
 * A simple book class.
 * */
public class Book {

	/**
	 * The identification number of a book
	 * */
	private int isbn;

	/**
	 * The title of a book
	 * */
	private String title;

	/**
	 * The name of the book's author
	 * */
	private String author;

	/**
	 * Creates a new book with default attributes.
	 * */
	public Book() {
		isbn = 0;
		title = "";
		author = "";
	}

	/**
	 * Creates a new book with the given attributes.
	 * 
	 * @param isbn
	 *            The identification number of the book
	 * @param title
	 *            The book's title
	 * @param author
	 *            The book's author
	 * */
	public Book(int isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}

	/**
	 * @return the isbn
	 */
	public int getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

}
