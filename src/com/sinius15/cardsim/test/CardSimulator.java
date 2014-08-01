package com.sinius15.cardsim.test;

import java.util.ArrayList;

import com.sinius15.cardsim.Vars;

public class CardSimulator {
	
	public static int beindigdeSpellen;

	
	public static void main(String[] args) {
		for(int i = 1; i < 100; i++){
			doSpellen(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static long doSpellen(int tafels){
		beindigdeSpellen = 0;
		long startTijd = System.currentTimeMillis();
		
		ArrayList<KaartSpel> spellen = new ArrayList<>();
		
		for(int i = 0; i < tafels; i++){
			KaartSpel k = new KaartSpel(Vars.aantalPerTest/tafels);
			spellen.add(k);
			new Thread(k, "spel"+i).start();
		}
		
		while(beindigdeSpellen != tafels){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		long eindTijd = System.currentTimeMillis();
		
		float goed = 0;
		float slecht = 0;
		for(KaartSpel k : spellen){
			goed += k.goedGeschud;
			slecht += k.slechtGeschud;
		}
		
		System.out.println("test "+tafels+" tafels elk "+Vars.aantalPerTest/tafels+" spellen. tijd: \t" + (eindTijd - startTijd)/1000 + " seconden  \t" + slecht/goed*100+"% is slecht geschud.");
		
		return eindTijd - startTijd;
	}
	
}
