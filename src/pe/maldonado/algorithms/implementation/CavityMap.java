package pe.maldonado.algorithms.implementation;

import java.util.Scanner;

public class CavityMap {
	
	static void findCavities(String s[]) {
		
		int i, j, n = s.length;
		char c, map[][] = new char[n][n]; 
		
		for (i = 0; i < n; i++) {
			map[i] = s[i].toCharArray();
		}
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				
				c = map[i][j];
				
				// check if its a frontier item
				if (i > 0 && j > 0 && i < n - 1 && j < n - 1) {
					
					// Not a frontier, check if its a cavity
					if (map[i-1][j] < c &&  
						map[i+1][j] < c && 
						map[i][j+1] < c &&
						map[i][j-1] < c) {
						
						// Its a cavity, print x
						System.out.print('X');
					}
					else {
						System.out.print(c);
					}
				}
				else {
					// Its a frontier
					System.out.print(c);
				}
				
			}
			System.out.println();
		}		
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    int i, t;
	    String s[];
	    	    	    
	    t = in.nextInt();
	    
	    s = new String[t]; 
	    
	    for (i = 0; i < t; i++) {
	    	s[i] = in.next();
	    }

	    findCavities(s);
	    
	    in.close();
	}
}
