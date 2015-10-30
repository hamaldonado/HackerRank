package pe.maldonado.contests.codestorm2015;

// asumming a is sorted in increasing order

// 2 3 9 10 12 15

// c = 15  
// b = 12
// a = 10

// c = 15
// b = 12
// a = 9

// c = 15
// b = 12   => Not a Triangle, move b to 10, and reset a (move it just before b: 9)
// a = 3

// c = 15
// b = 10
// a = 9

// c = 15
// b = 10  => Not a Triangle, move b to 9 and reset a (move it just before b: 3)
// a = 3
		
// c = 15
// b = 9   => Not a Triangle, move c to 12 and reset b and a (move it just before c: b=10, a=9)
// a = 3

// c = 12
// b = 10  
// a = 9

// c = 12
// b = 10  
// a = 3

// c = 12
// b = 10  => Not a Triangle, move b to 9 and reset a (move it just before b: 3)
// a = 2

// c = 12
// b = 9   => Not a Triangle, move c to 10 and reset b and a (move it just before c: b=9, a=3)
// a = 3

// c = 10
// b = 9  
// a = 3

// c = 10
// b = 9   => Not more values for the 'a' pointer.  Move b to 3 and reset a (move it just before b: 3) 
// a = 2

// c = 10
// b = 3   => Not a Triangle, move c to 9 and reset b and a (move it just before c: b=3, a=2)
// a = 2

// c = 9
// b = 3   => Not a Triangle, no more spaces to fit a, b and c.  Finish.
// a = 2


import java.util.Scanner;

public class CountingTriangles {
	
	static int right = 0, obtuse = 0, acute = 0;

	static boolean isTriangle(int a, int b, int c) {
		
		int a2, b2, c2, dif;		
				
		if (a + b > c && b + c > a && a + c > b) {
		
			c2 = c * c;
			b2 = b * b;
			a2 = a * a;
			dif = c2 - (a2 + b2);		
			
			// It is a triangle.  Lets check the type. Lets assume that c is the biggest side
			if (dif == 0) {
				// Right Triangle
				right++;
			}
			else if (dif > 0) { 
				// Obtuse Triangle
				obtuse++;
			}
			else { 
				// Acute Triangle
				acute++;
			}
			
			return true;
		}
				
		// Not a triangle
		return false;
	}
	
	static void solve(int s[]) {
		
		int a, b, c;
		int changes = 0;
		
		c = s.length - 1;
		b = c - 1;
		a = b - 1;

		while (true) {
			
			System.out.println(Integer.toString(a) + " " + 
					Integer.toString(b) + " " +
					Integer.toString(c) + " " + Integer.toString(changes));
			
			if (isTriangle(s[a], s[b], s[c])) {
				if (a > 0) {
					a--;
				}
				else if (b > 1) { 
					b--;
					a = b - 1;
				}
				else if (c > 2) { 
					c--;
					b = c - 1;
					a = b - 1;
				}
				else {
					// No more spaces to fit a, b and c.  Finish.
					break;
				}
				changes++;
			}
			else {
				
				if (changes == 0) {
					c--;
					b = c - 1;
					a = b - 1;
				} 
				else if (b > 1) { 
					b--;
					a = b - 1;
				}
				
				changes = 0;

			}

			if (c < 2) {
				// No more spaces to fit a, b and c.  Finish.
				break;
			}
			
		}
		
		System.out.println(Integer.toString(acute) + " " + 
						Integer.toString(right) + " " +
						Integer.toString(obtuse));
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int i, t;
	    int a[]; 
	    	    
	    t = in.nextInt();
	    a = new int[t];
	    
	    for (i = 0; i < t; i ++) {
	    	a[i] = in.nextInt();
	    }
	    
	    solve(a);
	    	    
	    in.close();

	}
}
