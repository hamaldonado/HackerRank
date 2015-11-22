package pe.maldonado.algorithms.search;

import java.util.Scanner;
import java.util.Arrays;

public class ClosestNumbers {

	
	static void printPairs(int[] a) {
		
		int i, j = 0;
		int min = 10000001;
		
		Arrays.sort(a);
		
		// find min
		for (i = a.length - 1; i > 0 ; i--) {
			
			if (a[i] - a[i-1] < min ) {
				min = a[i] - a[i-1];
			}
			
		}
		
		// print pairs whose difference is min 
		for (i = 0; i < a.length - 1; i++) {
			
			if (a[i+1] - a[i] == min ) {
				System.out.print(Integer.toString(a[i]) + " " + Integer.toString(a[i+1]) + " ");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int j, n;
	    int[] a;
	    	
    	n = in.nextInt();
    	a = new int[n]; 
    		    	
    	for (j = 0; j < n; j++) {
    		a[j] = in.nextInt(); 
		}
    	
    	printPairs(a);
	    	    
	    in.close();

	}
	
}
