package com.skilldistillery.cards.common;

public enum Suit {
	HEARTS("Hearts \u2665"), SPADES("Spades \u2660"), CLUBS("Clubs \u2663"), DIAMONDS("Diamonds \u2666");

	private final String name;

	Suit(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}