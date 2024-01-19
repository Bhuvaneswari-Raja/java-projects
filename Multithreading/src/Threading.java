import java.util.ArrayList;

public class Threading extends Thread {	
	
	@Override
	public void run() {
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Chennai");
		cities.add("Madurai");
		cities.add("New York");
		cities.add("London");
		cities.add("Paris");
		
		for(String x : cities) {
			System.out.println(x);
		}
		
		try {
			Thread.sleep(90000);
		} catch (InterruptedException e) {
		}
	}	

}
