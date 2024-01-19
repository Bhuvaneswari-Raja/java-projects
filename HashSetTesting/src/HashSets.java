import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

public class HashSets {

	public static void main(String[] args) {
		
		HashSet<String> fruits = new HashSet<String>();
		fruits.add("grapes");		
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("apple");
		fruits.add("apple");
		System.out.println("Fruits: " + fruits);
		System.out.println();
	
		Iterator<String> looping = fruits.iterator();
		System.out.print("Fruits: ");
		while(looping.hasNext()) {
			System.out.print(looping.next() + ", ");
		}
		
		
		
	}

}
