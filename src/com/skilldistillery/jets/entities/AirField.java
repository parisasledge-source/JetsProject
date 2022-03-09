package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.jets.jets.CargoPlane;
import com.skilldistillery.jets.jets.FighterJet;
import com.skilldistillery.jets.jets.Jet;
import com.skilldistillery.jets.jets.PassengerPlane;

public class AirField {

	public AirField() {
		this.airField(fileName);
	}

	String fileName = "jets.txt";
	List<Jet> jets = new ArrayList<>();

	public void airField(String fileName) {

		int menuInput = 0;
		do {
			try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
				String line;
				while ((line = bufIn.readLine()) != null) {
					String[] jetRecord = line.split(",");
					String model = jetRecord[1];
					double speed = (Double.parseDouble(jetRecord[2])) * 761.2;// 1 Mach (M) = 761.2 miles per hour (mph)
					int range = Integer.parseInt(jetRecord[3]);
					long price = Long.parseLong(jetRecord[4]);

					if (line.contains("Fighter Jet")) {
						FighterJet j = new FighterJet(model, speed, range, price, 0, 0);
						jets.add(j);
					} else if (line.contains("Cargo Plane")) {
						CargoPlane j = new CargoPlane(model, speed, range, price, "", 0.0);
						jets.add(j);
					} else if (line.contains("Passenger Plane")) {
						PassengerPlane j = new PassengerPlane(model, speed, range, price, 0);
						jets.add(j);
					}

				}
			} catch (IOException e) {
				System.err.println(e);
			}

		} while (menuInput >= 1 && menuInput <= 4);

	}

	public void listFleet() {
		for (Jet j : jets) {
			System.out.println(j);
		}
	}

	public void flyAllJets() {
		/*
		 * Print out the jet details and the amount of time the jet can fly until it
		 * runs out of fuel (based on speed and range).
		 */
		for (int i = 0; i < jets.size(); i++) {
			System.out.println(
					"\nModel: " + jets.get(i).getModel() + ", Speed: " + jets.get(i).getSpeed() 
					+ " Miles Per Hour" + ", Range: " + jets.get(i).getRange() + " Miles" 
							+ ", Price: $" + jets.get(i).getPrice());

			double jTime = (Math.round(jets.get(i).getRange() / jets.get(i).getSpeed() * 100)) / 100.0;
			System.out.println("\nThe amount of time this jet can fly " + "until it runs out of fuel "
					+ "(based on speed and range): \n" + jTime + " hours");
		}

	}

}
