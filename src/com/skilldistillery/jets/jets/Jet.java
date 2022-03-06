package com.skilldistillery.jets.jets;

public class Jet {

	private String model;
	private double speed;
	private double range;
	private double price;
	

	public Jet() {
	}

	public Jet(String model, double speed, double d, double price) {
		this.model = model;
		this.speed = speed;
		this.range = d;
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

	public void setSpeed(double d) {
		this.speed = d;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double d) {
		this.range = d;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
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
