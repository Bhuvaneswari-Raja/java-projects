
public interface Queue {
    public void enqueue(Object item);
    public Object dequeue();
    public Object peekFront();
    public Object peekRear();
    public int size();
}