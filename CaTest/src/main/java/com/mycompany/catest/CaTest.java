

package com.mycompany.catest;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Pedro Marcal - 2020300
 */
public class CaTest extends Thread {

	
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
    
    	List<Integer>data = file("C:\\Users\\henri\\Downloads\\data.csv");
    	
    	// Initializing Matrix Threads variables
    	int [][]firstMatrix = new int [20][10];
    	int [][]secMatrix = new int [20][10];
    	
    	
    	try (Scanner scanner = new Scanner(System.in)) {
    		
    		// Initializing MergeSort Thread
    		MergeSort mergeSortThread = new MergeSort(data);
    		MatrixResult matrixThread = new MatrixResult(firstMatrix, secMatrix);
    		
    		int num;
			
    		
			System.out.println("Type down :");
			System.out.println("1 - Standard Deviation \n" + "2 - Result of the matrizes \n" + 
			"3 - MergeSort \n" + "4 - All results in multithread \n");
			
			num = scanner.nextInt();
			
			
		  if (num == 1) {
			StandardDeviation sdThread = new StandardDeviation();
			sdThread.start();
			
		} if (num == 2) {
			matrixThread.start();
			
		} if (num == 3) {
			mergeSortThread.start();
			
		} if (num == 4) {
			StandardDeviation sdThread = new StandardDeviation();
			  sdThread.start(); 
			  mergeSortThread.start();
			  matrixThread.start();	 
			  
		} else if (num >= 5) {
			System.out.println("Wrong input!");
			
		}
   

}
    	
    	
    	// Other reading file method
    }
    public static List<Integer>file(String file) throws FileNotFoundException {
		List<Integer>data = new ArrayList<>();
		
	  try (Scanner sc = new Scanner(new File(file))) {
		 while (sc.hasNextLine()) {
			 String [] num = sc.nextLine().split(",");
			 for (String nums : num) {
				 data.add(Integer.parseInt(nums));
			 }
				 
		 }
	  }
	return data;
	
	 
}
	
}

