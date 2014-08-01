package com.sinius15.cardsim;

import com.sinius15.cardsim.primary.Getal;
import com.sinius15.cardsim.primary.Kleur;

public class Vars {
	
	//aantal tests per tafel
	public static final int aantalTests = 1000*1000;
	
	//aantal kaarten in één hand
	public static final int handGrote = 7;
	
	//maximaal aantal klachten.
	public static final int MAX_KLACHTEN = 5;
	
	//maximale hoeveelheid dat van één kleur aanwezig mag zijn in een hand.
	public static final int MAX_KLEUR_AANTAL = 3;  
	
	//maximale hoeveelheid dat van één getal aanwezig mag zijn in een hand.
	public static final int MAX_GETAL_AANTAL = 2;  
	
	//aantal kaarten in één set
	public static final int SET_GROTE = Kleur.values().length * Getal.values().length;
	
	//aantal spelers per tafel
	public static final int aantal_spelers = 5;

	
	
}
