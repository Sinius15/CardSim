package com.sinius15.cardsim;

public class CardSimulator {
	
	public static void main(String[] args) {
		Set kaartSet = new Set();
		
		int slechtGeschud = 0, goedGeschud = 0;
		
		Hand[] spelers = new Hand[4];
		for(int i = 0; i <1000; i++){
			kaartSet.schud();
			for(int j = 0; j < spelers.length; j++){
				spelers[j] = kaartSet.deelVolgende();
			}
			
			int klachten = 0;
			for(Hand speler : spelers){
				if(!speler.isGoedGeschud())
					klachten++;
			}
			if(klachten > spelers.length/2)
				slechtGeschud++;
			else 
				goedGeschud++;
		}
		
		System.out.println("slecht Geschud: " + slechtGeschud);
		System.out.println("goed Geschud: " + goedGeschud);
		
	}
	
}
