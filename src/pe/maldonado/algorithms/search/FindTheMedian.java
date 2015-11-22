package pe.maldonado.algorithms.search;

import java.util.Scanner;

public class FindTheMedian {

	
	static int findMedian(int[] a) {
		
		/*int i, j;
		
		for (i = 0; i < a.length; i++) {
		
			for (j = 0; j < a.length; j++) {
				
				if ( i != j ){
				
					if (a[j] < a[i]) {
						lt++;
					}
					
				}
				   
				
			}
			
		}*/
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int j, n, m;
	    int[] a;
	    	
    	n = in.nextInt();
    	a = new int[n]; 
    		    	
    	for (j = 0; j < n; j++) {
    		a[j] = in.nextInt(); 
		}
    	
    	m = findMedian(a);
	    	    
	    in.close();

	}
	
}
