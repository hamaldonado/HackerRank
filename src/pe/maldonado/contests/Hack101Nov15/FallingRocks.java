package pe.maldonado.contests.Hack101Nov15;

import java.util.Scanner;

public class FallingRocks {

	static int findStartingPoint(int W, char[][] G) {
		
		for (int i = 0; i < W; i ++) {
			if (G[0][i] == 'Y')
				return i;
		}
		
		return -1;
	}
	
	static int findMostSecureSpot(int W, int H, char G[][], int p, int r) {
		
		int maxLeft = 0, maxCenter = 0, maxRight = 0;
		
		if (p > 0 && G[0][p-1] != 'R') {
			
			while (r + maxLeft < H && G[r + maxLeft][p-1] != 'R') {
				maxLeft++;
			}
			
		}
		
		if (p < W && G[0][p+1] != 'R') {
			
			while (r + maxRight < H && G[r + maxRight][p+1] != 'R')
				maxRight++;
			
		}
		
		while (r + maxCenter < H && G[r + maxCenter][p] != 'R')
			maxCenter++;
				
	
		if (maxCenter == 0 && maxRight == 0 && maxLeft == 0) {
			// Tamos fritos
			return W;
		}

		// El que tenga mas espacio libre hacia adelante es el mas seguro
		if (maxRight > maxCenter && maxRight > maxLeft) {
			return 1;
		}
		
		// El que tenga mas espacio libre hacia adelante es el mas seguro
		if (maxLeft > maxCenter && maxLeft >= maxRight) {
			return -1;
		}
		
		return 0;
	}
	
	static boolean isSafe(int W, int H, char G[][]) {
		
		int temp, p = findStartingPoint(W, G);   // 0 <= p < W 
		int r = 1;  // 1 <= r < H
		
		while (r < H) {
			
			temp = findMostSecureSpot(W, H, G, p, r);
						
			if (temp == W) {
				// is dead
				return false;
			}
			
			p = p +  temp;
			
			r++;
			
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
	    int i, j, W, H;
	    char[][] G;
	    	    
	    W = in.nextInt();
	    H = in.nextInt();
	    G = new char[H][W];
	    
	    for (i = 0; i < H; i++) {
	    	G[i] = in.next().toCharArray();
	    }
	    
	    /*for (i = 0; i < W; i++) {
	    	for (j = 0; j < H; j++) {
	    		System.out.print(G[i][j]);
	    	}
	    	System.out.print("\n");
	    	
	    }*/
	    
	    System.out.println(isSafe(W, H, G) ? "YES" : "NO");
	     
	    in.close();

	}

	
}
