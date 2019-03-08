package com.purseWeb.viksuuPurse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CREDIT_CARD")
public class CreditCard extends Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	private String nameOnCard;
	private String creditCardType;
	private String bankName;
	private int cardNo;
	private String expiryDate;

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
		return creditCardType;
	}


	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
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


	public String getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}



	@Override
	public String toString() {
		return "CreditCard [id=" + id + ", nameOnCard=" + nameOnCard + ", CreditCardType=" + creditCardType
				+ ", bankName=" + bankName + ", cardNo=" + cardNo + ", expirayDate=" + expiryDate + "]";
	}

}
