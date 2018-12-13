package pe.maldonado.algorithms.strings;

import java.io.IOException;
import java.util.Scanner;

public class CamelCase {

	// Complete the camelcase function below.
    static int camelCase(String s) {

    	int count = 1;
    	
    	for (int i = 0; i < s.length(); i++) {
        	        	
        	if (s.charAt(i) < 95) 
        		count++;

    	}
    	
    	return count;
    }

    public static void main(String[] args) throws IOException {
    	
    	Scanner in = new Scanner(System.in);
	    
    	String s = in.nextLine();
	    	
	    System.out.println(camelCase(s));
	    	    	    
	    in.close();
    }

}
