//�bungsblatt 1 - ISW 15/16 - Robin Stadler
//Aufgabe 1.3

//F�r welche Collection habe ich mich entschieden?
//HashMap

	/*
	Vorteil der ArrayList ist, dass sie geordnet ist und direkt auf die Elemente zugegriffen werden kann.
	Nachteil ist dass dieser Datentyp recht langsam ist.
	
	Vorteil der HashMap ist, dass Elemente nicht doppelt vorkommen (Keys), so k�nnen keine Performer ausversehen doppelt 
	hinzugef�gt werden.	Au�erdem kann man durch den Key direkt auf die Elemente in der HashMap zugreifen.
	Weitere Vorteil ist, dass die HashMap sehr schnell ist.
	
	Die HashSet kann fast alles was die HashMap kann. Es k�nnen keine Elemente doppelt vorkommen
	aber es kann nicht direkt auf das Element zugegriffen werden.
	Au�erdem ist es langsamer als HashMap.
	
	Da die HashMap schnell ist, ein direkter Elementenzugriff m�glich ist UND keine Keys doppelt hinzugef�gt wurden, hab ich mich
	f�r sie entschieden.
	*/

package pack;

import java.util.ArrayList;
import java.util.HashMap;

public class MyFirstMovieManager {

	public static void main(String args[]){
		
		// Filme erzeugen
		Movie fightclub = new Movie("Fightclub", 140);
		Movie memento = new Movie("Memento", 135);
		Movie prestige = new Movie("Prestige - Die Meister der Magie", 150);
		
		// Performer erzeugen
		Performer edward = new Performer("Edward", "Norton", Gender.MALE);
		Performer brad = new Performer("Brad", "Pitt", Gender.MALE);
		Performer hugh = new Performer("Hugh", "Jackman", Gender.MALE);
		
		// Outstanding true setzten
		brad.setOutstanding(true);
		
		// Performer Filmen hinzuf�gen
		fightclub.addPerformer(edward);
		fightclub.addPerformer(brad);
		prestige.addPerformer(hugh);
		
		// Performer ausgeben lassen
		HashMap fightclubPerformer;
		HashMap fightclubPerformerOut;
		fightclubPerformer = fightclub.getPerformers();
		fightclubPerformerOut = fightclub.getPerformersOutstanding();
		
		// HashMaps der Ausgaben verwalten
		System.out.println("Schauspieler aus Fightclub:");
		ArrayList fightclubPerformerValuesList = new ArrayList(fightclubPerformer.values());
		for(int i=0; i < fightclubPerformerValuesList.size(); i++)
		{
			System.out.print(((Performer) (fightclubPerformerValuesList).get(i)).getFirstname());
			System.out.print(" ");
			System.out.println(((Performer) (fightclubPerformerValuesList).get(i)).getLastname());
		}
		
		System.out.println("\nOutstanding Schauspieler aus Fightclub:");
		ArrayList fightclubPerformerOutValuesList = new ArrayList(fightclubPerformerOut.values());
		for(int i=0; i < fightclubPerformerOutValuesList.size(); i++)
		{
			System.out.print(((Performer) (fightclubPerformerOutValuesList).get(i)).getFirstname());
			System.out.print(" ");
			System.out.println(((Performer) (fightclubPerformerOutValuesList).get(i)).getLastname());
		}
		
		// ist Brad Pitt OutStanding?
		System.out.println("\nIst Brad Pitt Outstanding?");
		if (brad.isOutstanding())
			System.out.println("Ja");
		else
			System.out.println("Nein");
		
		// Brad Pitt auf nicht Outstanding �ndern
		System.out.println("\nBrad Pitt auf nicht Outstanding ändern.");
		brad.setOutstanding(false);
		
		// ist Brad Pitt OutStanding?
		System.out.println("\nIst Brad Pitt Outstanding?");
		if (brad.isOutstanding())
			System.out.println("Ja");
		else
			System.out.println("Nein");
		
		// Wie ist Brads voller Name?
		System.out.println("\nWie ist Brads voller Name?");
		System.out.println(brad.getFirstname() + " " + brad.getLastname());
		
		// Name �ndern
		System.out.println("\nBrad Pitts Namen zu Brad Brett ändern");
		brad.setLastname("Brett");
		
		// Wie ist Brads voller Name?
		System.out.println("\nWie ist Brads voller Name?");
		System.out.println(brad.getFirstname() + " " + brad.getLastname());
				
		// Anwenden der performerInMovie Operation
		System.out.println("\nIst Hugh Jackman Schauspieler in Prestige?");
		if (prestige.performerInMovie(hugh))
			System.out.println("Ja");
		else
			System.out.println("Nein");
		
		System.out.println("\nIst Brad Pitt Schauspieler in Prestige?");
		if (prestige.performerInMovie(brad))
			System.out.println("Ja");
		else
			System.out.println("Nein");
		
		// Performer aus Film l�schen
		System.out.println("\nLösche Hugh Jackman von der Schauspieler liste von Prestige");
		prestige.deletePerformer(hugh);
		
		// Schauen ob er wirklich gel�scht ist
		System.out.println("\nIst Hugh Jackman Schauspieler in Prestige?");
		if (prestige.performerInMovie(hugh))
			System.out.println("Ja");
		else
			System.out.println("Nein");
		
	}

}
