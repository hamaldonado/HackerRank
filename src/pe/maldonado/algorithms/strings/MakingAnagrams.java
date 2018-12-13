package pe.maldonado.algorithms.strings;

import java.util.Scanner;

public class MakingAnagrams {

	static int makeAnagram(String s1, String s2) {
		
		int i, n, res = 0;
		
		int[] counts = new int[28];
		
		
		for (i = 0; i < s1.length(); i++) {
			n = s1.charAt(i) - 97;
			counts[n]++;
		}
		
		for (i = 0; i < s2.length(); i++) {
			n = s2.charAt(i) - 97;
			counts[n]--;
		}
		
		for (i = 0; i < 28; i++) {
			
			System.out.println(i + ": " + counts[i]);
			
			if (counts[i] != 0)
				res += Math.abs(counts[i]);
		}
		
		return res;
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    String s1, s2;
	    int d;
	    
	    s1 = in.next();
	    s2 = in.next();
	    
	    d = makeAnagram(s1, s2);
	    
	    System.out.println(d);

	    in.close();
	}
}
