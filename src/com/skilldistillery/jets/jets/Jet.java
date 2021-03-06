package com.skilldistillery.jets.jets;

public abstract class Jet {

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
		return "\nModel: " + model + ", Speed: " + speed + " Light Speed" 
	+ ", Range: " + range + " Light Years" + ", Price: $" + price;
	}

	public void fly() {
		/*
		 * Print out the jet details 
		 * and the amount of time the jet can fly 
		 * until it runs out of fuel 
		 * (based on speed and range).
		 */
	    String jetData = this.toString();
	    System.out.println(jetData);
	    

	    double speed = getSpeed();
	    double jetTime = (Math.round (getRange() / speed *100)) / 100.0;
	    
		System.out.println("\nThe amount of time this jet can fly "
				+ "until it runs out of fuel "
				+ "(based on speed and range): \n" + jetTime + " hours");	
	}
}
