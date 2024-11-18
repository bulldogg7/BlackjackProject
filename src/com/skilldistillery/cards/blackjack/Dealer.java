package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player {

	// Fields
	private Deck deck = new Deck();

	// NO getDeck()

	// Deal a Card
	public Card dealCard() {
		return deck.dealCard();
	}

	// Dealer Hit or Stand
	public void dealerHitOrStay() {
		System.out.println("The Dealer's Cards Are: " + toString());
		System.out.println("Their Cards Total: " + getHandValue());
		System.out.println();
		while (getHandValue() < 17) {
			hand.addCard(dealCard());
			System.out.println();
			System.out.println("The Dealer Hit. They Drew a " + currentCardDealt());
			System.out.println("The Dealer's Hand Now Totals " + getHandValue());
			System.out.println();
		}
	}

	// Shuffle the Deck
	public void shuffleDeck() {
		deck.shuffleDeck();
	}
}