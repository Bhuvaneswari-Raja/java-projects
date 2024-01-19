
public class SimpleDotCome {

	int[] locationCells;
	int numOfHits = 0;

	public void setCellLocation(int[] cellLocations) {
		locationCells = cellLocations;
	}
	
	public String checkYourself(String guess) {

		int userGuess = Integer.parseInt(guess);
		String result = "miss";

		for (int cell : locationCells) {

			if (userGuess == cell) {
				
				result =  "hit";
				numOfHits++;
				break;
			}
		}
		
		if(numOfHits == locationCells.length) {
			result =  "kill";
		}
		
		return result;
	}

	

}
