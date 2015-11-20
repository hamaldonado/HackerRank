package pe.maldonado.algorithms.graphtheory;

import java.util.Scanner;

public class EvenTree {

	static int maximizeComponents(int g[]) {
	
		// 1. count the number of childs each node has
		// 2. those nodes who have an odd number of childs may form a separate component.
		int i, p, c = 0; 
		int childCount[] = new int[g.length];
		
		for (i = 1; i < g.length; i++) {
			p = g[i];
			while (p > 0) {
				childCount[p]++;
				p = g[p];
			}
		}
		
		// Those ones whose their # of childs are odd, may form a separate component 
		// (except one, the root node who already has the main component)
		for (i = 1; i < childCount.length; i++) {
			if (childCount[i] % 2 != 0) {
				c++;
			}
		}
				
		return c-1;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int i, n, m, ui, vi;
	    int g[]; 
	    	    
	    n = in.nextInt();
	    m = in.nextInt();
	    
	    g = new int[n+1];
	    
	    for (i = 1; i <= m; i ++) {
	    	ui = in.nextInt();
	    	vi = in.nextInt();
	    	g[ui] = vi;
	    }

    	System.out.println(maximizeComponents(g));
	    
	    in.close();

	}
}
