package com.mycompany.catest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Scanner;

public class StandardDeviation extends Thread {

	//Declaring variables
    double standardDeviation;
    int[] finalVal;
    List<Integer> data = new ArrayList<>();
    int length;
    double sum;
    int i;
    String val ;
    
    public StandardDeviation() throws FileNotFoundException {

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
            
            
            // Saving the data and converting the list into integer array;
            finalVal = data.stream().mapToInt(Integer::intValue).toArray();

            // Creating variable to get the size of the array;
            length = data.size();
            
            // Creating method to find the mean number;
            DoubleSummaryStatistics stats = data.stream()
                    .mapToDouble(Integer::doubleValue)
                    .summaryStatistics();
            double mean = stats.getAverage();
            
            // Method to calculate the standard deviation;
            double sum = data.stream()
                    .mapToDouble(x -> Math.pow(x - mean, 2))
                    .sum();
            standardDeviation = Math.sqrt(sum / length);
        
            // Converting value to String with only 4 values after ,
            String val = String.format("%.4f", standardDeviation);
            
            // Printing results;
            System.out.println("Standard Deviation: "+val);

            // Closing Scanner
            sc.close();

        } finally {
        }
        
        }
    }
    
