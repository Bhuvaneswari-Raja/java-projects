import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;

public class Bookshelf {

	private Map<String, String> authors = new HashMap<>();
	private Map<Integer, String> allBooks = new HashMap<>();
	private List<String> justBooks = new ArrayList<>();

	public Bookshelf() {
		setBooks();
	}

	public void setCopies(String title) {
		for (int i = 0; i < 5; i++) {
			int rand = (int) (Math.random() * (90000 - 10000) + 10000);
			//TODO: conditional
			allBooks.put(rand, title);
		}

		// authors.put("HarryPotter", "Rowling");

	}

	public void setBooks() {
		justBooks.add("HarryPotter1");
		justBooks.add("HarryPotter2");
		justBooks.add("HarryPotter3");
		justBooks.add("HarryPotter4");
		justBooks.add("HarryPotter5");
		justBooks.add("HarryPotter6");
		justBooks.add("HarryPotter7");

		for (String x : justBooks) {
			setCopies(x);
		}
	}

	public Map<Integer, String> inventory() {
		return allBooks;
	}

	public void addItem(String title, String author) {
		int rand = (int) (Math.random() * (90000 - 10000) + 10000);
		allBooks.put(rand, title);
		if (!authors.containsKey(title) && !justBooks.contains(author)) {
			authors.put(title, author);
			justBooks.add(title);
			setCopies(title);
		}

	}

	public void removeItem(String title) {
		allBooks.remove(title);
		Iterator<Entry<Integer, String>> iterate = allBooks.entrySet().iterator();
		while (iterate.hasNext()) {
			Map.Entry<Integer, String> singleBook = iterate.next();
			if (singleBook.getValue() == title) {
				allBooks.remove(singleBook.getKey());
				break;
			}
		}
	}

	public String getAuthor(String title) {
		String author;

		if (authors.containsKey(title)) {
			author = authors.get(title);
		} else {
			author = null;
		}

		return author;
	}

}
