package com.bridgelabz;

public class Power2 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		
		int i = 0;
		int powerofTwo = 1;
		
		while (i <= n)
		{
			System.out.println(i + " " + powerofTwo);
			powerofTwo = 2 * powerofTwo;
					i = i + 1;
			
		}

	}

}