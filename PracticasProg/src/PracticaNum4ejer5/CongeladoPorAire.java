package PracticaNum4ejer5;

import java.time.LocalDate;

public class CongeladoPorAire extends ProductoCongelado {
	
	private int porcentajeN;
	private int porcentajeO2;
	private int porcentajeDO2;
	private int porcentajeVaporH20;
	
	public CongeladoPorAire(LocalDate vencimiento, int numLote, LocalDate envasado, String granjaOrigen, int codigo,
			int temperatura, int porcentajeN, int porcentajeO2, int porcentajeDO2, int porcentajeVaporH20) {
		
		super(vencimiento, numLote, envasado, granjaOrigen, codigo, temperatura);
		// TODO Auto-generated constructor stub
		this.porcentajeN = porcentajeN;
		this.porcentajeO2 = porcentajeO2;
		this.porcentajeDO2 = porcentajeDO2;
		this.porcentajeVaporH20 = porcentajeVaporH20;
	}

	public int getPorcentajeN() {
		return porcentajeN;
	}

	public void setPorcentajeN(int porcentajeN) {
		this.porcentajeN = porcentajeN;
	}

	public int getPorcentajeO2() {
		return porcentajeO2;
	}

	public void setPorcentajeO2(int porcentajeO2) {
		this.porcentajeO2 = porcentajeO2;
	}

	public int getPorcentajeDO2() {
		return porcentajeDO2;
	}

	public void setPorcentajeDO2(int porcentajeDO2) {
		this.porcentajeDO2 = porcentajeDO2;
	}

	public int getPorcentajeVaporH20() {
		return porcentajeVaporH20;
	}

	public void setPorcentajeVaporH20(int porcentajeVaporH20) {
		this.porcentajeVaporH20 = porcentajeVaporH20;
	}
	
	

}
