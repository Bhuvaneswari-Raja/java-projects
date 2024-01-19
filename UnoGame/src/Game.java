import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    UnoDeck deckOfCards = new UnoDeck();
    ArrayList<String> mainDeck = deckOfCards.getDeck();

    SuperPlayer playerOne = new SuperPlayer();
    ArrayList<String> playerOne_Hand = playerOne.getPlayerHand(mainDeck);

    SuperPlayer playerTwo = new SuperPlayer();
    ArrayList<String> playerTwo_Hand = playerTwo.getPlayerHand(mainDeck);

    GamePlay startGame = new GamePlay();
    
    //sets starting card of the game
    String openCard = startGame.setOpenCard(mainDeck);
    //set to 1 so that player One goes first
    int playerTurn = 1;
    boolean winner = false;
    boolean uno;
    boolean unoCall = true;
    boolean unoCallSize = false;

    System.out.println();
    System.out.print("Enter Player One's name: ");
    String playerOneName = scan.next();
    System.out.print("Enter Player Two's name: ");
    String playerTwoName = scan.next();
    System.out.println();
    System.out.println();
    System.out.println("---------------Guide---------------");
    System.out.println("R = Red \nB = Blue \nG = Green \nY = Yellow");
    System.out.println("Sk = Skip card \nRv = Reverse card");
    System.out.println("There are no Wild Cards or Plus 2 cards");
    System.out.println();
    System.out.println(playerOneName + " goes first!");

    do {

      if (playerTurn == 1) {
        System.out.println();
        System.out.println("--------------- " + playerOneName + " should be playing --------------- ");
        System.out.println();

        System.out.println(playerOneName + "\'s cards " + playerOne_Hand);
        System.out.println("Card last played: " + openCard);
        //collects the card player One is playing 
        System.out.print("Enter your card (enter no if you don't have any cards) (enter stop to exit the game): ");
        openCard = scan.next();
        if(openCard.equalsIgnoreCase("stop")) {
        	System.exit(-1);
        }
        
        //Only if the size is 2
        if(playerOne_Hand.size() == 2 ) {
        	unoCallSize = true;
        } else {
        	unoCallSize = false;
        }
        
        startGame.playerHasCard(openCard, mainDeck, playerOne_Hand, playerTurn);

        if (playerOne_Hand.size() == 1 && unoCallSize) {
        	System.out.print("Uno true or false: ");
        	uno = scan.nextBoolean();
        	if (uno) {
                System.out.println( playerOneName +" has called Uno!");
                unoCall = true;
            }
        	

        }
        
        if (unoCall) {
            if (playerOne_Hand.size() == 0) {
                winner = startGame.determineWinner(playerOne_Hand, unoCall);
                System.out.println( playerOneName +" IS THE WINNER!");

                System.out.println("Game over");
                System.exit(0);
            }        	
        }
        
       
//        startGame.playerHasCard(openCard, mainDeck, playerOne_Hand, playerTurn);
        openCard = startGame.openCard();
        playerTurn = startGame.switchPlayer();
        
       

      }

      if (playerTurn == 2) {
        System.out.println();
        System.out.println("--------------- " + playerTwoName + " should be playing ---------------");
        System.out.println();

        System.out.println(playerTwoName + "\'s cards " + playerTwo_Hand);
        System.out.println("Card last played: " + openCard);
        System.out.print("Enter your card (enter no if you don't have any cards) (enter stop to exit the game): ");
        openCard = scan.next();
        if(openCard.equalsIgnoreCase("stop")) {
        	System.exit(-1);
        }

        //Only if the size is 2
        if(playerTwo_Hand.size() == 2 ) {
        	unoCallSize = true;
        } else {
        	unoCallSize = false;
        }
        
        startGame.playerHasCard(openCard, mainDeck, playerTwo_Hand, playerTurn);

        if (playerTwo_Hand.size() == 1 && unoCallSize) {
        	System.out.print("Uno true or false: ");
        	uno = scan.nextBoolean();
        	if (uno) {
                System.out.println( playerTwoName +" has called Uno!");
                unoCall = true;
            }
        	
        }
        
        if (unoCall) {
            if (playerTwo_Hand.size() == 0) {
                winner = startGame.determineWinner(playerTwo_Hand, unoCall);
                System.out.println( playerTwoName +" IS THE WINNER!");
                System.out.println("Game over");
                System.exit(0);
            }        	
        }
        
       
//        startGame.playerHasCard(openCard, mainDeck, playerOne_Hand, playerTurn);
        openCard = startGame.openCard();
        playerTurn = startGame.switchPlayer();
        
      }
        System.out.println();
      

      if (mainDeck.size() <= 10) {
        startGame.sortUsedCards(mainDeck);
      }

    } while(winner==false);

}
}
