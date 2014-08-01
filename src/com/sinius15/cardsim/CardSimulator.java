package com.sinius15.cardsim;

public class CardSimulator {
	
	public static int beindigdeSpellen = 0;
	
	public static void main(String[] args) {

		int spelHoeveelheid = 100;
		
		for(int i = 0; i < spelHoeveelheid; i++){
			new Thread(new KaartSpel(), "spel"+i).start();
		}
		
		while(beindigdeSpellen != spelHoeveelheid){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
