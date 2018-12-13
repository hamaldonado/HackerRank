package pe.maldonado.algorithms.warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {

	public static int birthdayCakeCandles(int[] arr) {
		
		int max = arr[0];
    	int count = 1;
    	
    	for (int i = 1; i < arr.length; i++) {
    		if (arr[i] > max) {
    			max = arr[i];
    			count --;
    		}
    		if (arr[i] == max) {
    			count++;
    		}

    	}
		
		return count;
		
    }
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
				
    	int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
        	arr[i] = scanner.nextInt();
        }

        System.out.println(birthdayCakeCandles(arr));

        scanner.close();

	}

}
