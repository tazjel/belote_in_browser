package org.phase.game.entities;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Team {

	private long teamId;
	private List<Player> players = new ArrayList<Player>();
	private int ready = 0;
	private Deque<Card> won_cards = new ArrayDeque<Card>();
	
	public void new_player(Player player) throws Exception {
		if (players.size() < 2) {
			players.add(player);
			if (players.size() == 2) {
				ready = 1;
			}
		} else {
			throw new Exception("Player cannot be added to this team since "
					+ "maximum of players in a team was reached.");
		}
	}
	
	public long get_team_id() {
		return teamId;
	}
	
	public int if_ready() {
		return ready;
	}
	
	public void add_card_to_won_cards(Card card) {
		won_cards.addLast(card);
	}
	
}
