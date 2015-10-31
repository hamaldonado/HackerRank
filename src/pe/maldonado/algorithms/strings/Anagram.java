package pe.maldonado.algorithms.strings;

import java.util.Scanner;

public class Anagram {

	static int changesToFormAnagram(String s) {
		
		String s1, s2;
		int counts1[] = new int[26];
		int counts2[] = new int[26];
		int i, changes = 0;
		char c;
		
		if (s.length() % 2 != 0) {
			return -1;
		}
		
		s1 = s.substring(0, s.length() / 2);
		s2 = s.substring(s.length() / 2);
		
		for (i = 0; i < s1.length(); i++) {
			c = s1.charAt(i);
			counts1[c - 97]++;  
		}
		
		for (i = 0; i < s2.length(); i++) {
			c = s2.charAt(i);
			counts2[c - 97]++;  
		}
		
		for (i = 0; i < 26; i++) {
			if (counts2[i] > counts1[i]) {
				changes += counts2[i] - counts1[i];
			}
		}
		
		return changes;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int i, t;
	    String s; 
	    	    
	    t = in.nextInt();
	    
	    for (i = 0; i < t; i ++) {
	    	s = in.next();
	    	
	    	System.out.println(changesToFormAnagram(s));
	    	
	    }
	    	    
	    in.close();

	}
}
