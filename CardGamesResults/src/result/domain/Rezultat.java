package result.domain;

public class Rezultat {
	private int rbRunde;
	private int[] rezPoRundi = new int[7];
	
	public int getRbRunde() {
		return rbRunde;
	}
	public void setRbRunde(int rbRunde) {
		this.rbRunde = rbRunde;
	}
	public int[] getRezPoRundi() {
		return rezPoRundi;
	}
	public void setRezPoRundi(int[] rezPoRundi) {
		this.rezPoRundi = rezPoRundi;
	}
}
