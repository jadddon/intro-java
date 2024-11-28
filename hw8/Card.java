package hw8a;

public class Card implements Comparable<Card>{
	
	private int suit; // use integers 1-4 to encode the suit
	private int rank; // use integers 1-13 to encode the rank
	
	public Card(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
	}
	
	public int compareTo(Card c){
		// use this method to compare cards so they may be easily sorted
        if (this.rank != c.rank){
            return this.rank - c.rank;
        }
        return this.suit - c.suit;
	}
	
	public String toString(){
		// use this method to easily print a Card object
        String suitStr = "";
        switch(suit){
            case 1: suitStr = " of clubs"; 
                break;
            case 2: suitStr = " of diamonds"; 
                break;
            case 3: suitStr = " of hearts"; 
                break;
            case 4: suitStr = " of spades"; 
                break;
        }
        return suitStr + rank;
	}

}
