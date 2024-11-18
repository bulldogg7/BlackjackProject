package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.AbstractHand;
import com.skilldistillery.cards.common.Card;

public class BlackjackHand extends AbstractHand {

	// No Fields!

	// Get Value of Cards in Hand
	public int getHandValue() {
		int handValue = 0;
		for (Card card : cardsInHand) {
			handValue = handValue + card.getValue();
		}
		return handValue;
	}
	
	// Display Hand
	public void displayHand() {
		for (Card card : cardsInHand) {
			System.out.println(card);
		}
	}

	// Hand Over 21 -> Bust
	public boolean over21() {
		if (getHandValue() > 21) {
			System.err.println("Bust! You Lose!");
			return true;
		} else {
			return false;
		}
	}

	// Hand IS 21 -> Blackjack!
	public boolean blackjack() {
		if (getHandValue() == 21) {
			System.out.println("Blackjack!");
			return true;
		} else {
			return false;
		}
	}

	public void clearHand() {
		cardsInHand.clear();
	}
}
				//DONE! DO NOT EDIT!