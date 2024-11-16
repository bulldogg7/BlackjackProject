package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHand {

	// Fields
	protected List<Card> cardsInHand = new ArrayList<>();

	// Get Value of Cards in Hand
	public abstract int getHandValue();	{
	}

	// Add Card to Your Hand
	public void addCard(Card card) {
		cardsInHand.add(card);
	}

	// Return the Cards in Your Hand/Discard Hand
	public void discardHand() {
		cardsInHand.clear();
	}

	@Override
	public String toString() {
		return "Cards In Hand: " + cardsInHand;
	}
}
			// DONE! DO NOT EDIT!