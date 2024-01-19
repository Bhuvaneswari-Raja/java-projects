package com.pooja;

enum Scores{
	FIVE,
	FOUR,
	THREE,
	TWO,
	ONE
}

public class EnumsTesting {
	public static void main(String[] args) {
		Scores my_scores = Scores.FIVE;
		System.out.println(my_scores);
		
	}
}
