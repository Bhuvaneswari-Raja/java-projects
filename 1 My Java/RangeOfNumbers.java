import java.util.Scanner;
public class RangeOfNumbers {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;

		System.out.print("Enter a number between 1 and 100: ");
		num = scan.nextInt();

		/*for(int i = 0; num > i; i++) {
			System.out.println(num);
		}*/

		while(num > 0){
			System.out.print("Enter a number between 1 and 100: ");
			num = scan.nextInt();
		} 

		int[] intArr = new int[100];
		
	}

}