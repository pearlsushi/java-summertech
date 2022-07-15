

public class Card {
	String suit;
	int value;
	public Card(int value, String suit) {
		this.suit = suit;
		this.value = value;
	}
	public String toString() { //does this stuff still go into the other method 
		if(value == 11) {
			return "Jack of " + suit;
		}
		if(value == 12) {
			return "Queen of " + suit;
		}
		if(value == 13) {
			return "King of " + suit;
		}
		if(value == 14 || value == 1) { //am I able to do or or will this mess up gameplay in future code?? 
			return "Ace of " + suit;
		}
		return value + " of " + suit;
	}
	public int getValue() {
		if(value>10 && value<14) {
			return 10;
		}
		else if (value==14) {
			return 11;
		}
		else {
			return value;
		}
	}
//	public static void main(String[] args) {
//
//	}

}
