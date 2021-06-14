public class Player {

	private Card[] cards;
	private int handIndex;
	
	public Player(String strCards){

		String[] arrStrCards = strCards.split(" ");
		cards = new Card[arrStrCards.length];

		for(int i = 0; i < cards.length; i++)
			cards[i] = new Card(arrStrCards[i]);

		this.handIndex = 0;
	}

	public Card[] getCards(){

		return this.cards;
	}

	public int getHandIndex(){

		return this.handIndex;
	}

	public void setHandIndex(int handIndex){

		this.handIndex = handIndex;
	}

	public String toString(){

		String result = "";

		for(Card card : cards)
			result += card + " ";

		return result;
	}
}