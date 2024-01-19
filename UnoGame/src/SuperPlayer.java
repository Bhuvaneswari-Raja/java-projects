import java.util.ArrayList;

//this class creates an ArrayList containing 6 elements(7 cards) a player needs at the start of the game 
public class SuperPlayer extends Player{

  ArrayList<String> playerHand = new ArrayList<String>();
  int randomCard;
  
  // Pre: playerHand is empty and randomCard equals 0
  // Post: returns playerHand ArrayList, which contains 6 elements(7 cards) each is random selected from the mainDeck
  public ArrayList<String> getPlayerHand(ArrayList<String> playingDeck) {
    for (int x = 0; x < 7; x++) {

      randomCard = (int) (Math.random() * ((playingDeck.size() - 1) - 0 + 1) + 0);

      playerHand.add(playingDeck.get(randomCard));

      playingDeck.remove(randomCard);

    }
    return playerHand;
  }

}
