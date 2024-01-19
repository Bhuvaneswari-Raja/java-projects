package com.pooja;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTesting {

	public static void main(String[] args) {
		
		
		System.out.println("--------------------LinkedList-------------------");		
		LinkedList<String> marauders = new LinkedList<String>();
		marauders.add("James");
		marauders.add("Sirius");
		marauders.add("Remus");
		marauders.add("Peter");
		marauders.add(3, "Pooja");
		
		System.out.println(marauders);
		
		Iterator it = marauders.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		System.out.println("Contains said item: " + marauders.contains("Lily"));
		System.out.println();
		System.out.println("Size: "+ marauders.size());
		
		marauders.remove();
		System.out.println(marauders);
		

		System.out.println();
		System.out.println("--------------------ArrayList--------------------");

		ArrayList<String> colours = new ArrayList<String>();
		colours.add("Blue");
		colours.add("Red");
		colours.add("Green");
		colours.add("Yellow");
		colours.add(2, "Black");
		
		System.out.println(colours);
		
		for(String x :colours) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Contains said item: " + colours.contains("Pink"));
		
		System.out.println();
		System.out.println("Size: " + colours.size());
		
		colours.remove(0);
		System.out.println(colours);
		
		String[] name = new String[3];
		name[0] = "Pooja";
		name[1] = "raja";
		name[2] = "Kala";
		
		for(int x = 0; x < name.length; x++) {
			System.out.println(name[x]);
		}
		

	}

}
