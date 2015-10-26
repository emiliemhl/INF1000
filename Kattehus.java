import java.util.*;
import java.io.*;

class Kattehus{
	private HashMap<String, Katt> katteliste;
	
	public Kattehus(){
		katteliste = new HashMap<String, Katt>();
	}
	
	public void lesInnKatterFraFil(String filnavn) throws Exception{
		Scanner sc = new Scanner(new File(filnavn));
		
		do{
			String temp = sc.nextLine();
			boolean leserInnKatt = true;
			boolean erBindestrek = false;
			if(temp.equals("-") && leserInnKatt){
				String navn = sc.nextLine();
				String rase = sc.nextLine();
				String farge = sc.nextLine();
				Katt k = new Katt(navn, rase, farge);
				
				while (sc.hasNextLine() && !erBindestrek){
					k.leggTilPersonlighetstrekk(sc.nextLine());
					if (sc.nextLine().equals("-") && sc.hasNextLine()){
						erBindestrek = true;
					}
					else{
						erBindestrek = false;
					}
				}
				
			}
		}while (sc.hasNextLine());
	}
	
	public void skrivKatterTilFil(String filnavn) throws Exception{
		PrintWriter pw = new PrintWriter(filnavn);
		pw.println("Kattefil");
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