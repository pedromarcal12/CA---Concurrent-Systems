package com.mycompany.catest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrizResult extends Thread {
		
	//Declaring first variables
		private List<Integer> data;
		int[][] firstMatrix = new int[20][10];
		 int[][] secMatrix = new int[20][10];
		
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
						 data.add(Integer.parseInt(nums));
					 }
						 
				 }
			  }
			return data;

		 }
		 
		 public Matrix ( ) {
			 
		 }

		 	
}




   