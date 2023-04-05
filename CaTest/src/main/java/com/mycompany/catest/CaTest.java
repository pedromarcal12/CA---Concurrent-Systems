

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

	
    public static void main(String[] args) throws Exception {
    
    	List<Integer>data = MergeSort.file("C:\\Users\\henri\\Downloads\\data.csv");
    	
    	try (Scanner scanner = new Scanner(System.in)) {
    		
    		
    		int num;
			
			System.out.println("Type down :");
			System.out.println("1 - Standard Deviation \n" + "2 - Result of the matrizes \n" + 
			"3 - MergeSort \n" + "4 - All results in multithread \n" + "5 - All results in multithread with sleep thread implementation\n ");
			
			num = scanner.nextInt();
			
			
		  if (num == 1) {
			StandardDeviation thread1 = new StandardDeviation();
			System.out.println(thread1);
			
		} if (num == 2) {
			MatrizResult thread2 = new MatrizResult();
			System.out.println(thread2);
			
		} if (num == 3) {
			MergeSort thread3 = new MergeSort(data);
			System.out.println(thread3);
			
		} if (num == 4) {
			  new StandardDeviation();	
			  new MergeSort(data);
			  new MatrizResult();
			  
		} if (num == 5) {
			  StandardDeviation.sleep(5000);			
			  new StandardDeviation();
			  //MergeSort.sleep(5000);
			  //new MergeSort(data);
			  MatrizResult.sleep(4000);
			  new MatrizResult();
			  
			  
		} else if (num >= 6) {
			System.out.println("Wrong input!");
			
		}
   

}
    }

	
}

