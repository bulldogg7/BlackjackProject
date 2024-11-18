# BlackjackProject

## Description
	- Create a Blackjack game with a dealer & a player
	- Create a deck of cards with cards that have a suit & value
	- Start the game & deal cards to the player & dealer
	- Ask the player to hit or stand with the cards they have in their hand
	- Automate the dealer to hit or stand based off of the cards in their hand
	- Announce a Blackjack, bust, win, or loss

## Technologies Used
	- Java
	- Eclipse
	- Sublime
	- Git/GitHub
	- MacOS Terminal

## Lessons Learned
	- Always commit your work so that it saves
	- Learned how to write & call several methods, which represented different actions
	- Learned to have two entities (player & dealer) use the same player class
	- Learned .equalsIgnoreCase & try/catch
	- Learned that I don't know the rules of Blackjack - need to fix how the dealer's
	  2nd card is supposed to be dealt face down

## Changes Made
	- Refined User Experience with verbiage and formatting
	- Added a "Play Again" loop at the end
	- Changed Dealer's "Hit or Stand" to the Dealer class
	- Added a "discard hand" method to fix the card value accumulation error from
	  the "Play Again" loop


	 
## Difficulties Encountered
	- The player class with different actions for both the player and the dealer
	  was difficult to figure out & I am sure that I still could have done it better
	- It was difficult to conceptualize EVERY action of both players & to know what
	  methods to construct and where to call them.
	- I added, deleted, & added back several actions/methods as I tried to figure out
	  who was doing what. I had several redundant methods & I tried re-naming several 
	  things to better grasp what was actually happening.
	- Ran into an issue with the dealer hit or stand & moved the dealer's decision
	  into his class then called that method in the app
	- Ran into an issue with cards accumulating over multiple games due to being added to
	  the prior cards list of cards. Created a "discard hand" method & called it if the
	  player wanted to play again

