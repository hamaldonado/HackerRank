package pe.maldonado.algorithms.warmup;

import java.util.Scanner;

public class Staircase {

	// Complete the staircase function below.
    static void staircase(int n) {

        
    	for (int i = 1; i <= n; i++) {
    	
    		for (int j = 1; j <= n - i ; j++) {
        		System.out.print(" ");
        	}
        	
    		for (int k = 1; k <= i ; k++) {
        		System.out.print("#");
        	}
    		
        	System.out.println("");
    		
    	}
    	
    	

    }

    public static void main(String[] args) {
    
    	Scanner scanner = new Scanner(System.in);
    	
    	int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }

}
