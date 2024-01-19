import java.util.ArrayList;
import java.util.Comparator;


public class ArrayListsAreFun {

	public static void main(String[] args) {

		ArrayList<String> favCharacters = new ArrayList<>();
		favCharacters.add("Kate");
		favCharacters.add("Devi");
		favCharacters.add("Anthony");
		favCharacters.add("Katniss");
		favCharacters.add("Klaus");
		favCharacters.add("Kim");
		favCharacters.add("Kelly");
		
		System.out.println(favCharacters);
		favCharacters.sort(Comparator.naturalOrder());
		System.out.println(favCharacters);

		
		favCharacters.removeIf(n -> (n.charAt(0) == 'K'));
		System.out.println(favCharacters);


	}

}
