package pe.maldonado.algorithms.sorting;

import java.util.Scanner;
import java.util.Arrays;

public class SherlockAndPairs {

	static long findPairs(int a[]) {
		
		// for a group of n equal items, we will have n * (n - 1) posibilities of [i,j] in which i != j 
		int i, p;
		long count, combos = 0;
		
		Arrays.sort(a);
		 
		p = a[0];
		count = 1;
		
		for (i = 1; i < a.length; i++) {
			if (a[i] == p) {
				count++; 
			}
			else {
				combos += count * (count - 1);
				p = a[i];
				count = 1;
			}
		}
		
		// considering the last group of items
		if (count > 1) {
			combos += count * (count - 1);
		}

		return combos;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int i, j, t, n;
	    int a[]; 
	    	    
	    t = in.nextInt();
	        
	    for (i = 0; i < t; i ++) {
	    	
	    	n = in.nextInt();
	       	a = new int[n];
	       	
	    	for (j = 0; j < n; j++) {
	    		a[j] = in.nextInt();
	    	}
	    	
	    	System.out.println(findPairs(a));
	    }
	    	    
	    in.close();

	}
}
