package pe.maldonado.algorithms.strings;

import java.util.Scanner;

public class Pangrams {

	static boolean isPangram(String s) {
		
		// UPPER: 65 - 90
		// lower: 97 - 122
		// Space: 32
		
		int i, counts[] = new int [26];
		char c;
		
		for (i = 0; i < s.length(); i++) {
			
			c = s.charAt(i);
			
			if (c >= 65 && c <= 90) {
				counts[c-65]++;
			}
			else if (c >= 97 && c <= 122) {
				counts[c-97]++;
			}
		}
		
		for (i = 0; i < 26; i++) {
			if (counts[i] == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    String s = in.nextLine();
    	
	    if(isPangram(s)) {
    		System.out.println("pangram");
    	}
    	else {
    		System.out.println("not pangram");
    	}
    	    
	    in.close();
	}
}
