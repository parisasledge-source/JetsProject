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
		
		int menuInput = 0;

		do{
			
			//Prompt the user to choose from the menu.
			System.out.println("\n");
			System.out.println("Please choose between 1 to 10 from the menu:--make sure to enter twice after each input entry");
			System.out.println("==============================================================================================");
			System.out.println(" 1: List fleet");
			System.out.println(" 2: Fly all jets");
			System.out.println(" 3: View fastest jet");
			System.out.println(" 4: View jet with longest range");
			System.out.println(" 5: Load all Cargo Jets");
			System.out.println(" 6: Dogfight!");
			System.out.println(" 7: Rescue Mission!");
			System.out.println(" 8: Remove a jet from Fleet");
			System.out.println(" 9: Add a jet to Fleet");
			System.out.println("10: Quit");
			
			menuInput = sc.nextInt();
			
			if (menuInput == 1) {
				
				//List of all existing fleets.
				System.out.println("\n");
				System.out.println("List of all existing fleets: ");
				System.out.println("=============================");
				field.listFleet();	
	
			}
			else if (menuInput == 2) {
				
				//Print out the jet details and the amount of time the jet can fly until it
				//runs out of fuel (based on speed and range).
				System.out.println("\n");
				System.out.println("All jet details and the amount of time they can fly until they run out of fuel: ");
				System.out.println("================================================================================");
				field.flyAllJets();

			}
			else if (menuInput == 3) {
				
				//View fastest jet.
				System.out.println("\n");
				System.out.println("The fastest jet and all of the information about that jet: ");
				System.out.println("===========================================================");
				field.viewFastestJet();
				
			}
			else if (menuInput == 4) {
				
				//View jet with longest range.
				System.out.println("\n");
				System.out.println("The longest range jet and all of the information about that jet: ");
				System.out.println("==================================================================");
				field.viewLongestRange();	
	
			}
			else if (menuInput == 5) {
				
				//Load all Cargo Jets.
				System.out.println("\n");
				System.out.println("Load all Cargo Jets: ");
				System.out.println("=====================");
				field.loadAllCargoJets();

			}
			else if (menuInput == 6) {
				
				//Dogfight!
				System.out.println("\n");
				System.out.println("Dogfight! ");
				System.out.println("==========");
				field.Dogfight();
				
			}
			else if (menuInput == 7) {
				
				//Rescue Mission!
				System.out.println("\n");
				System.out.println("Rescue Mission! ");
				System.out.println("================");
				field.rescueMission();	
			
			}
			else if (menuInput == 8) {
				
				//Remove a jet from Fleet.
				System.out.println("\n");
				System.out.println("Remove a jet from Fleet ");
				System.out.println("========================");
				field.removeJetFromFleet();
			
			}
			else if (menuInput == 9) {
				
				//Add a jet to fleet.
				System.out.println("\n");
				System.out.println("Add a jet to fleet: ");
				System.out.println("====================");
				field.addJetToFleet();
				
			}
			//Quit
			else if (menuInput == 10){
				System.out.println("\n");
				System.out.println("You have chosen to quit the program.\nHave a nice day!");
				break;
			}
			
		}while (menuInput >= 1 && menuInput <= 10);
		
	  

	}

}