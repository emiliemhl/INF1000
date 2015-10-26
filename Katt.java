import java.util.HashMap;

class Katt{
	private String navn;
	private String farge;
	private String rase;
	private HashMap<String, String> personlighetstrekk;
	
	public Katt(String navn, String rase, String farge){
		this.navn = navn;
		this.rase = rase;
		this.farge = farge;
		personlighetstrekk = new HashMap<String, String>();
	}
	
	public String getFarge(){
		return farge;
	}
	
	public String getRase(){
		return rase;
	}
	
	public HashMap<String, String> getPersonlighet(){
		return personlighetstrekk;
	}
	
	public String toString(){
		return navn;
	}
	
	public void leggTilPersonlighetstrekk(String personlighetstrekk){
		this.personlighetstrekk.put(personlighetstrekk, personlighetstrekk);
	}
	
	
	
	
}