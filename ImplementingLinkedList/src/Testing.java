import java.util.Scanner;
public class Testing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList new_list = new LinkedList();
		
		String randNum;
		
		for(int i = 0; i < 5; i++) {
			randNum = String.valueOf((int)((Math.random() * (100 - 0)) + 0));
			new_list.add(randNum);
			
		}
		
		new_list.remove(new_list.size() - 1);
		
		System.out.println("------- LinkedList -------");
		for(int i = 0; i <= new_list.size(); i++) {
			System.out.println(new_list.get(i));;
		}
		
		System.out.println();
		new_list.insert(500, new_list.size() - 1);
		//System.out.println(new_list.get(new_list.size() - 1));

		new_list.remove(new_list.size() -1 );
		//System.out.println(new_list.get(new_list.size() - 1));
		
		System.out.println("LinkedList size: " + new_list.size());
		
		System.out.println("----- Search -----");
		System.out.print("Enter a value to search: ");
		int searchNum = scan.nextInt();
		System.out.println(new_list.search(String.valueOf(searchNum)));
		
		System.out.println("----- Sort -----");
		new_list.sort();
		for(int i = 0; i <= new_list.size(); i++) {
			System.out.println(new_list.get(i));;
		}
		
		

	}

}
