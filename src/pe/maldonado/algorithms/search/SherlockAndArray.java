package pe.maldonado.algorithms.search;

import java.util.Scanner;

public class SherlockAndArray {

	static boolean equalSum(int[] A) {
		
		int i;
		int t, l, r, p;
		
		for (t = 0, i = 0; i < A.length; i++) {
			t += A[i];
		}
		
		r = t;
		l = 0;
		
		for (i = 0; i < A.length; i++) {
			p = A[i];
			
			l = t - r;
			r = t - (p + l);
			
			if (l == r) {
				return true;
			}

		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int i, j, t, n;
	    int[] A;
	    	    
	    t = in.nextInt();
	    	    
	    for (i = 0; i < t; i ++) {
	    	
	    	n = in.nextInt();
	    	A = new int[n]; 
	    		    	
	    	for (j = 0; j < n; j++) {
	    		A[j] = in.nextInt(); 
			}
	    	
	    	System.out.println(equalSum(A) ? "YES" : "NO");
	    	
	    }
	    	    
	    in.close();

	}
	
}
