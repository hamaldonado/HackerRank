package pe.maldonado.algorithms.sorting;

import java.util.Scanner;

public class AlmostSorted {

	static boolean inOrder(int array[]) {

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i+1]) {
				return false;
			}
		}
		
		return true;
	}
	
	static void solve(int array[]) {
		
		//boolean ordered = true;

		// test #1: is the array already ordered? 
		if (inOrder(array)) {
			System.out.println("yes");
			return;
		}
		
		// test #2, #3: can the array be ordered with just 1 swap? by reversing a substring? 
		// 1. find i the first item that is not in order
		// 2. find min, the item to the right of i, that has the lesser value than i
		// 3. swap i & min
		// 4. check if the array is in order.
		// 5. If the array is not in order with the swap, try reversing the subarray between i+1 and min-1
		// 6. check again if the array is in order.
		int i, j, k, min = 0, temp;
		
		// 1.
		i = 0;
		while (array[i] < array[i+1]) {
			i++;
		}
		
		// 2.
		min = i;
		for (j = i + 1; j < array.length; j++) {
			if (array[j] < array[min]) {
				min = j;
			}
		}
		
		// 3. swap
		temp = array[i];
		array[i] = array[min];
		array[min] = temp;
		
		// 4.
		if (inOrder(array)) {
			System.out.println("yes");
			System.out.println("swap " + Integer.toString(i+1) + " " + Integer.toString(min+1));
			return;
		}
		
		// 5. 
		for (j = i + 1, k = min -1;  j < k; j++, k--) {
			temp = array[j];
			array[j] = array[k];
			array[k] = temp;
		}

		// 6.
		if (inOrder(array)) {
			System.out.println("yes");
			System.out.println("reverse " + Integer.toString(i+1) + " " + Integer.toString(min+1));
			return;
		}
		
		System.out.println("no");
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	    int array[];
	    int t;
	    
	    t = in.nextInt();
	    
	    array = new int[t];
	    
	    for (int i = 0; i < t; i++) {
	    	 array[i] = in.nextInt();
	    }

	    solve(array);
	    
	    in.close();
	}
	
}
