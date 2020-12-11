package OMS;

import java.util.ArrayList;

import Criterio.Criterio;


public class Persona extends ElementoOMS{

	private String nacionalidad;
	private int edad;
	private String genero;
	private ArrayList<String> enfermedades;
	private boolean recibioVacuna;
	private boolean contrajoEnfermedad;
	
	public Persona(String nombre, String nacionalidad, int edad, String genero,
			boolean recibioVacuna, boolean contrajoEnfermedad) {
		super(nombre);
		this.nacionalidad = nacionalidad.toLowerCase();
		this.edad = edad;
		this.genero = genero.toLowerCase();
		this.recibioVacuna = recibioVacuna;
		this.contrajoEnfermedad = contrajoEnfermedad;
		enfermedades = new ArrayList<>();
	}

	@Override
	public double getCantidadVoluntariosTotal() {
		return 1;
	}

	@Override
	public double getCantVoluntariosConCriterio(Criterio c) {
		if(c.cumple(this)) {
			return 1;
		}else return 0;
	}

	public void addEnfermedad(String e) {
		// TODO Auto-generated method stub
		if(!tieneEnfermedad(e))
			enfermedades.add(e);
	}
	
	public boolean tieneEnfermedad(String e) {
		// TODO Auto-generated method stub
		if(e != null)
		return enfermedades.contains(e);
		else {
			if(enfermedades.size() == 0) {
				return true;
			}
			return false;
		}
	}

	public boolean recibioVacuna() {
		return recibioVacuna;
	}

	public int getEdad() {
		return edad;
	}
	
	public boolean esGenero(String g) {
		return genero.equals(g);
	}

	public boolean esNacionalidad(String n) {
		// TODO Auto-generated method stub
		return nacionalidad.equals(n);
	}

	public boolean contrajoEnfermedad() {
		return contrajoEnfermedad;
	}

	@Override
	public ArrayList<Persona> getPosiblesVoluntarios(Criterio c) {
		ArrayList<Persona> personas = new ArrayList<>();
		if(c.cumple(this)) {
			Persona copia = new Persona(super.getNombre(), nacionalidad, edad, genero, recibioVacuna, contrajoEnfermedad);
			for (String enfermedad : enfermedades) {
				copia.addEnfermedad(enfermedad);
			}
			personas.add(copia);
		}
		return personas;
	}

}

