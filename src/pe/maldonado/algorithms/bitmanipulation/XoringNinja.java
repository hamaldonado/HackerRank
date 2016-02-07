package pe.maldonado.algorithms.bitmanipulation;

import java.util.Scanner;

public class XoringNinja {

	/*
	 * Consider this:
	 * XOR_SUM(A,B) = A + B + A^B
	 * Any 1-bits A and B have in common would be zero-bits in A^B. 
	 * Any 1-bits they do not have in common would be 1-bits in A^B.
	 * Put another way, A^B has a 1-bit everywhere A and B are different. 
	 * Therefore each 1-bit's position is added to the sum two times; once in A or B and once again in A^B.
	 * Suppose A = 1 and B = 3. Then we have A=0001, B=0011, and x=0011. You can see that A^B = 0010. 
	 * So A + B + A^B = 0b0001 + 0b0010 + 0b0011
	 *   0001 <==   0 +   1
	 *   0011 <==   2 +   1
	 * + 0010 <==   2 +   0
	 * ======
	 *   0110 <== 2*2 + 2*1
	 *   Each bit appears in the terms exactly two times.
	 *   
	 *   If you try, you can prove this extends to 3 terms, 4 terms, and n terms, where each bit is added to the sum 2^(n-1) times.
	 */
	
	static long xorSum(long[] a) {
		
		int i;
		long r = 0;
		int n = a.length;
		long m = 1000000007L;
		
		for (i = 0; i < n; i++) {
			r |= a[i];
		}
		
		/* 
		 * We need to solve this:
		 *   r = (r * 2^N-1) % 1000000007L;
		 * 
		 * By definition: 
		 *   (a * b) % m = ((a % m) * (b % m)) % m,   where a = r, b = 2^N-1, m = 1000000007L; 
		 * 
		 * To solve 2^N-1 % m, we must use modular exponentiation since N can be large
		 * 
		 */
		r = ((r % m) * modular_pow(2, n-1, m)) % m; 
		
		
		return r;
		
	}
	
	// Taken from: https://en.wikipedia.org/wiki/Modular_exponentiation
	static long modular_pow(long base, long exponent, long modulus) {
		
		if (modulus == 1) {
			return 0; 
		}
		
		long c = 1;
		
		for (long e = 1; e <= exponent; e++) {
	        c = (c * base) % modulus;
		}
		
		return c;
			
	}
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
	    long a[];
	    int t, n;
	    
	    t = in.nextInt();
	    
	    for (int i = 0; i < t; i++) {
	    
	    	n = in.nextInt();
	    	a = new long[n];
		    
		    for (int j = 0; j < n; j++) {
		    	a[j] = in.nextLong(); 
		    }
		    
		    System.out.println(xorSum(a));
	    }
	    
	    in.close();
		
		
	}
	
}
