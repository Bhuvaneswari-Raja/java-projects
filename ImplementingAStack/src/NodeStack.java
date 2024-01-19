
public class NodeStack implements Stack {
    private Node stack;
    private int size;
    
    public NodeStack() {
        stack = null;
        size = 0;
    }
    
    public void push(Object item) {
        if (size == 0) {
            stack = new Node(item, null);
        } else {
            Node node = new Node(item, stack);
            stack = node;
        }
        size++;
    }
    
    public Object pop() {
        if (size == 0) {
            return null;
        }
        Object item = stack.getValue();
        stack = stack.getNext();
        size--;
        return item;
    }
    
    public Object peekTop() {
        if (size == 0) {
            return null;
        }
        return stack.getValue();
    }
    
    public int size() {
        return size;
    }   
}

