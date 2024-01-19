public class NodeQueue implements Queue {
    private Node first;
    private Node last;
    private int size;
    
    public NodeQueue() {
        first = null;
        last = null;
        size = 0;
    }
    
    public void enqueue(Object item) {
        Node node = new Node(item, null);
        if (size == 0) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }
        size++;
    }
    
    public Object dequeue() {
        if (size == 0) {
            return null;
        }
        Object item = first.getValue();
        first = first.getNext();
        size--;
        return item;
    }
    
    public Object peekFront() {
        if (size == 0) {
            return null;
        }
        return first.getValue();
    }
    
    public Object peekRear() {
        if (size == 0) {
            return null;
        }
        return last.getValue();
    }
    
    public int size() {
        return size;
    }   
}

