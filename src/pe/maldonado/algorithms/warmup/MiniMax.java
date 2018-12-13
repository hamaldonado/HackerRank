package pe.maldonado.algorithms.warmup;

import java.util.Scanner;

public class MiniMax {

	// Complete the miniMaxSum function below.
    static void miniMaxSum(long [] arr) {
    	
    	long min = arr[0];
    	long max = arr[0];
    	long sum = arr[0];
    	
    	for (int i = 1; i < arr.length; i++) {
    		if (arr[i] > max) max = arr[i];
    		if (arr[i] < min) min = arr[i];
    		
    		sum += arr[i];
    	}
    	
    	System.out.println((sum - max) + " " + (sum - min));

    }
    

    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
    	long[] arr = new long[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }

}
