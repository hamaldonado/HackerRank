package pe.maldonado.algorithms.bitmanipulation;

import java.util.Scanner;

public class XoringNinja {

	static int xorSet(int[] a, int start, int count) {
		
		int r = 0, i;
		
		if (start + count > a.length) {
			return 0;
		}
		
		for (i = start; i < start + count; i++) {
			//System.out.print(a[i] + " ");
			r ^= a[i]; 
		}
		
		//System.out.print("\n");
		return r;
		
	}
	
	static int xorSum(int[] a) {
		
		int i, j;
		int r = 0;
		
		// Single sum
		for (i = 0; i < a.length; i++) {
			r += a[i];
		}
		
		// Sets sum
		for (j = 2; j <= a.length; j++) {
			for (i = 0; i < a.length; i++) {
				r += xorSet(a, i, j);
			}
		}
		
		return r;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
	    int[] a;
	    int n;
	    
	    n = in.nextInt();
	    a = new int[n];
	    
	    for (int i = 0; i < n; i++) {
	    	a[i] = in.nextInt(); 
	    }
	    
    	System.out.println(xorSum(a));
	    
	    in.close();
		
		
	}
	
}
