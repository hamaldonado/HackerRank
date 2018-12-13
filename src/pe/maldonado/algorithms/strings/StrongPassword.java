package pe.maldonado.algorithms.strings;

import java.util.Scanner;

public class StrongPassword {

	
	public static int strongPassword(int n, String s) {
		
		int i = 0;
		int r = 0;
		char c;
		int conditions[] = {0,0,0,0};
		int conditionsMet = 0;
		
		for (i = 0; i < s.length(); i++) {
		
			c = s.charAt(i);
			
			// digit?
			if (c > 47 && c < 58)
				conditions[0] = 1;
			
			// upper case?
			else if (c > 64 && c < 91)
				conditions[1] = 1;
			
			// lower case?
			else if (c > 96 && c < 123)
				conditions[2] = 1;	
			
			// special char?
			else if (c == 33 || (c >= 35 && c <= 38) || c == 65 || c == 94 || (c >= 40 && c <= 43) || c == 45)
				conditions[3] = 1;
			
		}
		
		for (i = 0; i <= 3; i++) {
			conditionsMet += conditions[i];
		}
			
		r = ((6 - n) > (4 - conditionsMet)) ? 6 - n : 4 - conditionsMet; 
		
		return r;
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	    
		int n = in.nextInt();
    	String s = in.next();
	    	
	    System.out.println(strongPassword(n, s));
	    	    	    
	    in.close();
		
	}

}
