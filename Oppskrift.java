import java.util.ArrayList;

public class Oppskrift {

	private String tittel;
	private ArrayList<String> oppskriften = new ArrayList<String>();
	private ArrayList<String> ingredienser = new ArrayList<String>();

	/*Metode som sjekker om noen om oppskriftens ingredienser kan inneholder allergier.*/
	public Oppskrift(String oppskriftsTittel) {
		this.tittel = oppskriftsTittel;
	}

	/*Skriver ut oppskriften. */
	public void skrivUtOppskrift() {
		for(String denneLinjen : oppskriften){
			System.out.println(denneLinjen);
		}
	}

	/*Skriver ut ingredienser. */
	public void skrivUtIngredienser() {
		for(String denneIngrediensen : ingredienser){
			System.out.println(denneIngrediensen);
		}
	}

	/*Returnerer tittelen paa oppskriften.*/
	public String toString() {
		return tittel;
	}

	/*Legger til en ingrediens i oppskriften.*/
	public void leggTilIngrediens(String ingrediensen) {
		ingredienser.add(ingrediensen);
	}

	public void leggTilOppskriftsLinje(String oppskriftslinje) {
		oppskriften.add(oppskriftslinje);
	}

}