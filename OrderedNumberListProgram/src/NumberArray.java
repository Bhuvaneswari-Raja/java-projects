import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberArray implements OrderedNumberList {

	Integer[] numArr = new Integer[1000];
	
	public void setValues() {
		int rand;
		for(int i = 0; i < 10; i++) {
			rand = (int) ((Math.random() * (100 - 1)) + 1);
			numArr[i] = rand;
		}
	}

	public int getCurrent() {
		return numArr[0];
	}

	public int removeCurrent() {
		int removeCurrent = numArr[0];

		List<Integer> removeCurrentItem = new ArrayList();
		
		for(Integer x: numArr) {
			removeCurrentItem.add(x);
		}

		removeCurrentItem.remove(removeCurrent);
		
		numArr = removeCurrentItem.toArray(new Integer[0]);
		
		return removeCurrent;

	}

	public void insertAfter(int value) {
		numArr[getCurrent() + 1] = value;
	}

	public void setCurrent(int value) {

		numArr[getCurrent()] = value;
		System.out.println("Current item = " + numArr[getCurrent()]);
	}

	public void toNext() {
		int pointer = numArr[getCurrent() + 1];
	}

	public void toFirst() {
		int pointer = numArr[0];

	}

	public int getSize() {
		return numArr.length;
	}

}