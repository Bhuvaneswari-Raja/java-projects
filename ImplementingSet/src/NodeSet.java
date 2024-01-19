public class NodeSet implements Set {
    private Node set;
    private int size;
    
    public NodeSet() {
        set = null;
        size = 0;
    }
    
    public boolean add(Object item) {
        Node node = new Node(item, null);
        if (size == 0) {
            set = node;
            size++;
            return true;
        }
        if (!contains(item)) {
            node.setNext(set);
            set = node;
            size++;
            return true;
        }
        return false;
    }
    
    public boolean contains(Object item) {
        if (set == null) {
            return false;
        }
        Node current = set;
        for (int i = 0; i < size; i++) {
            if (item.equals(current.getValue())) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
    
    public boolean remove(Object item) {
        if (!contains(item)) {
            return false;
        }
        if (size == 1) {
            if (set.getValue().equals(item)) {
                set = null;
                size--;
                return true;
            }
            return false;
        }
        if (set.getValue().equals(item)) {
            set = set.getNext();
            size--;
            return true;
        }
        Node current = set.getNext();
        Node previous = set;
        for (int i = 0; i < size-1; i++) {
            if (current.getValue().equals(item)) {
                previous.setNext(current.getNext());
                size--;
                return true;
            }
            if (current.getNext() == null) {
                return false;
            } else {
                previous = previous.getNext();
                current = current.getNext();
            }
        }
        return false;
    }
    
    public int size() {
        return size;
    }
    
    public String toString() {
        if (set == null) {
            return "";
        }
        String output = "";
        Node current = set;
        for (int i = 0; i < size; i++) {
            output += current.getValue();
            current = current.getNext();
        }
        return output;
    }
}

