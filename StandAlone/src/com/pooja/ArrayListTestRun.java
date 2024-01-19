package com.pooja;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTestRun {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first and last name: ");
		String name = scan.next();
		System.out.print("Enter age: ");
		int age = scan.nextInt();
		
		ArrayList<String> firstName = new ArrayList<String>();
		ArrayList<Integer> num = new ArrayList<Integer>();

		firstName.add(name);
		num.add(age);
		
		for(String x: firstName) {
			System.out.println("User name: " + x);
		}
		for(int x: num) {
			System.out.println("User age: " + x);
			
		}
		
	}

}
