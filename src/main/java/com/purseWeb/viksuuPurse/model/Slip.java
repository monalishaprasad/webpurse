package com.purseWeb.viksuuPurse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Slip")
public class Slip {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int billAmount;
	private String slipType;
	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

	public String getSlipType() {
		return slipType;
	}

	public void setSlipType(String slipType) {
		this.slipType = slipType;
	}

	public String getDesccription() {
		return description;
	}

	public void setDesccription(String desccription) {
		this.description = desccription;
	}

	@Override
	public String toString() {
		return String.format("Slip [billAmount=%s, slipType=%s, desccription=%s]", billAmount, slipType, description);
	}

}
