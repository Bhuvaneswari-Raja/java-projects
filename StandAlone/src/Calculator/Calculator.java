package Calculator;

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator2 calculator = new Calculator2();
		
		boolean exitCal = false;
		float num1;
		float num2;
		
		do {
			System.out.print("Enter operator [1(addition), 2(subtration), 3(multipilcation), 4(division), 5(exit calculator)]: ");
			float operator = scan.nextFloat();
			
			if(operator == 1) {
				System.out.print("Enter first number: ");
				num1 = scan.nextFloat();
				
				System.out.print("Enter second number: ");
				num2 = scan.nextFloat();
				
				float addition = calculator.addition(num1, num2);
				System.out.println();
				System.out.println("Sum is: " + addition);
				System.out.println();
				
				exitCal = false;
				
			} else if(operator == 2) {
				System.out.print("Enter first number: ");
				num1 = scan.nextFloat();
				
				System.out.print("Enter second number: ");
				num2 = scan.nextFloat();
				
				float subtration = calculator.subtration(num1, num2);
				System.out.println();
				System.out.println("Difference is: " + subtration);
				System.out.println();

				exitCal = false;

			} else if(operator == 3) {
				System.out.print("Enter first number: ");
				num1 = scan.nextFloat();
				
				System.out.print("Enter second number: ");
				num2 = scan.nextFloat();
				
				float multipilcation = calculator.multipilcation(num1, num2);
				System.out.println();
				System.out.println("Product is: " + multipilcation);
				System.out.println();

				exitCal = false;
				
			} else if (operator == 4) {
				System.out.print("Enter first number: ");
				num1 = scan.nextFloat();
				
				System.out.print("Enter second number: ");
				num2 = scan.nextFloat(); 
				
				float division = calculator.division(num1, num2);
				System.out.println();
				System.out.println("Quotient is: " + division);
				System.out.println();

				exitCal = false;
				
			} else if (operator == 5) {
				exitCal = true;			
				
			} else {
				System.out.println("Wrong operator [1(addition), 2(subtration), 3(multipilcation), 4(division)]: ");
				exitCal = false;
			}
		} while (exitCal == false);
		
	}
	

}
