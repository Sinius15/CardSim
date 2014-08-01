package com.sinius15.cardsim;

public class KaartSpel implements Runnable{
	
	public float slechtGeschud = 0, goedGeschud = 0;
	
	@Override
	public void run() {
		
		Set kaartSet = new Set();

		Hand[] spelers = new Hand[7];
		
		for(int i = 0; i <1000000; i++){
			kaartSet.schud();
			for(int j = 0; j < spelers.length; j++){
				spelers[j] = kaartSet.deelVolgende();
			}
			
			int klachten = 0;
			for(Hand speler : spelers){
				if(!speler.isGoedGeschud())
					klachten++;
			}
			if(klachten > 3) //meer dan de helft
				slechtGeschud++;
			else 
				goedGeschud++;
		}
		CardSimulator.beindigdeSpellen++;
		
	}
	
	@Override
	public String toString() {
		return "slecht Geschud:\t\t" + slechtGeschud + System.lineSeparator() +
		"goed Geschud:\t\t" + goedGeschud + System.lineSeparator() +
		slechtGeschud/goedGeschud*100+"% is slecht geschud.";
	}
}
