package pe.maldonado.algorithms.strings;

import java.util.Scanner;
import java.util.ArrayList;

public class SherlockAndAnagrams {

	static boolean isAnagram(String s1, String s2) {
		
		if (s1.length() != s2.length()) {
			return false;
		}
		
		int counts[] = new int[26];
		int i, c1, c2;
		
		for (i = 0; i < s1.length(); i++) {
			c1 = (int)s1.charAt(i) - 97;
			counts[c1]++;
			
			c2 = (int)s2.charAt(i) - 97;
			counts[c2]--;
		}
		
		for (i = 0; i < 25; i++) {
			if (counts[i] != 0)
				return false;
		}
		
		return true;
	}
		
	static int countAnagramicPairs(String s) {
		
		int i, j;
		int count = 0;
		ArrayList <String> subs = new ArrayList<>();
		
		for(i = 0 ; i < s.length() ; i++ ) {
			for( j = 1 ; j <= s.length() - i ; j++ ) {
				subs.add(s.substring(i, i + j));
			}
		}
				
		for(i = 0 ; i < subs.size(); i++ ) {
			for( j = i + 1 ; j < subs.size(); j++ ) {
				if (isAnagram(subs.get(i), subs.get(j))) {
					count ++;
				} 
			}
		}
	        	 
		return count;
	}
	
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	    String s1;
	    int t;
	    
	    t = in.nextInt();
	    
	    for (int i = 0; i < t; i++) {
	    	s1 = in.next();
	    	System.out.println(countAnagramicPairs(s1));
	    }
	    
	    in.close();
	    
	}

}
