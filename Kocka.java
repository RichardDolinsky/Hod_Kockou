package sk.richard.uloha9_4;

import java.util.Random;

public class Kocka implements Meratelny {
	private int pocetStran;
	private int nahodneCislo;
	private Random generator = new Random();
/**
 * vytvaram kocku s poctom stran
 * @param pocetStran
 */
	public Kocka(int pocetStran) {
		
		this.pocetStran = pocetStran;
	}
/**
 * metoda hod
 * @return nahodneCislo vracia vygenerovane cislo
 */
	public int hod() {
		 nahodneCislo = generator.nextInt(pocetStran)+1;
		
		return nahodneCislo;
	}

	@Override
	public int getMiera() {
		
		return nahodneCislo;
	}
// hodnoty vypise pomocou metody tostring
	@Override
	public String toString() {
		return "Kocka [nahodneCislo=" + nahodneCislo + "]";
	}
	
	
	
	
	

}
