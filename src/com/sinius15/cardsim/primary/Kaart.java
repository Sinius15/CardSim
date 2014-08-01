package com.sinius15.cardsim.primary;

public class Kaart {
	
	public Kleur kleur;
	public Getal getal;
	
	public Kaart(Kleur kleur, Getal getal) {
		this.kleur = kleur;
		this.getal = getal;
		if (this.kleur == null || this.getal == null) {
			throw new IllegalArgumentException("Kleur of Getal mag niet NULL zijn!");
		}
	}
	
	@Override
	public String toString() {
		return kleur + " " + getal;
	}
}
