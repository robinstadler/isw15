package com.my.movie_manager;
import java.util.Iterator;

/**
 * This class demonstrates the functionality
 * of the classes 'Movie' and 'Performer'.
 * 
 * @version 18.10.15
 * @author Gavin Gabriel
 * @project Blatt1
 * @section 1.3
 */

public class MyFirstMovieManager {
	
	/**
	 * Main function, demonstarting the functionality of the classes 'Movie'
	 * and 'Performer'.
	 * @param args no arguments needed
	 */
	public static void main(final String[] args){
		
		final Movie starwars4 = new Movie("A New Hope", 125);
		final Movie starwars5 = new Movie("The Empire Strikes Back", 127);
		final Movie starwars6 = new Movie("The Return of the Jedi", 135);
		final Movie indianaJones = new Movie("Raiders of the Lost Ark", 115);
		
		
		final Performer harrison = new Performer("Harrison", "Ford", Gender.MALE, true);
		final Performer carrie = new Performer("Carrie", "Fisher", Gender.FEMALE, false);
		final Performer mark = new Performer("Mark", "Hamill", Gender.MALE, false);
		
		starwars4.addPerformer(harrison);
		starwars4.addPerformer(carrie);
		starwars4.addPerformer(mark);

		starwars5.addPerformer(harrison);
		starwars5.addPerformer(carrie);
		starwars5.addPerformer(mark);
		
		starwars6.addPerformer(harrison);
		starwars6.addPerformer(carrie);
		starwars6.addPerformer(mark);
		
		indianaJones.addPerformer(harrison);
		
		starwars4.showInformation();
		
		System.out.println("Mark Hamill is in Star Wars 4: " + starwars4.isInMovie(mark));
		System.out.println("Mark Hamill is in Indiana Jones: " + indianaJones.isInMovie(mark));
		
		System.out.println("Performers in Star Wars 5: ");
		Performer temp;
		for(Iterator<Performer> it = starwars5.listPerformers().iterator(); it.hasNext(); ){
			temp = it.next();
			System.out.println(temp.getFirstname() + " " + temp.getLastname());
		}
		
		System.out.println("Outstanding performers in Star Wars 5: ");
		for(Iterator<Performer> it = starwars5.listOutstandingPerformers().iterator(); it.hasNext(); ){
			temp = it.next();
			System.out.println(temp.getFirstname() + " " + temp.getLastname());
		}
		
	}

}
