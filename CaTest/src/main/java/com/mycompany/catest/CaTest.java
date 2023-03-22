/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.catest;


import java.io.*;  
import java.util.Scanner;  
/**
 *
 * @author 35389
 */
public class CaTest {

    public static void main(String[] args) throws Exception {
        
        //Scanner method for reading the file
        Scanner sc = new Scanner(new File("C:\\Users\\35389\\Downloads\\data.csv"));
        //Splitting value inside file using ,
        sc.useDelimiter(",");
        //While loop to read file until last line
        while (sc.hasNext())  {
            System.out.println(sc.next());
        }
        //Closing scanner
            sc.close();
    }
}
