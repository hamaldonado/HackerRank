package pe.maldonado.algorithms.implementation;

import java.util.Scanner;

public class AngryProfessor {

	static boolean isCancelled(int k, int arrivals[]) {
		
		int i, onTime = 0;
		
		for (i = 0; i < arrivals.length; i++) {
			if (arrivals[i] <= 0) {
				onTime++;
			}
				
		}
		
		if (onTime >= k) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    int i, j, n, k, t;
	    int arrivals[];
	    
	    t = in.nextInt();
	    
	    for (i = 0; i < t; i++) {
	    	n = in.nextInt(); 
	    	k = in.nextInt();
	    	
	    	arrivals = new int[n];
	    	
	    	for (j = 0; j < n; j++) {
	    		arrivals[j] = in.nextInt();
	    	}
	    	
	    	if (isCancelled(k, arrivals)) {
	    		System.out.println("YES");
	    	}
	    	else {
	    		System.out.println("NO");
	    	}
	    }
	    
	    in.close();
	}

}
