//�bungsblatt 1 - ISW 15/16 - Robin Stadler
//Aufgabe 1.3

package pack;
import java.util.HashMap;
import java.util.ArrayList;

public class Movie {

	//--//Instanzattribute//--//
	private String title;
	private int time;
	private int number;
	private HashMap performer = new HashMap(); // Aufgabe 1.3
	
	//--//Klassenattribut//--//
	static int nextNumber = 1; //Aufgabe 1.2.5
	
	//--//Getter und Setter//--//
	//Aufgabe 1.1.3
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title; //Aufgabe 1.2.4: this.title referenziert die vorhandene Klassenvariable title; this ist eine Objektreferenz auf das Objekt in dem es aufgerufen wird
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}

	//--//Klassenmethoden//--//
	//Aufgabe 1.2.6
	public void showInformation() {
		System.out.println("Titel:" + this.title + "\nZeit:" + this.time + "\nNummer:" + this.number);
	}
	//Aufgabe 1.3.1
	public void addPerformer(Performer performer) {// Performer hinzuf�gen
		this.performer.put(performer, performer); // Performer in die HashMap eintragen
		performer.setMovie(this);  // Den Film in die Performer Instanz eintragen
	}
	
	public boolean performerInMovie(Performer performer) // Schauen ob ein bestimmter Performer im Movie mitspielt
	{
		if (this.performer.containsValue(performer))
			return true;
		else
			return false;
	}
	
	public HashMap getPerformers() // Alle Performer zur�ckgeben
	{
		return this.performer;
	}
	
	public HashMap getPerformersOutstanding() // Alle outstanding Performer zur�kgeben
	{
		ArrayList performerValuesList = new ArrayList(this.performer.values()); //Werte aus der HashMap in ein ArrayList schreiben
		HashMap performerOut = new HashMap();	//Neue Hashmap erzeugen f�r die R�ckgabe
				
		for(int i=0; i < performerValuesList.size(); i++)
		{
			if((((Performer) performerValuesList.get(i)).isOutstanding())) //F�r jeden Performer in der ArrayList �berpr�fen, ob Outstanding true ist
				performerOut.put(i, performerValuesList.get(i));  //Wenn JA, wird er der R�ckgabe HashMap hinzugef�gt
		}
		return performerOut; //R�ckgabe der HashMap mit den Performern bei denen Outstanding true ist
	}
	
	public void deletePerformer(Performer performer) //einen Performer l�schen
	{
		this.performer.remove(performer);
		performer.setMovie(null);
	}
	
	//--//Konstruktor//--//
	//Aufgabe 1.1.1
	Movie(String title, int time) {
        this.title = title;
        this.time = time;
        this.number = nextNumber; //Aufgabe 1.2.5
        nextNumber = nextNumber + 1; //Aufgabe 1.2.5
	} 
	
	
	
	//--//Main//--//	   
//	public static void main( String args[]) {
//		Movie newMovie; //Aufgabe 1.2.2
//		newMovie = new Movie("test", 0); //Aufgabe 1.2.2
//		newMovie.showInformation();
//	}
	
}

