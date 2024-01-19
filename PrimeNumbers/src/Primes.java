import java.util.Scanner;
public class Primes {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("Enter a number: ");
			num = scan.nextInt();
			checkPrime(num);
		 } while(num > 0);
		
		
	}
	
	public static void checkPrime(int input) {
		if(input%1 == 0 && input%input == 0) {
			System.out.println("This is a prime number");
		}
		else {
			System.out.println("This is not a prime number");
		}
		
	}
}
