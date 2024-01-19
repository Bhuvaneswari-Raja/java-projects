import java.util.Map;
import java.util.Set;
import java.util.HashMap;


public class Transaction {

	private double customerMoney;
	private double productPrice;
	private Set<String> item;
	private Inventory listOfProducts = new Inventory(); 
	Map<String, Double> product = new HashMap<>();

	
	public Transaction(double money) {
		addMoney(money);
	}
	
	
	public Set<String> getProduct() {
		product = listOfProducts.getProducts();		
		item = product.keySet();
		return item;
		
	}
	
	public double getProductPrice() {
		productPrice = product.get(0);
		return productPrice;

	}
	
	
	public void addMoney(double m) {
		customerMoney = m;
	}
	
	
}
