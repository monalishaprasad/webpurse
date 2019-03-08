package com.purseWeb.viksuuPurse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEBIT_CARD")
public class DebitCard extends Card {     
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nameOnCard;
	private String debitCardType;
	private String bankName;
	private int cardNo;
	private int cvv;
	private String expiryDate;
	private long balance;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
		return expiryDate;
	}

	public void setExpirayDate(String expirayDate) {
		this.expiryDate = expirayDate;
	}

	@Override
	public String toString() {
		return "DebitCard [id=" + id + ", nameOnCard=" + nameOnCard + ", debitCardType=" + debitCardType + ", bankName="
				+ bankName + ", cardNo=" + cardNo + ", cvv=" + cvv + ", expirayDate=" + expiryDate + ", balance="
				+ balance + "]";
	}

}
