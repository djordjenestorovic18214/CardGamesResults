package view;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

public class GUIKontroler {
	static GlavniProzor glavniProzor;
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
}
