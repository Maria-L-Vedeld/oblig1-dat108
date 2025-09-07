package no.hvl.dat108.o1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* i et fast kronetillegg
*  ii et fast prosenttillegg
*  iii et fast kronetillegg hvis du har lav lønn
*  iv et fast prosenttillegg hvis du er mann
*/

public class opppg2 {

	public static void main(String[] args) {

		List<Ansatt> ansatte = new ArrayList<>(List.of(new Ansatt("Atle", "Patle", Kjonn.M, "Ingeniør", 300000),
				new Ansatt("Kari", "Nor", Kjonn.K, "Lege", 1000000),
				new Ansatt("Thomas", "Carlyle", Kjonn.M, "Forfatter", 400000),
				new Ansatt("Charlotte", "Bronte", Kjonn.K, "Professor", 900000),
				new Ansatt("Matthew", "Arnold", Kjonn.M, "Dikter", 500000)
				));

		System.out.print("Før lønnsoppgjør: \n");
		skrivUtAlle(ansatte);

	

	//fast kronetillegg
	lonnsoppgjor(ansatte, a -> a.getLonn() + 10000);  // alle får 10,000 ekstra
	System.out.println("i) Etter kronetillegg:");
	skrivUtAlle(ansatte);
	
	
	//fast prosenttillegg
	lonnsoppgjor(ansatte, a -> (int) (a.getLonn() * 1.05)); // legger til 5%
	System.out.println("ii) Etter prosenttillegg;");
	skrivUtAlle(ansatte);
	
	
	//fast kronetillegg hvis du har lav lønn
	lonnsoppgjor(ansatte, a -> a.getLonn() < 500000 ? a.getLonn() + 20000 : a.getLonn() ); // under 600,000 får 20,000 ekstra
	System.out.println("iii) Etter kronetillegg for lav lønn:");
	skrivUtAlle(ansatte);
	
	
	//fast prosenttillegg hvis du er mann
	lonnsoppgjor(ansatte, a -> a.getKjonn() == Kjonn.M ? (int) (a.getLonn() * 1.05) : a.getLonn()); //5% for menn
	System.out.println("iv) Etter prosenttillegg for menn:");
	skrivUtAlle(ansatte);
	
	//fast prosenttillegg hvis du er kvinne
		lonnsoppgjor(ansatte, a -> a.getKjonn() == Kjonn.K ? (int) (a.getLonn() * 1.10) : a.getLonn()); //10% for kvinner
		System.out.println("v) Etter prosenttillegg for kvinner:");
		skrivUtAlle(ansatte);
	}
	
	
	private static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> beregning) {


		for (Ansatt a : ansatte) {
			int nyLonn = beregning.apply(a);
			a.setLonn(nyLonn);
		}

	}

	private static void skrivUtAlle(List<Ansatt> ansatte) {
		for (Ansatt a : ansatte) {
			System.out.println(a);
		}
		System.out.println();

	}

}
