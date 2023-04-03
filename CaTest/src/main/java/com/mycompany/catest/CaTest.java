

package com.mycompany.catest;


import java.util.Scanner;
/**
 *
 * @author Pedro Marcal - 2020300
 */
public class CaTest{

	
    public static void main(String[] args) throws Exception {
    	
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
			MergeSort thread2 = new MergeSort(null, 0, 0, 0);
			System.out.println(thread2);
			
		} if (num == 3) {
			MatrizResult thread3 = new MatrizResult();
			System.out.println(thread3);
			
		} if (num == 4) {
			  new StandardDeviation();	
			  new MergeSort(null, 0, 0, 0);
			  new MatrizResult();
			  
		} if (num == 5) {
			  new StandardDeviation();
			  StandardDeviation.sleep(500);
			  new MergeSort(null, 0, 0, 0);
			  MergeSort.sleep(5000);
			  new MatrizResult();
			  MatrizResult.sleep(4000);
			  
		} else if (num >= 6) {
			System.out.println("Wrong input!");
		}
   

}
    }
}

