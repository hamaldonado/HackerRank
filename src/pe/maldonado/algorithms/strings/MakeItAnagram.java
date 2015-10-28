package pe.maldonado.algorithms.strings;

import java.util.Scanner;

public class MakeItAnagram {

	static int makeItAnagram(String s1, String s2) {
		
		int i, j, count = 0;
		int n = s1.length() >= s2.length() ? s1.length() : s2.length();
		
		boolean coincidences[] = new boolean[n];
		
		for (i = 0; i < s1.length(); i++) {
			for (j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					if (coincidences[j] != true) {
						coincidences[j] = true;
						count++;
						break;
					}
				}
			}
		}

		return s1.length() + s2.length() - 2*count;
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    String s1, s2;
	    int d;
	    
	    s1 = in.next();
	    s2 = in.next();
	    
	    d = makeItAnagram(s1, s2);
	    
	    System.out.println(d);

	    in.close();
	}

}
