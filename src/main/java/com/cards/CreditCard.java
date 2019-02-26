package com.cards;

public class CreditCard extends Card {

	
	private String nameOnCard;
	private String CreditCardType;
	private String bankName;
	private int cardNo;
	private String expirayDate;
	
	
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public String getCreditCardType() {
		return CreditCardType;
	}
	public void setCreditCardType(String creditCardType) {
		this.CreditCardType = creditCardType;
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
	
	public String getExpirayDate() {
		return expirayDate;
	}
	public void setExpirayDate(String expirayDate) {
		this.expirayDate = expirayDate;
	}
	
	
	
	@Override
	public String toString() {
		return "DebitCard [nameOnCard=" + nameOnCard + ", debitCardType=" + CreditCardType + ", bankName=" + bankName
				+ ", cardNo=" + cardNo + ", expirayDate=" + expirayDate + "]";
	}
	
	
	
}
