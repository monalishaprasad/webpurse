package com.purseWeb.viksuuPurse.utility;

/*@Entity
@Table(name = "USERUTILITY")*/
public class UserPurse {

	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;*/
	private String notes;
	private String coins;
	private String debitCard;
	
	public void setDebitCard(String debitCard) {
		this.debitCard = debitCard;
	}
	public String getDebitCard() {
		return debitCard;
	}
	private String purseHolderName;
	//private String CardBal;
	
	public String getPurseHolderName() {
		return purseHolderName;
	}
	public void setPurseHolderName(String purseHolderName) {
		this.purseHolderName = purseHolderName;
	}
	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}*/
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
	/*public String getCardBal() {
		return CardBal;
	}
	public void setCardBal(String cardBal) {
		CardBal = cardBal;
	}*/
	@Override
	public String toString() {
		return "UserPurse [notes=" + notes + ", coins=" + coins + ", debitCard=" + debitCard + ", purseHolderName="
				+ purseHolderName + "]";
	}
	
	
	
}

	