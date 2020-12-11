package Criterio;

import OMS.Persona;

public class CriterioEdadMayor implements Criterio {

	private int edad;

	public CriterioEdadMayor(int edad) {
		this.edad = edad;
	}

	@Override
	public boolean cumple(Persona p) {
		// TODO Auto-generated method stub
		return p.getEdad() > edad;
	}
	
}
