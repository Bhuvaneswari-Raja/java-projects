package com.pooja;

public class NestedClassTesting {
	
	public static void main(String[] args) {
		
		OuterNest outside = new OuterNest();
		OuterNest.InnerNest inside = new OuterNest.InnerNest();
		System.out.println(inside.name);
	}
 
}
