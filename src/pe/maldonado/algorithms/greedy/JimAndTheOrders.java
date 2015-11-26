package pe.maldonado.algorithms.greedy;

import java.util.Scanner;

public class JimAndTheOrders {

	static void sort(int[][] td, int l) {
		
		int i, j, temp[];
		
		for (i = 1; i < l; i++) {
			for (j = i; j > 0; j--) {
				if (td[j][1] < td[j-1][1]) {
					temp = td[j-1];
					td[j-1] = td[j];
					td[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int i, n, t, d;
	    int[][] td;
	    
	    n = in.nextInt();
	    
	    td = new int[n][2];
	    
	    for (i = 0; i < n; i++) {
	    	t = in.nextInt();
	    	d = in.nextInt();
	    	
	    	td[i][0] = i;
	    	td[i][1] = t + d;
	    }
	    
	    sort(td, n);
	    
	    for (i = 0; i < n; i++) {
	    	System.out.print(Integer.toString(td[i][0] + 1) + " ");
	    }
	     
	    in.close();

	}
	

}
