package com.skilldistillery.jets.app;

import com.skilldistillery.jets.jets.Jet;

public class JetsApplication {

	public static void main(String[] args) {
		// Create two Jets and assign fields
		Jet jet1 = new Jet("UFO1", 7.2, 20.00, 4372965234914.35);

		Jet jet2 = new Jet();
		jet2.setModel("UFO2");
		jet2.setSpeed(9.6);
		jet2.setRange(24.72);
		jet2.setPrice(7499999643699.30);

		// Have the jets display themselves
		jet1.displayJet();
		jet2.displayJet();

		String jet1Data = jet1.toString();
		String jet2Data = jet2.toString();

		// Get the jets' data and display that
		System.out.println("Jet 1 data: " + jet1Data);
		System.out.println("Jet 2 data: " + jet2Data);
	}

}