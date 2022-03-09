package com.skilldistillery.jets.app;

import java.util.Scanner;
import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {

	static Scanner sc = new Scanner(System.in);

	private static AirField field = new AirField();

	public static void main(String[] args) {

		JetsApplication jet = new JetsApplication();

		jet.launch();
	}

	private void launch() {
		displayUserMenu();
	}

	private void displayUserMenu() {

		boolean displayUserMenu = true;
		String fileName = "";
		int menuInput = 0;
		// List<Jet> jets = null;

		// Prompt the user to choose from the menu.
		/*
		 * System.out.println("\n"); System.out.println("Please choose :");
		 * System.out.println("============================================");
		 * System.out.println("1: List all Fleet.");
		 * 
		 * 
		 * menuInput = sc.nextInt();
		 * 
		 * if (menuInput == 1) {
		 * 
		 * //List of all existing food trucks. System.out.println("\n");
		 * System.out.println("List of Fleet: ");
		 * System.out.println("================================="); menuInput =
		 * sc.nextInt(); field.printFleet(); }
		 */

		field.listFleet();
		field.flyAllJets();
		field.viewFastestJet();
		field.viewLongestRange();
		field.addJetToFleet();
		field.removeJetFromFleet();
	}

}