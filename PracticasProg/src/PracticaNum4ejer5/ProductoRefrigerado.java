package PracticaNum4ejer5;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {
	
	private int codigo;
	private int temperatura;
	private LocalDate envasado;
	private String granjaOrigen;

	public ProductoRefrigerado(LocalDate vencimiento, int numLote, LocalDate envasado, String granjaOrigen, int codigo, int temperatura) {
		super(vencimiento, numLote);
		this.envasado = envasado;
		this.granjaOrigen = granjaOrigen;
		this.codigo = codigo;
		this.temperatura = temperatura;
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
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

	
}
