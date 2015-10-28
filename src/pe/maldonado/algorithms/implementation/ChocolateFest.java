package pe.maldonado.algorithms.implementation;

import java.util.Scanner;

public class ChocolateFest {

	static int howManyChocolates(int n, int c, int m) {
		
		int cb, cf, uw, af;  
		
		cb = n / c;		// # Chocolates he may buy
		cf = cb / m;	// # Chocolates he will get for free
		uw = cb % m; 	// # Unused wrappers
		
		af = (cf + uw) / m; 	// # additional free (wrappers of free ones + unused wrappers make additional free ones)
		
		return cb + cf + af;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int t, n, c, m;
	    	   
	    t = in.nextInt();
	    
	    for (int i = 0; i < t; i++) {
	    	n = in.nextInt();  // How much does he have 
	    	c = in.nextInt();  // How much does each chocolate cost
	    	m = in.nextInt();  // How many chocolates you need to get an extra free
	    	
	    	System.out.println(howManyChocolates(n,c,m));
	    }
    
	    
	    in.close();
	}

}
