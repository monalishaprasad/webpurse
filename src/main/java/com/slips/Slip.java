package com.slips;

public class Slip {
	private int billAmount;
	private String slipType;
	private String description;

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
