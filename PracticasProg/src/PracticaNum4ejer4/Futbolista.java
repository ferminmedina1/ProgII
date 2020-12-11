package PracticaNum4ejer4;

public class Futbolista extends Integrante {
	private String posicion;
	private String piernaBuena;
	private int cantGoles;
	
	public Futbolista(String nombre, String apellido,int pasaporte,int diaNacimiento,int mesNacimiento,int anioNacimiento, String posicion,String piernaBuena,int cantGoles) {
		super(nombre,apellido,pasaporte,diaNacimiento,mesNacimiento,anioNacimiento);
		this.posicion = posicion;
		this.piernaBuena = piernaBuena;
		this.cantGoles = cantGoles;
	}
	
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getPiernaBuena() {
		return piernaBuena;
	}
	public void setPiernaBuena(String piernaBuena) {
		this.piernaBuena = piernaBuena;
	}
	public int getCantGoles() {
		return cantGoles;
	}
	public void setCantGoles(int cantGoles) {
		this.cantGoles = cantGoles;
	}
	
	
}
