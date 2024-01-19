import java.util.Scanner;
import java.util.Arrays;

public class ArraysAreFun {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		*/
		int[] myArr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] myArr2 = {10,9,8,7,6,5,4,3,2,1};
		int[] myArr3 = {25,50,75,100};

		System.out.println(Arrays.copyOf(myArr3, 10));
		int[] myArrCopy = Arrays.copyOfRange(myArr2, 0, 5);
		
		for(int i = 0; i < myArrCopy.length; i++) {
			System.out.println(myArrCopy[i]);
		}
		
		
		
		/*
		for(int i = 0; i < num; i++ ) {
			rand = (int) ((num - 1 + 1) * Math.random() + 1);
			myArr[i] = rand;
		}

		for(int i = 0; i < num; i++ ) {
			System.out.println("---> "+ myArr[i]);
		}
		*/
		
		
	}

}
