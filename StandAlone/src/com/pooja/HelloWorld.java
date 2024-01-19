package com.pooja;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String arg[]) {
		System.out.println("Hello");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 1 or 2: ");
		int num = scan.nextInt();
		
		if(num == 1) {
			System.out.println(methodOne());
			  System.out.println();
		} if(num == 2) {
			System.out.println(methodTwo());
			  System.out.println();
		}
		while (num !=1 || num !=2) {
			System.out.print("Enter 1 or 2: ");
			num = scan.nextInt();
			
			if(num == 1) {
				System.out.println(methodOne());
				System.out.println();

			}else if(num == 2) {
			  System.out.println(methodTwo());
			  System.out.println();

			} else {
				System.out.println("Try again");
				System.out.println();
			}
		}
				
	}
	
	public static String methodOne() {
		return "methodOne";
	}
	
	public static String methodTwo() {
		return "methodTwo";
	}

}
