package com.sinius15.cardsim.test.poker;

import com.sinius15.cardsim.Vars;
import com.sinius15.cardsim.primary.Kaart;
import com.sinius15.cardsim.secondary.Set;


public class PokerMath {
//dit heeft nooit goed gewerkt.
	public static void main(String[] args) {
		Set set = new Set();
		Speler[] spelers = new Speler[5];
		for(int i = 0; i < spelers.length; i++){
			spelers[i] = new Speler();
		}
		
		for(int i = 0; i <Vars.aantalTests; i++){
			set.schud();
			
			Kaart[] opTafel = new Kaart[5];
			for(int j = 0; j < opTafel.length; j++)
				opTafel[j] = set.nextKaart();
			
			for(Speler speler : spelers){
				speler.speel(new Kaart[]{set.nextKaart(), set.nextKaart()}, opTafel);
			}
		}
		for(int i = 0; i < spelers.length; i++){
			System.out.println(spelers[i].toString());
		}
	}
	
}
