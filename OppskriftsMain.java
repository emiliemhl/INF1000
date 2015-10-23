public class OppskriftsMain{
	public static void main(String [] args) throws Exception{

		OppskriftsBok boka = new OppskriftsBok("oppskrifter.txt");
		boka.skrivUtAlleOppskrifter();
		System.out.println(boka.finnesOppskrift("Kantarellsuppe"));

	// Her bør man lage flere tester :-)
	}
}