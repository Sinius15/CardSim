package com.sinius15.cardsim;

public class Hand {
	
	public static final int handGrote = 7;
	
	//maximale hoeveelheid dat van één kleur aanwezig mag zijn in een hand.
	public static final int MAX_KLEUR_AANTAL = 3;  
	
	//maximale hoeveelheid dat van één getal aanwezig mag zijn in een hand.
	public static final int MAX_GETAL_AANTAL = 2;  
	
	
	public Kaart[] kaarten;
	
	public Hand(Kaart[] kaarten){
		this.kaarten = kaarten;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("kaarten:" + System.lineSeparator());
		for(Kaart kaart : kaarten){
			builder.append("  - " + kaart.toString() + System.lineSeparator());
		}

		return builder.toString();
	}
	
	public boolean isGoedGeschud(){
		for(Kleur kleur : Kleur.values()){
			if(getKleurHoeveelheid(kleur) > MAX_KLEUR_AANTAL)
				return false;
		}
		for(Getal getal : Getal.values()){
			if(getGetalHoeveelheid(getal) > MAX_GETAL_AANTAL)
				return false;
		}
		return true;
	}
	
	public int getKleurHoeveelheid(Kleur kleur){
		int out = 0;
		for(Kaart kaart : kaarten){
			if(kaart.kleur == kleur)
				out++;
		}
		return out;
	}
	
	public int getGetalHoeveelheid(Getal getal){
		int out = 0;
		for(Kaart kaart : kaarten){
			if(kaart.getal == getal)
				out++;
		}
		return out;
	}
}
