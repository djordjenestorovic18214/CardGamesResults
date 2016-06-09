package result.view;

import java.awt.EventQueue;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import result.domain.Rezultat;
import result.domain.TabelaRezultata;
import results.view.models.ResultTableModel;

public class GUIKontroler {
	private static GlavniProzor glavniProzor;
	private static TabelaRezultata tabela;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tabela = new TabelaRezultata();
					glavniProzor = new GlavniProzor();
					glavniProzor.setVisible(true);
					glavniProzor.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Nova igra
	public static void pokreniNovaIgraProzor() {
		NovaIgra novaIgra = new NovaIgra();
		novaIgra.setVisible(true);
		novaIgra.setLocationRelativeTo(glavniProzor.getContentPane());
	}
	
	//Metoda za dodavanje novog rezultata
	public static void dodajRezultat(String[] igraci) {
		DodajRezultat dodajRezultat = new DodajRezultat();
		dodajRezultat.setVisible(true);
		dodajRezultat.setLocationRelativeTo(glavniProzor.getContentPane());
		dodajRezultat.ispisiIgrace(igraci);
	}
	
	public static LinkedList<Rezultat> vratiRezultate() {
		return tabela.vratiRezultate();
	}
	
	
	
	public static void showConfirmDialog(String title, String message, String btn1, String btn2, int vrstaDijaloga) {
		String[] opcije = new String[2];
		opcije[0] = new String(btn1);
		opcije[1] = new String(btn2);
		
		int opcija;
				
		switch(vrstaDijaloga) {
		default: 
			opcija = JOptionPane.showOptionDialog(glavniProzor.getContentPane(), message, title, 0, JOptionPane.INFORMATION_MESSAGE, null, opcije, null);
			if(opcija == JOptionPane.YES_OPTION)
				System.exit(0);
			break;
		case 1: 
			opcija = JOptionPane.showOptionDialog(glavniProzor.getContentPane(), message,
					title, 0, JOptionPane.ERROR_MESSAGE, null, opcije, null);
			if(opcija == JOptionPane.YES_OPTION)
				System.exit(0);
			break;
		case 2:
			opcija = JOptionPane.showOptionDialog(glavniProzor.getContentPane(), message,
					title, 0, JOptionPane.WARNING_MESSAGE, null, opcije, null);
			if(opcija == JOptionPane.YES_OPTION)
				System.exit(0);
			break;
		}		
	}
	
	public static void ugasiAplikaciju() {
		showConfirmDialog("Затварање апликације...", "Да ли заиста желите да угасите апликацију?", "ДА", "НЕ", 1);
	}

	public static void zapocniIgru(String igra, int brIgraca, int poeniZaPobedu, String igrac1, String igrac2,
			String igrac3, String igrac4, String igrac5, String igrac6) {
		ResultTableModel.napraviTabelu(igrac1, igrac2, igrac3, igrac4, igrac5, igrac6);
		glavniProzor.pocniIgru(igra, brIgraca, poeniZaPobedu);
		glavniProzor.osveziTabelu();
	}

	public static void dodajRezUTabelu(LinkedList<Integer> rezultatiRunde) {
		Rezultat r = new Rezultat();
		r.setRedniBrojRunde(tabela.vratiRezultate().size() + 1);
		r.setRezPoRundi(rezultatiRunde);
		tabela.dodajRezultat(r);
		glavniProzor.osveziTabelu();
	}
}
