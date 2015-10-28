package pe.maldonado.algorithms.implementation;

import java.util.Scanner;

public class FindDigits {
	
	static int findDigits(int n) {
		
		int d, count = 0, m = n;
		
		while (m > 0) {
			
			d = m % 10;
			
			if (d != 0 && (n % d == 0)) {
				count ++;
			}
			
			m = m / 10;
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    int i, t, n;
	    	    	    
	    t = in.nextInt();
	    
	    for (i = 0; i < t; i++) {
	    	n = in.nextInt();
	    	System.out.println(findDigits(n));
	    }
	    
	    in.close();
	}
	
}
