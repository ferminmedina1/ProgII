package TP8Navidad;

public class CondicionRegalo implements Condicion{

	private String regalo;
	
	public CondicionRegalo(String regalo) {
		this.regalo = regalo.toLowerCase();
	}
	
	@Override
	public boolean cumple(Carta c) {
		return c.contieneRegalo(regalo);
	}

}
