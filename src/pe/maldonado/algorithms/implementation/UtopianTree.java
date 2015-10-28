package pe.maldonado.algorithms.implementation;

import java.util.Scanner;

public class UtopianTree {

	static int getHeightAfterNCycles(int n) {
		
		int i, height = 1;
		
		for (i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				height = height + 1;
			}
			else {
				height = height * 2;
			}
		}
		
		return height;
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    int n;
	    
	    for (int i = 0; i < t; i++) {
	       	n = in.nextInt();
	    	System.out.println(getHeightAfterNCycles(n));   
	    }
	    
	    in.close();

	}

}
