import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestBook {
	
	static Map<String, String> bookAndAuthor = new HashMap<>();	
	static Map<Integer, String> bookDetails = new HashMap<>();
	public static void main(String[] args) {	
		
		
		
		Map<Integer, String> testMap = new HashMap<>();	
		
		testMap.put(10, "Fangirl");
		testMap.put(20, "Fangirl");
		testMap.put(30, "Fangirl"); 
		testMap.put(40, "Fangirl");
		testMap.put(50, "Fangirl");
		testMap.put(60, "Fangirl");
		testMap.put(70, "ChainOfGold");
		testMap.put(80, "HarryPotter");
		testMap.put(90, "PrecyJackson");
		
		Iterator<Entry<Integer, String>> iterate = testMap.entrySet().iterator();

		Object[] temp = new Object[2];

		while(iterate.hasNext()) {
			Map.Entry<Integer, String> oneCopy = iterate.next();
			//System.out.println(oneCopy.getKey() + " = " + oneCopy.getValue());
			
			if(oneCopy.getValue() == "Fangirl") {
				temp[0] = oneCopy.getValue();
				temp[1] = oneCopy.getKey();
				testMap.remove(oneCopy.getKey());
				break;
				
			}
			System.out.println("This list does not contain this value");
		}
		
		System.out.println(temp[0] + " = " + temp[1]);
		

		
				
	}
	

	

}
