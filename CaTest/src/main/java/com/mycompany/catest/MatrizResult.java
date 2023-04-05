package com.mycompany.catest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrizResult extends Thread {
		
	//Declaring first variables
		private List<Integer> data;
		int[][] firstMatrix;
		int[][] secMatrix;
		
		 public MatrizResult (List<Integer> data) {
		        this.data = data;
		    }
		 public void run( ) {
			 System.out.println(data);
		 }
		 
		// Reading the file
		 public static List<Integer>file(String file) throws FileNotFoundException {
				List<Integer>data = new ArrayList<>();
				
			  try (Scanner sc = new Scanner(new File(file))) {
				 while (sc.hasNextLine()) {
					 String [] num = sc.nextLine().split(",");
					 for (String nums : num) {
						 for (int i = 0; i < 10; i++) {
								for (int a = 0; a < 20; a++) {
									firstMatrix[i][a]= sc.nextInt();
									secMatrix[i][a] = sc.nextInt();
						 data.add(Integer.parseInt(nums));
					 }
						
							}
				 
						}
				 
			  
			return data;

		 }
		 
		 public static int[][] calculateVal (int[][] firstMatrix, int[][] secMatrix){
			 int[][] val = new int [20][10];
			 for (int i = 0; i < 20; i++) {
				 for (int a = 0; a < 10; a++) {
					 for (int b = 0; b < 20; b++) {
						 val[i][a] += firstMatrix[i][a] * secMatrix[b][a];
					 }
				 }
			 }
			 return val;
		 }

		 	
}




   