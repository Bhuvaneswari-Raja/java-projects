package school;
import java.util.ArrayList;
import java.util.Scanner;

import com.pooja.Calendar;

class Searching {
	public static void main(String[] args) {
		//System.out.println("Testing");
		
		Scanner scan = new Scanner(System.in);
		
		boolean flag = false;
		
		do {
			System.out.print("Enter 1 (Array) or 2 (ArrayList) or 3 (Exit): ");
			int input = scan.nextInt();
			
			if(input == 1) {
				System.out.print("Enter Array size: ");
				int size  = scan.nextInt();
				System.out.print("Enter minimum number: ");
				int low  = scan.nextInt();
				System.out.print("Enter maximum number: ");
				int high  = scan.nextInt();
				randomArraySort(size, low, high);
				flag = true;
				
			} else if(input == 2) {
				System.out.print("Enter Array List size: ");
				int size  = scan.nextInt();
				System.out.print("Enter minimum number: ");
				int low  = scan.nextInt();
				System.out.print("Enter maximum number: ");
				int high  = scan.nextInt();
				arrayListBehaviour(size, low, high);
				flag = true;
				
			} else if (input == 3) {
				flag = false;				
			} else {
				System.out.println();
				System.out.println("Wrong Input: choose 1 or 2 or 3");
				
				flag = true;
			}
			
		} while(flag);
		
		System.out.println();
		System.out.println("------------- End -------------");
		
		/*
		if(input == 1) {
			System.out.print("Enter Array size: ");
			int size  = scan.nextInt();
			System.out.print("Enter minimum number: ");
			int low  = scan.nextInt();
			System.out.print("Enter maximum number: ");
			int high  = scan.nextInt();
			randomArraySort(size, low, high);
			
			//System.out.println()
			
		}else if(input == 2) {
			System.out.print("Enter Array List size: ");
			int size  = scan.nextInt();
			System.out.print("Enter minimum number: ");
			int low  = scan.nextInt();
			System.out.print("Enter maximum number: ");
			int high  = scan.nextInt();
			arrayListBehaviour(size, low, high);
			
			//System.out.println()
			
		}else {
			System.out.println("Wrong Input: choose 1 or 2");
		}
		*/
		
	}
	
	public static void randomArraySort(int size, int low, int high) {
		Scanner scan = new Scanner(System.in);

		int[] randomArray = randomArray(size, low, high);
		System.out.println("Before sorting");
		
		for(int x = 0; x < randomArray.length; x++) {
			System.out.println(randomArray[x]);
		}
		System.out.println("-----------------------------------------------");
		
		sort(randomArray);
		System.out.println("After sorting");

		for(int x = 0; x < randomArray.length; x++) {
			System.out.println(randomArray[x]);
		}
		
		System.out.println("----------------linearSearch-----------------------------");
		System.out.print("Enter a number: ");
		int item  = scan.nextInt();
		int indexValue= linearSearch(randomArray, item);
		System.out.println("Index value is: " + indexValue);

		/*	
		System.out.println("----------------binarySearch-----------------------------");
		System.out.print("Enter a number: ");
		int item2  = scan.nextInt();
		int indexValue2 = binarySearch(randomArray, item2);
		System.out.println("Index value is: " + indexValue2);
		*/
		
		System.out.println("-----------------------------------------------");
	}
	
	
	public static void arrayListBehaviour(int size, int low, int high) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Before sorting ArrayList");
		ArrayList<Integer> randomList = randomArrayList(size, low, high);
		for(int x = 0; x < randomList.size(); x++) {
			System.out.println(randomList.get(x));
		}
		
		System.out.println("-----------------------------------------------");
		
		
		sortArrayList(randomList);
		System.out.println("After sorting ArrayList");

		for(int x = 0; x < randomList.size(); x++) {
			System.out.println(randomList.get(x));
		}
		
		System.out.print("Enter a number: ");
		int arrayItem  = scan.nextInt();
		
		int listIndexValue = linearSearch (randomList, arrayItem);
		System.out.println("Index of Array List: " + listIndexValue);
		
		/*System.out.print("Enter a number: ");
		int arrayItem2  = scan.nextInt();
		int listIndexValue2 = binarySearch (randomList, arrayItem2);
		System.out.println("(Binary Search)Index of Array List: " + listIndexValue2);
		*/

	} 
	
	
		
	//Pre: low is less than high; size >= 1
	  //Post: An arrayList has been constructed and returned containing "SIZE" items each randomly choosen between HIGH and LOW
	  //SIZE represents the total desired length of the arrayList, LOW and HIGH represent the lowest and highest possible values for each item in the list
	  public static ArrayList<Integer> randomArrayList(int size, int low, int high) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for (int i = 0; i < size; i++) {
	      list.add((int)((high - low + 1) * Math.random() + low));
	    }
	    return list;
	  }
	
	//Pre: none
	  //Post: The ArrayList has been sorted low to high
	  public static void sortArrayList(ArrayList<Integer> list) {
	    for (int i = 0; i < list.size(); i++) {
	      for (int j = 0; j < list.size()-1; j++) {
	        if (list.get(j) > list.get(j+1)) {
	          int temp = list.get(j);
	          list.set(j, list.get(j+1));
	          list.set(j+1, temp);
	        }
	      }
	    }
	  }
	  
	  //Pre: none
	  //Post: If ITEM is in the arrayList, then the index of the item is returned, if not found returns -1
	  public static int linearSearch (ArrayList<Integer> list, int item) {
	  //Implements a linear search of an arrayList
	  for (int i = 0; i < list.size(); i++) {
	      if (item == list.get(i)) {
	        return i;
	      }
	    }
	    return -1;
	  }
	
	//Pre: The arrayList must be sorted and ordered low to high
	  //Post: If ITEM is in the arrayList, then the index of the item is returned, if not found returns -1
	  public static int binarySearch (ArrayList<Integer> list, int item) {
	    //Implements a binary search of an arrayList
		  int low = 0;
		    int high = list.size()-1;
		    int midpoint = 0;
		    while (low <= high) {
		      midpoint = (high + low) / 2;
		      if (item == list.get(midpoint)) {
		        return midpoint;
		      } else if (item > list.get(midpoint)){
		        low = midpoint + 1;
		      } else {
		        high = midpoint - 1;
		      }
		    }
	    return -1;
	  }
	
	
	
		 
	//Pre: The array must be sorted and ordered low to high
	  //Post: If ITEM is in the array, then the index of the element is returned, if not found returns -1
	  public static int binarySearch (int [] array, int item) {
	    //Implements a binary search of an array
	    int low = 0;
	    int high = array.length-1;
	    int midpoint = 0;
	    while (low <= high) {
	      midpoint = (high + low) / 2;
	      if (item == array[midpoint]) {
	        return midpoint;
	      } else if (item > array[midpoint]){
	        low = midpoint + 1;
	      } else {
	        high = midpoint - 1;
	      }
	    }
	    return -1;
	  }
	   
	  
	  
	   //Pre: none
	  //Post: If ITEM is in the array, then the index of the element is returned, if not found returns -1
	  public static int linearSearch (int [] array, int item) {
	    //Implements a linear search of an array
	    for (int i = 0; i < array.length; i++) {
	      if (item == array[i]) {
	        return i;
	      }
	    }
	    return -1;
	  }
	  
	    
	  
	  //Pre: low is less than high; size >= 1
	  //Post: An array has been constructed and returned containing "SIZE" items each randomly choosen between HIGH and LOW
	  //SIZE represents the total desired length of the array, LOW and HIGH represent the lowest and highest possible values for each element in the array
	  public static int[] randomArray(int size, int low, int high) {
	    int [] array = new int[size];
	      for (int i = 0; i < size; i++) {
	        array[i] = (int)((high - low + 1) * Math.random() + low);
	      }
	    return array;
	  }
	  
	   //Pre: none
	  //Post: The array has been sorted low to high
	  public static void sort(int [] array) {
	    for (int i = 0; i < array.length; i++) {
	      for (int j = 0; j < array.length-1; j++) {
	        if (array[j] > array[j+1]) {
	          int temp = array[j];
	          array[j] = array[j+1];
	          array[j+1] = temp;
	        }
	      }
	    }
	  }
	  
}  
	  
	  	  

	  

	  

	  

	  

	  
