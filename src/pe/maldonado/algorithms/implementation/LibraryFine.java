package pe.maldonado.algorithms.implementation;

import java.util.Scanner;

public class LibraryFine {

	static int calculateFee(int d1, int m1, int y1, int d2, int m2, int y2) {
		
		// check year
		if (y1 > y2) {
			return 10000;
		}
		else if (m1 > m2 && y1 == y2) {
			return 500 * (m1 - m2);
		}
		else if (d1 > d2 && m1 == m2 && y1 == y2) {
			return 15 * (d1 - d2);
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int d1, m1, y1;
	    int d2, m2, y2;
	    	    	
	    d1 = in.nextInt();
	    m1 = in.nextInt();
	    y1 = in.nextInt();
	    d2 = in.nextInt();
	    m2 = in.nextInt();
	    y2 = in.nextInt();
	    	    
	    System.out.println(calculateFee(d1, m1, y1, d2, m2, y2));
	    	    
	    in.close();
	}

}
