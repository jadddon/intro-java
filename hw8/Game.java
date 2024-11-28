package hw8;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	private Player p;
	private Deck cards;
    private Scanner scanner;
	// you'll probably need some more here
	
	
	public Game(String[] testHand){
		// This constructor is to help test your code.
		// use the contents of testHand to make a hand for the player
		// use the following encoding for cards
		    // c = clubs
		    // d = diamonds
		    // h = hearts
		    // s = spades
		    // 1-13 correspond to ace-king
		// example: s1 = ace of spades
		// example: testhand = {s1, s13, s12, s11, s10} = royal flush

        p = new Player();
        cards = new Deck();

        for (String cardStr : testHand) {
            int suit = 0;
            char suitChar = cardStr.charAt(0);
            int rank = Integer.parseInt(cardStr.substring(1));

            switch(suitChar){
                case 'c': suit = 1; break;
                case 'd': suit = 2; break;
                case 'h': suit = 3; break;
                case 's': suit = 4; break;
            }
            p.addCard(new Card(suit,rank));
        }
	}
	
	public Game(){
		// This no-argument constructor is to actually play a normal game
        p = new Player();
        cards = new Deck();
        scanner = new Scanner(System.in);
	}
	
	public void play(){
		// this method should play the game	
        while (p.getBankroll() > 0){
            System.out.println("\nBankroll: "+ p.getBankroll());
            System.out.println("Enter bet amount (1-5) or 0 to quit: ");
            int betAmount = scanner.nextInt();

            if (betAmount ==0) break;
            if (betAmount < 1 || betAmount > 5 || betAmount > p.getBankroll()){
                System.out.println("Invalid bet amount!");
                continue;
            }

            p.bets(betAmount);
            cards.shuffle(); // from deck class
            p.clearHand();

            for (int i = 0; i < 5; i++){
                p.addCard(cards.deal());
            }

            if (scanner!=null){
                System.out.println("Your hand: " + p.getHand());
                System.out.println("Enter positions to discard (1-5) separated by spaces, or 0 to keep all: ");
                scanner.nextLine();
                String input = scanner.nextLine();

                if(!input.equals("0")){
                    String[] discards = input.split(" ");
                    ArrayList<Card> currentHand = new ArrayList<>(p.getHand()); 
                    for (String pos : discards) {
                        int index = Integer.parseInt(pos) - 1; 
                        if (index >= 0 && index < 5) { 
                            p.removeCard(currentHand.get(index)); 
                            p.addCard(cards.deal()); // deals new card
                        }
                    }
                }
            }

            String result = checkHand(p.getHand()); 
            System.out.println("Final hand: " + p.getHand()); // print result
            System.out.println("Result: " + result); // print outcome
            
            double odds = getOdds(result); 
            if (odds > 0) { 
                p.winnings(odds); 
                System.out.println("You won: " + (odds * betAmount)); //print winnings
            }
        }
	}
	
	public String checkHand(ArrayList<Card> hand){
		// this method should take an ArrayList of cards as input and then determine what evaluates to and return that as a String
		if (isOnePair(hand)) return "One Pair";
        if (isTwoPair(hand)) return "Two Pairs";
        if (isThreeOfAKind(hand)) return "Three of a Kind";
        if (isStraight(hand)) return "Straight";
        if (isFlush(hand)) return "Flush";
        if (isFullHouse(hand)) return "Full House";
        if (isFourOfAKind(hand)) return "Four of a Kind";
        if (isStraightFlush(hand)) return "Straight Flush";
        if (isRoyalFlush(hand)) return "Royal Flush";
        return "No Pair";
	}
	
	
	// you will likely want many more methods here per discussion in class

    private double getOdds(String hand) {
        switch (hand) {
            case "One Pair": return 1;
            case "Two Pairs": return 2;
            case "Three of a Kind": return 3;
            case "Straight": return 4;
            case "Flush": return 5;
            case "Full House": return 6;
            case "Four of a Kind": return 25;
            case "Straight Flush": return 50;
            case "Royal Flush": return 250;
            default: return 0;
        }
    }

    private boolean isRoyalFlush(ArrayList<Card> hand) {
        if (!isStraightFlush(hand)) return false;
        ArrayList<Card> sortedHand = new ArrayList<>(hand);
        sortedHand.sort(null);
        return sortedHand.get(0).compareTo(new Card(1, 10)) == 0 &&
               sortedHand.get(1).compareTo(new Card(1, 11)) == 0 &&
               sortedHand.get(2).compareTo(new Card(1, 12)) == 0 &&
               sortedHand.get(3).compareTo(new Card(1, 13)) == 0 &&
               sortedHand.get(4).compareTo(new Card(1, 1)) == 0;
    }

    private boolean isStraightFlush(ArrayList<Card> hand) {
        return isFlush(hand) && isStraight(hand); 
    }

    private boolean isFourOfAKind(ArrayList<Card> hand) {
        int[] counts = getCounts(hand); 
        return containsCount(counts, 4); 
    }

    private boolean isFullHouse(ArrayList<Card> hand) {
        int[] counts = getCounts(hand);
        return containsCount(counts, 3) && containsCount(counts, 2); 
    }

    private boolean isFlush(ArrayList<Card> hand) {
        int firstSuit = hand.get(0).compareTo(new Card(1, 1)) % 4; 
        for (Card c : hand) {
            if (c.compareTo(new Card(1, 1)) % 4 != firstSuit) {
                return false;
            }
        }
        return true;
    }

    private boolean isStraight(ArrayList<Card> hand) {
        ArrayList<Card> sortedHand = new ArrayList<>(hand); 
        sortedHand.sort(null);
        
        // Check for Ace-low straight (A,2,3,4,5)
        if (sortedHand.get(4).compareTo(new Card(1, 1)) == 0 &&
            sortedHand.get(0).compareTo(new Card(1, 2)) == 0 &&
            sortedHand.get(1).compareTo(new Card(1, 3)) == 0 &&
            sortedHand.get(2).compareTo(new Card(1, 4)) == 0 &&
            sortedHand.get(3).compareTo(new Card(1, 5)) == 0) {
            return true;
        }
        
        // Check normal straight
        int firstRank = sortedHand.get(0).compareTo(new Card(1, 1)); 
        for (int i = 1; i < 5; i++) {
            if (sortedHand.get(i).compareTo(new Card(1, 1)) != firstRank + i) {
                return false; 
            }
        }
        return true; 
    }

    private boolean isThreeOfAKind(ArrayList<Card> hand) {
        int[] counts = getCounts(hand); 
        return containsCount(counts, 3); 
    }

    private boolean isTwoPair(ArrayList<Card> hand) {
        int[] counts = getCounts(hand); 
        int pairs = 0; 
        for (int count : counts) {
            if (count == 2) pairs++; 
        }
        return pairs == 2; 
    }

    private boolean isOnePair(ArrayList<Card> hand) {
        int[] counts = getCounts(hand); 
        return containsCount(counts, 2); 
    }
    
    private int[] getCounts(ArrayList<Card> hand) {
        int[] counts = new int[14];  
        for (int i = 0; i < hand.size(); i++) {
            counts[hand.get(i).compareTo(new Card(1, 1))]++;
        }
        return counts; 
    }
    
    private boolean containsCount(int[] counts, int target) {
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == target) return true; 
        }
        return false; 
    }

}






