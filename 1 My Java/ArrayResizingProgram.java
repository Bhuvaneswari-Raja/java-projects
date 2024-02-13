class ArrayResizingProgram {
	public static void main(String[] args) { 

		int[] numbers = new int[5];
		numbers [0] = 4;
		numbers [1] = 8;
		numbers [2] = 12; 	
		numbers [3] = 25;
		numbers [4] = 17; 

		/*
		numbers Resize.addItem(numbers, 10, 5); 
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers [i]); 
		 }
		 */
		 

		int [] items = {6,8,12,4,9,-12, 0,55, 72, 3}; 
		items = Resize.addItem(items, 125, 4); 
		for (int i= 0; i < items.length; i++) { 
			System.out.println(items[i]);
		}
	}
} 