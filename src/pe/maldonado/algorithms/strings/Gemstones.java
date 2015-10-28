package pe.maldonado.algorithms.strings;

import java.util.Scanner;

public class Gemstones {

	static int dict[] = new int[26];
	
	static void feedDictionary(String s, int n) {
		
		int i;
		char c;
		char unique[] = new char[26];
		
		for (i = 0; i < s.length(); i++) {
			
			c = s.charAt(i);
			
			if (unique[c - 97] == 0) {
				unique[c - 97] = 1;
				dict[c - 97]++;
			}
		}
		
	}
	
	static int countGems(int n) {
		
		int i, gems = 0;
		
		for (i = 0; i < 26; i++) {
			
			if (dict[i] == n) {
				gems++;
			}
		}
		
		return gems;
	}
		
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    int i, t;
	    String s;
	    	    
	    t = in.nextInt();
	    
	    for (i = 0; i < t; i++) {
	    	s = in.next();
	    	feedDictionary (s, i+1);
	    }
	    
	    System.out.println(countGems(t));
	    
	    in.close();
	}
	
	
}
