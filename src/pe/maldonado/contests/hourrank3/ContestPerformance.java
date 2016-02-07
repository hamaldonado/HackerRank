package pe.maldonado.contests.hourrank3;

import java.util.Scanner;

public class ContestPerformance {

	static int calcPoints(int[] a) {
		
		int i;
		int k, r = 0;
		
		for (i = 1; i < a.length; i++ ) {
			
			if (a[i] == i) {
				r += 100;
			}
			else {
				k = 100 - 10 * (a[i] - i);
				r += (k < 0? 0: k); 
			}
		}
		
		return r > 0 ? r : 0;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int i, n;
	    int[] a;
	    	  
	    a = new int[6];
	    
	    for (i = 1; i <= 5; i++) {
	    	a[i] = in.nextInt();
	    }
	    
	    System.out.println(calcPoints(a));
	     
	    in.close();

	}
}
