package pe.maldonado.algorithms.bitmanipulation;

import java.util.Scanner;
import java.math.BigInteger;

public class CounterGame {

	/*
	 
	1. Segun problema, la potencia de dos más grande posible seria 2 a la 63 
	2. Para hallar la potencia de dos mas grande y menor a N. hacemos.
		p = 63;
	 	base = 2 << p;
	 	mientras que base > N
	    	base = base >> 1  // reducimos el exponente en 1
	    	p--;

	3. una vez hallado p sabremos quien es el ganador:  Dado que Louise movio primero, si p es par 
	   el ganador seria Louise, de lo contrario Richard.
	   
	   Notese que en el problema, diidir N / 2 o reducirlo a la potencia mas cercana es lo mismo!
	   	   
	 */
	static String counterGameWinner(BigInteger n) {
		
		int p = 63;
		boolean winner = false; // false = Richard, true = Louise;
		
		BigInteger base = BigInteger.valueOf(1 << p);
				
		while (n.compareTo(BigInteger.valueOf(1)) > 0) {

			// Find "base", the largest power of 2 less than n
			while (base.compareTo(n) > 0) {
				base = base.shiftRight(1);
				p--;
			}
			
			//if equals, then n is a power of 2
			if (base.equals(n)) {
				
				// reduce n to the half
				n = n.shiftRight(1);
			}
			else {
				
				// not a power of two, reduce the counter by the largest power of 2 less than N (ie base).
				n = n.subtract(base);
			}
			
			winner = !winner;
		}
			
		if (winner) {
			return "Louise";
		}
		else {
			return "Richard";
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    int t;
	    BigInteger bi;
	    
	    t = in.nextInt();
	    
	    for (int i = 0; i < t; i++) {
	    	bi = in.nextBigInteger();
	    	
	    	System.out.println(counterGameWinner(bi));
	    }
	    
	    in.close();
	}

}
