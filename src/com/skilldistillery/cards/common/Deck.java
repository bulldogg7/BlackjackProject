package com.skilldistillery.cards.common;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private List<Card> cards;

	public Deck() {
		cards = new ArrayList<>();
		createDeck();
	}

	private void createDeck() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards.add(new Card(rank, suit));
			}
		}
		return;
	}

	public int checkDeckSize() {
		return cards.size();
	}

	public void shuffleDeck() {
		Collections.shuffle(cards);
	}

	public Card dealCard() {
		return cards.remove(0);
	}
}