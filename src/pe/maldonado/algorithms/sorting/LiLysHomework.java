package pe.maldonado.algorithms.sorting;

import java.util.Scanner;

public class LiLysHomework {

	public static int sort(int a[], int start, int end) {
		
		int i, j, temp, swaps = 0;
		
		for (i = start + 1; i <= end; i++) {
			for (j = i; j > start; j--) {
				if (a[j] < a[j-1]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
					swaps++;
				}
			}
		}
		
		return swaps;

	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    int[] a, b;
	    int n;
	    
	    n = in.nextInt();
	    a = new int[n];
	    b = new int[n];
	    
	    for (int i = 0, j = n - 1; i < n; i++, j--) {
	    	 a[i] = in.nextInt();
	    	 b[j] = a[i];
	    }

	    int s1 = sort(a, 0, a.length - 1);
	    int s2 = sort(b, 0, b.length - 1);
	    
	    System.out.println(s1 < s2 ? s1 : s2);
	    
	    in.close();

	}

}
