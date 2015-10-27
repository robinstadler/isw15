package com.my.movie_manager;

/**
 * 
 * @author Robin
 * @project 2.2
 * @date 2015-10-25
 * @version 2015-10-25
 */

public class Director extends Performer {

	/**
	 * Counter for the amount of movies directed.
	 */
	private int countMovies;
	
	/**
	 * Contructor with initialisation of countMovies.
	 * @param firstname
	 * @param lastname
	 * @param gender
	 * @param outstanding
	 */
	public Director(String firstname, String lastname, Gender gender,
			boolean outstanding) {
		super(firstname, lastname, gender, outstanding);
		this.countMovies = 0;
	}
	
	/**
	 * Getter for countMovies.
	 * @return
	 */
	public int getCountMovies() {
		return countMovies;
	}

	/**
	 * Setter for countMovies.
	 * @param countMovies
	 */
	public void setCountMovies(int countMovies) {
		this.countMovies = countMovies;
	}
	
	
}

