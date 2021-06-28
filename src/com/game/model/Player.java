package com.game.model;

public class Player {

	private String name;
	private Piece piece;
	private Board board;
	private Die dice;

	public Player(String name, Board board, Die dice2) {
		this.setName(name);
		this.board = board;
		this.dice = dice2;
		this.piece = new Piece(board.getStartSquare());
	}

	public void takeTurn() {
		System.out.println(name + " taking a turn...");
		int rollTotal = 0;
		
			dice.roll();
			rollTotal += dice.getFaceValue();
		
		Square newLoc = board.getSquare(this.piece.getLocation(), rollTotal);
		piece.setLocation(newLoc);
		System.out.println(" new location is " + getLocation().getIndex());

	}

	public Square getLocation() {
		return this.piece.getLocation();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}