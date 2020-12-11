package Criterio;

import OMS.Persona;

public class CriterioNacionalidad implements Criterio{

	private String nacionalidad;
	
	public CriterioNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad.toLowerCase();
	}

	@Override
	public boolean cumple(Persona p) {
		return p.esNacionalidad(nacionalidad);
	}
}
