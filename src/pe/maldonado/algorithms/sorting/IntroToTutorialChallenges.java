package pe.maldonado.algorithms.sorting;

import java.util.Scanner;

public class IntroToTutorialChallenges {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	    int[] a;
	    int V, n, r = -1;
	    
	    V = in.nextInt();
	    n = in.nextInt();
	    a = new int[n];
	    
	    for (int i = 0; i < n; i++) {
	    	 a[i] = in.nextInt();
	    	 if (a[i] == V) {
	    		 r = i;
	    	 }
	    }
	    
	    System.out.println(r);
	    
	    in.close();
	}
	
}
