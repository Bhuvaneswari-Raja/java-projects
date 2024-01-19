
public class Dice implements GamePiece {
	int side;

	// puts the die on the side indicated
	public void setDie(int side) {
		this.side = side;
	}

	// sets the side to a random value and returns the side as a String between 1 and 6
	public String getRandom() {
		int randomSide = (int) ((Math.random() * (6 - 1)) + 1);
		side = randomSide;
		return String.valueOf(side);
	}

	// puts the die on side 1
	public void setDefault() {
		side = 1;
	}

	// returns the side as an integer
	public int getNumeric() {
		return side;
	}

	// returns the die’s side as a string
	public String toString() {
		return String.valueOf(side);
	}

}