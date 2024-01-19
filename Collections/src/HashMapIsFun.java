import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapIsFun {

	public static void main(String[] args) {
				
		HashMap<String, String> login = new HashMap<>();
		login.put("Kate", "Anthony");
		login.put("Kate", "Edwina");
/*		login.put("James", "Lily");
		login.put("Sirius", "Remus");
		login.put("Percy", "Annabeth"); */
		
		
		for(int i = 0; i < login.size(); i++) {
			System.out.println(login.get(i));
		}
		
		System.out.println();

		System.out.println(login.values());
		


		
		

	}
}
