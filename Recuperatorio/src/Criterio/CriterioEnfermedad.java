package Criterio;

import OMS.Persona;

public class CriterioEnfermedad implements Criterio {

	public String enfermedad;

	public CriterioEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	public CriterioEnfermedad() {
	}

	@Override
	public boolean cumple(Persona p) {
		// TODO Auto-generated method stub
		return p.tieneEnfermedad(enfermedad);
	}
	
	
	
}
