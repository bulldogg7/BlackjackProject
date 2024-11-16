package com.skilldistillery.cards.blackjack;

import java.util.Scanner;
import com.skilldistillery.cards.common.Card;

public class Player {
	Scanner input = new Scanner(System.in);

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

	public void addCard(Card dealCard) {
		getHandOfCards().addCard(dealCard);
	}

	// Say Whether to Hit or Stand
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

	// Empty Hand to 0 Cards

	// See Value of Cards in Hand
	public int getHandValue() {
		return getHandValue();

	}



	public void setHandOfCards(BlackjackHand handOfCards) {
		this.hand = handOfCards;
	}

	@Override
	public String toString() {
		return "hand";
	}

}