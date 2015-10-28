package pe.maldonado.algorithms.strings;

import java.util.Scanner;

public class FunnyString {

	static boolean isFunny(String s) {
		
		int i, j;
		char c1, c2, k1, k2;
		
		for (i = 1, j = s.length() - 1; i < s.length(); i++, j--) {
			
			c1 = s.charAt(i);
			c2 = s.charAt(i-1);
			
			k1 = s.charAt(j);
			k2 = s.charAt(j-1);
			
			if (Math.abs(c1 - c2) != Math.abs(k1 - k2)) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    int i, t;
	    String s;
	    
	    t = in.nextInt();
	    
	    for (i = 0; i < t; i++) {
	    	s = in.next();
	    	
	    	if (isFunny(s)) {
	    		System.out.println("FUNNY");
	    	}
	    	else {
	    		System.out.println("NOT FUNNY");
	    	}
	    }
	    
	    in.close();
	}
	
}
