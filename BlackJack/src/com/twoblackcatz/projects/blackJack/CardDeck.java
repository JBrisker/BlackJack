package com.twoblackcatz.projects.blackJack;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {

	private ArrayList<Card> cards;

//constructor
	public CardDeck() {
		this.cards = new ArrayList<Card>();
	}
	// creating the deck
	public void createDeck() {
		cards = new ArrayList<>(52);
		for (int s = 0; s < 4; s++) {
			for (int r = 0; r < 13; r++) {
				// if (r == 0) {
				cards.add(new Card(r, s));

				// }
			}
		}
	}

	// Methods - what can I do with the deck
	public String toString() {
		String cardList = "";
		int i = 0;
		for(Card aCard : this.cards){
			cardList += "\n" + aCard.toString();
			i++;
		}
		return cardList;
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	 
	// add card to deck
	public void addCard(Card addCard) {
		this.cards.add(addCard);
	}

	// retrieve card
	public Card getCard(int i) {
		return this.cards.get(i);
	}

	// remove card
	public void removeCard(int i) {
		this.cards.remove(i);
	}

	// draw card and remove top card deck
	public void drawCard(CardDeck deck) {
		this.cards.add(deck.getCard(0));
		deck.removeCard(0);
	}
	public int handSize(){
		return this.cards.size();
	}
 
	public int scoreTally() {
		int total = 0;
		int aceCount = 0;
		// For every card in the deck
		for (Card aCard : this.cards) {
			// retrieve the value of the card and add to score
			total += aCard.getValue();
		
		}

		for (int i = 0; i < aceCount; i++) {
			// If they're already at over 10 getting an ace valued at 11 would put them up
			// to 22, so make ace worth one
			if (total > 10) {
				total += 1;
			} else {
				total += 11;
			}

		}
		return total;
	}
	public void clearHand() {
		
		cards.clear();
	}
}
