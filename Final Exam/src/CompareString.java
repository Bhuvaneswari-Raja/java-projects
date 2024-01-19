import java.util.ArrayList;
public class CompareString {
	
	public static void main(String agrs[]) {
		String name = "Pooja";
		//System.out.println(name.compareTo("Nandhini"));
		Cupboard newcupboard = new Cupboard();
		Cupboard newcupboard_2 = new Cupboard();
		//newcupboard_2 = newcupboard;
		
		/*newcupboard.setName("Bookshelf");
		
		System.out.println(newcupboard.getName());
		newcupboard_2.setName("Pooja");
		System.out.println(newcupboard_2.getName());

		System.out.println(newcupboard.equals(newcupboard_2));
		*/
		String[] arr = new String[4];
		int[] nums = new int[3];
		
		arr[0] = "Hello";
		arr[1] = "World";
		arr[2] = "Goodnight";
		arr[3] = "Goodmorning";
		
		for(int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(6);
		arrList.add(652);
		arrList.add(81);
		arrList.add(21);
		System.out.println();
		for(int x = 0; x < arrList.size(); x++) {
			System.out.println(arrList.get(x));
		}


		
			
	}

}
