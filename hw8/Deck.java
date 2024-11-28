package hw8a;

public class Deck {
	
	private Card[] cards;
	private int top; // the index of the top of the deck

	// add more instance variables if needed
	
	public Deck(){

        cards = new Card[52];
        top = 0;

	    int index = 0;
        for (int suit = 1; suit <= 4; suit++){
            for(int rank = 1; rank <=13; rank++){
                cards[index++] = new Card(suit, rank);
            }
        }
	}
	
	public void shuffle(){
		for (int i = cards.length - 1; i>0; i--){
            int j = (int)(Math.random()*(i+1));
            Card x = cards[j];
            cards[j] = cards[i];
            cards[i] = x;
        }
        top = 0;
	}
	
	public Card deal(){
		// deal the top card in the deck
        if (top >= cards.length){
            return null;
        }
        return cards[top++];
	}
	
	// add more methods here if needed

}
