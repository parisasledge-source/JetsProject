package com.skilldistillery.jets.jets;

public class CargoPlane extends Jet{
	
	String loadType = "";
	double loadWeight = 0.0;
	
	public CargoPlane(String model, double speed, int range, long price, String loadType, double loadWeight) {
		super(model, speed, range, price);
		this.loadType = loadType;
		this.loadWeight = loadWeight;
	}

	public String getLoadType() {
		return loadType;
	}

	public void setLoadType(String loadType) {
		this.loadType = loadType;
	}

	public double getLoadWeight() {
		return loadWeight;
	}

	public void setLoadWeight(double loadWeight) {
		this.loadWeight = loadWeight;
	}
	
	public void loadCargo(){
		
	}
	
//	@Override
//	public String toString() {
//		return "CargoPlane [loadType=" + loadType + ", loadWeight=" + loadWeight + "]";
//	}
		
}
