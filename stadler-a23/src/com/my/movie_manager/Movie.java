package com.my.movie_manager;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Represents a movie consisting of a title and time as in running time.
 * 
 * The Performers in a movie are stored in a HashSet.
 * Here entries can be quickly added and removed.
 * Direct access is not possible but searching for entries is fast.
 * 
 * An ArrayList allows for direct access but searching for an entry requires
 * iterating over the List and is O(n) in worst case.
 * 
 * HashMap allows for another value to be mapped to an entry 
 * and is associative. That is not needed here.
 * 
 * 
 * @author Gavin Gabriel
 * @author Robin Stadler
 * @project Blatt1
 * @version 2015-10-25
 * 
 */
public class Movie {
	/**
	 * The Movies title.
	 */
	private String title;
	
	/**
	 * The Movies running time.
	 */
	private int time;
	
	/**
	 * The instances are consecutively numbered and number stores
	 * an instances number.
	 */
	private int number;
	
	/**
	 * Extends Movie with a Director.
	 */
	private Director director;
	
	/**
	 * HashSet containing the Performers in a movie.
	 */
	private final Set<Performer> performers;
	
	/**
	 * This variable is an instance counter.
	 */
	private static int nextNumber;
	
	/**
	 * Customer who loaned the movie.
	 */
	private Customer customer;
	
	/**
	 * Getter for title.
	 * @return title as a string
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Setter vor title.
	 * @param title Movie title as a String
	 */
	public void setTitle(String title) { 
		this.title = title;					
	}
	// 'this' references the instance for which the method was called
	
	/**
	 * Getter for time.
	 * @return time
	 */
	public int getTime() {
		return time;
	}

	/**
	 * Setter for time.
	 * @param time the Movies running time
	 */
	public void setTime(int time) {
		this.time = time;
	}
	
	/**
	 * Getter for number.
	 * @return the Movies number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Setter for number.
	 * @param number the movies number
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	/**
	 * Getter for customer.
	 * @return customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * Setter for Customer.
	 * @param customer customer to be set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * Basic constructor.
	 * @param enteredTitle title of the movie
	 * @param enteredTime running time of the movie
	 */
	public Movie (String enteredTitle, int enteredTime) {
		++nextNumber;
		setNumber(nextNumber);
		setTitle(enteredTitle);
		setTime(enteredTime);
		performers = new HashSet<Performer>(); 
		
	}
	
	/**
	 * Extended constructor for Director.
	 * @param enteredTitle title of the movie
	 * @param enteredTime running time of the movie
	 * @param director of the movies director.
	 * @project 2.2
	 */
	public Movie (String enteredTitle, int enteredTime, Director director) {
		++nextNumber;
		setNumber(nextNumber);
		setTitle(enteredTitle);
		setTime(enteredTime);
		performers = new HashSet<Performer>();
		this.director = director;
		this.director.setCountMovies(this.director.getCountMovies() + 1);
	}
	
	/**
	 * Prints the Movies title, time and number.
	 */
	public void showInformation() {
		System.out.println("Title: " + getTitle());
		System.out.println("Time: " + getTime());
		System.out.println("Number: " + getNumber());
	}
	/**
	 * Adds a Performer to the HashSet containing the Performers in the Movie.
	 * @param performer to be added
	 */
	public void addPerformer(Performer performer){
		performers.add(performer);
	}
	
	/**
	 * Checks if a Performer is in the Movie.
	 * @param performer to check for
	 * @return true or false
	 */
	public boolean isInMovie(Performer performer){

		if(performers.contains(performer)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Returns the HashSet containing all the Performers in the Movie.
	 * @return HashSet<Performer>
	 */
	public Set<Performer> listPerformers(){
		return this.performers;
	}
	
	/**
	 * Returns a HashSet containg all the outstanding Performers in the Movie.
	 * @return HashSet<Performer>
	 */
	public Set<Performer> listOutstandingPerformers(){
		
		final Set<Performer> outstandingPerformers = new HashSet<Performer>();
		Performer temp;
		for(final Iterator<Performer> it = performers.iterator(); it.hasNext(); ){
			temp = it.next();
			if(temp.isOutstanding()){
				outstandingPerformers.add(temp);
			}
		}
		return outstandingPerformers;
	}
	
	/**
	 * Delete a Performer from the Movie.
	 * @param performer Performer to be deleted
	 */
	public void deletePerformer(Performer performer){
		performers.remove(performer);
	}
	
	/**
	 * Main function as requested in task 2 of exercise 1.2.
	 * @param args no arguments needed
	 */
	public static void main(final String[] args) {
		@SuppressWarnings("unused")
		final Movie movie1;
		movie1 = new Movie("someMovie", 90);
		
		final Director jjabrams = new Director("J.J.", "Abrams", Gender.MALE, false);
		System.out.println("Number of movies directed by " + jjabrams.getLastname()
				+ ", " + jjabrams.getFirstname() + ": " + jjabrams.getCountMovies());
		
		final Movie movie2;
		movie2 = new Movie("someMovie2", 91, jjabrams);
		System.out.println("Director of " + movie2.getTitle() + ": "
				+ movie2.director.getLastname() + ", " + movie2.director.getFirstname());
		System.out.println("Number of movies directed by " + movie2.director.getLastname()
				+ ", " + movie2.director.getFirstname() + ": " + movie2.director.getCountMovies());
		
		final Movie movie3;
		movie3 = new Movie("someMovie3", 92, jjabrams);
		System.out.println("Number of movies directed by " + jjabrams.getLastname()
				+ ", " + jjabrams.getFirstname() + ": " + jjabrams.getCountMovies());
		
	}
	
}
