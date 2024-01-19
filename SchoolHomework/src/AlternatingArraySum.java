import java.util.Arrays;
import java.util.Scanner;

public class AlternatingArraySum {

	public static void main(String[] args) {
		int[] data = create();
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		System.out.println();
		System.out.println("Total: " + compute(data));

	}

	public static int[] create() {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[1000];
		int size = 0;
		int num;

		for (; size <= input.length; size++) {
			System.out.print("Enter an integer(enter number zero or smaller to stop): ");
			num = scan.nextInt();

			if (num > 0) {
				input[size] = num;
			} else {
				break;
			}
		}

		int[] data = new int[size];
		data = Arrays.copyOfRange(input, 0, size);
		/*
		 * for (int i=0;i<size;i++) { data[i] = input[i]; }
		 */

		return data;
	}

	public static int compute(int[] data) {
		int total = 0;

		for (int i = 0; i < data.length; i++) {

			if (i == 0 || i % 2 != 0) {
				total = total + data[i];
			} else {
				total = total - data[i];
			}

		}
		return total;
	}

}