package PracticaNum5ejer2;

import java.util.ArrayList;

public class Alumno {
	
	private String nombre;
	private Casa perteneceACasa;
	
	private ArrayList<String> cualidades = new ArrayList<String>();
	private ArrayList<Alumno> familiares = new ArrayList<Alumno>();
	
	public Alumno(String nombre, String cualidad1,String cualidad2,String cualidad3, ArrayList<Alumno> familiares) {
		super(); 
		this.nombre = nombre;
		this.familiares = familiares;
		this.pushCualidad(cualidad1);
		this.pushCualidad(cualidad2);
		this.pushCualidad(cualidad3);
	}
	
	public Alumno(String nombre, String cualidad1,String cualidad2,String cualidad3) {
		super();
		this.nombre = nombre;
		cualidades = new ArrayList<String>();
		familiares = new ArrayList<Alumno>();
		this.pushCualidad(cualidad1);
		this.pushCualidad(cualidad2);
		this.pushCualidad(cualidad3);
	}
	
	public void pushCualidad(String cualidad) {
		cualidades.add(cualidad.toUpperCase());
		System.out.println("Se agrego una cualidad: '" + cualidad + "' a " + nombre);
		System.out.println("******************************");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getCualidades() {
		return cualidades;
	}

	public void setCualidades(ArrayList<String> cualidades) {
		this.cualidades = cualidades;
	}

	public ArrayList<Alumno> getFamiliares() {
		return familiares;
	}

	public void pushFamiliar(Alumno familiar) {
		familiares.add(familiar);
	}
	
	public String toString() {
		return nombre;
	}

	public Casa getPerteneceACasa() {
		return perteneceACasa;
	}

	public void setPerteneceACasa(Casa perteneceACasa) {
		this.perteneceACasa = perteneceACasa;
	}
	
	
}
