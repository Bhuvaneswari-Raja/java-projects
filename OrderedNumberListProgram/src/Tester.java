import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		NumberArray numberArr = new NumberArray();
		NumberArrayList numberArrayList = new NumberArrayList();
		
		int currentItem = (int) ((Math.random() * (100 - 1)) + 1);
		
		System.out.println("---------NumberArray----------");
		numberArr.setValues();
		System.out.println("Current item = " + numberArr.getCurrent());
		System.out.println("Removed item = " + numberArr.removeCurrent());
		numberArr.insertAfter(89);
		numberArr.setCurrent(currentItem);
		numberArr.toNext();
		numberArr.toFirst();
		System.out.println("size = " + numberArr.getSize());
		
		System.out.println();
		System.out.println("---------NumberArrayList----------");
		numberArrayList.setValues();
		System.out.println("Current item = " + numberArrayList.getCurrent());
		System.out.println("Removed item = " + numberArrayList.removeCurrent());
		numberArrayList.insertAfter(59);
		numberArrayList.setCurrent(currentItem);
		numberArrayList.toNext();
		numberArrayList.toFirst();
		System.out.println("size = " + numberArrayList.getSize());

	}

}
