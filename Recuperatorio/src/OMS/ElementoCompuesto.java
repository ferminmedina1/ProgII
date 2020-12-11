package OMS;

import java.util.ArrayList;

import Criterio.Criterio;

public class ElementoCompuesto extends ElementoOMS{

	private ArrayList<ElementoOMS> elementos;
	
	public ElementoCompuesto(String nombre) {
		super(nombre);
		elementos = new ArrayList<>();
	}
	
	public void addElemento(ElementoOMS e) {
		// TODO Auto-generated method stub
		if(!elementos.contains(e))
			elementos.add(e);
	}

	@Override
	public double getCantidadVoluntariosTotal() {
		int voluntarios = 0;
		for (ElementoOMS elem : elementos) {
			voluntarios += elem.getCantidadVoluntariosTotal();
		}
		return voluntarios;
	}

	@Override
	public double getCantVoluntariosConCriterio(Criterio c) {
		int voluntarios = 0;
		for (ElementoOMS elem : elementos) {
			voluntarios += elem.getCantVoluntariosConCriterio(c);
		}
		return voluntarios;
	}
	
	public double getPorcentaje(Criterio c) {
		double voluntariosTotales = getCantidadVoluntariosTotal();
		double voluntariosQueCumplen = getCantVoluntariosConCriterio(c);
		return (voluntariosQueCumplen/voluntariosTotales) * 100;
	}

	@Override
	public ArrayList<Persona> getPosiblesVoluntarios(Criterio c) {
		ArrayList<Persona> encontrados = new ArrayList<>();
		for (ElementoOMS elem : elementos) {
			encontrados.addAll(elem.getPosiblesVoluntarios(c));
		}
		return encontrados;
	}

}
