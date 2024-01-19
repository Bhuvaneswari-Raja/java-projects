package storyTemplate;

public class PercyJackson extends Story {

	@Override
	public void storyName() {
		System.out.println();
		System.out.println("Title: " + "\n" +"Percy Jackson and The Lightning Thief");
		System.out.println("--------------------------------------------------");
	}

	@Override
	public void creator() {
		System.out.println("Author:" + "\n " + "Rick Riorand");
		System.out.println("--------------------------------------------------");
	}

	@Override
	public void protagonist() {
		System.out.println("Protagonist: " + "\n" + "Percy Jackcson" + "\n" + "Annabeth Chase");
		System.out.println("--------------------------------------------------");
	}

	@Override
	public void antagonist() {
		System.out.println("Antagonist: " + "\n" + "Chronos" + "\n" + "The Titians");
		System.out.println("--------------------------------------------------");
	}

	@Override
	public void setting() {
		System.out.println("Setting: " + "\n" + "New York");
		System.out.println("--------------------------------------------------");
	}
	
	public void next() {
		System.out.println("Next in series: " + "\n" + "Percy Jackson and The Sea of Monsters" + "\n" + "Percy Jackson and The Titan's Curse" + "\n" + "Percy Jackson and The Battle of the Labyrinth" + "\n" + "Percy Jackson and The Last Olympian");
		System.out.println("--------------------------------------------------");
	}

}
