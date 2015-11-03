package pe.maldonado.algorithms.search;

import java.util.Scanner;

public class MissingNumbers {

	static void findMissingNumbers(int a[], int b[]) {
		
		int i;
		int countsA[] = new int[100];
		int countsB[] = new int[100];
		int min = 10000;
		
		// find the minimum value in b
		for (i = 0; i < b.length; i++) {
			if (b[i] < min) { 
				min = b[i];
			}
		}
		
		// count items in a
		for (i = 0; i < a.length; i++) {
			countsA[a[i]-min]++;
		}
		
		// count items in b
		for (i = 0; i < b.length; i++) {
			countsB[b[i]-min]++;
		}
		
		// Compare the counts and print out the missing numbers
		for (i = 0; i < 100; i++) {
			if (countsA[i] != countsB[i]) {
				System.out.print(Integer.toString(min + i) + " ");
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int i, n, m, a[], b[];
	    	
	    n = in.nextInt();
	    a = new int[n];
	    for (i = 0; i < n; i++) {
	    	a[i] = in.nextInt();
	    }
	    
	    m = in.nextInt();
	    b = new int[m];
	    for (i = 0; i < m; i++) {
	    	b[i] = in.nextInt();
	    }
	    	
	    findMissingNumbers(a, b);
	    
	    in.close();
	}
}
