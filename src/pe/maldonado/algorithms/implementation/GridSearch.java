package pe.maldonado.algorithms.implementation;

import java.util.Scanner;

public class GridSearch {

	static boolean gridSearch(String G[], String P[], int R, int C, int r, int c) {
		
		int i, j, k;
		boolean found;
				
		// 1. Look for P[0] in G[i], where 0 < i < R - r
		for (i = 0; i <= R - r; i++) {
			
			k = G[i].indexOf(P[0]);
			
			// if k > -1 it means that P[0] was found on G[i] at index k
			while (k > -1) {
				
				// Look in the following lines G[i+1], G[i+2], etc if at the starting position k, 
				// the next c characters are the same as in P[1], P[2], etc respectively.
				found = true;
				
				for (j = 1; j < r; j++) {
					if (G[i+j].substring(k, k + c).compareTo(P[j]) != 0) {
						found = false;
						break;
					}
				}
				
				if (found) {
					return true;
				}
				
				// Try again. Look for another P[0] in G[i]
				k = G[i].indexOf(P[0], k + 1);
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    int t, i, j;
	    int R, C, r, c;
	    String G[], P[];
	    	    	    	    
	    t = in.nextInt();
	    
	    for (i = 0; i < t; i++) {
	    	R = in.nextInt();
	    	C = in.nextInt();
	    	
	    	G = new String[R];
	    	
	    	for (j = 0; j < R; j++) {
	    		G[j] = in.next();
	    	}
	    	
	    	r = in.nextInt();
	    	c = in.nextInt();
	    	
	    	P = new String[r];
	    	
	    	for (j = 0; j < r; j++) {
	    		P[j] = in.next();
	    	}
	    	
	    	if (gridSearch(G, P, R, C, r, c)) {
		    	System.out.println("YES");
		    }
		    else {
		    	System.out.println("NO");
		    }
	    }

	    in.close();
	}
}
