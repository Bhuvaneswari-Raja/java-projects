import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Librarian librarian;
		Member member = new Member();
		Receipt receipt = new Receipt();
		List<Object[]> newBooks = new ArrayList<>();
		List<Object[]> oldBooks = new ArrayList<>();

		System.out.println("---------- Welcome to the Library ----------");
		System.out.print("Enter username: ");
		String username = scan.next();

		System.out.print("Enter password: ");
		String password = scan.next();

		do {
			librarian = new Librarian();
			String decision = scan.next();

			if (decision.equals("1")) {
				System.out.print("Book Title? ");
				String book = scan.next();
				newBooks.add(librarian.getItem(book));
				System.out.print("1 or 2? (enter exit to stop) ");
				decision = scan.next();

			} else if (decision.equals("2")) {
				librarian.returnItem(oldBooks);
				System.out.print("1 or 2? (enter exit to stop) ");
				decision = scan.next();

			} else if (decision.equalsIgnoreCase("exit")) {
				System.out.println("Come again soon! ");
				System.exit(0);
			}

		} while (member.checkMember(username));

		do {
			System.out.println("Create new account");
			System.out.print("Enter username: ");
			username = scan.next();
			System.out.print("Enter password: ");
			password = scan.next();
			
			librarian = new Librarian();
			String decision = scan.next();

			if (decision.equals("1")) {
				System.out.print("Book Title? ");
				String book = scan.next();
				newBooks.add(librarian.getItem(book));
				System.out.print("1 or 2? (enter exit to stop) ");
				decision = scan.next();

			} else if (decision.equals("2")) {
				librarian.returnItem(oldBooks);
				System.out.print("1 or 2? (enter exit to stop) ");
				decision = scan.next();

			} else if (decision.equalsIgnoreCase("exit")) {
				System.out.println("Come again soon! ");
				System.exit(0);
			}
			
		} while(!member.checkMember(username));		
		

	}

}
