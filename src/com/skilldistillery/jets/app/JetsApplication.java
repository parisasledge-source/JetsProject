package com.skilldistillery.jets.app;

import com.skilldistillery.jets.jets.Jet;

public class JetsApplication {

	public static void main(String[] args) {
		// Create two Jets and assign fields
		Jet jet1 = new Jet("UFO1", 8.4, 122069, 4372965234914L);

		Jet jet2 = new Jet();
		jet2.setModel("UFO2");
		jet2.setSpeed(6.5);
		jet2.setRange(182500);
		jet2.setPrice(7499999643699L);

		//1. List fleet
		System.out.println("\n");
		System.out.println("List of the fleet: ");
		System.out.println("===================");
		String jet1Data = jet1.toString();
		String jet2Data = jet2.toString();
		
		//System.out.println("List of the fleet: ");
		System.out.println(jet1Data);
		System.out.println(jet2Data);
		
		//2. Fly all jets
		//Call the fly() method on the entire fleet of jets.
		System.out.println("\n");
		System.out.println("                  All jets' details ");
		System.out.println("                         and");
		System.out.println("the amount of time the jet can fly until it runs out of fuel. ");
		System.out.println("==============================================================");
		jet1.fly();
		jet2.fly();

	}
}