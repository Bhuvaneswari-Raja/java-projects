
public class LinkedList {
	private Node node;
    private Node list; //this represents a node list starting point
    private int size;   //total size of the list

    //construct an empty Linked List
    //Notice the use of "null" when when defining an empty list or empty node 
    public LinkedList() {
        list = null;
        size = 0;
    }
    
    //Add a new node to the list as an "item"
   //There are two situations that must be accounted for, an empty list and an existing list
    public void add(Object item) {
    	node = new Node(item, null);
        Node current;
        if (list == null) {
            list = node;
        } else {
            current = list;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
        size++;
    }
    
    //inserts a new node as an "item" at a specific location in the list (index)
   //There are several situations we have to account for, look at them all below
    public boolean insert(Object item, int index) {
        Node node = new Node(item, null);
        Node current;
        if (index < 0 || index > size) {
            return false;
        }
        if (index == 0) {
            node.setNext(list);
            list = node;
            size++;
            return true;
        }
        current = list;
        Node previous = current;
        current = current.getNext();
        for (int i = 1; i < index; i++) {
            previous = current;
            current = current.getNext();
        }
        node.setNext(current);
        previous.setNext(node);
        size++;
        return false;
    }
    
    //get an item's data (node) at a specific location (index) in the list
    public Object get(int index) {
        if (index < 0 || index > size-1) {
            return null;
        }
        Node current = list;
        int temp = -1;
        while (current != null) {
            temp++;
            if (temp == index) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }
    
    //Removes a node item at a specific location in the list (index)
   //There are several situations we have to account for, look at them all below
    public boolean remove(int index) {
        if (index < 0 || index > size-1) {
            return false;
        }
        Node current = list;
        if (list != null) {
            if (index == 0) {
                list = list.getNext();
                size--;
                return true;
            }
            for (int i = 0; i < index-1; i++) {
                if (current.getNext() == null) {
                    return false;
                }
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
            size--;
            return true;
        }
        return false;
    }
    
    //total number of nodes in the list
    public int size() {
        return size;
    }

	public int search(String item) {
		Node head = list;
		int index = 0;
		
		if(head == null) {
			return -1;
		}
		
			else {
				while (head != null) {
					if(item == head.getValue()) {
						return index;
					} 
					
					index++;
					head = head.getNext();	
				}
				
			}
		
		return index;
		
	}
	
	public void sort() {
		Node current = list;
		Node index = null;
		Object temp;
		
		if(current == null) {
			return;
		}
		
		else {
			index = current.getNext();
			while(index != null) {
				if(Integer.valueOf(String.valueOf(current.getValue())) > Integer.valueOf(String.valueOf(index.getValue()))) {
					temp = current.getValue();
					current = index;
					index = (Node) temp;
				}
				index = index.getNext();
			}
			current = current.getNext();
		}
		
		 /*
		Object next = list.getNext();
		
		if(list.getValue() == null) {
			return;
		}
		else {
			while(!list.getValue().equals(null)) {
				if(Integer.vlist > list.getNext()) {
					list.setValue(next);
					next = list.getValue() ;
				}
				
			}
		}
		*/
	}
    
    public String toString() {
        String result = "";
        Node current = list;
        while (current != null) {
            result += current.getValue().toString() + "\n";
            current = current.getNext();
        }
        return result;
    }
}