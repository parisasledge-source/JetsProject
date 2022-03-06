package com.skilldistillery.jets.jets;

public class FighterJet extends Jet{
	
	int weapons = 0;
	int figthers = 0;
	
	public FighterJet(String model, double speed, int range, long price, int weapons, int figthers) {
		super(model, speed, range, price);
		this.weapons = weapons;
		this.figthers = figthers;
	}

	public int getWeapons() {
		return weapons;
	}

	public void setWeapons(int weapons) {
		this.weapons = weapons;
	}

	public int getFigthers() {
		return figthers;
	}

	public void setFigthers(int figthers) {
		this.figthers = figthers;
	}
	
	public void fight() {
		
	}

//	@Override
//	public String toString() {
//		return "FighterJet [weapons=" + weapons + ", figthers=" + figthers + "]";
//	}

}
