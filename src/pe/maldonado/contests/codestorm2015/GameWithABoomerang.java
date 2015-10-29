package pe.maldonado.contests.codestorm2015;

import java.util.Scanner;
import java.util.ArrayList;

public class GameWithABoomerang {

	static int whoIsKilled(int n, int i) {
		
		int d = n/2;
		
		if (n % 2 == 0) {
			return i < d ? i + d : i - d; 
		} 
		else {
			return i;
		}
		
	}
	
	static int winner(int n) {
							
		int i, k, alive = n; 
		ArrayList <Integer> aborigens = new ArrayList<>(n);
		
		for (i = 1; i <= n; i++) {
			aborigens.add(i);
		}
		
		i = 0;
		
		while (alive > 1) {
		
			if (aborigens.size() == 112) {
				System.out.println("x");
			}
			
			k = whoIsKilled(aborigens.size(), i);
			aborigens.remove(k);
			alive--;
			
			if (k != i) {
				if (i == aborigens.size()) {
					i = 0;
				}
				else {
					i++;
				}
			}

		}
		
		// The last item in the arraylist is the winner
		return aborigens.get(0);
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int i, t;
	    int n, w; 
	    	    
	    t = in.nextInt();
	    	    
	    for (i = 0; i < t; i ++) {
	    	n = in.nextInt();
	    	
	    	w = winner(n);
	    	System.out.println(w);
	    }
	    	    
	    in.close();

	}
	
}
