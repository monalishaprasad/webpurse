package com.cards;

public class DebitCard extends Card {

	
	private String nameOnCard;
	private String debitCardType;
	private String bankName;
	private int cardNo;
	private int cvv;
	private String expirayDate;
	private long balance;
	

	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public String getDebitCardType() {
		return debitCardType;
	}
	public void setDebitCardType(String debitCardType) {
		this.debitCardType = debitCardType;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getExpirayDate() {
		return expirayDate;
	}
	public void setExpirayDate(String expirayDate) {
		this.expirayDate = expirayDate;
	}
	@Override
	public String toString() {
		return String.format(
				"DebitCard [nameOnCard=%s, debitCardType=%s, bankName=%s, cardNo=%s, cvv=%s, expirayDate=%s, balance=%s]",
				nameOnCard, debitCardType, bankName, cardNo, cvv, expirayDate, balance);
	}
	

	
	
	
}
