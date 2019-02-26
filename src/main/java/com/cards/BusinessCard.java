package com.cards;

public class BusinessCard extends Card {
	private String Name;
	private String address;
	private String companyName;
	private int mobileNumber;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "BusinessCard [Name=" + Name + ", address=" + address + ", companyName=" + companyName
				+ ", mobileNumber=" + mobileNumber + "]";
	}

}
