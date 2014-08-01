package com.sinius15.cardsim.tertiair;

import com.sinius15.cardsim.Vars;
import com.sinius15.cardsim.secondary.Hand;
import com.sinius15.cardsim.secondary.Set;
import com.sinius15.cardsim.test.CardSimulator;

public class Tafel implements Runnable{
	
	public float slechtGeschud = 0, goedGeschud = 0;
	
	public int aantalRondjes = Vars.aantalTests;
	
	@Override
	public void run() {
		
		Set kaartSet = new Set();

		Hand[] spelers;
		
		for(int i = 0; i <aantalRondjes; i++){
			kaartSet.schud();
			spelers = kaartSet.deel(Vars.aantal_spelers, "sinius");
			
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
		return slechtGeschud/(goedGeschud+slechtGeschud)*100+"% is slecht geschud.";
	}
}
