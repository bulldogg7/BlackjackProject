package com.skilldistillery.cards.app;

import java.util.Scanner;
import com.skilldistillery.cards.blackjack.Dealer;
import com.skilldistillery.cards.blackjack.Player;

public class BlackjackApp {

	// Fields
	private Scanner input;
	private Dealer dealer;
	private Player player;
	boolean playingGame;

	// No Argument Constructor
	private BlackjackApp() {
		input = new Scanner(System.in);
		dealer = new Dealer();
		player = new Player();

	}

	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		app.playGame();
	}

	// Start Playing the Game
	public void playGame() {
		playingGame = true;
		while (playingGame) {
			dealer.shuffleDeck();
			dealCards();
		}

	}

	// Deal Out Cards to Player & Dealer
	private void dealCards() {
		player.addCard;
		dealer.addCard;
		player.addCard;
		dealer.addCard;
		System.out.println("Your Hand Contains: ");
		System.out.println("The Dealer's Hand Contains: ");
	}

	// Ask Player to Hit or Stand
	System.out.println("Your Hand Totals: "+hand+". Do You Want to Hit or Stand? H or S");

	}

	// Results of Blackjack, 21, or Player Loses/Dealer Wins

	// Empty Hand of the Player & Dealer (Turn Cards Back In)

	// Ask to Play Again (Loop?)
	System.out.println("Do You Want to Play Again? Y or N");
	String playAgain = input.nextLine();
	if(playAgain.equalsIgnoreCase("Y")) {
		playingGame = true;
		System.out.println("Here We Go!");
	} else if(playAgain.equalsIgnoreCase("N")) {
		playingGame = false;
		System.out.println("See You Next Time!");
	} else {
		System.out.println("Invalid Input. Try Again.");
	}
}}
