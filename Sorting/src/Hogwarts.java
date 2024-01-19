import java.util.ArrayList;
import java.util.Scanner;
public class Hogwarts {
	
	static ArrayList<String> names = new ArrayList<>();

	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) {
			System.out.print("Enter a name(s) (enter done to exit): ");
			String n = scan.next();
			if(n.equalsIgnoreCase("done")) {
				flag = false;
			}
			
			names.add(n);
		}		 
	}
	
	
	public static void sort(ArrayList list)  {
		String temp;
		int index;
		for(int i = 0; i < names.size(); i++) {
			for(int j = i; j < names.size(); j++) {
				
				if(names.get(i).compareTo(names.get(j)) > 0) {
					temp = names.get(i);
					names.add(j, temp);
					temp = names.get(j);
				}
				
			}
		}
	}
	
}
