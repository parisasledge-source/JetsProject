package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.jets.CargoPlane;
import com.skilldistillery.jets.jets.FighterJet;
import com.skilldistillery.jets.jets.Jet;
import com.skilldistillery.jets.jets.PassengerPlane;

public class AirField {
	
	static Scanner sc = new Scanner(System.in);

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

	//Print out the model, speed, range, and price of each jet. 
	public void listFleet() {
		
		for (Jet j : jets) {
			System.out.println(j);
		}
	}

	//Print out the jet details and the amount of time the jet can fly until it
	//runs out of fuel (based on speed and range).
	public void flyAllJets() {
		
		for (int i = 0; i < jets.size(); i++) {
			System.out.println(
					"\nModel: " + jets.get(i).getModel() + ", Speed: " + jets.get(i).getSpeed() + " Miles Per Hour"
							+ ", Range: " + jets.get(i).getRange() + " Miles" + ", Price: $" + jets.get(i).getPrice());

			double jTime = (Math.round(jets.get(i).getRange() / jets.get(i).getSpeed() * 100)) / 100.0;
			System.out.println("\nThe amount of time this jet can fly " + "until it runs out of fuel "
					+ "(based on speed and range): \n" + jTime + " hours");
		}

	}

	//View fastest jet and print out all of the information about a jet.
	public void viewFastestJet() {
		double temp = 0;
		int fastID = 0;
		for (int i = 0; i < jets.size(); i++) {

			if (jets.get(i).getSpeed() > temp) {
				// swap elements
				temp = jets.get(i).getSpeed();

				fastID = i;
			}
		}
		
		System.out.println("\n" + jets.get(fastID).getModel() + " (" + jets.get(fastID).getSpeed() + " mph) is the fastest jet of the fleet.");
		System.out.println("\nDetails: ");
		System.out.println(
				"\nModel: " + jets.get(fastID).getModel() + ", Speed: " + jets.get(fastID).getSpeed() + " Miles Per Hour"
						+ ", Range: " + jets.get(fastID).getRange() + " Miles" + ", Price: $" + jets.get(fastID).getPrice());

	}

	//View longest range and print out all of the information about a jet.
	public void viewLongestRange() {
		double temp = 0;
		int longestRangeID = 0;
		for (int i = 0; i < jets.size(); i++) {
			
			if (jets.get(i).getRange() > temp) {
				// swap elements
				temp = jets.get(i).getRange();
				
				longestRangeID = i;
			}
		}
		
		System.out.println("\n" + jets.get(longestRangeID).getModel() + " (" + jets.get(longestRangeID).getRange() + " miles range) is the longest range jet of the fleet.");
		System.out.println("\nDetails: ");
		System.out.println(
				"\nModel: " + jets.get(longestRangeID).getModel() + ", Speed: " + jets.get(longestRangeID).getSpeed() + " Miles Per Hour"
						+ ", Range: " + jets.get(longestRangeID).getRange() + " Miles" + ", Price: $" + jets.get(longestRangeID).getPrice());
		
	}
	
	public void removeJetFromFleet() {
		
		System.out.println("\n");
		System.out.println("Please choose a number to remove the jet from the fleet: ");
		System.out.println("=========================================================");
		for (int i = 0; i < 5; i++) {
			
			System.out.println((i + 1) + ": " + jets.get(i).getModel());
		}
		
		int userInput = sc.nextInt();

			jets.remove(userInput - 1);
			
			System.out.println("\nThe new list of fleet of jets: ");
			for (int i = 0; i < jets.size(); i++) {
				System.out.println(
						"\nModel: " + jets.get(i).getModel() + ", Speed: " + jets.get(i).getSpeed() + " Miles Per Hour"
								+ ", Range: " + jets.get(i).getRange() + " Miles" + ", Price: $" + jets.get(i).getPrice());
		}
		
	}
}



