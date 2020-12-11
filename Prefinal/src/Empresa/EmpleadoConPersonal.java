package Empresa;

import java.util.ArrayList;
import java.util.Collections;


public class EmpleadoConPersonal extends ElementoEmpresa {

	private int aniosAntiguedad;
	protected ArrayList<ElementoEmpresa> personasAcargo;
	
	
	public EmpleadoConPersonal(String nombre, String apellido, int edad, int sueldoMensual) {
		super(nombre, apellido, edad);
		this.setSueldo(sueldoMensual);
		personasAcargo = new ArrayList<ElementoEmpresa>();
	}
	
	public void addpersonasAcargo(ElementoEmpresa e) {
		if(!personasAcargo.contains(e)) {
			personasAcargo.add(e);
		}
	}
	@Override
	public ArrayList<String> getEspecialidades() {
		ArrayList<String> especialidadesEncontradas = new ArrayList<String>();
		for (ElementoEmpresa elem : personasAcargo) {
			ArrayList<String> aux = elem.getEspecialidades();
			for (String especialidad : aux) {
				if(!especialidadesEncontradas.contains(especialidad))
					especialidadesEncontradas.add(especialidad);
			}
		}
		return especialidadesEncontradas;
	}

	@Override
	public int getGastoSueldo() {
		int valor = 0;
		for (ElementoEmpresa elem : personasAcargo) {
			valor += elem.getGastoSueldo();
		}
		return valor + getSueldo();
	}

	@Override
	public ArrayList<ElementoEmpresa> getEmpleados() {
		ArrayList<ElementoEmpresa> empleados = new ArrayList<>();
		for (ElementoEmpresa elem : personasAcargo) {
			empleados.addAll(elem.getEmpleados());
		}
		empleados.add(this);
		
		Collections.sort(empleados);
		return empleados;
	}
	
	public int getCantidadEmpleados() {
		return getEmpleados().size()-1;
		
		/*		
		 oint valor = 0;
		for (int i = 0; i < personasAcargo.size(); i++) {
			valor += personasAcargo.get(i).getCantidadEmpleados();
		}
		valor++;
		
		return valor;*/
	}
	
}
