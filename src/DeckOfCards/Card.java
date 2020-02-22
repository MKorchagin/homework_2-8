package DeckOfCards;

public class Card {
    private int rank;
    private int suit;


    public Card( int rank, int suit){
            this.rank = rank;
            this.suit = suit;
        }

        public String toString () {
            String[] rankValues = {null,
                    "Ace",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "Jack",
                    "Queen",
                    "King"};
            String[] suitValues = {
                    "Spades",
                    "Clubs",
                    "Diamonds",
                    "Hearts"};

            String card = rankValues[this.rank] + " of " + suitValues[this.suit];
            return card;
        }
        public int getRank () {return rank;}
        public int getSuit () {return suit;}
    }
