package com.sinius15.cardsim;

import com.sinius15.cardsim.primary.Getal;
import com.sinius15.cardsim.primary.Kaart;
import com.sinius15.cardsim.primary.Kleur;

public class Hand {
	
	public Kaart[] kaarten;
	
	public Hand(Kaart[] kaarten) {
		this.kaarten = kaarten;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("kaarten:" + System.lineSeparator());
		for (Kaart kaart : kaarten) {
			builder.append("  - " + kaart.toString() + System.lineSeparator());
		}
		
		return builder.toString();
	}
	
	public boolean isGoedGeschud() {
		for (Kleur kleur : Kleur.values()) {
			if (getKleurHoeveelheid(kleur) > Vars.MAX_KLEUR_AANTAL)
				return false;
		}
		for (Getal getal : Getal.values()) {
			if (getGetalHoeveelheid(getal) > Vars.MAX_GETAL_AANTAL)
				return false;
		}
		return true;
	}
	
	public int getKleurHoeveelheid(Kleur kleur) {
		int out = 0;
		for (Kaart kaart : kaarten) {
			if (kaart.kleur == kleur)
				out++;
		}
		return out;
	}
	
	public int getGetalHoeveelheid(Getal getal) {
		int out = 0;
		for (Kaart kaart : kaarten) {
			if (kaart.getal == getal)
				out++;
		}
		return out;
	}
}
