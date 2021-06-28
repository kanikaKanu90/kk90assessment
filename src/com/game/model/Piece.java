package com.game.model;

public class Piece

{
	Square location;

	/** Creates a new instance of Piece */
	public Piece(Square location) {
		this.location = location;
	}

	public Square getLocation() {
		return location;
	}

	public void setLocation(Square location) {
		this.location = location;
	}

}
