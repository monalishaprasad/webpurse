package com.purse;

import java.util.List;

import com.cards.Card;
import com.currency.Coins;
import com.currency.Notes;
import com.slips.Slip;

// comment added
public class Purse {
	private String colour;
	private String pursetype;
	private List<Notes> notes;
	private List<Coins> coins;
	private List<Slip> slips;
	private List<Card> card;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getPursetype() {
		return pursetype;
	}

	public void setPursetype(String pursetype) {
		this.pursetype = pursetype;
	}

	public List<Notes> getNotes() {
		return notes;
	}

	public void setNotes(List<Notes> notes) {
		this.notes = notes;
	}

	public List<Coins> getCoins() {
		return coins;
	}

	public void setCoins(List<Coins> coins) {
		this.coins = coins;
	}

	public List<Slip> getSlips() {
		return slips;
	}

	public void setSlips(List<Slip> slips) {
		this.slips = slips;
	}

	public List<Card> getCard() {
		return card;
	}

	public void setCard(List<Card> card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return String.format("Purse [colour=%s, pursetype=%s, notes=%s, coins=%s, slips=%s, card=%s]", colour,
				pursetype, notes, coins, slips, card);
	}

}
