package pe.maldonado.algorithms.bitmanipulation;


import java.util.Scanner;

public class FlippingBits {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    long n,r;
	    
	    for (int i = 0; i < t; i++) {
	       	n = in.nextLong();
	    	r = n ^ 0xffffffffL;
	    	System.out.println(String.format("%d",r));
	    }
	    
	    in.close();
				
	}

}
