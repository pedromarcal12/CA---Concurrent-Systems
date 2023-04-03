package com.mycompany.catest;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort extends Thread {
	
	int[] finalVal;
    List<Integer> data = new ArrayList<>();
	
	public MergeSort(int[]array, int left, int right, int mid ) throws FileNotFoundException  {
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
		mid = 15;
		left = 5;
		right = 50;
		int arrayOne = mid + left +1;
		int arrayTwo = right - mid;
		
		int[] leftArray = new int [arrayOne];
		int[] rightArray = new int [arrayTwo];
		
			System.out.println("Im working");
}finally{
	
}
}
}
