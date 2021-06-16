import java.util.Scanner;

public class Table {
	
	private static final String[] hands = {"", "HighCard", "Pair", "TwoPair", "ThreeKind", "Straight", "Flush", "FullHouse", "FourKind", "StraightFlush", "RoyalFlush"};

	private Player[] players;
	private int highHandIndex;

	public Table(){

		this.players = new Player[5];
		this.highHandIndex = 0;
	}



	private int defineHand(Player player){

		if(player.getCards().length != 5)
			return 0;

		Card[] cards = player.getCards().clone();
		sortCards(cards);

		if(isRoyalFlush(cards)) return 10;
		if(isStraightFlush(cards)) return 9;
		if(isFourKind(cards)) return 8;
		if(isFullHouse(cards)) return 7;
		if(isFlush(cards)) return 6;
		if(isStraight(cards)) return 5;
		if(isThreeKind(cards)) return 4;
		if(isTwoPair(cards)) return 3;
		if(isPair(cards)) return 2;

		return 1;
	}


	private boolean isRoyalFlush(Card[] cards){

		return cards[0].getRank() == 14 && isStraightFlush(cards);
	}

	private boolean isStraightFlush(Card[] cards){

		return (isFlush(cards) && isStraight(cards));
	}

	private boolean isFourKind(Card[] cards){

		return cards[0] == cards[3] || cards[1] == cards[4];
	}

	private boolean isFullHouse(Card[] cards){

		return isTwoPair() && isThreeKind();
	}

	private boolean isFlush(Card[] cards){

		for(int i = 1; i < cards.length; i++){
			if(cards[i-1].getSuit() != cards[i].getSuit())
				return false;
		}

		return true;
	}

	private boolean isStraight(Card[] cards){

		for(int i = 1; i < cards.length; i++){
			if((cards[i-1].getRank() + 1) != cards[i].getRank())
				return false;
		}

		return true;
	}
	private boolean isTwoPair(Card[] cards) {
		
		for(int i = 1; i < card.length; i++) {
			int p = 0; // p sendo o numero de pares
			if((cards[i-1].getRank() + 1) == cards[i].getRank()){
				p++;
				if(p=2){ // se tiver 2 pares retorna true
					return true;
				}
			}	
		}
		
		return false;
	}
	
	private boolean isPair(Card[] cards) {
		
		for(int i = 1; i < card.length; i++) {
			if((cards[i-1].getRank() + 1) == cards[i].getRank())
				return true;
		}
		
		return false;
	}

	
}
