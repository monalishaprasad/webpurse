package com.purseWeb.viksuuPurse.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Purse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	private double cash;
	private double totalBalance;
	private String colour;
	private String pursetype;
	public List<Notes> notes;
	private List<Coins> coins;
	private List<Slip> slips;
	private List<Card> card;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	public double getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}

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
		return "Purse [id=" + id + ", cash=" + cash + ", totalBalance=" + totalBalance + ", colour=" + colour
				+ ", pursetype=" + pursetype + ", notes=" + notes + ", coins=" + coins + ", slips=" + slips + ", card="
				+ card + "]";
	}

}
