package Criterio;

import OMS.Persona;

public class CriterioContrajoEnfermedad implements Criterio {
	@Override
	public boolean cumple(Persona p) {
		// TODO Auto-generated method stub
		return p.contrajoEnfermedad();
	}
}
