package com.pooja;

import java.util.Scanner;

public class ForLoop {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int x = input.nextInt();
				
		for(int i = 0; x > i; i = i + 2) {
			System.out.println(i);
		}
		

		}

}
