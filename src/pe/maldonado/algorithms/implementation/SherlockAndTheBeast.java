package pe.maldonado.algorithms.implementation;

import java.util.Scanner;

public class SherlockAndTheBeast {

	static String getLargestDecentNumber(int n) {
		
		// Decent Number Properties:
		// a. 3, 5, or both as its digits. No other digit is allowed.
		// b. Number of times 3 appears is divisible by 5.
		// c. Number of times 5 appears is divisible by 3.
		//   =>  n = n5 + n3 where n3 % 5 = 0, n5 % 3 = 0;
		if (n < 3)
			return "-1";
		
		int i, n3, n5;
		StringBuilder r = new StringBuilder("");
		
		// Find the largest multiple of three that is less or equal to n and assign that to n5, so we know that n5 is divisible by 3.  
		// n3 would be the complement to n (at this point we dont know if n3 is divisible by 5
		// Check if n3 is divisible by five, if not, reduce n5 by 3 (so it is still divible bby 3) and augment n3 by 3.  Repeat until n3 is 
		// divisible by 3 or n3 equals n.
		n5 = n - (n % 3);
		n3 = n - n5;
		
		while (n3 % 5 != 0 && n3 < n) {
			n5 -= 3;
			n3 += 3; 
		}
		
		if (n5 % 3 != 0 || n3 % 5 != 0) {
			return "-1";
		}
		
		for (i = 0; i < n5; i++) {
			r.append(5);
		}
		
		for (i = 0; i < n3; i++) {
			r.append(3);
		}
		
		return r.toString();
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    int n;
	    
	    for (int i = 0; i < t; i++) {
	       	n = in.nextInt();
	    	System.out.println(getLargestDecentNumber(n));   
	    }
	    
	    in.close();

	}
	
}
