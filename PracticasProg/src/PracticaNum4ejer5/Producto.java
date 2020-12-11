package PracticaNum4ejer5;

import java.time.LocalDate;

public class Producto {
	
	private LocalDate vencimiento;
	private int numLote = 1;

	
	public Producto(LocalDate vencimiento, int numLote) {
		this.vencimiento = vencimiento;
		this.numLote = numLote;
	}

	public LocalDate getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(LocalDate vencimiento) {
		this.vencimiento = vencimiento;
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}
	
	public String getAtributos() {
		return "La fecha de vencimiento es el: " + vencimiento + " y su numero de lote es: " + numLote;
	}
	
	public String toString() {
		return 	"----Fecha de Vencimiento: "+this.vencimiento+
				"\n----Nro. Lote: "+this.numLote;
	}
	
}
