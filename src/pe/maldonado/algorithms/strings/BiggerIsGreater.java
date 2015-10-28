package pe.maldonado.algorithms.strings;

import java.util.Scanner;

public class BiggerIsGreater {

	static String getNextPermutation(String str) {
		
		char temp, s[] = str.toCharArray();
		int i, j, k, l;
		
		// 1.Find the largest index k such that a[k] < a[k + 1]. If no such index exists, 
		//   the permutation is the last permutation.
		for (k = s.length-2; k >= 0; k--) {
			if (s[k] < s[k+1]) {
				break;
			}
		}
		
		if (k < 0) {
			return "no answer";
		}
		
		// 2.Find the largest index l greater than k such that a[k] < a[l].
		for (l = s.length-1; l > k; l--) {
			if (s[k] < s[l]) {
				break;
			}
		}
		
		// 3.Swap the value of a[k] with that of a[l].
		temp = s[k];
		s[k] = s[l];
		s[l] = temp;
		
		// 4.Reverse the sequence from a[k + 1] up to and including the final element a[n].
		for (i = k + 1, j = s.length-1; i < j; i++, j--) {
			temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
		
		return String.valueOf(s);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    
	    int i, t;
	    String s;
	    
	    t = in.nextInt();
	    
	    for (i = 0; i < t; i++) {
	    	s = in.next();
	    	System.out.println(getNextPermutation(s));
	    }
	    	    
	    in.close();
	}

}
