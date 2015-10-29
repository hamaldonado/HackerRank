package pe.maldonado.contests.codestorm2015;

import java.util.Scanner;

public class EmmasNotebook {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int i, t;
	    long k = 0; 
	    	    
	    t = in.nextInt();
	    	    
	    for (i = 1; i <= t; i ++) {
	    	k = k + (i / 2 + 1);
	    }
	        
	    
	    System.out.println(k); 
	    	    
	    in.close();

	}
}
