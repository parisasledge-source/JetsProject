package com.skilldistillery.jets.jets;

public class Jet {

	private String model;
	private double speed;
	private int range;
	private long price;
	

	public Jet() {
	}

	public Jet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nModel: " + model + ", Speed: " + speed + " Mock" + ", Range: " + range + " Billion Km" + ", Price: $" + price;
	}

	public void displayJet() {
		// TODO Auto-generated method stub
		
	}
	
	

}
