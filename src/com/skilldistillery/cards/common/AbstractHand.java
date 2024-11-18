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

	// Get Cards in Hand
	public List<Card> getCardsInHand() {
		return new ArrayList<>(cardsInHand);
	}
	
	@Override
	public String toString() {
		return "" + cardsInHand;
	}
}
			// DONE! DO NOT EDIT!