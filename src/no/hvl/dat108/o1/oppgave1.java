package no.hvl.dat108.o1;

import java.util.Arrays;
import java.util.List;

public class oppgave1 {

	public static void main(String[] args) {

		
		List<String> listen = Arrays.asList("10", "1", "20", "110", "21", "12");
		
		listen.stream().mapToInt(t -> Integer.parseInt(t))
			.sorted()
			.forEach(t -> System.out.print(t + " "));
		
		//se om du får gjort dette med collections.sort isteden
	}

}
