package com.game.model;

public class Square {
	private String name;
	private int index;

	/** Creates a new instance of Square */
	public Square(String name, int index) {
		this.name = name;
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public int getIndex() {
		return index;
	}

}
