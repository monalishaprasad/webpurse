package com.purseWeb.viksuuPurse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PURSE")
public class Purse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	private double cash;
	private String purseHolderName;
	private double totalBalance;
	private String notes;
	private String coins;
	private String slips;
	private String cards;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCash() {
		return cash;
	}
	public String getPurseHolderName() {
		return purseHolderName;
	}
	public void setPurseHolderName(String purseHolderName) {
		this.purseHolderName = purseHolderName;
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
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getCoins() {
		return coins;
	}
	public void setCoins(String coins) {
		this.coins = coins;
	}
	public String getSlips() {
		return slips;
	}
	public void setSlips(String slips) {
		this.slips = slips;
	}
	public String getCards() {
		return cards;
	}
	public void setCards(String cards) {
		this.cards = cards;
	}
	@Override
	public String toString() {
		return "Purse [id=" + id + ", cash=" + cash + ", purseHolderName=" + purseHolderName + ", totalBalance="
				+ totalBalance + ", notes=" + notes + ", coins=" + coins + ", slips=" + slips + ", cards=" + cards
				+ "]";
	}

	
}

	