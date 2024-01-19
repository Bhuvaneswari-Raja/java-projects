
// April 12, 2023
import java.util.ArrayList;

public class Eyebrows {

	public static void main(String[] args) {
		Threading needle = new Threading();
		Wax thread2 = new Wax();
		//Threading needele2 = new Threading();
		
		ArrayList<String> tlnd = new ArrayList<>();
		tlnd.add("Magnus");
		tlnd.add("Alec");
		tlnd.add("Rafael");
		tlnd.add("Anjali");
		tlnd.add("Max");
		tlnd.add("David");
		tlnd.add("Shinyun");
				
		needle.start();
		
		for(String x : tlnd) {
			System.out.println("--> " + x);
		}
		thread2.start();


	}

}
