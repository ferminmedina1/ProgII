package Empresa;

import java.util.ArrayList;

public class EmpleadoCargoHumilde extends EmpleadoConPersonal {

	public EmpleadoCargoHumilde(String nombre, String apellido, int edad, int sueldoMensual) {
		super(nombre, apellido, edad, sueldoMensual);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<String> getEspecialidades() {
		ArrayList<String> especialidadesEncontradas = new ArrayList<String>();
		for (ElementoEmpresa elem : personasAcargo) {
			ArrayList<String> aux = elem.getEspecialidades();
			for (String especialidad : aux) {
				if(!especialidadesEncontradas.contains(especialidad) && especialidadesEncontradas.size() < 5)
					especialidadesEncontradas.add(especialidad);
			}
		}
		return especialidadesEncontradas;
	}
}
