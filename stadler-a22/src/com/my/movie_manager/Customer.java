
package com.my.movie_manager;

import java.util.ArrayList;

/**
 * Represents a Customer, who has a name and a List of Movies he has loaned.
 * He may only loan up to 5 movies and only those that no other customer has
 * loaned.
 */
public class Customer {
	
	/**
	 * The customers name.
	 */
	private String name;
	
	/**
	 * ArrayList containing the movies the customer has loaned.
	 */
	private final ArrayList<Movie> loanedMovies;
	
	/**
	 * Getter for name.
	 * @return Customers name 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for name.
	 * @param name name to be assigned to customer
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Sole constructor.
	 * @param name the Customers name
	 */
	public Customer(String name) {
		this.name = name;
		this.loanedMovies = new ArrayList<Movie>();
	}
	
	/**
	 * Allows the customer to loan a movie, by adding it to the ArrayList of
	 * loaned movies.
	 * @param movie movie to be loaned
	 */
	public void loanMovie(Movie movie){
		
		if(movie.getCustomer() == null){  //if no other customer has loaned it
			if(loanedMovies.size() == 5) {
				System.out.println("Customer " + this.getName()
										+ " has already loaned 5 movies.");
			}
			else {
				movie.setCustomer(this);
				loanedMovies.add(movie);
			}
		}
		else {
			System.out.println("Customer " + movie.getCustomer().getName()
										+ " has currently loaned the movie.");
			
		}
	}
	
	/**
	 * Main function demonstrating the functionality of the implemented classes.
	 * @param args no arguments
	 */
	public static void main(String[] args){
		//creating 6 Movies and 2 Customers:
		final Movie newmovie0 = new Movie("300", 120);
		final Movie newmovie1 = new Movie("301", 121);
		final Movie newmovie2 = new Movie("302", 122);
		final Movie newmovie3 = new Movie("303", 123);
		final Movie newmovie4 = new Movie("304", 124);
		final Movie newmovie5 = new Movie("305", 125);
		final Customer leonidas = new Customer("Leonidas");
		final Customer xerxes = new Customer("Xerxes");
		
		//leonidas tries to loan all six:
		leonidas.loanMovie(newmovie0);
		leonidas.loanMovie(newmovie1);
		leonidas.loanMovie(newmovie2);
		leonidas.loanMovie(newmovie3);
		leonidas.loanMovie(newmovie4);
		leonidas.loanMovie(newmovie5);
		
		//xerxes tries to loan a movie which is already loaned by leonidas:
		xerxes.loanMovie(newmovie0);
		
	}

}
