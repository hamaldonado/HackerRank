package pe.maldonado.algorithms.sorting;

import java.util.Scanner;

public class RunningTimeOfAlgorithms {
	
	static void sort(int a[]) {
		
		int i, j, temp;
		int l = a.length;
		int counter = 0;
		
		for (i = 1; i < l; i++) {
			for (j = i; j > 0; j--) {
				if (a[j] < a[j-1]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
					counter++;
				}
			}
		}
		
		System.out.println(counter);

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
