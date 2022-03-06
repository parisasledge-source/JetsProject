package com.skilldistillery.jets.jets;

public class PassengerPlane extends Jet {
	
	int passengersCapacity = 0;

	public PassengerPlane(String model, double speed, int range, long price, int passengersCapacity) {
		super(model, speed, range, price);
		this.passengersCapacity = passengersCapacity;
	}

	public int getPassengersCapacity() {
		return passengersCapacity;
	}

	public void setPassengersCapacity(int passengersCapacity) {
		this.passengersCapacity = passengersCapacity;
	}

//	@Override
//	public String toString() {
//		return "PassengerPlane [passengersCapacity=" + passengersCapacity + "]";
//	}
//	
	
	

}
