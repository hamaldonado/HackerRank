package pe.maldonado.algorithms.implementation;

import java.util.Scanner;

public class Encryption {

	static String encrypt(String s) {
		
		int i, k;
		int n = (int)Math.floor(Math.sqrt(s.length()));   // # rows
		int m = (int)Math.ceil(Math.sqrt(s.length()));   // # columns

		if (n * m < s.length()) {
			n++;
		}
		
		StringBuilder sb = new StringBuilder("");
		
		for (i = 0; i < m; i++) {
			for (k = 0; k < n; k++) {
				if (k * m + i < s.length()) {
					sb.append(s.charAt(k * m + i));
				}
				else {
					break;
				}
			}
			sb.append(" ");
		}

		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    String s;
	    	
	    s = in.next();
	    	    
	    System.out.println(encrypt(s));
	    	    
	    in.close();
	}
	
}
