import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Inventory {

	private List<String> productInventory = new ArrayList<>();
	private Map<String, Double> products= new HashMap<>();
	private double productPrice;
	
	public void setProducts() {
		productInventory.add("Oreo");
		
	}
	
	public void setProductPrice(String item) {
		if(item.equalsIgnoreCase("Coke")) {
			productPrice = 2.00;
		}
		if(item.equalsIgnoreCase("Pepsi")) {
			productPrice = 3.00;
		}
		if(item.equalsIgnoreCase("Sprite")) {
			productPrice = 5.00;
		} 
		
	}
	
	
	
	public Map<String, Double> getProducts() {
		setProducts();
		setProductPrice(productInventory.get(0));
		products.put(productInventory.get(0), productPrice);
		return products;
		
	}
}
