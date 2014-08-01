package com.sinius15.cardsim.test;

import com.sinius15.cardsim.Vars;
import com.sinius15.cardsim.secondary.Hand;
import com.sinius15.cardsim.secondary.Set;

public class Tafel implements Runnable{
	
	public float slechtGeschud = 0, goedGeschud = 0;
	
	private int aantalSpelletjes;
	
	public Tafel(int aantalSpelletjes){
		this.aantalSpelletjes = aantalSpelletjes;
	}
	
	@Override
	public void run() {
		
		Set kaartSet = new Set();

		Hand[] spelers = new Hand[7];
		
		for(int i = 0; i <aantalSpelletjes; i++){
			kaartSet.schud();
			spelers = kaartSet.deel(7, "sinius");
			
			int klachten = 0;
			for(Hand speler : spelers){
				if(!speler.isGoedGeschud())
					klachten++;
			}
			if(klachten > Vars.MAX_KLACHTEN) //meer dan de helft
				slechtGeschud++;
			else 
				goedGeschud++;
		}
		CardSimulator.beindigdeSpellen++;
		
	}
	
	@Override
	public String toString() {
		return slechtGeschud/goedGeschud*100+"% is slecht geschud.";
	}
}
