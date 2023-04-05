package com.mycompany.catest;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort extends Thread {
	
	public static void main (String[] args) throws FileNotFoundException {
		
		List<Integer>data = file("C:\\Users\\henri\\Downloads\\data.csv");
		mergeSort(data);
		System.out.println(data);
	}
			
		
		public static List<Integer> mergeSort(List<Integer>data) {
			int length = data.size();
			
			if (length <= 1) {
				return data;
			}
				
				int mid = length / 2;
				
				
				List<Integer> l = data.subList(0, mid);
				List<Integer>r = data.subList(mid, length);
				//lef
				
				return r;
				
				
				//MergeSort(left);
				//MergeSort(data, mid +1, right);
				//merge(data, left, mid, right);
				
				
			}
			
		

		
		public static void merge(List<Integer>data, int left, int right, int mid)	 {
			List<Integer> leftArray = new ArrayList<>();
			List<Integer> rightArray = new ArrayList<>();
			int sizeLeft = mid - left + 1;
			int sizeRight = right - mid;
			
			
			for (int i = 0; i < sizeLeft; i++) {
				leftArray.add(data.get(left + i));
			}
			for (int i = 0; i < sizeRight; i++) {
				rightArray.add(data.get(mid + 1 + i));
			}
			int a = 0;
			int b = 0;
			int c = left;
			
			while (a < sizeLeft && b < sizeRight) {
				if (leftArray.get(a) >= rightArray.get(b)) {
					data.set(c++, leftArray.get(a));
				} else {
					data.set(c++, rightArray.get(b));
				}
			}
			while (a < sizeLeft) {
				data.set(c++, leftArray.get(a));
			}
			while (b < sizeRight) {
				data.set(c++, rightArray.get(b));
			}
		
		}
	
		
		public static List<Integer>file(String fileName) throws FileNotFoundException {
			List<Integer>data = new ArrayList<>();
			
		  try (Scanner sc = new Scanner(new File(fileName))) {
			  
		    while (sc.hasNextLine()) {
		    String line = sc.nextLine();
		    String[] split = line.split(","); 
		    
		    for (String nums : split) {
		    	int num = Integer.parseInt(nums);
		    	data.add(num);
		    }
		   
			
		}
		  } finally {
			  
		  }
		return data;

		}
}



