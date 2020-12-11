package OMS;

import java.util.ArrayList;


import Criterio.Criterio;

public abstract class ElementoOMS {
	
	private String nombre;

	public ElementoOMS(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double getCantidadVoluntariosTotal();
	
	public abstract double getCantVoluntariosConCriterio(Criterio c);
	
	public abstract ArrayList<Persona> getPosiblesVoluntarios(Criterio c);
	
	public String getNombre() {
		return nombre;
	}
	
	public String toString() {
		return nombre;
	}

}
