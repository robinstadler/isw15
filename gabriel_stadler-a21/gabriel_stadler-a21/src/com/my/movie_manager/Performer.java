package com.my.movie_manager;

/**
 * Represents a Performer, as in movie actor.
 * A Performer has a first name a last name and a gender.
 * A Perfomer can be outstanding or not
 * and can be in an unlimited amount of movies of movies.
 * 
 * @version 18.10.15
 * @author Gavin Gabriel
 * @project Blatt1
 * 
 */
public class Performer {

	private String firstname;
	private String lastname;
	private Gender gender;
	
	/**
	 * Reference to a movie from task 7 in exercise 1.2.
	 */
	private Movie movie;
	
	private boolean outstanding;
	
	/**
	 * Getter for firstname.
	 * @return firstname as a String
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Setter for firstname.
	 * @param firstname Performers firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * Getter for lastname.
	 * @return lastname as a String
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * Setter for lastname.
	 * @param lastname Performers lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * Getter for gender.
	 * @return Performers gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * Setter for gender.
	 * @param gender Performers gender
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	/**
	 * Getter for movie.
	 * @return movie
	 */
	public Movie getMovie() {
		return movie;
	}

	/**
	 * Setter for movie.
	 * @param movie movie to be assigned to Performer
	 */
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	/**
	 * Getter for outstanding.
	 * @return outstanding
	 */
	public boolean isOutstanding() {
		return outstanding;
	}

	/**
	 * Setter for Outstanding.
	 * @param outstanding true or false
	 */
	public void setOutstanding(boolean outstanding) {
		this.outstanding = outstanding;
	}

	/**
	 * Sole constructor - creates a new Performer instance.
	 * @param firstname Performers firstname
	 * @param lastname Performers lastname
	 * @param gender Performers gender
	 * @param outstanding true if Performer is outstanding, false if not
	 */
	public Performer(String firstname, String lastname, Gender gender,
							boolean outstanding) {
		setFirstname(firstname);
		setLastname(lastname);
		setGender(gender);
		setOutstanding(outstanding);
	}


	
	
}
