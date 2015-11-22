package pe.maldonado.algorithms.implementation;

import java.util.Scanner;

public class CaesarCipher {

	static String cipher(String s, int k) {
		int i;
		char c, S[] = s.toCharArray();
		
		for (i = 0; i < S.length; i++) {
			
			c = S[i];
			k = k % 26;
			
			if (c > 64 && c < 91) {  // A-Z
				if (c + k > 90) {
					c = (char)(65 + (c + k) - 91);
				} 
				else {
					c = (char)(c + k);
				}
			}
			else if (c > 96 && c < 123) {  // a-z
				if (c + k > 122) {
					c = (char)(97 + (c + k) - 123);
				} 
				else {
					c = (char)(c + k);
				}
			}
			
			S[i] = c;
		}
		
		return String.valueOf(S);
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int n, k;
	    String s;
	    	
	    n = in.nextInt();
	    s = in.next();
	    k = in.nextInt();
	    	    
	    System.out.println(cipher(s, k));
	    	    
	    in.close();
	}
	
}
