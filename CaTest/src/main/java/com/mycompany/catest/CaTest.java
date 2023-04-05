

package com.mycompany.catest;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Pedro Marcal - 2020300
 */
public class CaTest extends Thread {

	
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
    
    	
    	
    	try (Scanner scanner = new Scanner(System.in)) {
    		
    		List<Integer>data = MergeSort.file("C:\\Users\\henri\\Downloads\\data.csv");
    		int num;
			
    		
			System.out.println("Type down :");
			System.out.println("1 - Standard Deviation \n" + "2 - Result of the matrizes \n" + 
			"3 - MergeSort \n" + "4 - All results in multithread \n" + "5 - All results in multithread with sleep thread implementation\n ");
			
			num = scanner.nextInt();
			MergeSort mergeSortThread = new MergeSort(data);
			StandardDeviation sdThread = new StandardDeviation();
			
		  if (num == 1) {
			sdThread.start();
			
		} if (num == 2) {
			MatrizResult thread2 = new MatrizResult();
			System.out.println(thread2);
			
		} if (num == 3) {
			mergeSortThread.start();
			
		} if (num == 4) {
			  sdThread.start();	
			  System.out.println(sdThread);
			  mergeSortThread.start();
			  
			  new MatrizResult();
			  
		} if (num == 5) {
			  sdThread.start();	
			  mergeSortThread.start();
			  
			  // MatrizResult.sleep(4000);
			  //new MatrizResult();
			  
		} else if (num >= 6) {
			System.out.println("Wrong input!");
			
		}
   

}
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
	
}

