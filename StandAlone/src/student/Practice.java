package student;

import java.util.Scanner;
public class Practice {
	
	public static void main(String args[]) {
		//System.out.println("Testing main method");
		//String firstName = "Nandhini";
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("First Name: ");
		String name1 = scan.next();
		
		System.out.print("Last Name: ");
		String name2 = scan.next();

		System.out.print("Age: ");
		int age = scan.nextInt();

		System.out.print("Grade: ");
		int grade = scan.nextInt();


		PracticeTwo myObj = new PracticeTwo(name1, name2, age, grade);
		
	}
	
}
