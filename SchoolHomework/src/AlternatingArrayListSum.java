import java.util.ArrayList;
import java.util.Scanner;

public class AlternatingArrayListSum {

	public static void main(String[] args) {
		ArrayList<Integer> data = create();
		System.out.println();
		System.out.println("Total:" + compute(data));
	}

	public static ArrayList<Integer> create () {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> data = new ArrayList<Integer>();
		int num;
		
		 do{
			 System.out.print("Enter an integer(enter number zero or smaller to stop): ");
			 num = scan.nextInt();
			 
			 if(num > 0) {
				 data.add(num);
			 }
			 
		 }while(num > 0);		
		
		return data;
	}
	
	public static int compute(ArrayList<Integer> data) {
		int total = 0;
		
		for(int i = 0; i < data.size(); i++){
			
			if(i == 0 || i%2 != 0) {
				total =total + data.get(i);
			}
			else{
				total = total - data.get(i);
			}
			
		}
			return total;
	  }
		
	


}
