package pe.maldonado.datastructures.arrays;

import java.util.Scanner;

public class Array2d {

	// Get sum of elements of hourglass at row, column
	static int getHourGlassAt(int[][] a, int r, int c) {
		
		return a[r][c] + a[r][c+1] + a[r][c+2] +
			   a[r+1][c+1] +
			   a[r+2][c] + a[r+2][c+1] + a[r+2][c+2];
	}

	static int getLargestSum(int[][] a) {
	
		int i, j, t, max = -64;
				
		for (i = 0; i <= a.length - 3; i++) {
			for (j = 0; j <= a[0].length - 3; j++) {
				
				t = getHourGlassAt(a, i, j);
				if (t > max ) {
					max = t;
				}
			}
		}
		
		return max;

	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
		int i, j;
	    int[][] a = new int[6][6];
	    
	    for (i = 0; i < 6; i++) {
	    	for (j = 0; j < 6; j++) {
	    		a[i][j] = in.nextInt();
	    	}
	    }
	    
	    System.out.println(getLargestSum(a));
	     
	    in.close();

	}
	
	
}
