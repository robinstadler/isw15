package com.my.movie_manager;

/**
 * 
 * @author Robin
 * @project 2.2
 * @date 2015-10-25
 * @version 2015-10-25
 */

public class Director extends Performer {

	private int countMovies;
	
	public Director(String firstname, String lastname, Gender gender,
			boolean outstanding) {
		super(firstname, lastname, gender, outstanding);
		this.countMovies = 0;
	}
	
	public int getCountMovies() {
		return countMovies;
	}

	public void setCountMovies(int countMovies) {
		this.countMovies = countMovies;
	}
	
	
}
