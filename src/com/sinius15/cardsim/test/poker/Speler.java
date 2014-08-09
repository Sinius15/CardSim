package com.sinius15.cardsim.test.poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sinius15.cardsim.primary.Kaart;
import com.sinius15.cardsim.primary.Kleur;
import com.sinius15.cardsim.secondary.Hand;

public class Speler extends Hand {

	public int pair, twoPair, threeOfKind, wins;

	public Speler() {
		super(null);
	}
	
	public void speel(Kaart[] inHand, Kaart[] opTafel){
		ArrayList<Kaart> kaarten = new ArrayList<>();
		kaarten.addAll(Arrays.asList(inHand));
		kaarten.addAll(Arrays.asList(opTafel));
		int pairs = getPairAmount(kaarten);
		this.kaarten = kaarten.toArray(new Kaart[kaarten.size()]);
		for(Kleur k : Kleur.values()){
			if(getKleurHoeveelheid(k) == 3){
				System.out.println(super.toString());
				threeOfKind++;
				return;
			}
		}
		if(pairs == 2)
			twoPair++;
		else if(pairs == 1)
			pair++;
		
		
	}
	
	private int getPairAmount(List<Kaart> kaarten){
		int i = 0;
		for(Kaart kaarta : kaarten){
			for(Kaart kaartb : kaarten){
				if(kaarta.equals(kaartb))
					continue;
				if(kaarta.getal == kaartb.getal)
					i++;
			}
		}
		
		return i/2;
	}

	@Override
	public String toString() {
		return "Speler [pair=" + pair + ", twoPair=" + twoPair
				+ ", threeOfKind=" + threeOfKind + ", wins=" + wins + "]";
	}
	
	
}
