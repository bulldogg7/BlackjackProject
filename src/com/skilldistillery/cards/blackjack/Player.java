package com.skilldistillery.cards.blackjack;

import java.util.Scanner;
import com.skilldistillery.cards.common.Card;

public class Player {
	Scanner input = new Scanner(System.in);

	// Fields
	protected BlackjackHand cards = new BlackjackHand();

	// No Argument Constructor
	public Player() { 
	}

	// NO getHand() From the Deck!!!

	// Player Gets Card Dealt to Their Hand From Dealer
	public void hitMe(Card dealtCard) {
		cards.addCard(dealtCard);
	}

	// Dealer Gets Card Dealt to Their Hand From Dealer
	public void addCardToDealerHand(Card dealerCard) {
		cards.addCard(dealerCard);
	}

	// Player Says Whether to Hit or Stand
	public void hitOrStand(Dealer dealer) {
		boolean playingGame = true;
		while (playingGame) {
			System.out.println("Your Hand Totals: " + hand + ". Do You Want to Hit or Stand? H or S");
			String hitMe = input.nextLine();
			if (hitMe.equalsIgnoreCase("H")) {
				this.addCard(dealer.dealCard());
				System.out.println("Your Hand Now Totals: " + hand);
			} else if (hitMe.equalsIgnoreCase("S")) {
				System.out.println("Your Hand Now Totals: " + hand);
				playingGame = false;
			}
			if (this.getHandValue() > 21) {
				System.out.println("Your Hand Now Totals: " + hand);
				System.out.println("Bust! You Lose!");
				playingGame = false;
			}
		}
	}

	// Player Discards Hand to 0 Cards
		public void clearHand() {
			this.cards.clear();
		}
	
	
	// See Value of Cards in Hand
	public int getHandValue() {
		return getHandValue();

	}

	public void setHandOfCards(BlackjackHand handOfCards) {
		this.hand = handOfCards;
	}

	@Override
	public String toString() {
		return getHand();
	}

}