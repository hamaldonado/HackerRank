package pe.maldonado.algorithms.strings;

import java.util.Scanner;

public class TwoStrings {

	static boolean haveCommonSubstrings(String a, String b) {
		
		boolean ca[] = new boolean[26];
		boolean cb[] = new boolean[26];
		int i;
		
		for (i = 0; i < a.length(); i++) {
			ca[a.charAt(i) - 97] = true;
		}
		
		for (i = 0; i < b.length(); i++) {
			cb[b.charAt(i) - 97] = true;
		}
		
		for (i = 0; i < 26; i++) {
			if (ca[i] && cb[i]) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int i, t;
	    String a, b;
	    
	    t = in.nextInt();
	    
	    for (i = 0; i < t; i++) {
	    	a = in.next();
	    	b = in.next();
	    	
	    	if (haveCommonSubstrings(a, b)) {
	    		System.out.println("YES");
	    	}
	    	else {
	    		System.out.println("NO");
	    	}
	    }
	    	    
	    in.close();

	}

}
