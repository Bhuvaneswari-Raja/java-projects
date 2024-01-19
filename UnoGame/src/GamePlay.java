import java.util.ArrayList;
import java.util.Collections;

public class GamePlay {

	ArrayList<String> usedCards = new ArrayList<String>();
	String currentCard;
	int rand;
	int switichingPlayer;
	boolean checkingList;
	boolean winner;

	//Pre: 
	//Post:returns the opening card of the game
	public String setOpenCard(ArrayList<String> playingDeck) {
		rand = (int) (Math.random() * ((playingDeck.size() - 1) - 0 + 1) + 0);
		currentCard = playingDeck.remove(rand);
		
		//makes sure that the opening card will not be a reverse or skip card
		while (currentCard.trim().charAt(1) == 'S' || currentCard.trim().charAt(1) == 'R') {
			playingDeck.add(currentCard);
			rand = (int) (Math.random() * ((playingDeck.size() - 1) - 0 + 1) + 0);
			currentCard = playingDeck.remove(rand);
		}
		return currentCard;

	}
	
	//Pre:
	//Post: sets the new open card, add or removes card from player's hand
	public void playerHasCard(String card, ArrayList<String> playingDeck, ArrayList<String> playerHand,
			int playerTurn) {

		for (int i = 0; i < playerHand.size(); i++) {

			if (card.equals(playerHand.get(i))) {
				checkingList = true;
				break;
			} else {
				checkingList = false;
			}
		}


		if (checkingList) {
			if (currentCard.equals(card) || currentCard.charAt(0) == card.trim().charAt(0)
					|| currentCard.charAt(1) == card.trim().charAt(1)) {

				if (card.trim().charAt(1) == 'S' || card.trim().charAt(1) == 'R') {
					switichingPlayer = playerTurn;
				} else {
					checkAndSwitchPlayer(playerTurn);

				}

				playerHand.remove(card);
				currentCard = card;
				usedCards.add(card);
			}
		}

		if (card.equalsIgnoreCase("no")) {
			rand = (int) (Math.random() * ((playingDeck.size() - 1) - 0 + 1) + 0);
			playerHand.add(playingDeck.remove(rand));
			
			checkAndSwitchPlayer(playerTurn);
			
		}
	}
	
	//Post: checks and sets player's turn
	public void checkAndSwitchPlayer(int playerTurn) {
		if (playerTurn == 1) {
			switichingPlayer = 2;
		} else {
			switichingPlayer = 1;

		}
	}
	
	//Post: returns player's turn
	public int switchPlayer() {
		return switichingPlayer;
	}
	
	//Post:returns open card
	public String openCard() {
		return currentCard;
	}
	
	//Post: checks if player has called uno and if the player has zero cards left. t
	public boolean determineWinner(ArrayList<String> playerHand, boolean unoCalled) {
		if (playerHand.size() < 1 && unoCalled) {
			winner = true;
		}
		return unoCalled;

	}
	
	//sorts all the cards in the usedCards list and adds them to the mainDeck
	public ArrayList<String> sortUsedCards(ArrayList<String> mainDeck) {

		Collections.sort(usedCards);
		for (int x = 0; x < usedCards.size(); x++) {
			mainDeck.add(usedCards.remove(x));
		}
		return mainDeck;
	}

}
