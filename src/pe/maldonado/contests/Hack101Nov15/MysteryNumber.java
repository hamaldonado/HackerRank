package pe.maldonado.contests.Hack101Nov15;

import java.util.Scanner;

public class MysteryNumber {

	static int findMysteryNumber(int[] A, int[] B) {
		
		int i;
		int[] countsA = new int [101];
		int[] countsB = new int [101];
		
		for (i = 0; i < A.length; i++) {
			countsA[A[i]]++;
		}
		
		for (i = 0; i < B.length; i++) {
			countsB[B[i]]++;
		}
		
		for (i = 0; i < 101; i++) {
			if (countsA[i] != countsB[i])
				return i;
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int i, n;
	    int[] A, B; 
	    	    
	    n = in.nextInt();
	    
	    A = new int[n];
	    B = new int[n+1];
	    
	    for (i = 0; i < n; i++) {
	    	A[i] = in.nextInt();
	    }
	    
	    for (i = 0; i <= n; i++) {
	    	B[i] = in.nextInt();
	    }
	    
	    System.out.println(findMysteryNumber(A, B));
	     
	    in.close();

	}

}
