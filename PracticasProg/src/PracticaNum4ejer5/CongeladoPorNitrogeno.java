package PracticaNum4ejer5;

import java.time.LocalDate;

public class CongeladoPorNitrogeno extends ProductoCongelado {
	private int segundosEnN;
	
	public CongeladoPorNitrogeno(LocalDate vencimiento, int numLote, LocalDate envasado, String granjaOrigen,
			int codigo, int temperatura, int segundosEnN) {
		super(vencimiento, numLote, envasado, granjaOrigen, codigo, temperatura);
		// TODO Auto-generated constructor stub
		
		this.setSegundosEnN(segundosEnN);
	}

	public int getSegundosEnN() {
		return segundosEnN;
	}

	public void setSegundosEnN(int segundosEnN) {
		this.segundosEnN = segundosEnN;
	}

}
