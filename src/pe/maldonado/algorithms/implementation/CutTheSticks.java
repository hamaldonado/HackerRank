package pe.maldonado.algorithms.implementation;

import java.util.Scanner;

public class CutTheSticks {

	static void cutSticks(int sticks[], int size) {
		
		int i, cutCount = 0, min = 1001;
		
		for (i = 0; i < sticks.length; i++) {
			if (sticks[i] != 0) {
				sticks[i] -= size;
				cutCount++; 
				if (sticks[i] < min && sticks[i] > 0) {
					min = sticks[i];
				}
			}
		}
		
		if (cutCount > 0) {
			System.out.println(cutCount);
			cutSticks(sticks, min);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    int t, min = 1001;
	    int sticks[];
	   
	    t = in.nextInt();
	    sticks = new int[t];
	    
	    for (int i = 0; i < t; i++) {
	       	sticks[i] = in.nextInt();
	       	if (sticks[i] < min) {
	       		min = sticks[i];
	       	}
	    }

	    cutSticks(sticks, min);
	    
	    in.close();
	
	}

}
