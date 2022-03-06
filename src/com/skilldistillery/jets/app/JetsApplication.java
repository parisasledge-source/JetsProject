package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.skilldistillery.jets.jets.CargoPlane;
import com.skilldistillery.jets.jets.FighterJet;
import com.skilldistillery.jets.jets.Jet;

public class JetsApplication {

	public static void main(String[] args) {

		BufferedReader bufIn = null;
		try {
			bufIn = new BufferedReader(new FileReader("jets.txt"));
			String line;
			while ((line = bufIn.readLine()) != null) {

				// System.out.println(line);
				if (line.contains("UFO1")) {
					System.out.println(line);
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (bufIn != null) {
				try {
					bufIn.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}
		
//		FighterJet fighter1 = new FighterJet("", 0.0, 0, 00000, 0, 0);
//		CargoPlane cargo1 = new CargoPlane("", 0.0, 0, 00000, "", 0.0);

		// Create two Jets and assign fields
		Jet jet1 = new FighterJet("UFO1", 8.4, 122069, 4372965234914L, 0, 0);
		Jet jet2 = new CargoPlane("UFO2", 6.5, 182500, 7499999643699L, "", 0.0);
	

		// 1. List fleet
		System.out.println("\n");
		System.out.println("List of the fleet: ");
		System.out.println("===================");
		String jet1Data = jet1.toString();
		String jet2Data = jet2.toString();
		System.out.println(jet1Data);
		System.out.println(jet2Data);

		// 2. Fly all jets
		// Call the fly() method on the entire fleet of jets.
		System.out.println("\n");
		System.out.println("                  All jets' details ");
		System.out.println("                         and");
		System.out.println("the amount of time the jet can fly until it runs out of fuel. ");
		System.out.println("==============================================================");
		jet1.fly();
		jet2.fly();

		// 3. View fastest jet

	}
}