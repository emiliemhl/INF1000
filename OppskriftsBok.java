import java.util.HashMap;
import java.io.File;
import java.util.Scanner;

public class OppskriftsBok {

	private HashMap<String, Oppskrift> oppskrifter = new HashMap<String, Oppskrift>();

	public OppskriftsBok(String filnavn) throws Exception{
		lagOppskrifterFraFil(filnavn);
	}

	private void lagOppskrifterFraFil(String filnavn) throws Exception{
		File filen = new File(filnavn);
		Scanner fil = new Scanner(filen);
		String linje = fil.nextLine(); //Linje er "Tittel".
		
		while(true){
			linje = fil.nextLine(); //Forste linje er oppskriftstittel
			Oppskrift oppskriften = new Oppskrift(linje);
			oppskrifter.put(oppskriften.toString(), oppskriften);

			//Legg til ingredienser.
			linje = fil.nextLine();
			while(!linje.equals("Oppskrift:")){
				oppskriften.leggTilIngrediens(linje);
				linje = fil.nextLine();
			}

		//Legg til oppskriftstekst.
		linje = fil.nextLine();

		while(!linje.equals("Tittel:")){
			oppskriften.leggTilOppskriftsLinje(linje);
			linje = fil.nextLine();

			// Om filen ikke har igjen flere linjer
			if(!fil.hasNextLine()){
				return;
			}
		}
	}
}
	/*Skriver ut alle oppskrifter i boken.*/

	public void skrivUtAlleOppskrifter(){ 

		for(Oppskrift denneOppskriften : oppskrifter.values()){
			System.out.println("\nTittel: " + denneOppskriften.toString());
			System.out.println("\nIngredienser:");
			denneOppskriften.skrivUtIngredienser();
			System.out.println("\nOppskrifttekst:");
			denneOppskriften.skrivUtOppskrift();
		}
	}

	/*Sjekker om en oppskrift eksisterer i boken.*/
	public boolean finnesOppskrift(String oppskriftsTittel){
		for(String denneOppskriftensTittel : oppskrifter.keySet()){
			if(denneOppskriftensTittel.equals(oppskriftsTittel)){
				return true;
			}
		} return false;
	}

	/*Skriv ut spesifikk oppskrift.*/
	public void skrivUtOppskrift(String oppskriftsTittel){
	// Sjekker at oppskriften finnes
		if(finnesOppskrift(oppskriftsTittel)){
			Oppskrift oppskrift = oppskrifter.get(oppskriftsTittel);
		} else {
			System.out.println("Oppskrift finnes ikke");
		}
	}
}