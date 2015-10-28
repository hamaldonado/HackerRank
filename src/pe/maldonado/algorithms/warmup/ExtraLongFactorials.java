package pe.maldonado.algorithms.warmup;

import java.util.Scanner;
import java.math.BigInteger;

public class ExtraLongFactorials {

	static BigInteger extraLongFactorial(long n) {
		
		if (n == 1) {
			return BigInteger.valueOf(1);
		}
		else {
			return BigInteger.valueOf(n).multiply(extraLongFactorial(n-1));
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    int t;
	    	   
	    t = in.nextInt();
	    
	    BigInteger factorial = extraLongFactorial(t);
	    
	    System.out.println(factorial);

	    in.close();
	}

}
