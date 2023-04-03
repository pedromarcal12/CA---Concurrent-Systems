

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
			
			System.out.println("\nChoose the task");
			System.out.println("1 - Standard Deviation");
			System.out.println("2 - Result of the matrizes");
			System.out.println("3 - MergeSort");
			System.out.println("4 - All results in multithread\n");
			System.out.println(" ");
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
			  StandardDeviation thread1 = new StandardDeviation();	
			  MergeSort thread2 = new MergeSort(null, 0, 0, 0);
			  MatrizResult thread3 = new MatrizResult();
		} else if (num >= 5) {
			System.out.println("Wrong input!");
		}
   

}
    }
}

