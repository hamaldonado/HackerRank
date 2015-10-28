package pe.maldonado.algorithms.dynamicprogramming;

import java.util.Scanner;
import java.math.BigInteger;

public class FibonacciModified {
	
	static String getModifiedFibonacci(int a, int b, int n) {
		
		int i;
		BigInteger ba, bb, bc;
		
		ba = BigInteger.valueOf(a);
		bb = BigInteger.valueOf(b);
		bc = BigInteger.valueOf(0);
		
		
		//Tn+2 = (Tn+1)^2 + Tn
		
		for (i = 2; i < n; i++) {
			bc = bb.pow(2).add(ba);
			ba = bb;
			bb = bc;
		}
				
		return bc.toString();
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    
	    int a, b, n;
	    
	    a = in.nextInt();
	    b = in.nextInt();
	    n = in.nextInt();
	    
	    System.out.println(getModifiedFibonacci(a, b, n));
	    
	    in.close();
	}
}
