package pe.maldonado.algorithms.sorting;

import java.util.Scanner;

public class InsertionSortPart2 {
	
	static void sort(int a[]) {
		
		int i, j, temp;
		int l = a.length;
		
		for (i = 1; i < l; i++) {
			for (j = i; j > 0; j--) {
				if (a[j] < a[j-1]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
			
			for (int k = 0; k < l; k++) {
		    	 System.out.print(Integer.toString(a[k]) + " ");
		    }
			System.out.print("\n");
			
			
		}

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
