package sk.richard.uloha9_4;

public class MnozinaDat {
	private Meratelny maximum;
	private Meratelny minimum;
	private int pocetPrvkov;
	private double sucet;
	
	
	public MnozinaDat() {
	
	}
	
/**
 * pridava prvky do mnoziny dat
 * @param prvok hodnota ktora je vkladana do mnoziny
 */
	public void pridaj(Meratelny prvok) {
		if(pocetPrvkov == 0 || prvok.getMiera() > maximum.getMiera()) {
			
			maximum=prvok;
		
			
		}
		if(pocetPrvkov==0 || prvok.getMiera()< minimum.getMiera()) {
			minimum=prvok;
		}
		pocetPrvkov++;
		sucet +=prvok.getMiera();
		
	}
/**
 * vracia hodnoty maxima
 * @return maxima maximalna hodnota
 */
	public Meratelny getMaximum() {
		
		return maximum;
	}
	/**
	 * vracia hodnoty minima
	 * @return minimum minumalna hodnota
	 */
	public Meratelny getMinimum() {
		
		return minimum;
	}
	/**
	 * vypocita priemer z hodnot mnoziny dat
	 * @return sucet/pocetPrvkov sucet deli poctom prvkov
	 */
	public double getPriemer() {
		if(pocetPrvkov ==0) {
			return 0;
		}
		else {
			return sucet/pocetPrvkov;
		}
	}
	/**
	 * metoda vypisuje naraz maximalne hodene cislo a minimalne cislo
	 */
	public void ukazCisla() {
		System.out.println("Najvacsie cislo je: "+ maximum.getMiera());
		System.out.println("Najmensie cislo je: " + minimum.getMiera());
		
				
		
		
	}

}
