package com.skilldistillery.jets.jets;

public interface CargoCarrier {
	
	public default void loadCargo(){
		
		System.out.println("Load All Cargo Jets");
		
	}

}
