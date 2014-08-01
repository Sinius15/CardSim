package com.sinius15.cardsim;

public class CardSimulator {
	
	public static void main(String[] args) {
		Set kaartSet = new Set();
		kaartSet.schud();
		
		Hand speler1 = kaartSet.deelVolgende();
		Hand speler2 = kaartSet.deelVolgende();
		System.out.println("speler 1: ");
		System.out.println(speler1);
		System.out.println("speler 2: ");
		System.out.println(speler2);
	}
	
}
