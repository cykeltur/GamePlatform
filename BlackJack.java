import java.util.Scanner;

public class BlackJack extends CardGame {
  DeckHandler deck;
  // BlackJackPlayer[] players;
  // BlackJackPlayer house;
  BlackJackHand[] positions;
  BlackJackHand house;


  // Create deck from 1-8
  // Deal 2 cards to each position
  // Deal one card to house
  // Resolve each position
  // deal to house, deal on 16, stand on 17.
  //

  BlackJack () {
    Scanner userInput = new Scanner(System.in);
    System.out.println("How many postions at the table?");
    String usrInputStr = userInput.nextLine();
    if (Character.isDigit(usrInputStr.charAt(0))) {
      int noPos = Integer.parseInt(usrInputStr.substring(0,1));
      System.out.println("There will be " + noPos + " at the table." );
      deck = new DeckHandler();
      deck.newDeck(8);
    } else {
      System.out.println("Bad input.");
    }
  }

  @Override
  public void runGame() {
    newGame();
  }

  void newGame() {

  }
  // newGame
  // initialDeal
  // resolvePostition
  // resolveHouse
  // isBust
  // isBlackJack
  // handValue
  //

}
