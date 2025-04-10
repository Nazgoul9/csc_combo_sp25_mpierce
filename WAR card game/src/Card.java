
public class Card {
	private final int suit;
	private final int rank;
	private static final String [] suits = {"diamonds","clubs","hearts","spades"};
	private static final String [] ranks = {null, "Ace", "2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

	public Card(int rank, int suit) {
		super();
		this.suit = suit;
		this.rank = rank;
	}
	public int getSuit() {
		return suit;
	}
	public int getRank() {
		return rank;
	}
	public boolean equal(Card that) {
		return this.rank == that.rank && this.suit == that.suit;
	}
	public int compareto(Card that) {
		if(this.suit<that.suit) return -1;
		if(this.suit>that.suit) return 1;
		if(this.rank<that.rank) return -1;
		if(this.rank>that.rank) return 1;
		return 0;
		
	}
	@Override
	public String toString() {
		
		String s = ranks[this.rank]+" of "+suits[this.suit];
		return s;
	}
	
	
	
	
}
