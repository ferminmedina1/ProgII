package Empresa;

import java.util.ArrayList;

import Sueldos.Sueldo;

public class Programador extends ElementoEmpresa{

	private ArrayList<String> especialidad;
	private Sueldo tipoSueldo;
	private int horasDeTrabajo;
	private int horasDeTrabajoExtra;
	private int precioHoraExtra;
	
	public Programador(String nombre, String apellido, int edad, Sueldo tipoSueldo, int horasDeTrabajo,
			int horasDeTrabajoExtra, int precioHoraExtra) {
		super(nombre, apellido, edad);
		this.tipoSueldo = tipoSueldo;
		this.horasDeTrabajo = horasDeTrabajo;
		this.horasDeTrabajoExtra = horasDeTrabajoExtra;
		this.precioHoraExtra = precioHoraExtra;
		especialidad = new ArrayList<String>();
	}

	public void addEspecialidad(String e) {
		if(!especialidad.contains(e)) {
			especialidad.add(e);
		}
	}

	@Override
	public ArrayList<String> getEspecialidades() {
		return new ArrayList<>(especialidad);
	}

	public void setTipoSueldo(Sueldo s) {
		this.tipoSueldo = s;
	}
	
	public int getHorasDeTrabajo() {
		return horasDeTrabajo;
	}
	
	public int getPrecioHorasTrabajoExtra() {
		return precioHoraExtra * horasDeTrabajoExtra;
	}

	@Override
	public int getGastoSueldo() {
		if(getSueldo() == 0) {
			super.setSueldo(tipoSueldo.calcularSueldo(this));
		}
		return getSueldo();
	}

	@Override
	public ArrayList<ElementoEmpresa> getEmpleados() {
		ArrayList<ElementoEmpresa> e = new ArrayList<>();
			e.add(this);
		return e;
	}

	@Override
	public int getCantidadEmpleados() {
		return 1;
	}
}
