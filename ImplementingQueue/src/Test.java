
public class Test {
  public static void main(String[] args) {

		ArrayQueue arrQueue = new ArrayQueue();
		int randNum;

		System.out.print("------- Queue (enqueue) -------");
		for(int i = 0; i < 5; i++) {
			randNum = (int)((Math.random() * (100 - 0)) + 0);
			arrQueue.enqueue(randNum);
			System.out.println(randNum);
		}
		System.out.println("Queue size - " + arrQueue.size());

		
		
		System.out.println("------- Queue (dequeue) -------");
		arrQueue.dequeue();		
		System.out.println("peekFront - " + arrQueue.peekFront());
		System.out.println("peekRear - " + arrQueue.peekRear());
		System.out.println("Queue size - " + arrQueue.size());

		
		
  }
}