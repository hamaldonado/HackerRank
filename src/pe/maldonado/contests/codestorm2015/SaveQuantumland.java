package pe.maldonado.contests.codestorm2015;

import java.util.Scanner;

public class SaveQuantumland {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int i, j, t, n;
	    int c, k, g[]; 
	    	    
	    t = in.nextInt();
	    	    
	    for (i = 0; i < t; i ++) {
	    	
	    	n = in.nextInt();
	    	g = new int[n];
	    	c = 0;
	    	
	    	for (j = 0; j < n; j++) {
	    		g[j] = in.nextInt();
	    		
	    		if (j > 0) {
	    			if (g[j-1] == 0 && g[j] == 0) {
	    				g[j] = 1;
	    				c++;
	    			}
	    		}
	    	}
	    	
	    	System.out.println(c);
	    	
	    }
	    	    
	    in.close();

	}
}
