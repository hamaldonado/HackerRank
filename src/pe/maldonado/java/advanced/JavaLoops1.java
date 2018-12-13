package pe.maldonado.java.advanced;

import java.util.Scanner;

public class JavaLoops1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
		int n = in.nextInt();
		int p = 0;
	    	
	    for (int i = 1; i <= 10; i++) {
	    	p = n * i;
	    	System.out.println(n + " x " + i + " = " + p);
	    }
	     
	    in.close();

	}

}
