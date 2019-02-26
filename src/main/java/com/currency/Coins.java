package com.currency;

public class Coins {
	private int number;
	private String image;
	private int radius;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return String.format("Coins [number=%s, image=%s, radius=%s]", number, image, radius);
	}
	
	

}
