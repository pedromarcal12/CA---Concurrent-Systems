package com.mycompany.catest;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

public class MatrixResult implements Runnable  {
    
	// Creating variables
	private List<Double> values;

    public MatrixResult(List<Double> values) {
        this.values = values;
    }

    @Override
    public void run() {
        // Dividing by 2 10x10 matrix
        List<Double> firstMatrix = values.subList(0, 100);
        List<Double> secMatrix = values.subList(100, 200);

        double[][] matrix = new double[10][10];
        double[][] matrix2 = new double[10][10];
        int ind = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
            	matrix[i][j] = firstMatrix.get(ind++);
                matrix2[j][i] = secMatrix.get(ind++);
            }
        }
        
        // Creating empty array for the results
        double[][] resultMatrix = new double[20][10];
        
        // Calculating each of the sum and storing it in array
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                double sum = 0;
                for (int k = 0; k < 10; k++) {
                    sum += matrix[i][k] * matrix2[k][j];
                }
                resultMatrix[i][j] = sum;
            }
        }

        // Print the result
        System.out.println("Matrix Result:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                int value = (int) Math.round(resultMatrix[i][j]);
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    	 String filePath = "C:\\Users\\henri\\Downloads\\data.csv";
         String separator = ",";
        List<Double> values = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(separator);
                for (String token : tokens) {
                    values.add(Double.parseDouble(token));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading input file: " + e.getMessage());
            
        }

        MatrixResult multiplication = new MatrixResult(values);
        Thread thread = new Thread(multiplication);
        thread.start();
    

        }
        
    }






   