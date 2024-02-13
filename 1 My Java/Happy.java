import java.util.ArrayList;
public class Happy {
	public static void main(String args[]) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Rajamanikandan");
		names.add("Pushkala");
		names.add("Nandhini"); 
		names.add("Dr.Bhuvaneswari Rajamanikandan");
		names.add("Dr.Merdith Grey");
		names.add("Dr.Christina Yang");
		
		//System.out.println(names);
		
		for(String x : names) {
			System.out.println();
			System.out.println(x);


		}
			
	}
}