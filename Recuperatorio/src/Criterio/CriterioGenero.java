package Criterio;

import OMS.Persona;

public class CriterioGenero implements Criterio{

	private String genero;
	
	public CriterioGenero(String genero) {
		this.genero = genero.toLowerCase();
	}

	@Override
	public boolean cumple(Persona p) {
		return p.esGenero(genero);
	}
	
}
