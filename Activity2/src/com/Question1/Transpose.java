package com.Question1;

public class Transpose {
	
	 public static void main(String[] args) {
	// declaring two variables, row and column
	        int row = 2;
	        int column = 3;
	        int[][] matrix = { {10,20,30}, {40,50,60} };
	// Display current matrix
	        display(matrix);
	// Transpose the matrix
	        int[][] transpose = new int[column][row];
	        for(int i = 0; i < row; i++)
	        {
	            for (int j = 0; j < column; j++) 
	            {
	                transpose[j][i] = matrix[i][j];
	            }
	        }
	// Display transposed matrix
	        display(transpose);
	    }
	    public static void display(int[][] matrix) {
	        System.out.println("The matrix is: ");
	        for(int[] row : matrix)
	        {
	            for (int column : row) 
	            {
	                System.out.print(column + "    ");
	            }
	            System.out.println();
	        }
	   }
}