package PracticaNum4ejer5;

import java.time.LocalDate;

public class CongeladoPorAgua extends ProductoCongelado {

	private int gramosDeSal;
	private int litrosDeAgua;
	
	private double salinidad;
	
	public CongeladoPorAgua(LocalDate vencimiento, int numLote, LocalDate envasado, String granjaOrigen, int codigo,
			int temperatura, int gramosDeSal, int litrosDeAgua) {
		super(vencimiento, numLote, envasado, granjaOrigen, codigo, temperatura);
		// TODO Auto-generated constructor stub
		this.gramosDeSal = gramosDeSal;
		this.litrosDeAgua = litrosDeAgua;
		this.salinidad = getSalinidad();
	}

	public int getGramosDeSal() {
		return gramosDeSal;
	}

	public void setGramosDeSal(int gramosDeSal) {
		this.gramosDeSal = gramosDeSal;
	}

	public int getLitrosDeAgua() {
		return litrosDeAgua;
	}

	public void setLitrosDeAgua(int litrosDeAgua) {
		this.litrosDeAgua = litrosDeAgua;
	}

	public double getSalinidad() {
		salinidad = gramosDeSal / litrosDeAgua;
		return salinidad;
	}

	public void setSalinidad(int salinidad) {
		this.salinidad = salinidad;
	}

	public String toString() {
		return super.toString()+"\n---- Salinidad: " + this.salinidad;
	}
	
}
