
public class driver {

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		Pile p1 = new Pile();
		p1.addDeck(deck.subDeck(0, 25));
		
		Pile p2 = new Pile();
		p2.addDeck(deck.subDeck(26, 51));
		
		
		while(!p1.isEmpty()&&!p2.isEmpty())
		{
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			
			int diff = c1.getRank()-c2.getRank();
			
			if(diff>0) {
				p1.addCard(c2);
				p1.addCard(c1);
				for(int i = 0; i<5;i++) {
					if(!p1.isEmpty())p1.addCard(p2.popCard());
				}
			}
			else if(diff<0) {
				p2.addCard(c2);
				p2.addCard(c1);
				for(int i = 0; i<5;i++) {
					if(!p1.isEmpty())p2.addCard(p1.popCard());
				}
			}
			else {
				p2.addCard(c2);
				p1.addCard(c1);
			}
			
		}
		if(p1.isEmpty())
		{
			System.out.println("player 2 wins!");
		}
		else
		{
			System.out.println("player 1 wins");
		}
	
	}

	public static int binarysearch(Card[] cards, Card target) {
		int low = 0;
		int high = cards.length - 1;
		while (low < high) {
			int mid = (low + high) / 2;
			int comp = cards[mid].compareto(target);
			if (comp == 0)
				return mid;
			else if (comp < 0)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}
	public int search(Card[] cards, Card target) {
		for (int i = 0; i < cards.length; i++) {
			if (cards[i].equals(target))
				return i;
		}
		return -1;
	}
	public static void printDeck(Card[] cards) {
		if (cards[0] == null)
			System.out.println("no cards yet");

		for (Card card : cards) {
			System.out.println(card);
		}
	}
}
