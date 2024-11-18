package com.skilldistillery.cards.app;

import java.util.Scanner;
import com.skilldistillery.cards.blackjack.Dealer;
import com.skilldistillery.cards.blackjack.Player;

public class BlackjackApp {

	// Fields
	private Scanner input;
	private Dealer dealer;
	private Player player;

	// No Argument Constructor
	private BlackjackApp() {
		input = new Scanner(System.in);
		dealer = new Dealer();
		player = new Player();
	}

	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		app.launch();
	}

	// Start Playing the Game
	private void launch() {
		System.out.println("Are You Ready to Play? Yes or No");
		String selection = input.nextLine();
		if (selection.equalsIgnoreCase("Y") || (selection.equalsIgnoreCase("Yes"))) {
			dealCards();
			hitOrStand();
		} else if (selection.equalsIgnoreCase("N") || (selection.equalsIgnoreCase("No"))) {
			System.out.println();
			System.out.println("See You Next Time!");
			input.close();
		} else {
			System.err.println("Invalid Response!");
			System.out.println();
			launch();
		}
	}

	// Deal Out Cards to Player & Dealer
	private void dealCards() {
		dealer.shuffleDeck();
		System.out.println();
		System.out.println("Deal the Cards!");
		System.out.println();
		player.hitMe(dealer.dealCard());
		dealer.hitMe(dealer.dealCard());
		player.hitMe(dealer.dealCard());
		dealer.hitMe(dealer.dealCard());
		if (player.getHandValue() < 21) {
			System.out.println("Your Cards Are: " + player.toString());
			System.out.println("Your Cards Total " + player.getHandValue());
			System.out.println();
			if (player.getHandValue() == 21) {
				System.out.println("Blackjack! You Win!");
				playAgain();
			} else {
				System.out.println("The Dealer's Cards Are: " + dealer.toString());
				System.out.println("Their Cards Total " + dealer.getHandValue());
				System.out.println();
			}
		}
	}

	// Ask Player to Hit or Stand -> Bust if Over 21
	public void hitOrStand() {
		boolean stillPlaying = true;
		while (stillPlaying) {
			System.out.println("Your Hand Totals " + player.getHandValue() + ". Do You Want to Hit or Stand? H or S");
			String selection = input.nextLine();
			if (selection.equalsIgnoreCase("H")) {
				player.hitMe(dealer.dealCard());
				System.out.println("You Were Dealt a " + player.currentCardDealt());
				System.out.println("Your Hand Now Totals " + player.getHandValue());
				System.out.println();
			}
			if (selection.equalsIgnoreCase("S")) {
				System.out.println("Your Hand Totals " + player.getHandValue());
				System.out.println();
				stillPlaying = false;
				dealer.dealerHitOrStay();
				scoreGame();
			} else if (player.getHandValue() > 21) {
				System.err.println("Bust! You Lose!");
				playAgain();
			}
		}
	}

	// Score the Game & Declare a Winner
	public void scoreGame() {
		if (player.getHandValue() > dealer.getHandValue() && player.getHandValue() <= 21) {
			System.out.println(
					"You Win With " + player.getHandValue() + " vs the Dealer's " + dealer.getHandValue() + "!");
			playAgain();
		} else if (dealer.getHandValue() > player.getHandValue() && dealer.getHandValue() <= 21) {
			System.out.println("Dealer Wins With " + dealer.getHandValue() + " vs Your " + player.getHandValue() + "!");
			playAgain();
		} else if (dealer.getHandValue() > 21) {
			System.out.println("The Dealer Went Over 21 & Busted! You Win!");
			playAgain();
		} else if ((dealer.getHandValue() == player.getHandValue() && dealer.getHandValue() <= 21)) {
			System.out.println("The Game Ends in a Tie!");
			playAgain();
		}
	}

	// Ask to Play Again
	public void playAgain() {
		player.discardHand();
		dealer.discardHand();
		System.out.println();
		System.out.println("Do You Want to Play Again? Y or N");
		String selection = input.nextLine();
		{
			if (selection.equalsIgnoreCase("Y")) {
				System.out.println("Here We Go!");
				dealCards();
				hitOrStand();
				scoreGame();
			} else if (selection.equalsIgnoreCase("N")) {
				System.out.println("See You Next Time!");
				input.close();
			} else {
				System.err.println("Invalid Input. Try Again.");
			}
		}
	}
}
