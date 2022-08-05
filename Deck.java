package javaprojectweek6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	
	
public Deck() {
		
	for(int i = 2; i < 15; i++) {
		cards.add(new Card("Hearts", i));
		cards.add(new Card("Diamonds", i));
		cards.add(new Card("Spades", i));
		cards.add(new Card("Clubs", i));
	}
	
}


		/*cards.add(new Card("two of Hearts", 2));
		cards.add(new Card("two of Diamonds", 2));
		cards.add(new Card("two of Spades", 2));
		cards.add(new Card("two of Clubs", 2));

		cards.add(new Card("Three of Hearts", 3));
		cards.add(new Card("Three of Diamonds", 3));
		cards.add(new Card("Three of Spades", 3));
		cards.add(new Card("Three of Clubs", 3));
        
		cards.add(new Card("Four of Hearts", 4));
		cards.add(new Card("Four of Diamonds", 4));
		cards.add(new Card("Four of Spades", 4));
		cards.add(new Card("Four of Clubs", 4));
	
		cards.add(new Card("Five of Hearts", 5));
		cards.add(new Card("Five of Diamonds", 5));
		cards.add(new Card("Five of Spades", 5));
		cards.add(new Card("Five of Clubs", 5));
		
		cards.add(new Card("Six of Hearts", 6));
		cards.add(new Card("Six of Diamonds", 6));
		cards.add(new Card("Six of Spades", 6));
		cards.add(new Card("Six of Clubs", 6));
		
		cards.add(new Card("Seven of Hearts", 7));
		cards.add(new Card("Seven of Diamonds", 7));
		cards.add(new Card("Seven of Spades", 7));
		cards.add(new Card("Seven of Clubs", 7));
		
		cards.add(new Card("Eight of Hearts", 8));
		cards.add(new Card("Eight of Diamonds", 8));
		cards.add(new Card("Eight of Spades", 8));
		cards.add(new Card("Eight of Clubs", 8));
		
		cards.add(new Card("Nine of Hearts", 9));
		cards.add(new Card("Nine of Diamonds", 9));
		cards.add(new Card("Nine of Spades", 9));
		cards.add(new Card("Nine of Clubs", 9));
		
		cards.add(new Card("Ten of Hearts", 10));
		cards.add(new Card("Ten of Diamonds", 10));
		cards.add(new Card("Ten of Spades", 10));
		cards.add(new Card("Ten of Clubs", 10));
		
		cards.add(new Card("Jack of Diamonds", 11));
		cards.add(new Card("Jack of Hearts", 11));
		cards.add(new Card("Jack of Spades", 11));
		cards.add(new Card("Jack of Clubs", 11));
		
		cards.add(new Card("Queen of Diamonds", 12));
		cards.add(new Card("Queen of Hearts", 12));
		cards.add(new Card("Queen of Spades", 12));
		cards.add(new Card("Queen of Clubs", 12));
		
		cards.add(new Card("King of Diamonds", 13));
		cards.add(new Card("King of Hearts", 13));
		cards.add(new Card("King of Spades", 13));
		cards.add(new Card("King of Clubs", 13));
		
		cards.add(new Card("Ace of Diamonds", 14));
		cards.add(new Card("Ace of Hearts", 14));
		cards.add(new Card("Ace of Spades", 14));
		*///cards.add(new Card("Ace of Clubs", 14));
		
		
	


	public Card draw() {
		return cards.remove(0);
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
}
