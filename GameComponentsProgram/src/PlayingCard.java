
public class PlayingCard implements GamePiece {

	String suit;
	String number;

	// sets the card to a number and suit indicated
	public void setCards(String n, String s) {
		suit = s;
		number = n;
	}

	// sets the card to a random number and suit and returns the card
	public String getRandom() {
		int randomSuit = (int) ((Math.random() * (4 - 1)) + 1);
		int randomNum = (int) ((Math.random() * (14 - 2)) + 2);

		if (randomSuit == 1) {
			suit = "Spades";
		}
		if (randomSuit == 2) {
			suit = "Hearts";
		}
		if (randomSuit == 3) {
			suit = "Diamonds";
		}
		if (randomSuit == 4) {
			suit = "Clubs";
		}

		number = String.valueOf(randomNum);

		if (number == "14") {
			number = "Ace";
		}

		return number + suit;

	}

	// sets the card to the “Ace of Spades”
	public void setDefault() {
		suit = "Spades";
		number = "Ace";
	}

	// returns the card’s number as a value between 2 and 14 (representing 2 to Ace)
	public int getNumeric() {

		if (number == "Ace") {
			number = "14";
		}
		return Integer.parseInt(number);
	}

	// returns the card as a string
	public String toString() {
		return number + " of " + suit;
	}

}