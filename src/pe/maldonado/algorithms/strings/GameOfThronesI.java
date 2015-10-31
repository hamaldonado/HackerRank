package pe.maldonado.algorithms.strings;

import java.util.Scanner;

public class GameOfThronesI {

	static boolean canFormPalindrome(String s) {
		
		// Palindrome of an anagram:
		// if length of the word is even, the count for every letter should be even too
		// if length of the word is odd, the count for every letter should be even except 
		// one. Only one can be odd.
		
		int i, odds = 0, counts[] = new int[26];
		char c;
		
		for (i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			counts[c - 97]++;
		}
		
		for (i = 0; i < 26; i++) {
			if (counts[i] % 2 != 0) {
				// If there is an odd count but the string is even, not a palindorme
				if (s.length() % 2 == 0) {
					return false;
				}
				// If it is a odd string only 1 odd count is permitted
				else if (odds == 1) {
					return false;	
				}
				odds++;
			}
		}
				
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    String s = in.nextLine();
    	
	    if(canFormPalindrome(s)) {
    		System.out.println("YES");
    	}
    	else {
    		System.out.println("NO");
    	}
    	    
	    in.close();
	}
	
}
