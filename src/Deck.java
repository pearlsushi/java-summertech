

import java.util.ArrayList;
import java.util.Random;

public class Deck {
		ArrayList<Card> cardDeck = new ArrayList<Card>(); //<> generic 
	public Deck() { // init returns Deck returns itself - constructor
			for (int b = 1; b < 14; b++) {
				cardDeck.add(new Card(b,"Hearts"));
				cardDeck.add(new Card(b,"Diamonds"));
				cardDeck.add(new Card(b,"Clubs"));
				cardDeck.add(new Card(b,"Spades"));
			}
	}
	public void shuffle() {
		Random r = new Random();
		
		for (int h = 0; h < 200; h++) {
			Card c = cardDeck.get(0);
			cardDeck.remove(0);
			cardDeck.add(r.nextInt(cardDeck.size()),c);
		}
	}
	public Card draw() {
		Card o = cardDeck.get(0);
		cardDeck.remove(0);
		return o;
	}
	public Card[] draw(int num) {
		Card[]temp = new Card[num];
		// cardDeck.get(num);
		for(int i = 0; i < num; i++) {
			temp[i] = cardDeck.get(0);
			cardDeck.remove(0);
		}
		return temp;
	}
	public String toString() {
		String temp = "";
		for (int i = 0; i < 52; i++) {
			temp += cardDeck.get(i);
		}
		return temp;
	}
}

