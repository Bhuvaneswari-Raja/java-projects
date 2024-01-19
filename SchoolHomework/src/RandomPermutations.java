import java.util.ArrayList;

public class RandomPermutations {

	public static void main(String[] args) {
		int arraySize = 10;
		
		
		System.out.println("----------Brute Force Permutation----------");
		for (int i = 0; i <= 20; i++) {
			int[] permutations = bruteForcePermutation(arraySize);
			System.out.print(i + "-->  ");
			printArrayValues(permutations);
		}
	}

	public static void printArrayValues(int[] myArr) {
		for (int x = 0; x < myArr.length; x++) {
			System.out.print(myArr[x] + ", ");
		 }
		
		System.out.println();
	}

	public static int[] bruteForcePermutation(int size) {
		int[] data = new int[size];
		for (int i = 0; i < size; i++) {
			boolean duplicate = true;
			while (duplicate == true) {
				int rn = (int) ((size - 1 + 1) * Math.random() + 1);
				duplicate = false;
				for (int j = 0; j < size; j++) {
					if (data[j] == rn) {
						duplicate = true;
					}
				}
				if (duplicate == false) {
					data[i] = rn;
				}
			}
		}

		return data;
	}

	public static int[] efficientPermutation(int size) {
		int[] data = new int[size];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			list.add(i + 1);
		}
		for (int i = 0; i < size; i++) {
			int max = list.size() - 1;
			int rl = (int) ((max - 0 + 1) * Math.random() + 0);
			data[i] = list.get(rl);
			list.remove(rl);
		}
		for (int x = 0; x < data.length; x++) {
			System.out.print(data[x] + ", ");
		}

		return data;
	}

}