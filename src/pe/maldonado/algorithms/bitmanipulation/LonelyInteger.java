package pe.maldonado.algorithms.bitmanipulation;

import java.util.Scanner;

public class LonelyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
	    int n, a = 0;
	    
	    n = in.nextInt();
	    
	    for (int i = 0; i < n; i++) {
	    	a = a ^ in.nextInt();
	    }
	    
		System.out.println(a);
	    
	    in.close();
	    
	}

}
