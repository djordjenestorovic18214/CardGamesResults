package result.domain;

import java.util.LinkedList;

public class TabelaRezultata {
	LinkedList<Rezultat> rezultati;

	public TabelaRezultata(LinkedList<Rezultat> rezultati) {
		this.rezultati = rezultati;
	}
	
	public TabelaRezultata() {
		this.rezultati = new LinkedList<Rezultat>();
	}
	
	public void dodajRezultat(Rezultat rezultat) {
		rezultati.add(rezultat);
	}
	
	public void izbrisiRezultate() {
		rezultati.clear();
	}
	
	public LinkedList<Rezultat> vratiRezultate() {
		return rezultati;
	}
}

