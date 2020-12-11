package SIC;

public class FiltroCaracteristica {
	private String caract;
	
	public FiltroCaracteristica(String caract) {
		this.caract = caract.toUpperCase();
	}

	public boolean cumple(Automovil c) {
		return c.tieneCaract(caract);
	}
}
