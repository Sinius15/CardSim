package com.sinius15.cardsim;

import java.util.Arrays;

public class Hand {
	
	public static final int handGrote = 7;
	
	public Kaart[] kaarten =  new Kaart[7];
	
	public Hand(Kaart[] kaarten){
		this.kaarten = kaarten;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hand [");
		if (kaarten != null) {
			builder.append("kaarten=" + System.lineSeparator());
			for(Kaart kaart : kaarten){
				builder.append("  - " + kaart.toString() + System.lineSeparator());
			}
			builder.append(Arrays.toString(kaarten));
		}
		builder.append("]");
		return builder.toString();
	}
	
	
}
