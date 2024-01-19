import java.util.HashMap;
import java.util.ArrayList;

public class HashMapIsFun {

	public static void main(String[] args) {
		
		/*
		HashMap<String, Integer> my_hash = new HashMap<String, Integer>();
		my_hash.put("x", 21);
		my_hash.put("y", 69);
		my_hash.put("z", 18);
		
		System.out.println(my_hash); 
		*/
		
		
		HashMap<String, String> login = new HashMap<String, String>();
		login.put("Lifeisfun", " Life123$");
		login.put("brajam1608", " SiriusBlack");
		login.put("JamesPotter", " WolfStar123$");
		
		
		System.out.println(login);
		System.out.println();

		System.out.println(login.replace("brajam1608", " NatalieTurner"));
		System.out.println(login);
		
		

		
		
		
		

	}
}
