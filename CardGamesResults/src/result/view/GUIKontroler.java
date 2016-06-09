package result.view;

import java.awt.EventQueue;
import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import result.domain.Rezultat;
import results.view.models.ResultTableModel;

public class GUIKontroler {
	static GlavniProzor glavniProzor;
	private static LinkedList<Rezultat> rezultati;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					glavniProzor = new GlavniProzor();
					glavniProzor.setVisible(true);
					glavniProzor.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void pokreniNovaIgraProzor() {
		NovaIgra novaIgra = new NovaIgra();
		novaIgra.setVisible(true);
		novaIgra.setLocationRelativeTo(glavniProzor.getContentPane());
	}
	
	public static LinkedList<Rezultat> vratiRezultate() {
		return rezultati;
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

	public static void zapocniIgru(int brIgraca, String txtPobeda, String txtIgracBr_1, String txtIgracBr_2,
			String txtIgracBr_3, String txtIgracBr_4, String txtIgracBr_5, String txtIgracBr_6) {
		ResultTableModel.napraviTabelu(txtIgracBr_1, txtIgracBr_2, txtIgracBr_3, txtIgracBr_4, txtIgracBr_5, txtIgracBr_6);
	}
}
