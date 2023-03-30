/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.catest;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

/**
 *
 * @author 35389
 */
public class CaTest {

    public static void main(String[] args) throws Exception {
    	
     List<Double> data = new ArrayList<>();   
     
    	
        //Scanner method for reading the file
        Scanner sc = new Scanner(new File("C:\\Users\\henri\\Downloads\\data.csv"));
        
        //Splitting value inside file using ,
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
        	System.out.println(data);
        }
        //Closing scanner
            sc.close();
            
        //Saving all info in one array in order to do methods    
            double[] finalVal = data.stream().mapToDouble(Double::doubleValue).toArray();        
    }
    
   
}
