import java.util.Scanner;

public class PrimeNumbers {
			
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		boolean flag = false;
		
		for(int i = 2; i <= num; i++) {
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		

		if (num == 0 || num == 1) {
			System.out.println(num + " is not prime number");
		} 
		if(flag) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
		
		
	}
}