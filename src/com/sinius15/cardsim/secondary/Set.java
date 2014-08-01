package com.sinius15.cardsim.secondary;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.sinius15.cardsim.Vars;
import com.sinius15.cardsim.primary.Getal;
import com.sinius15.cardsim.primary.Kaart;
import com.sinius15.cardsim.primary.Kleur;

public class Set {
	
	Kaart[] kaarten = new Kaart[Vars.SET_GROTE];
	
	public Set() {
		int i = 0;
		for (Kleur kleur : Kleur.values()) {
			for (Getal getal : Getal.values()) {
				kaarten[i] = new Kaart(kleur, getal);
				i++;
			}
		}
	}
	
	public void schud() {
		List<Kaart> lijst = Arrays.asList(kaarten);
		Collections.shuffle(lijst);
		this.kaarten = lijst.toArray(new Kaart[Vars.SET_GROTE]);
	}
	
	public Hand[] deel(int aantalHanden, String algorythm) {
		if (aantalHanden * Vars.handGrote > Vars.SET_GROTE)
			new IndexOutOfBoundsException("Alle kaarten zijn op! Sorry :( Volgende potje mag je meespelen.");
		
		if(algorythm.equals("fikius")){
			Hand[] out = new Hand[aantalHanden];
			for(int i = 0; i < out.length; i++){
				out[i] = new Hand(new Kaart[Vars.handGrote]);
			}
			
			int ronde = 0; 		//geeft aan op hoeveelste ronde je bent.
			int curHand = 0;	//geeft aan welk stapeltje je aan het verhogen bent
			int i = 0;  		//verhoogt elke kaart
			while(true){
				out[curHand].kaarten[ronde] = kaarten[i];
				i++;
				curHand++;
				if(curHand >= aantalHanden){
					curHand = 0;
					ronde++;
				}
				if(ronde == Vars.handGrote)
					break;
			}
			
			return out;	
		}
		if(algorythm.equals("sinius")){
			Hand[] out = new Hand[aantalHanden];
			for(int i = 0; i < out.length; i++){
				out[i] = new Hand(Arrays.copyOfRange(kaarten, i*Vars.handGrote, (i+1)*Vars.handGrote));
			}
			return out;
		}
		
		return null;
		
		
	}
	
}
