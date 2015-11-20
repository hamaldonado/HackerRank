package pe.maldonado.algorithms.strings;

import java.util.Scanner;

public class MorganAndAString {

	static int compareArrays(char a[], char b[], int ia, int ib) {
		
		int i, j;
		
		for (i = ia, j = ib; i < a.length && j < b.length; i++, j++) {
			if (a[i] < b[j]) {
				return -1;
			}
			else if (a[i] > b[j]) {
				return 1;
			}
		}
		
		// if we reach this point, the shorter string is the lesser
		if (i == a.length) {
			return 1;
		}

		return -1;
		
	}
	
	static String findLMS(String a, String b) {
			
		char A[] = a.toCharArray();
		char B[] = b.toCharArray();
		char C[] = new char[a.length() + b.length()];
		char minor = 'a';
		boolean lastWasEquals = false;
		
		int pa = 0, pb = 0, pc = 0;
		
		while (pc < C.length) {
			
			if (pa >= A.length) {
				C[pc] = B[pb];
				pb++;
				lastWasEquals = false;
			}
			else if (pb >= B.length) {
				C[pc] = A[pa];
				pa++;
				lastWasEquals = false;
			}
			else if (A[pa] < B[pb]) {
				C[pc] = A[pa];
				pa++;
				lastWasEquals = false;
			} 
			else if (A[pa] > B[pb]) {
				C[pc] = B[pb];
				pb++;
				lastWasEquals = false;
			}
			else { // A[pa] == B[pb]
				
				// Adding this conditional to avoid cases in which we have several repeated characters
				if (!lastWasEquals) {
					minor = compareArrays(A, B, pa, pb) < 0 ? 'a' : 'b';
				}
				
				if (minor == 'a') {
					// remove from stack 'a'
					C[pc] = A[pa];
					pa++;
				}
				else {
					// remove from stack 'b'
					C[pc] = B[pb];
					pb++;
				}
				
				lastWasEquals = true;
			}
			
			pc++; 
		}
		
		return String.valueOf(C);
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int i, t;
	    String a, b;
	    	
	    t = in.nextInt();
	    
	    for (i = 0; i < t; i++) {
	    	a = in.next();
	    	b = in.next();
	    	
	    	System.out.println(findLMS(a, b));
	    }
	    
	    in.close();
	}
	
}
