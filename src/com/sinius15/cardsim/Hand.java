package com.sinius15.cardsim;

public class Hand {
	
	public static final int handGrote = 7;
	
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
	
	
}
