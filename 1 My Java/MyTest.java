import java.util.ArrayList;
public class MyTest {
	public static void main(String args[]) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Raja");
		names.add("Kala");
		names.add("Pooja");
		names.add("Nandhini");
		
		System.out.println(names);
		
		for(int x = 0; x < 4; x++) {
			System.out.println(names.get(x));

		}
			
	}
}