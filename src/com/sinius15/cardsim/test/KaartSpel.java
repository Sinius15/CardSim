package com.sinius15.cardsim.test;

import com.sinius15.cardsim.Hand;
import com.sinius15.cardsim.Set;

public class KaartSpel implements Runnable{
	
	public float slechtGeschud = 0, goedGeschud = 0;
	
	private int aantalSpelletjes;
	
	public KaartSpel(int aantalSpelletjes){
		this.aantalSpelletjes = aantalSpelletjes;
	}
	
	@Override
	public void run() {
		
		Set kaartSet = new Set();

		Hand[] spelers = new Hand[7];
		
		for(int i = 0; i <aantalSpelletjes; i++){
			kaartSet.schud();
			for(int j = 0; j < spelers.length; j++){
				spelers[j] = kaartSet.deelVolgende();
			}
			
			int klachten = 0;
			for(Hand speler : spelers){
				if(!speler.isGoedGeschud())
					klachten++;
			}
			if(klachten > spelers.length/2) //meer dan de helft
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