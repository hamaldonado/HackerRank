package pe.maldonado.contests.weekofcode18;

import java.util.Scanner;
import java.math.BigDecimal;

public class Target {

	static int getValue(int[] R, BigDecimal bd, int lo, int hi) {
		
		int pivot = lo + (hi - lo) / 2;  
		
		if (bd.compareTo(BigDecimal.valueOf(R[pivot])) == 0) {
			return pivot + 1;
		}
		
					
		if (bd.compareTo(BigDecimal.valueOf(R[pivot])) < 0 ) {
			
			//if (hi == lo) {
			if (pivot == hi) {
				return pivot + 1;
			}
			else {
				return getValue(R, bd, pivot + 1, hi);
			}
			
		}
		else {

			//if (hi == lo) {
			if (pivot == lo) {
				return pivot;
			}
			else {
				return getValue(R, bd, lo, pivot - 1);
			}
			
		}
		
	}
	
	static int getPoints(int[] R, int[][] P, int N) {
		
		int i, x, y, points = 0;
		BigDecimal bd;
		
		for (i = 0; i < N; i++) {
			
			x = P[i][0];
			y = P[i][1];
			
			bd = BigDecimal.valueOf(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
			
			points += getValue(R, bd, 0, R.length - 1);
		}
		
		return points;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int i, K, N;
	    int[] R;
	    int[][] P;
	    	    
	    K = in.nextInt();
	    N = in.nextInt();
	    
	    R = new int[K];
	    P = new int[N][2];
	    
	    for (i = 0; i < K; i++) {
	    	R[i] = in.nextInt();
	    }
	    
	    for (i = 0; i < N; i++) {
	    	P[i][0] = in.nextInt();
	    	P[i][1] = in.nextInt();
	    }
	    
	    System.out.println(getPoints(R, P, N));
	     
	    in.close();

	}
	
}
