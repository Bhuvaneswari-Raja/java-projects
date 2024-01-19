package com.pooja;

public class RecursionTesting {
	
	public static void main(String[] args) {
		name(0);
	}
	
	public static void name(int x) {
		if(x == 5) {
			System.out.println("Bhuvaneswari");
		}else {
			System.out.println("Pooja");
			x++;
			name(x);
		}
		
	}
 
}
