package com.game.main;

import java.util.ArrayList;
import java.util.List;

import com.game.model.*;

public class Game {

	private static final int ROUNDS_TOTAL = 20;
	private static final int PLAYERS_TOTAL = 5;
	private List<Player> players = new ArrayList<Player>(PLAYERS_TOTAL);
	private Board board; 
	private Die dice;

	public Game() {
		board = new Board();
		dice = new Die();
		for (int i = 0; i < PLAYERS_TOTAL; i++) {
			// call PlayerFactory to create Players 
			//add player in the list
		}
	}

	public void playGame() {
		for (int i = 0; i < ROUNDS_TOTAL; i++)
			playRound();
	}

	public List<Player> getPlayers() {
		return players;
	}

	private void playRound() {
		for (Player player : players)
			player.takeTurn();
	}

}
