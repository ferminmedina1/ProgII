package PracticaNum5ejer2;

import java.util.ArrayList;

public class Hufflepuff extends Casa {
	
	private int cantMaxAlumnos;
	
	private ArrayList<String> cualidades = new ArrayList<String>();
	private ArrayList<Casa> enemistades = new ArrayList<Casa>();
	private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	
	public Hufflepuff(String nombre, int cantMaxAlumnos, ArrayList<String> cualidades,Casa enemistad) {
		super(nombre);
		this.cantMaxAlumnos = cantMaxAlumnos;
		this.cualidades = cualidades;
		enemistades.add(enemistad);
	}

	public Hufflepuff(String nombre, int cantMaxAlumnos, ArrayList<String> cualidades) {
		super(nombre);
		this.cantMaxAlumnos = cantMaxAlumnos;
		this.cualidades = cualidades;
	}
	public void pushCualidad(String cualidad) {
		cualidades.add(cualidad.toUpperCase());
		System.out.println("Se agrego una cualidad: '" + cualidad + "' a " + super.getNombre());
		System.out.println("******************************");
	}
	
	public ArrayList<String> getCualidades() {
		return cualidades;
	}
	
	public void pushAlumno(Alumno alumno,Casa casa) {
		alumnos.add(alumno);
		alumno.setPerteneceACasa(casa);
		System.out.println("Se agrego un alumno llamado: '" + alumno + "' a " + super.getNombre());
		System.out.println("******************************");
	}
	
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void pushEnemistad(Casa casa) {
		enemistades.add(casa);
		System.out.println("Se agrego una enemistad llamada: '" + casa + "' a " + enemistades);
		System.out.println("******************************");
	}
	
	public ArrayList<Casa> getEnemistades() {
		return enemistades;
	}

	public int getCantMaxAlumnos() {
		return cantMaxAlumnos;
	}

	public void setCantMaxAlumnos(int cantMaxAlumnos) {
		this.cantMaxAlumnos = cantMaxAlumnos;
	}
	
	public boolean hayLugar() {
		if(alumnos.size() < cantMaxAlumnos) {
			return true;
		}else {
			return false;
		}
	}
}
