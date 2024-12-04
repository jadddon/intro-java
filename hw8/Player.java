package hw8;

import java.util.ArrayList;

public class Player {
	
	private ArrayList<Card> hand; // the player's cards
	private double bankroll;
        private double bet;

	// you may choose to use more instance variables
		
	public Player(){		
	    // create a player here
        hand = new ArrayList<>(); //empty hand
        bankroll = 10000; //starting amount
        bet = 0;
	}

	public void addCard(Card c){
	    // add the card c to the player's hand
        hand.add(c);
	}

	public void removeCard(Card c){
	    // remove the card c from the player's hand 
        hand.remove(c);
    }
		
    public void bets(double amt){
        // player makes a bet
        if(amt >= 1 && amt <= 5 && amt <= bankroll){
            bet = amt;
            bankroll -= amt;
        }
    }

    public void winnings(double odds){
        //	adjust bankroll if player wins
        bankroll += (odds*bet);
    }

    public double getBankroll(){
        // return current balance of bankroll
        return bankroll;
    }

    // you may wish to use more methods here

    public ArrayList<Card> getHand(){
        return hand;
    }

    public void clearHand(){
        hand.clear();
    }
}


