package results.view.models;

import java.util.LinkedList;

import javax.swing.table.AbstractTableModel;

import result.domain.Rezultat;

public class ResultTableModel extends AbstractTableModel{
	private static String[] kolone = new String[7];
	private LinkedList<Rezultat> rezultati;
	public ResultTableModel(LinkedList<Rezultat> rezultati) {
		if(rezultati == null) {
			this.rezultati = new LinkedList<Rezultat>();
		} else {
			this.rezultati = rezultati;
		}
	}
	@Override
	public String getColumnName(int column) {
		return kolone[column];
	}
	
	public int getColumnCount() {
		return kolone.length;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void napraviTabelu(String txtIgracBr_1, String txtIgracBr_2,
			String txtIgracBr_3, String txtIgracBr_4, String txtIgracBr_5, String txtIgracBr_6) {
		kolone[0] = "#";
		kolone[1] = txtIgracBr_1;
		kolone[2] = txtIgracBr_2;
		if(txtIgracBr_3 != null)
			kolone[3] = txtIgracBr_3;
		if(txtIgracBr_4 != null)
			kolone[4] = txtIgracBr_4;
		if(txtIgracBr_5 != null)
			kolone[5] = txtIgracBr_5;
		if(txtIgracBr_6 != null)
			kolone[6] = txtIgracBr_6;
		
	}
	
	
}
