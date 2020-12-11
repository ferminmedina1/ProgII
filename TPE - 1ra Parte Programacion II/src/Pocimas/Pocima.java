package Pocimas;

import Juego.Atributo;

public abstract class Pocima {

	private String nombre;
	
	public Pocima(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double efecto(Atributo a);

	public String toString() {
		return this.nombre;
	}
}
