
public class CombinedTable {
	
	private static SingleTable t1;
	private static SingleTable t2;
	//private static  SingleTable t3;
	
	public boolean canSeat(int n) {
		if(t1.getNumSeats() + t2.getNumSeats() - 2 >= n ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static double getDesirability() {
		if(t1.getHeight() == t2.getHeight()) {
			return (t1.getViewQuality() + t2.getViewQuality()) / 2;
		} 
		else {
			return (t1.getViewQuality() + t2.getViewQuality()) / 2 - 10;

		}
	}
	
	
}