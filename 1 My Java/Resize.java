class Resize {

	public static int[ ] initialize (int [ ] array, int item) { 
		//Sets all elements in the array to the item value
		return array;
	}

	public static int[] addItem(int [ ] array, int item, int index) {
		//Create a new array increasing the size of the array by 1, shift all elements starting at index up by 1, inserts the item at the index location, and returns the new array
		int [] array2 = new int[array.length + 1];

		for (int i= 0; i < array.length; i++) { 
		if (i >= index) {
			array2 [i+1] = array[i]; 
		} 
		else {
			array2[i] = array[i];
		}

		}
		
		array2[index] = item; return array2;
	}
	public static int[ ] removeItem(int[] array, int index) { 
		//Remove the item at the specific index location and resizes the array by shifting all items down, and returns a new array 1 size smaller return array;
    return array;
	} 
}