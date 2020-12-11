package PrimerPrograma;

public class Dado {

	private int cara;
	private int cantidadCaras;
	
	public Dado() {
		cantidadCaras=6;
		tirar();
	}
	
	public Dado(int cantidadCaras) {
		this.setCantidadCaras(cantidadCaras);
		tirar();
	}
	
	public int tirar() {
		cara =  (int)  (Math.random()*cantidadCaras)+1;
		return cara;
	}
	
	public int getCara() {
		return cara;
	}

	public int getCantidadCaras() {
		return cantidadCaras;
	}
	
	public void setCantidadCaras(int cantCaras) {
		if (cantCaras <=0) {
			cantCaras = 6;
		}
		cantidadCaras=cantCaras;
		tirar();
		
	}
	
}
