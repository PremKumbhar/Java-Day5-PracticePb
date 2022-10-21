package com.bridgelabz;

public class SwapNumber {
	public static void main(String[] args) {
		float first = 3.40f, second = 4.50f;
		
		System.out.println("Before Swap");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		
		float temporary = first;
		
		first = second;
		
		second = temporary;
		
		System.out.println("After Swap");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);

	}
}
