package pe.maldonado.algorithms.strings;

import java.util.Scanner;

public class CommonChild {

	private static int L[][];
	
	// Metodo tomado de: http://www.geeksforgeeks.org/dynamic-programming-set-4-longest-common-subsequence/
	static int sizeOfLCS(char[] a, char[] b) {
		
		int m = a.length;
		int n = b.length;
		int i, j, p, q;
		
		L = new int[m+1][n+1];

		// Following steps build L[m+1][n+1] in bottom up fashion. Note 
		// that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
		for (i=0; i<=m; i++) {
			
			for (j=0; j<=n; j++) {
		       
				if (i == 0 || j == 0) {
					L[i][j] = 0;
				}
				
				else if (a[i-1] == b[j-1]) {
					L[i][j] = L[i-1][j-1] + 1;
				}
				
				else {
					p = L[i-1][j];
					q = L[i][j-1];
					L[i][j] = p > q ? p : q;
				}

			}
		
		}

		/* L[m][n] contains length of LCS for X[0..n-1] and Y[0..m-1] */
		return L[m][n];

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    String a, b;
	    
	    a = in.nextLine();
	    b = in.nextLine();
	    
	    System.out.println(sizeOfLCS(a.toCharArray() ,b.toCharArray()));
	    
	    in.close();
		
	}

}
