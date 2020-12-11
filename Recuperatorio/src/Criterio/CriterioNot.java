package Criterio;

import OMS.Persona;

public class CriterioNot implements Criterio{

	private Criterio c1;
	
	public CriterioNot(Criterio c1) {
		this.c1 = c1;
	}

	@Override
	public boolean cumple(Persona p) {
		// TODO Auto-generated method stub
		return !c1.cumple(p);
	}
	
}
