package pe.maldonado.algorithms.warmup;

import java.util.Scanner;

public class SolveMeSecond {

	static int solveMeSecond(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int t, a, b, sum;
	     
	    t = in.nextInt();
	     
	    while (t > 0) {
	       	a = in.nextInt();
		    b = in.nextInt();
		    
		    sum = solveMeSecond(a,b);
		     
		    System.out.println(sum);
	        t--;
	    }
	    
	    in.close();
	}
}
	