import java.util.ArrayList;

public class ArraySet implements Set {
	
	ArrayList setArray = new ArrayList();
	
	public boolean add(Object item) {
		
		if(!setArray.contains(item)) {
			setArray.add(item);
			return true;
		}
		else {
			return false;
		}
	}

	public boolean contains(Object item) {
		boolean flag = false;
		if(setArray.contains(item)) {
			flag = true;
		}
		return flag;
	}

	public boolean remove(Object item) {
		if(setArray.contains(item)) {
			setArray.remove(item);
			return true;
		}
		else {
			return false;
		}
	}

	public int size() {
		return setArray.size();
	}

}
