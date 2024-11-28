video poker homework explanation 

//steps for how to play the game

1. run the program using $ java PokerTest
2. you start with a bankroll of 10,000 chips
3. for each round:
   - input a bet amount (1-5 chips) or enter 0 to quit the program
   - you will receive 5 random cards
   - you can choose which cards to discard by entering their positions (1-5) and separating the positions by spaces
   - you can enter 0 to keep of your given cards
   - the game will then give you new cards if you have selected to do so and will pay you according to the outcome

//program design

classes:
- Game: main logic controller
- Player: manages player's cards, bankroll, and betting values
- Card: for individual cards with suit options 1-4 and rank options 1-13
- Deck: for deck shuffling and dealing

//implementation

comparing cards:  cards are compared first by rank, then by suit to simplify checking for straights and other hand combinations
evaluating hand: created separate methods for each poker hand type and used helper methods (getCounts, containsCount) to reduce code duplication
testing: for easy testing of specific hand scenarios
errors: checks for valid bet amounts (1-5 chips, must have sufficient bankroll) and prevents dealing an empty deck

//payouts (given)

royal flush: 250x
straight flush: 50x
four of a kind: 25x
full house: 6x
flush: 5x
straight: 4x
three of a kind: 3x
two pairs: 2x
one pair: 1x
no pairs: 0x

//design 

The Game class acts as a controller, coordinating between the Player, Deck, and hand evaluation logic. My design allows for easy testing and simple code. I structured the hand evaluation hierarchically to ensure correct payouts for hands that might qualify for multiple categories.