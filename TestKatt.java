import java.util.ArrayList;

class TestKatt
{
	public static void main(String[]args)
	{
		ArrayList<Katt> emcats= new ArrayList<Katt>();
		ArrayList<Katt> freezzyCats= new ArrayList<>();
		Katt riverolf= new Katt("riverolf", 5);
		Katt lenin= new Katt("lenin", 8);
		Katt catstro= new Katt("catstro", 12);
		Katt pusin= new Katt("pusin", 1);
		Katt mao= new Katt("mao", 32);
		
		emcats.add(riverolf);
		emcats.add(lenin);
		emcats.add(catstro);
		emcats.add(pusin);
		emcats.add(mao);
		
		System.out.println(emcats);
		
		freezzyCats.add(emcats.get(4));
		emcats.remove(4);
		
		System.out.println("varme katter: " + emcats);
		System.out.println("kalde katter: " + freezzyCats);
	}
}