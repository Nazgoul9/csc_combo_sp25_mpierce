
public class driver {

	public static void main(String[] args) {
		Card[] cards = new Card[52];
		makedeck(cards);
		int highCard = cards[45].compareto(cards[23]);
		
		if(highCard == -1) System.out.println(cards[45]);
		if(highCard == -1) System.out.println(cards[23]);
		makedeck(cards);
	
	}
	public static int binarysearch(Card[] cards, Card target)
	{
		int low = 0;
		int high = cards.length-1;
		while (low<high)
		{
			int mid = (low + high)/2;
			int comp = cards[mid].compareto(target);
			if(comp == 0)return mid;
			else if (comp<0) low = mid+1;
			else high = mid-1;
		}
		return -1;
	}
	
	
	public int search(Card[] cards, Card target)
	{
		for(int i = 0;i<cards.length;i++) {
			if(cards[i].equals(target)) return i;
		}
		return -1;
	}
	
	private static void makedeck(Card[] cards) {
		int index = 0;
		for (int suit = 0; suit < 4; suit++)
		{
			for (int rank= 1; rank <=13; rank++)
			{
				cards[index] = new Card(rank,suit);
				index++;
			}
		}
		
	}
	public static void printDeck(Card[] cards) {
if(cards[0]==null)System.out.println("no cards yet");
		
		for (Card card:cards)
		{
			System.out.println(card);
		}
	}
}
