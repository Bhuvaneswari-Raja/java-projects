package com.pooja;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

	public static void main(String[] args) {
		LocalDateTime obj = LocalDateTime.now();
		System.out.println(obj);
		System.out.println("--------------------------------");
		System.out.println();
		
		DateTimeFormatter format_obj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
		
		String after_format = obj.format(format_obj);
		System.out.println(after_format);


	}

}
