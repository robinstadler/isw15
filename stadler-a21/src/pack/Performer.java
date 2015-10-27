//Übungsblatt 1 - ISW 15/16 - Robin Stadler
//Aufgabe 1.3

package pack;

public class Performer {

	//--//Instanzattribute//--//
	private String firstname;
	private String lastname;
	private Gender gender;
	private Movie movie; //Aufgabe 1.2.7 Objektreferenz
	private boolean outstanding; //Aufgabe 1.3.1
	
	//--//Getter und Setter//--//
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}	
	
	//Aufgabe 1.2.7 Objektreferenz
	public Movie getMovie(){
		return this.movie;
	}
	public void setMovie(Movie movie){
		this.movie = movie;
	}
	
	//Aufgabe 1.3.1
	public boolean isOutstanding() 
	{
		return this.outstanding;
	}
	public void setOutstanding(boolean outstanding) 
	{
		this.outstanding = outstanding;
	}
	
	//--//Konstruktor//--//	
	public Performer(String firstname, String lastname, Gender gender) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
	}
	
	//--//Main//--//	
//	public static void main( String args[]) {
//		newPerformer = new Performer("firstname", "lastname", Gender.MALE);
//		newPerformer.movie.showInformation();
//	}
	
}
