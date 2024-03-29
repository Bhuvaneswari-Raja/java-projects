
public class Node {
	private Object value; // contains a specific piece of data
	private Node next; // contains a link to the next "Node" in the list

	// construct a Node object entity containing a data value and a link to the next Node
	// NOTE: The next value is often "null", especially if it is the last node in the list
	public Node(Object value, Node next) {
		this.value = value;
		this.next = next;
	}

	// returns the data value of the node object
	public Object getValue() {
		return value;
	}

	// returns the next Node in the list (quite often null)
	public Node getNext() {
		return next;
	}

	// changes the node object's value
	public void setValue(Object value) {
		this.value = value;
	}

	// changes the node object's pointer to another node or to null
	public void setNext(Node next) {
		this.next = next;
	}
}