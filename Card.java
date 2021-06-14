public class Card {

	private int rank;
	private char suit;

	public Card(int rank, char suit){

		this.rank = rank;
		this.suit = suit;
	}

	public Card(String value){

		this.rank = Integer.parseInt(value.substring(0, value.length()-1));
		this.suit = value.charAt(value.length()-1);
	}

	public int getRank(){

		return this.rank;
	}

	public char getSuit(){

		return this.suit;
	}

	public String toString(){

		return "" + this.rank + this.suit;
	}

	public int compareCard(Card other){

		return this.getRank() - other.getRank();
	}
}