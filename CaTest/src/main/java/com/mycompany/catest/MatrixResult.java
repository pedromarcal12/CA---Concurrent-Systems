package com.mycompany.catest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixResult extends Thread {
		
	//Declaring first variables
		private static int[][] firstMatrix;
		private static int[][] secMatrix;
		private static int[][] result;
		 
public MatrixResult (int[][] firstMatrix, int[][] secMatrix ) {
         MatrixResult.firstMatrix = firstMatrix;
         MatrixResult.secMatrix = secMatrix;
         MatrixResult.result = new int[firstMatrix.length][secMatrix[0].length];
}

public void run() {
	try {
		// Reading file and saving in matrix format
			
        Scanner sc = new Scanner(new File ("C:\\\\Users\\\\henri\\\\Downloads\\\\data.csv"));
        
        // Splitting value inside file using ,
        sc.useDelimiter(",\\n]");
        
        // Reading every line and add it to the matrix
        for (int i = 0; i < firstMatrix.length; i++) {
        	String[] line = sc.nextLine().split(","); 
        	for (int j = 0; j < secMatrix[0].length; j++) {
        		firstMatrix[i][j] = Integer.parseInt(line[j]);
        	}
        	
        	
        }
        // Closing scanner
        sc.close();
        
        for (int i = 0; i < firstMatrix.length; i++) {
        	for (int j = 0; j < secMatrix[0].length; j++) {
        		for (int k = 0; k < firstMatrix[0].length; k++) {
        		result[i][j] += firstMatrix[i][k] * secMatrix[k][j]; 
        	}
        }
	
	
	}	
        
        // Printing results
        System.out.println("Result: ");
        for (int i = 0; i < result.length; i++) {
        	for (int j = 0; j < result[0].length; j++) {
        		System.out.print(result[i][j] + " ");
        	
        	}
        	System.out.println();
        }
		
}	  catch (FileNotFoundException e ) {
	System.out.println("!!");
}
			
}
}




   