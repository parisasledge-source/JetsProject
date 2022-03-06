package com.skilldistillery.jets.entities;

import com.skilldistillery.jets.jets.Jet;

public class AirField {
	private int numJets = 0;
	private Jet[] jets;

	private static final int MAX_JETS = 5;

	public AirField() {
		jets = new Jet[MAX_JETS];
	}

	public void addJet(Jet jetToBeParked) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				jets[i] = jetToBeParked;
				numJets++;
				System.out.println(numJets);
				break;
			}
			System.out.println("Space available");
		}
	}

	public Jet[] getJets() {
		Jet[] availableJets = new Jet[numJets];

		int availJetNum = 0;

		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				availableJets[availJetNum] = jets[i];
				availJetNum++;
			}
		}
		return availableJets;
	}
}
