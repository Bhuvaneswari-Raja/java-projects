import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Librarian {
	
	private Catalog catalog = new Catalog();;
	//private Member member = new Member(null, null);
    private Map<Integer, String> members = new HashMap<>();
    

    public Librarian() {
    	openingMessage();
    }

    public void addItem(String title, String author) {
        catalog.addItem(title, author);
    }

    public void removeItem(String item) {
        catalog.removeItem(item);
    }
    
    public Object[] getItem(String itemName) {
    	return catalog.getItem(itemName);
    	
    }
    
    public void returnItem(List<Object[]> returnedBooks) {
    	for(int i = 0; i < returnedBooks.size(); i++) {
			Object[] temp = returnedBooks.get(i);
			String title = temp[0].toString();
			int bookId = Integer.parseInt(temp[2].toString());
	    	catalog.returnItem(bookId, title);
    	}
    	

    }
    
    public void openingMessage() {
    	System.out.println("1- Checkout book \n 2- Return book");
    }
    
    
    
  
}
