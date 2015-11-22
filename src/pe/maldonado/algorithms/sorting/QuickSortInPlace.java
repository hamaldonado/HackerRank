package pe.maldonado.algorithms.sorting;

import java.util.Scanner;

public class QuickSortInPlace {

	static void sort(int a[]) {
		partition(a, 0, a.length - 1);
	}
	
	
	/*
	 * Partition using lomuto
		partition(A, lo, hi)
		pivot = A[hi]
		i = lo #place for swapping
		for j = lo to hi - 1
		    if A[j] <= pivot
		        swap A[i] with A[j]
		        i = i + 1
		swap A[i] with A[hi]
		return i
	 */
    		
	static void partition(int a[], int lo, int hi) {
		
		// has reached maximum level of recursion?
		if (hi <= lo) { 
			return;
		}
		
		int j, temp;
		int p = a[hi]; 
		int q = lo;
		
		for(j = lo; j < hi; j++) {
			if (a[j] <= p) {
				temp = a[j];
				a[j] = a[q];
				a[q] = temp;
				q++;				
			}
		}
		
		temp = a[hi];
		a[hi] = a[q];
		a[q] = temp;
			
		for (int i = 0; i < a.length; i++) {
	    	System.out.print(Integer.toString(a[i]) + " ");
	    }
	    System.out.print("\n");
	    
		// less than sector
		partition(a, lo, q - 1);
		
		// greater than sector
		partition(a, q + 1, hi);

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
