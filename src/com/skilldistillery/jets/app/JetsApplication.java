package com.skilldistillery.jets.app;

import com.skilldistillery.jets.jets.Jet;

public class JetsApplication {

	public static void main(String[] args) {
		// Create two Jets and assign fields
		Jet jet1 = new Jet("UFO1", 7.2, 20, 4372965234914L);

		Jet jet2 = new Jet();
		jet2.setModel("UFO2");
		jet2.setSpeed(9.6);
		jet2.setRange(25);
		jet2.setPrice(7499999643699L);

		//1. List fleet
		String jet1Data = jet1.toString();
		String jet2Data = jet2.toString();
		
		System.out.println("List of the fleet: ");
		System.out.println(jet1Data);
		System.out.println(jet2Data);
		
		//2. Fly all jets
		//jet1.fly();
		//jet2.fly();
	}
}