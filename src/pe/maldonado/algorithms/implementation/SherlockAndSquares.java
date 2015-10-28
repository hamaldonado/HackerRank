package pe.maldonado.algorithms.implementation;

import java.util.Scanner;

public class SherlockAndSquares {

	static int countSquareIntegers(int a, int b) {

		//1,4,9,16,25,36,49,64,81.. (squares)
		//3,5,7,9 ,11,13,15,17,19.. (increments)

		// Next square int = current square int + SQRT(n)*2 + 1
		// if n = 16, next square int => SQRT(16)*2 + 1 = 4*2 + 1 = 9 => 16 + 9 = 25
		// if n = 49, prox square int => SQRT(49)*2 + 1 = 7*2 + 1 = 15 => 49 + 15 = 64
		
		int i, count = 0;
	
		// find first square int
		for (i = a; i <= b; i++) {
			if (Math.sqrt(i) % 1 == 0) {
				break;
			}
		}
		
		// find the rest of square ints based on the formula above
		while (i <= b) {
			count++;
			i += Math.sqrt(i)*2 + 1; 
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
	    int a,b,t;
	    
	    t = in.nextInt();
	    
	    for (int i = 0; i < t; i++) {
	    	a = in.nextInt();
	    	b = in.nextInt();
	    	System.out.println(countSquareIntegers(a,b));
	    }
	    
	    in.close();
		
		
	}

}
