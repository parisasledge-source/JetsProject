package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.skilldistillery.jets.jets.Jet;

public class JetsApplication {

	public static void main(String[] args) {
		
		BufferedReader bufIn = null;
		try {
		  bufIn = new BufferedReader(new FileReader("jets.txt"));
		  String line;
		  while ((line = bufIn.readLine()) != null) {
			  
			  //System.out.println(line);
			  if (line.contains("UFO1")) {
		          System.out.println(line);
		        }
		  }
		}
		catch (IOException e) {
		  System.err.println(e);
		}
		finally {
		  if (bufIn != null) {
		    try {
		      bufIn.close();
		    }
		    catch (IOException e) {
		      System.err.println(e);
		    }
		  }
		}
		
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
		
		//3. View fastest jet
		
		
		

	}
}