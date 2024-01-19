import java.util.Scanner;
public class Test {
  public static void main(String[] args) {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  ArraySet arrSet = new ArraySet();
		int randNum = 0;

		System.out.print("------- Set(push) -------");
		for(int i = 0; i < 5; i++) {
			randNum = (int)((Math.random() * (100 - 0)) + 0);
			arrSet.add(randNum);
			System.out.println(randNum);
		}
		System.out.println("Set size - " + arrSet.size());

		
		
		System.out.println("------- Set(pop) -------");
		arrSet.remove(randNum);		
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		System.out.println("contains? " + arrSet.contains(num));
		System.out.println("Set size - " + arrSet.size());

		
		
  }
}