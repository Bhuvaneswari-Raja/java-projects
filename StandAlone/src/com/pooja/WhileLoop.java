package com.pooja;

import java.util.Scanner;

public class WhileLoop {
	
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);

	double random = ((Math.random() * (20 - 0)) + 0);
	System.out.println(random);
	
	System.out.print("Enter number: ");
	double x = input.nextDouble();
	
	
	while(x < random) {
		System.out.println("out of bounds");
	}
	}
}
