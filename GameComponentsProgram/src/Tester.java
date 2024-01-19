
class Tester {
	
	public static void main(String[] args) {
	
		Dice dice = new Dice();
		PlayingCard card = new PlayingCard();

		dice.setDie(5);
		System.out.println("Set Dice: "+ dice);
		dice.getRandom();
		System.out.println("Random Dice: "+ dice);
		
		System.out.println("------------------------------");
		
		card.setCards("Ace", "Spades");
		System.out.println("Set Card: " + card);
		card.getRandom();
		System.out.println("Random Card: " + card);
		
	}
	
	
	
	
}