package results.view.models;

import java.util.LinkedList;

import javax.swing.table.AbstractTableModel;

import result.domain.Rezultat;
import result.view.GlavniProzor;

public class ResultTableModel extends AbstractTableModel {
//	private static String[] kolone = new String[7];
	private static String[] kolone = new String[]{"", "Djole", "Dzoni", "Djomla", "David", "Vale", "Cope"};
	
	private LinkedList<Rezultat> rezultati;
	
	public ResultTableModel(LinkedList<Rezultat> rezultati) {
		this.rezultati = rezultati;
	}
	public ResultTableModel() {
		rezultati = new LinkedList<Rezultat>();
	}
	
	@Override
	public String getColumnName(int column) {
		return kolone[column];
	}
	
	public int getColumnCount() {
		return kolone.length;
	}
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		Rezultat r = rezultati.get(rowIndex);
		LinkedList<Integer> rez = r.getRezPoRundi(); 
		switch(columnIndex) {
		case 0: return r.getRedniBrojRunde();
		case 1: return rez.get(0);
		case 2:	return rez.get(1);
		case 3:	return rez.get(2);
		case 4:	return rez.get(3);
		case 5:	return rez.get(4);
		case 6:	return rez.get(5);
		default: return "NN";
		}
	}

	public int getRowCount() {
		return rezultati.size();
	}
	public static void napraviTabelu(String igrac1, String igrac2,
			String igrac3, String igrac4, String igrac5, String igrac6) {
		kolone[0] = "Рунда број:";
		kolone[1] = igrac1;
		kolone[2] = igrac2;
		kolone[3] = igrac3;
		kolone[4] = igrac4;
		kolone[5] = igrac5;
		kolone[6] = igrac6;
	}
	public void staviSveRezultateUTabelu(LinkedList<Rezultat> rezultati) {
		this.rezultati = rezultati;
		fireTableDataChanged();
	}
}
