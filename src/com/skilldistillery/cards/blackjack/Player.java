package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player {

	// Fields
	protected BlackjackHand hand = new BlackjackHand();

	// NO getHand() From the Deck!!!

	// Players Gets Card Dealt to Their Hands
	public void hitMe(Card dealtCard) {
		hand.addCard(dealtCard);
	}

	// See Value of Cards in Hand
	public int getHandValue() {
		return hand.getHandValue();

	}

	// Display Cards in Hand
	public void displayHand() {
		hand.displayHand();
	}

	// Identify Dealt Card
	public  Card currentCardDealt() {
		return hand.getCardsInHand().get(hand.getCardsInHand().size() - 1);
	}
	
	// Return the Cards in Your Hand/Discard Hand
	public void discardHand() {
		hand.clearHand();
	}
	public String toString() {
		return "" + hand;
	}
	
	
}