//import java.util.ArrayList;
public class MultipleChoice {
	public static void main(String[] args) {
		
		String[][] magic = { {"James", "Sirius", "Remus", "Peter"}, {"Harry", "Ron", "Hermione"} };
		
		for(int row = 0; row < magic.length; row++) {
			for(int column = 0; column < magic[row].length; column++) {
				System.out.println(magic[row][column]);
			}
			
			System.out.println("*-*-*-*-*-*-*-*-*-*-*");
		}
		
	}
	
}
