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
	}
	

	
}
