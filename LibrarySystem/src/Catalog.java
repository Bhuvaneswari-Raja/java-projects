import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;;

public class Catalog {
	
    private Bookshelf books;
    private Map<Integer, String> items = new HashMap<>();
     
    
    public Catalog() {
        books = new Bookshelf();
        items = books.inventory();
    }

    public void addItem(String title, String author) {
    	books.addItem(title, author);
    }

    public void removeItem(String title) {
    	books.removeItem(title);
    }

      
    public Object[] getItem(String title) {
    	Iterator<Entry<Integer, String>> iterate = items.entrySet().iterator();
    	while(iterate.hasNext()) {
			Map.Entry<Integer, String> singleBook = iterate.next();
			if(singleBook.getValue() == title) {
        		Object[] temp = {singleBook.getValue(), books.getAuthor(title), singleBook.getKey()};
        		return temp;
			}
		}
		
		return null;
    	
    }
    
    public void getAuthor(String title) {
    	books.getAuthor(title);
    }
    
    public void returnItem(int id, String title) {
    	items.put(id, title);
    }
 
   
       
}


