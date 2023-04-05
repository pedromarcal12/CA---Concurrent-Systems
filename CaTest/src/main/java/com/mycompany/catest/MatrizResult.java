package com.mycompany.catest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrizResult extends Thread {

	public MatrizResult () {
		System.out.println("Im Working too");	
	}
	


int[] arrayOne, arrayTwo;
int[] finalVal ;
static int sizeArray ;
int length;
   
public static void mergeSort(int[]finalVal) throws NumberFormatException, FileNotFoundException {
	
	
	List<Integer> num = new ArrayList<>();

	 // Scanner method for reading the file
    Scanner sc = new Scanner(new File("C:\\Users\\henri\\Downloads\\data.csv"));

    // Splitting value inside file using
    sc.useDelimiter(",");
    	
        // While loop to read file until last line
        while (sc.hasNextLine()) {
        	
        	
            // Saving data into a String
            String value = sc.nextLine();

            // Split values into , and storing in an Array;
            String[] splitNum = value.split(",");

            // For loop to add value into array
            for (String number : splitNum) {
                num.add(Integer.parseInt(number));
                finalVal = new int [num.size()];  
                for (int i = 0; i< num.size(); i++) {
                	finalVal[i] = num.get(i);
                }
            }
            
            arraySorted(finalVal);
            

         // Variables to get size of the array and the mid of the array    
    		int length = num.size();
    		int mid = length / 2;       
            
	 
    
	
	// Creating first array with the mid size
	int[]arrayOne = new int [mid];
	
	// Creating second array with the length minus o mid size, giving us the other half
	int []arrayTwo = new int[sizeArray - mid];
	
	// Converting values into int array
	
	// For loop to store value in the left size array
	for (int i = 0; i < mid; i++) {
		arrayOne[i] = finalVal[i];
	}
	
	// For loop to store value in the other half of the array
	for (int i = mid; i < sizeArray; i++) {
		arrayTwo[i - mid] = finalVal[i];
	}
	
	mergeSort(arrayOne);
	mergeSort(arrayTwo);
	merge(finalVal, arrayOne, arrayTwo);
        }	
              
}

 
	
private static void merge(int []arrayOne, int []arrayTwo, int[]finalVal) {
	int leftSize = arrayOne.length;	
	int rightSize = arrayTwo.length;
	
	// Variable for the first array
	int a = 0;
	// Variable for the second array;
	int b = 0;
	// Variable for the sorted array;
	int c = 0;
	 
	// While loop to check the biggest value;
	while (a < leftSize && b < rightSize) {
		if (arrayOne[a] <= arrayTwo[b]) {
		finalVal[c] = arrayOne[a];
		a++;
		}else {
			finalVal[c] = arrayTwo[b];
		b++;	
		}
		c++;
		}
	while (a < leftSize) {
		finalVal[c] = arrayOne[a];
		a++;
		c++;
	}
	while (b < rightSize) {
		finalVal[c] = arrayTwo[b];
		b++;
		c++;
	}
}

		
		
	
private static void arraySorted(int[]finalVal) {
for (int c = 0;c < finalVal.length; c++) {
	System.out.println(finalVal.toString());
}
}
}