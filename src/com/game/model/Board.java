package com.game.model;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private static final int SIZE = 40;
	private List<Square> squares;

	/** Creates a new instance of Board */
	public Board() {
		squares = new ArrayList<Square>(SIZE);
		buildSquares();
	}

	public Square getSquare(Square start, int distance) {
		int endIndex = (start.getIndex() + distance) % Board.SIZE;
		return squares.get(endIndex);
	}

	public Square getStartSquare() {
		return squares.get(0);
	}

	private void buildSquares() {
		for (int i = 0; i < SIZE; i++) {
			Square square = new Square("Square " + i, i);
			squares.add(square);
			//Template to create Square
		}
	}

}
