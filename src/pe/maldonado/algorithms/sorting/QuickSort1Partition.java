package pe.maldonado.algorithms.sorting;

import java.util.Scanner;

public class QuickSort1Partition {

	static void partition(int a[]) {
		
		int temp;
		int l = a.length;
		int p = 0; 
		int lt = 1;
		int gt = a.length - 1;
		
		while (true) {
		
			while (lt < l && a[lt] < a[p]) {
				lt++;
			}

			while (gt > 0 && a[gt] > a[p]) {
				gt--;
			}
			
			if (lt < gt) {
				temp = a[lt];
				a[lt] = a[gt];
				a[gt] = temp;
			}
			else {
				temp = a[gt];
				a[gt] = a[p];
				a[p] = temp;
				break;
			}
			
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

	    partition(a);
	    
	    for (int i = 0; i < n; i++) {
	    	System.out.print(Integer.toString(a[i]) + " ");
	    }
	    System.out.print("\n");
	    
	    in.close();
	}
	
	
}
