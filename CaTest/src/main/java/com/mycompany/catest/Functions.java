package com.mycompany.catest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Functions extends Thread {
	
	double StandardDeviation;
	List<Double> data = new ArrayList<>();   
	double[] finalVal = data.stream().mapToDouble(Double::doubleValue).toArray(); 
	double mean = Arrays.stream(finalVal).average().orElse(Double.NaN);
	
	public Functions ( ) throws FileNotFoundException {
    //Scanner method for reading the file
    Scanner sc = new Scanner(new File("C:\\Users\\henri\\Downloads\\data.csv"));
    
    //Splitting value inside file using 
    sc.useDelimiter(",");
    
    //While loop to read file until last line
    while (sc.hasNextLine())  {
    //Saving data into an array
    	String value = sc.nextLine();
    	
    //Split values into ,	
    	String [] splitNum = value.split(",");
    	
    //for loop to add value into array	
    for(String number : splitNum) {
    data.add(Double.valueOf(number));	
    
    }
   
    }
    System.out.println(data);
    System.out.println(mean);
	
    
    //Closing scanner
    sc.close(); 
	}
	
}
    
          

 
	