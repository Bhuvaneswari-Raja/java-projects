package storyTemplate;

public class HarryPotter extends Story {

	@Override
	public void storyName() {
		System.out.println();
		System.out.println("Title:"+ "\n" +"Harry Potter and the Philosopher's Stone");
		System.out.println("--------------------------------------------------");

	}
	
	@Override
	public void creator() {
		System.out.println("Author:"+ "\n" + "J. K. Rowling");
		System.out.println("--------------------------------------------------");

	}

	@Override
	public void protagonist() {
		System.out.println("Protagonist: "+ "\n" + "Harry Potter" + "\n" +"Ron Weasley" + "\n" + "Hermione Granger");
		System.out.println("--------------------------------------------------");
		
	}

	@Override
	public void antagonist() {
		System.out.println("Antagonist: " + "\n" + "Lord Voldemort ");
		System.out.println("--------------------------------------------------");

	}

	@Override
	public void setting() {
		System.out.println("Setting: " + "\n" + "1991 Wizarding World ");
		System.out.println("--------------------------------------------------");

	}
	
	public static void next() {
		System.out.println("Next in the series: " + "\n" + "Harry Potter and the Chamber of Secrets" + "\n" + "Harry Potter and the Prisoner of Azkaban" + "\n" + "Harry Potter and the Goblet of Fire "+ "\n"+ "Harry Potter and the Order of the Phoenix" + "\n" + "Harry Potter and the Half-Blood Prince"+ "\n" + "Harry Potter and the Deathly Hallows");
	}
}
