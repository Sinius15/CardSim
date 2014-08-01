package com.sinius15.cardsim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Set {
	
	public static final int SET_GROTE = Kleur.values().length * Getal.values().length;
	
	Kaart[] kaarten = new Kaart[SET_GROTE];
	
	public Set(){
		int i = 0;
		for(Kleur kleur : Kleur.values()){
			for(Getal getal : Getal.values()){
				kaarten[i] = new Kaart(kleur, getal);
				i++;
			}
		}
	}
	
	public void schud(){
		List<Kaart> lijst = Arrays.asList(kaarten);
		Collections.shuffle(lijst);
		this.kaarten = lijst.toArray(new Kaart[SET_GROTE]);
		aantalGedeeld = 0;
	}

	private int aantalGedeeld = 0;
	
	public Hand deelVolgende() {
		aantalGedeeld++;
		if(aantalGedeeld*Hand.handGrote > Set.SET_GROTE)
			new IndexOutOfBoundsException("Alle kaarten zijn op! Sorry :( Volgende potje mag je meespelen.");
		return new Hand(Arrays.copyOfRange(kaarten, (aantalGedeeld-1)*Hand.handGrote, aantalGedeeld*Hand.handGrote));
	}
	
}
