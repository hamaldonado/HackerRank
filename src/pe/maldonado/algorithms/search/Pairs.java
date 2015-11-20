package pe.maldonado.algorithms.search;

import java.util.Scanner;
import java.util.Arrays;

public class Pairs {

	static int findPairs(int a[], int k) {
		
		if (a.length < 2) {
			return 0;
		}
		
		int p, q, count;
		
		Arrays.sort(a);
		
		p = 0;
		q = 1;
		count = 0;
		
		while (q < a.length) {

			if (a[q] - a[p] == k) {
				p++;
				q++;
				count++;
			}
			else if (a[q] - a[p] < k) {
				q++;
			}
			else if (a[q] - a[p] > k) {
				p++;
			}
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int i, n, k, a[];
	    	
	    n = in.nextInt();
	    k = in.nextInt();
	    a = new int[n];
	       	
	    for (i = 0; i < n; i++) {
	    	a[i] = in.nextInt();
	    }
	    	
	    System.out.println(findPairs(a, k));
	    
	    in.close();
	}

}
