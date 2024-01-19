import java.util.ArrayList;

public class ArrayStack implements Stack {

	private ArrayList stackArray = new ArrayList();

	public void push(Object item) {
		stackArray.add(0, item);
	}

	public Object pop() {
		Object popped;
		popped = stackArray.remove(0);
		return popped;
	}

	public Object peekTop() {
		return stackArray.get(0);
	}

	public int size() {
		return stackArray.size();
	}

}