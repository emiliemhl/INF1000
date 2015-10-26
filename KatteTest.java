class KatteTest{
	public static void main(String[] args) throws Exception{
		Kattehus emiliesHus = new Kattehus();
		emiliesHus.lesInnKatterFraFil("Kattefil.txt");
		emiliesHus.opprettKatt("Nyankatt", "Nyan", "Regnbue", "#Irriterende");
		emiliesHus.opprettKatt("Figaro", "Cavakatt", "Svart med medaljong og sånt", "Partysvenske");
		emiliesHus.skrivKatterTilFil("okei.txt");
		
	}
}