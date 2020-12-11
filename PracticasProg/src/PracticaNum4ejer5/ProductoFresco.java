package PracticaNum4ejer5;

import java.time.LocalDate;

public class ProductoFresco extends Producto {

	private LocalDate envasado;
	private String granjaOrigen;
	
	public ProductoFresco(LocalDate vencimiento, int numLote, LocalDate envasado, String granjaOrigen) {
		super(vencimiento, numLote);
		// TODO Auto-generated constructor stub
		this.envasado = envasado;
		this.granjaOrigen = granjaOrigen;
	}

	public LocalDate getEnvasado() {
		return envasado;
	}

	public void setEnvasado(LocalDate envasado) {
		this.envasado = envasado;
	}

	public String getGranjaOrigen() {
		return granjaOrigen;
	}

	public void setGranjaOrigen(String granjaOrigen) {
		this.granjaOrigen = granjaOrigen;
	}
	
	public String toString() {
		return "vence: " + getVencimiento() + "\nEl numero de lote es: " + getNumLote() + "\nFue envasado el: " + getEnvasado() + "\nLa granja de origen se llama: " + getGranjaOrigen();
	}

}
