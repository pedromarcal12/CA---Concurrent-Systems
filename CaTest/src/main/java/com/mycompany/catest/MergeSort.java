package com.mycompany.catest;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort extends Thread {

	public static void main (String[] args) throws FileNotFoundException {
		
		List<Integer>data = file("C:\\Users\\henri\\Downloads\\data.csv");
		mergeSort(data,  0, data.size() - 1);
		System.out.println("The array sorted is: " + data);
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

	
		// Creating the mergeSort method 	
		public static List<Integer> mergeSort(List<Integer>data, int left, int right) {
			
			// sorting the numbers while 
			if (left < right ) {
				int mid = (right + left) / 2;
				mergeSort(data, left, mid);
				mergeSort(data, mid +1, right);
				merge(data, left, right, mid);
			}
				return data;
			
			
			}
			
		// Method that will merge the values
		public static void merge(List<Integer>data, int left, int right, int mid)	 {
			List<Integer> leftArray = new ArrayList<>(data.subList(left, mid + 1));
			List<Integer> rightArray = new ArrayList<>(data.subList(mid + 1, right +1));
			int sizeLeft = leftArray.size();
			int sizeRight = rightArray.size();
			
			// a being left Array
			int a = 0;
			// b being right array
			int b = 0;
			// c meaning currently left value
			int c = left;
			
			
			
			// While loop until we reach all the values
			while (a < sizeLeft && b < sizeRight) {
				// Comparing the current value, if bigger will be placed first
				if (leftArray.get(a) >= rightArray.get(b)) {
					data.set(c++, leftArray.get(a++));
					
				// Else, if the value is smaller, will be placed after	
				} else {
					data.set(c++, rightArray.get(b++));
				}
				
				// Adding value 
			}
			while (a < sizeLeft) {
				data.set(c++, leftArray.get(a++));
			}
			while (b < sizeRight) {
				data.set(c++, rightArray.get(b++));
			}
		
		}
	
		
}



