package com.purseWeb.viksuuPurse.utility;

import java.util.List;

/**
 * @author mprasad
 *
 */
public class UserPurse {

	private List<Number> notes;
	private List<Number> coins;
	
	
	/**
	 * @return
	 */
	public List<Number> getNotes() {
		return notes;
	}
	public void setNotes(List<Number> notes) {
		this.notes = notes;
	}
	
	
	/**
	 * @return  List
	 */
	public List<Number> getCoins() {
		return coins;
	}
	
	
	/**
	 * @param coins
	 */
	public void setCoins(List<Number> coins) {
		this.coins = coins;
	}


	@Override
	public String toString() {
		return "UserPurse [notes=" + notes + ", coins=" + coins + "]";
	}

	
}
