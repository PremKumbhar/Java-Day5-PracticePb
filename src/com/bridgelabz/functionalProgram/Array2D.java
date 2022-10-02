package com.bridgelabz.functionalProgram;

import java.util.Scanner;

public class Array2D 
{

	public static void main(String[] args) 
	{
		int row,col,i,j;
		int arr[][];
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter a total number of row: ");
	    row = scan.nextInt();
	    System.out.println("Enter a total number of col: ");
	    col = scan.nextInt();
	    arr = new int[row][col];
	    for (i = 0; i < row; i++);
	    {
	    	for (j = 0; j < col; j++)
	    	{
	    		System.out.print("Enter element for row = " + (i + 1) + " column = " + (j + 1) + " : ");
	    		arr[i][j] = scan.nextInt();
	    	}
	    }
	    
	    System.out.println("The array is :");
	    for (i = 0; i < row; i++) {
	    	for (j = 0; j < col; j++) {
	    		System.out.println(arr[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	    
	}

}
