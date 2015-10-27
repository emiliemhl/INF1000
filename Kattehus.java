import java.util.*;
import java.io.*;

class Kattehus{
	private HashMap<String, Katt> katteliste;
	
	public Kattehus(){
		katteliste = new HashMap<String, Katt>();
	}
	
	public void lesInnKatterFraFil(String filnavn) throws Exception{
		Scanner sc = new Scanner(new File(filnavn));

		sc.nextLine();

		String denneKatt = sc.nextLine();
		String rase = sc.nextLine();
		String farge = sc.nextLine();
		String linje = sc.nextLine();
		ArrayList<String> trekk = new ArrayList<String>();

		while(sc.hasNextLine()) {
			if(linje.equals("-")) {
				Katt k = new Katt(denneKatt, rase, farge);
				katteliste.put(denneKatt, k);

				for(String s : trekk) {
					k.leggTilPersonlighetstrekk(s);
				}

				denneKatt = sc.nextLine();
				rase = sc.nextLine();
				farge = sc.nextLine();
				trekk = new ArrayList<String>();
				linje = sc.nextLine();
				continue; // Ikke bruk dette på eksamen da stryker dere (neida)
						  // hopper deg opp til begynnelsen av while-løkka
			}
			trekk.add(linje);
			linje = sc.nextLine();
		}
		for(Katt k : katteliste.values()) {
			System.out.println(k);
		}

		Katt k = new Katt(denneKatt, rase, farge);
		katteliste.put(denneKatt, k);

		for(String s : trekk) {
			k.leggTilPersonlighetstrekk(s);
		}

	}


	
	public void skrivKatterTilFil(String filnavn) throws Exception{
		PrintWriter pw = new PrintWriter(filnavn);
		for (String s : katteliste.keySet()){
			pw.println("-");
			pw.println(katteliste.get(s).toString());
			pw.println(katteliste.get(s).getRase());
			pw.println(katteliste.get(s).getFarge());
			for (String t : katteliste.get(s).getPersonlighet().keySet()){
				pw.println(t);
			}
		}
		pw.close();
	}
		
		
	public void opprettKatt(String navn, String rase, String farge, String p){
		Katt k = new Katt(navn, rase, farge);
		k.leggTilPersonlighetstrekk(p);
		katteliste.put(navn, k);
		
	}					
}