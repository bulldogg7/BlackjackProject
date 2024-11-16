package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player {

	// Fields
	private Deck deck;
	
	// No Argument Constructor
	public Dealer() {
		deck = new Deck();
	}
	
	// NO getDeck()

	
	// Deal a Card
	public Card dealCard() {
		return deck.dealCard();
	}
	
	// Dealer Hit or Stand
	public void hitOrStand () {
		System.out.println();
		while (getHandValue() < 17) {
			
		}
		
	}
	
	// Shuffle the Deck???
	public void shuffleDeck() {
		deck.shuffleDeck();
	}
	
	
	
}