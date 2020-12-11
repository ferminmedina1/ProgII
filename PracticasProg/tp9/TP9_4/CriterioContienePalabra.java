package TP9_4;

public class CriterioContienePalabra  implements Criterio{

	private String palabra;
	
	public CriterioContienePalabra(String palabra) {
		this.palabra = palabra;
	}
	
	@Override
	public boolean cumple(Mensaje p) {
		return p.contienePalabra(palabra);
	}

}
