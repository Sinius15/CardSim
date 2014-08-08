package com.sinius15.cardsim;

import com.sinius15.cardsim.primary.Getal;
import com.sinius15.cardsim.primary.Kleur;

public class Vars {
	
	//aantal tests per tafel
	public static int aantalTests = 1000*1000*1000;
	
	//aantal kaarten in één hand
	public static int handGrote = 7;
	
	//maximaal aantal klachten.
	public static int MAX_KLACHTEN = 3;
	
	//maximale hoeveelheid dat van één kleur aanwezig mag zijn in een hand.
	public static int MAX_KLEUR_AANTAL = 3;  
	
	//maximale hoeveelheid dat van één getal aanwezig mag zijn in een hand.
	public static int MAX_GETAL_AANTAL = 2;  
	
	//aantal kaarten in één set
	public static int SET_GROTE = Kleur.values().length * Getal.values().length;
	
	//aantal spelers per tafel
	public static int aantal_spelers = 5;

	
	
}
