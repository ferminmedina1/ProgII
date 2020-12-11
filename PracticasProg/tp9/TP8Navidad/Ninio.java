package TP8Navidad;

public class Ninio {

	private int dni;
	private boolean ninioBueno;
	
	public Ninio(int dni) {
		this.dni = dni;
	}

	public int getDni() {
		return dni;
	}

	public boolean isNinioBueno() {
		return ninioBueno;
	}

	public void setNinioBueno(boolean ninioBueno) {
		this.ninioBueno = ninioBueno;
	}
	
	public String toString() {
		return "" + dni;
	}
}
