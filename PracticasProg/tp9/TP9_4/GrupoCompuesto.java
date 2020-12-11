package TP9_4;

import java.util.ArrayList;
import java.util.Collections;

public class GrupoCompuesto extends ElementoSC {

	private ArrayList<ElementoSC> elementos = new ArrayList<>();
	private Criterio criterio;
	
	public void AgregarElem(ElementoSC e) {
		elementos.add(e);
	}
	
	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}
	
	@Override
	public void recibirMensaje(Mensaje m) {
		if(criterio != null && criterio.cumple(m)) {
			for (ElementoSC elem : elementos) {
				elem.recibirMensaje(m);
			}
		}else{
			for (ElementoSC elem : elementos) {
				elem.recibirMensaje(m);
			}
		}
	}
	
	@Override
	public int getCantidadEmpleados() {
		int empleados = 0;
		for (ElementoSC elem : elementos) {
			empleados += elem.getCantidadEmpleados();
		}
		return empleados;
	}

	@Override
	public ArrayList<Persona> getEmpleados() {
		ArrayList<Persona> empleadosEncontrados = new ArrayList<>();
		
		for (ElementoSC elem : elementos) {
			ArrayList<Persona> auxArrayList = elem.getEmpleados();
			for (Persona persona : auxArrayList) { //ESTO GENERA QUE NO HAYAN REPETIDOS!!!!!!!!!
				if(!empleadosEncontrados.contains(persona))
					empleadosEncontrados.add(persona);
			}
		}
		Collections.sort(empleadosEncontrados);
		
		return empleadosEncontrados;
	}
}
