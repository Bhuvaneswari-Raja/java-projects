
public class Test {
  public static void main(String[] args) {

	  ArrayStack arrStack = new ArrayStack();
		int randNum;

		System.out.print("------- Queue(push) -------");
		for(int i = 0; i < 5; i++) {
			randNum = (int)((Math.random() * (100 - 0)) + 0);
			arrStack.push(randNum);
			System.out.println(randNum);
		}
		System.out.println("Queue size - " + arrStack.size());

		
		
		System.out.println("------- Queue(pop) -------");
		arrStack.pop();		
		System.out.println("peekTop - " + arrStack.peekTop());
		System.out.println("Stack size - " + arrStack.size());

		
		
  }
}