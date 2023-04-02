package com.mycompany.catest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Functions extends Thread {

	double StandardDeviation;
	int[]finalVal ;
	List<Integer> data = new ArrayList<>();
	double mean ;
	int length;
	 
	
	public Functions ( ) throws FileNotFoundException {
    //Scanner method for reading the file
    Scanner sc = new Scanner(new File("C:\\Users\\henri\\Downloads\\data.csv"));
    
    //Splitting value inside file using 
    sc.useDelimiter(",");
    try {
    //While loop to read file until last line
    while (sc.hasNextLine())  {
    //Saving data into an array
    	String value = sc.nextLine();
    	
    
    //Split values into ,	
    	String[] splitNum = value.split(",");
    	
    //for loop to add value into array	
    for(String number : splitNum) {
    data.add(Integer.parseInt(number));
    
    	}
    
	}
   //Saving the data and converting the list into array
    int[] finalVal = data.stream().mapToInt(Integer::intValue).toArray();
    
  //Creating variable to calculate standard deviation
    int length = data.size();
    
  //Creating first method to find the mean number; 
   int mean = finalVal[5] % length;
   
   System.out.println(Arrays.toString(finalVal));
   System.out.println(mean);
 
   //Closing Scanner
   
    sc.close(); 
	}finally {
		
	}
}
}
    
          

 
	