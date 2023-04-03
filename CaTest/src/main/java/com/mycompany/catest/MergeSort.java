package com.mycompany.catest;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort extends Thread {
	
	int[] finalVal;
    List<Integer> data = new ArrayList<>();
	int length ;
    
	public MergeSort(int[]arrayOne, int[]arrayTwo, int left, int right, int mid ) throws FileNotFoundException  {
		 // Scanner method for reading the file
	    Scanner sc = new Scanner(new File("C:\\Users\\henri\\Downloads\\data.csv"));

	    // Splitting value inside file using
	    sc.useDelimiter(",");
	    try {
	    	
	        // While loop to read file until last line
	        while (sc.hasNextLine()) {
	        	
	        	
	            // Saving data into a String
	            String value = sc.nextLine();

	            // Split values into , and storing in an Array;
	            String[] splitNum = value.split(",");

	            // For loop to add value into array
	            for (String num : splitNum) {
	                data.add(Integer.parseInt(num));
	            }

	        }
	        
	    // Variables to get size of the array and the mid of the array    
		length = data.size();
		mid = length / 2;
		
		// Creating first array with the mid size
		arrayOne = new int [mid];
		
		// Creating second array with the length minus o mid size, giving us the other half
		arrayTwo = new int [length - mid];
		
		// For loop to store value in the left size array
		for (int i = 0; i < mid; i++) {
			arrayOne[i] = data.get(i);
			
		}
		
		// For loop to store value in the other half of the array
		for (int i = mid; i < length; i++) {
			arrayTwo[i - mid] = data.get(i);
		}
		     
		//MergeSort(arrayOne);
		//MergeSort(arrayTwo);
		
		System.out.println(arrayOne.length);
		System.out.println("Im working");
}finally{
	
}
}
}
