package no.hvl.dat108.o1;

import java.util.function.BiFunction;

public class oppgve1b {
	
	/*skal ta inn to tall og gjøre en beregning på de tallene
	 * 
	 * for eksempel skal den finne ut hva som er summen 
	 * av 12 og 13 = 25.
	 * 
	 * finne det største av -5 og 3.
	 * 
	 * finne absoluttverdien av differansen mellim54 og 45
	 * 
	 * 
	 * den tredje parameteren skal alltid angis som en variabel.
	 * int sum = beregn(12, 13, summerFunksjon
	 * 
	 * tips BiFunksjon(evt. BinaryOperator)
	 *  
	 */
	
	public static int beregn(int a, int b, BiFunction<Integer, Integer, Integer> funksjon) {
        return funksjon.apply(a, b);
    }

    public static void main(String[] args) {
        // i. Summen av 12 og 13
        BiFunction<Integer, Integer, Integer> summerFunksjon = (x, y) -> x + y;
        int sum = beregn(12, 13, summerFunksjon);
        System.out.println("Summen: " + sum);
        
        

        // ii. Den største av -5 og 3
        BiFunction<Integer, Integer, Integer> storstFunksjon = (x, y) -> Math.max(x, y);
        int storst = beregn(-5, 3, storstFunksjon);
        System.out.println("Størst: " + storst);
        
        

        // iii. Avstanden (absoluttverdien av differansen) mellom 54 og 45
        BiFunction<Integer, Integer, Integer> avstandFunksjon = (x, y) -> Math.abs(x - y);
        int avstand = beregn(54, 45, avstandFunksjon);
        System.out.println("Avstanden: " + avstand);
    
    
    }
}