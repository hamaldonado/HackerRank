package pe.maldonado.algorithms.sorting;

import java.util.Scanner;

public class SherlockAndWatson {

	static void rotateArray(int a[]) {
		
		int i, temp;
		
		temp = a[a.length - 1];
		
		for (i = a.length - 1; i > 0; i--) {
			a[i] = a[i-1];
		}
		
		a[0] = temp;
		
	}
	
	static int rotateArray2(int a[], int n) {
		
		int p = 0;
		
		while (n > 0) {
			if (p == 0) {
				p = a.length - 1;
			}
			else {
				p--;
			}
			
			n--;
		}
		
		// p points to the 0th element in the rotated array
		return p;
			
	}
	
	// returns the nth element in a rotated array a with the specified base (0th position)
	static int getElement(int a[], int base, int n) {
	
		int idx = 0;
		
		if ((base + n) >= a.length) {
			idx = ((base + n - a.length));
		}
		else {
			idx = base + n;
		}
			
		return a[idx];
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    int n, k, q, i;
	    int array[];
	    int base, idx;
	    
	    n = in.nextInt();
	    k = in.nextInt();
	    q = in.nextInt();
	    
	    array = new int[n];
	    
	    for (i = 0; i < n; i++) {
	    	array[i] = in.nextInt(); 
	    }
	    
	    base = rotateArray2(array, k);
	    
	    for (i = 0; i < q; i++) {
	    	idx = in.nextInt();
	    	System.out.println(getElement(array, base, idx)); 
	    }
	    
	    in.close();

	}

}
