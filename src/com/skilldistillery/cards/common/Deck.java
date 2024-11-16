package com.skilldistillery.cards.common;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private List<Card> cards;

	public Deck() {
		cards = new ArrayList<>(52);
		createDeck();
	}

	// Create a Deck
	private void createDeck() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards.add(new Card(rank, suit));
			}
		}
		return;
	}

	// Check Quantity of Cards in the Deck
	public int checkDeckSize() {
		return cards.size();
	}

	// Shuffle the Cards in the Deck
	public void shuffleDeck() {
		Collections.shuffle(cards);
	}

	// Deal a Card from the Deck
	public Card dealCard() {
		return cards.remove(0);
	}
}