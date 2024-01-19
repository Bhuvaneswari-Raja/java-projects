import java.util.ArrayList;
public class ArrayQueue implements Queue {
	private ArrayList queueArray = new ArrayList();

	public void enqueue(Object item) {
		queueArray.add(item);
		
	}

	public Object dequeue() {
		queueArray.remove(0);
		return null;
	}

	public Object peekFront() {
		if(queueArray.size() == 0) {
		return null;
		}
		else {
			return queueArray.get(1);
		}
		
	}


	public Object peekRear() {
		if(queueArray.size() == 0) {
		return null;
		}
		else {
			return queueArray.get(queueArray.size() -1);
		}
		
	}

	public int size() {
		return queueArray.size();
	}
	
}
