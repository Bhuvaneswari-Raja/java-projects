import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NumberArrayList implements OrderedNumberList {

	static List<Integer> numList = new LinkedList<Integer>();
	
	public void setValues() {
		int rand;
		for(int i = 0; i < 10; i++) {
			rand = (int) ((Math.random() * (100 - 1)) + 1);
			numList.add(rand);
		}
	}

	public int getCurrent() {
		return numList.get(0);

	}

	public int removeCurrent() {
		int removeCurrent = numList.get(0);
		numList.remove(0);
		return removeCurrent;

	}

	
	public void insertAfter(int value) {
		numList.add(getSize(), value);;
	}

	public void setCurrent(int value) {
		numList.set(numList.indexOf(getCurrent()), value);
		System.out.println("Current item = " + getCurrent());
	}

	public void toNext() {
		int pointer = numList.get(numList.indexOf(getCurrent()) + 1);
	}

	public void toFirst() {
		int pointer = numList.get(0);

	}


	public int getSize() {
		return numList.size();
	}

}