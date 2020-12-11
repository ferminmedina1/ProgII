package Empresa;

import java.util.ArrayList;

public abstract class ElementoEmpresa implements Comparable<ElementoEmpresa>{

	private String nombre,apellido;
	private int edad;
	private int sueldo;
	
	public ElementoEmpresa(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public abstract ArrayList<String> getEspecialidades();
	
	public abstract int getGastoSueldo();
	
	public abstract ArrayList<ElementoEmpresa> getEmpleados();
	
	public abstract int getCantidadEmpleados();
	
	@Override
	public int compareTo(ElementoEmpresa o) {
		int valor = this.getApellido().compareTo(o.getApellido());
		if(valor == 0) {
			valor = this.getNombre().compareTo(o.getNombre());
		}
		return valor;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nombre + " " + apellido;
	}

}
