package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player {

	// Fields 
	protected BlackjackHand hand;

	// No Argument Constructor
	public Player() {
		hand = new BlackjackHand();
	}
	
	// NO getHand()
	
	// Get Dealt a Card to Your Hand
	public void hitMe(Card card) {
		hand.addCard(card);
	}

	// Say Whether to Hit or Stay
	
	// Empty Hand to 0 Cards
	
	// See Value of Cards in Hand
	
	
	
	
	
	@Override
	public String toString() {
		return "hand";
	}
	
	
	
	
	
	
	
}