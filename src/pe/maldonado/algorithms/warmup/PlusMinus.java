package pe.maldonado.algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {

	// Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

    	int i;
    	int p = 0, n = 0, z = 0;
    	
    	for (i = 0; i < arr.length; i++) {
    		
    		if (arr[i] > 0) { 
    			p++;
    		}
    		else if (arr[i] < 0) {
    			n++;
    		}
    		else {
    			z++;
    		}
    		
    	}
    	
    	System.out.format("%.6f%n", ((float) p / (float) i));
    	System.out.format("%.6f%n", ((float) n / (float) i));
    	System.out.format("%.6f%n", ((float) z / (float) i));
    	
    	
    	
    	
    }
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
				
    	int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
        	arr[i] = scanner.nextInt();
        }

        plusMinus(arr);

        scanner.close();

	}

	
}
