package com.sinius15.cardsim.test;

import com.sinius15.cardsim.Vars;
import com.sinius15.cardsim.tertiair.Tafel;

public class CardSimulator {
	
	public static int beindigdeSpellen;

	public static void main(String[] args) {
		
		Tafel tafel = new Tafel();
		tafel.run();
		System.out.println(tafel);
		System.out.println(getSettingString());
	}
	
	public static String getSettingString(){
		return "settings: "+ System.lineSeparator()
				+ " - maximaal zelfde kleur: \t" + Vars.MAX_KLEUR_AANTAL + System.lineSeparator()
				+ " - maximaal zelfde getal: \t" + Vars.MAX_GETAL_AANTAL + System.lineSeparator()
				+ " - maximaal aantal klachten: \t" + Vars.MAX_KLACHTEN + System.lineSeparator()
				+ " - aantal spelers: \t \t" + Vars.aantal_spelers + System.lineSeparator()
				+ " - aantal kaarten in hand: \t" + Vars.handGrote + System.lineSeparator()
				+ " - aantal tests: \t \t" + Vars.aantalTests + System.lineSeparator();
//				+ " - : \t" +  + System.lineSeparator()
//				+ " - : \t" +  + System.lineSeparator()
//				+ " - : \t" +  + System.lineSeparator();
	}
	
}
