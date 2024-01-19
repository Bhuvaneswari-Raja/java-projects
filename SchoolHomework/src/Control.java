import java.util.Scanner;

public class Control {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int input;
		System.out.print("Enter a number: ");
		input = scan.nextInt();
		
		while (input > 0) {
			try {
				input = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Invalid input");
				System.out.print("Enter a number: ");
				input = scan.nextInt();
			} 
		}

	}
}
