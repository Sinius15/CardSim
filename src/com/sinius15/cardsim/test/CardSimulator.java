package com.sinius15.cardsim.test;

import java.io.FileWriter;
import java.io.IOException;

import com.sinius15.cardsim.Vars;
import com.sinius15.cardsim.tertiair.Tafel;

public class CardSimulator {
	
	public static int beindigdeSpellen;

	public static void main(String[] args) throws IOException {
		StringBuilder outt = new StringBuilder();
		
		for(int i = 1; i <= 7; i++){
			
			Vars.aantal_spelers = i;
			
			Tafel tafel = new Tafel();
			tafel.run();
			outt.append(tafel + System.lineSeparator());
			outt.append(getSettingString() + System.lineSeparator() + System.lineSeparator());
		}
		
		FileWriter wr = new FileWriter("test Aantal Spelers.txt");
		wr.write(outt.toString());
		wr.flush();
		wr.close();
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
