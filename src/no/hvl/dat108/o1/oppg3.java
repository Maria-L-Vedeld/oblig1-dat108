package no.hvl.dat108.o1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class oppg3 {

	public static void main(String[] args) {
		
		
		List<Ansatt> ansatte = new ArrayList<>(List.of(new Ansatt("Atle", "Patle", Kjonn.M, "Sjefsingeniør", 1500000),
				new Ansatt("Kari", "Nor", Kjonn.K, "Lege", 1000000),
				new Ansatt("Thomas", "Carlyle", Kjonn.M, "Forfattersjef", 400000),
				new Ansatt("Charlotte", "Bronte", Kjonn.K, "Professor", 900000),
				new Ansatt("Matthew", "Arnold", Kjonn.M, "Dikter", 600000)
				));
		
		//a)
		//liste med kun etternavn
		List<String> lastName = ansatte.stream()
				.map(a -> a.getEtternavn())
				.toList();
		
		System.out.println(lastName + "\n"); // legger til linjeskift for å unngå at utskrift blir for kompakt
		
		//b)
		//finne ut antallet kvinnlige ansatte
		
		Integer antallKvinner = (int) ansatte.stream()
				.filter(a -> a.getKjonn() == Kjonn.K)
				.count();
		
		System.out.println(antallKvinner + "\n");
		
		
		//c)
		//regne ut gjennomsnittslønn til kvinner
		
		Double gjennomsnittLonnK = ansatte.stream()
				.filter(x -> x.getKjonn() == Kjonn.K)
				.mapToDouble( l -> l.getLonn())
				.average()
				.getAsDouble();

		System.out.println(gjennomsnittLonnK + "\n");

		
		//d)
		//alle stillinger som innehilder "sjef" i stilling får en lønnsøkning med 7% ved å bruke
		//stream direkte ( ikke skriv ut metoden fra oppg2)
		
		List<String> sjefer = ansatte.stream()
				.filter(a -> a.getStilling().toLowerCase().contains("sjef"))
                .map(a -> a.getFornavn() + " " + a.getEtternavn() + " (" + a.getKjonn() + ") " + a.getStilling() + " " + (int)(a.getLonn() * 1.07))
                .toList();
		
		System.out.println(sjefer + "\n");
				
		
		
		//e)
		//finn ut (true/false) om noen tjener mer enn 800.000
		
		boolean noenMedHoyLonn = ansatte.stream()
				.anyMatch(a -> a.getLonn() > 800000);
		
		System.out.println(noenMedHoyLonn + "\n");
		
				
		
		//f)
		//skriv ut alle ansatte med  System.out.print() uten å bruke løkke

		ansatte.stream().forEach(System.out::println);
		
		System.out.println("\n");
				
				
		
		//g)
		//finn den/de med lavest lønn
		String lavestLonn = ansatte.stream()
				.min((a1, a2) -> Integer.compare(a1.getLonn(), a2.getLonn()))
				.map(a -> a.getFornavn() + " " + a.getEtternavn() + " (" + a.getKjonn() + ") " + a.getStilling() + " " + a.getLonn())
				.toString();	
		
		System.out.println(lavestLonn + "\n");
		
		
		
		//h) 
		//Finn ut summen av alle heltall i [1, 1000> som er delelig med 3 eller 5
		
		int summenAvTall = IntStream.range(1,  1000)
				.filter(a -> a % 3 == 0 || a % 5 == 0)
				.sum();
		System.out.println(summenAvTall);
		
		
	}

}
