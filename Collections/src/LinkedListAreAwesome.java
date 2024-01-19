import java.util.LinkedList;


public class LinkedListAreAwesome {

	public static void main(String[] args) {
		LinkedList<String> fam = new LinkedList<>();
		
		fam.add("Dad");
		fam.add("Mom");
		fam.add("Sister");
		fam.add("Brother");
		fam.add("Grandma");
		fam.add("Grandpa");
		fam.add("Uncle");
		fam.add("Aunt");
		fam.add("Cousin");
		
		System.out.println(fam.element());
		System.out.println(fam.indexOf("Uncle"));
		
		System.out.println("--------LinkedList to Array----------");
		String[] myArr = new String[fam.size()];
		fam.toArray(myArr);
		for(int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
			
		}

	}

}
