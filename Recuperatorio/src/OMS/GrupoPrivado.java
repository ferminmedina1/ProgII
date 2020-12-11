package OMS;

import java.util.ArrayList;

import Criterio.Criterio;

public class GrupoPrivado extends ElementoCompuesto {

	public GrupoPrivado(String nombre) {
		super(nombre);
	}

	@Override
	public ArrayList<Persona> getPosiblesVoluntarios(Criterio c) {
		return new ArrayList<Persona>();
	}
}
