package pe.maldonado.algorithms.strings;

import java.util.Scanner;

public class AlternandoCaracteres {

	static int removeConsecutives(String s) {
	
		int i, removals = 0;
		char curChar, nextChar;
		
		curChar = s.charAt(0);
		
		for (i = 1; i < s.length(); i++) {
			nextChar = s.charAt(i);
			if (nextChar == curChar) {
				removals++;
			}
			else {
				curChar = nextChar;
			}
		}
		
		return removals;
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    int i, t;
	    String s;
	    
	    t = in.nextInt();
	    
	    for (i = 0; i < t; i++) {
	    	s = in.next();
	    	System.out.println(removeConsecutives(s));
	    }
	    
	    in.close();
	}

}
