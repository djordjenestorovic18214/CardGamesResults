package result.domain;

import java.util.LinkedList;

public class Rezultat {

	private int redniBrojRunde;
	private LinkedList<Integer> rezPoRundi = new LinkedList<Integer>();
	
	public LinkedList<Integer> getRezPoRundi() {
		return rezPoRundi;
	}
	public void setRezPoRundi(LinkedList<Integer> rezPoRundi) {
		this.rezPoRundi = rezPoRundi;
	}
	public int getRedniBrojRunde() {
		return redniBrojRunde;
	}
	public void setRedniBrojRunde(int redniBrojRunde) {
		this.redniBrojRunde = redniBrojRunde;
	}
}
