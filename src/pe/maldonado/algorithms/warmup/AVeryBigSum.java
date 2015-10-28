package pe.maldonado.algorithms.warmup;

import java.util.Scanner;

public class AVeryBigSum {

	static long aVeryBigSum(long v[]) {
		
		long r = 0;
		
		for (int i = 0; i < v.length; i++) {
			r += v[i];
		}
		
		return r;
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int t;
	    long values[], sum;
	   
	    t = in.nextInt();
	    values = new long[t];
	    
	    for (int i = 0; i < t; i++) {
	       	values[i] = in.nextLong();
	    }

	    sum = aVeryBigSum(values);
	     
	    System.out.println(sum);
	    
	    in.close();

	}

}
