package pe.maldonado.algorithms.strings;

import java.util.Scanner;

public class PalindromeIndex {

	static boolean isPalindrome(String s, int i, int j) {
	
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++; 
			j--;
		}
		
		return true;
			
	}
	
	static int palindromeIndex(String s) {
		
		int i, j;
		
		for (i = 0, j = s.length()-1; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				// test if difference is on i
				if (isPalindrome(s, i+1, j)) {
					return i;
				}
				else {
					return j;
				}
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    String s1;
	    int t, i;
	    
	    t = in.nextInt();
	    
	    for (i = 0; i < t; i++) {
	    	s1 = in.next();
	    	System.out.println(palindromeIndex(s1));
	    }
	    
	    in.close();

	}

}
