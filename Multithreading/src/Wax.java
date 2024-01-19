import java.util.ArrayList;

public class Wax extends Thread {	
	
	@Override
	public void run() {
		ArrayList<String> bridgertons = new ArrayList<String>();
		bridgertons.add("Anthony");
		bridgertons.add("Ben");
		bridgertons.add("Colin");
		bridgertons.add("Daphane");
		bridgertons.add("Elosie");
		bridgertons.add("Francesca");
		bridgertons.add("Gregory");
		bridgertons.add("Hyacinth");
		
		for(String x : bridgertons) {
			System.out.println("--------" + x + "--------");
		}
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
	}	

}

