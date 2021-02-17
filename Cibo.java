package macchinette;

public class Cibo extends Prodotto {
	private int calorie;

	public Cibo(String cod, float prezzo, String nome, int calorie) {
		super(cod, prezzo, nome);
		this.calorie= calorie;
	}
	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	public String toString() {
		return "Cibo [calorie=" + calorie + super.toString() +"]";
	}
	
}
