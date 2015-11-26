package pe.maldonado.contests.weekofcode18;

import java.util.Scanner;

public class Ghosts {

	static int gcd(int a, int b) {
		
		int hi = (a > b) ? a : b;
		int lo = (a < b) ? a : b;
		int m;
		
		m = hi % lo;
		
		if ( m == 0 ) {
			return lo;
		}
		else {
			return gcd(hi, m);
		}
		
	}
	
	static int findGhosts(int A, int B, int C, int D) {
		
		int a, b, c, d;
		int count = 0;
		
		for (a = 1; a <= A; a++) {
			
			for (b = 1; b <= B; b++) {
				
				for (c = 1; c <= C; c++) {
					
					for (d = 1; d <= D; d++) {
					
						if ((a - b) % 3 == 0 && 
								(a * c) % 4 == 0 && 
								(b + c) % 5 == 0 && 
								gcd(a, d) == 1) {
							
							//System.out.println(Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c) + " " + Integer.toString(d));
							count++;
						}
					}
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int A, B, C, D;
	    	    
	    A = in.nextInt();
	    B = in.nextInt();
	    C = in.nextInt();
	    D = in.nextInt();
	    
	    System.out.println(findGhosts(A, B, C, D));
	     
	    in.close();
	}
	
}
