package pe.maldonado.algorithms.sorting;

import java.util.Scanner;

public class QuickSort2Sort {

	static void sort(int a[]) {
		partition(a, 0, a.length - 1);
	}
	
	static void partition(int a[], int start, int end) {
		
		// has reached maximum level of recursion?
		if (end <= start) { 
			return;
		}
		
		int p, i, j = 0;
		int[] temp = new int[end - start + 1];
		
		// Pick left elements
		for (i = start + 1; i <= end; i++) {
			if (a[i] < a[start]) {
				temp[j++] = a[i];
			}
		}
		
		// add the pivot
		p = j++;
		temp[p] = a[start];
		
		// Pick right elements
		for (i = start + 1; i <= end; i++) {
			if (a[i] > a[start]) {
				temp[j++] = a[i];
			}
		}
	
		// Move back temp elements to a
		for (i = start, j = 0; i <= end; i++, j++) {
			a[i] = temp[j];
		}
		
		// recurse on less than sector
		partition(a, start, start + p - 1);
		
		// greater than sector
		partition(a, start + p + 1, end);
		
		
		for (i = start; i <= end; i++) {
	    	System.out.print(Integer.toString(a[i]) + " ");
	    }
	    System.out.print("\n");
		
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	    int[] a;
	    int n;
	    
	    n = in.nextInt();
	    a = new int[n];
	    
	    for (int i = 0; i < n; i++) {
	    	 a[i] = in.nextInt();
	    }

	    sort(a);
	    
	    in.close();
	}
	
}
