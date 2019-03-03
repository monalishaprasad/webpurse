package com.purseWeb.viksuuPurse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CreditCards")
public class CreditCard extends Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nameOnCard;
	private String CreditCardType;
	private String bankName;
	private int cardNo;
	private String expirayDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
