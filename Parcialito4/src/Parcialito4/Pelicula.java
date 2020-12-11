package Parcialito4;

import java.util.ArrayList;
public class Pelicula {
	
	private String titulo;
	private String sinopsis;
	private ArrayList<String> generos;
	private String director;
	private ArrayList<String> actores;
	private int estreno;
	private int duracion;
	private int edadMin;

	public Pelicula(String titulo, String sinopsis, String director, int estreno, int duracion, int edadMin) {
		super();
		this.titulo = titulo.toUpperCase();
		this.sinopsis = sinopsis.toUpperCase();
		this.director = director.toUpperCase();
		this.estreno = estreno;
		this.duracion = duracion;
		this.edadMin = edadMin;
		actores = new ArrayList<String>();
		generos = new ArrayList<String>();
	}
	
	public void addGenero(String g) {
		String gMayus = g.toUpperCase();
		if(!generos.contains(gMayus)) {
			generos.add(gMayus);
		}else {
			System.out.println("el genero "+gMayus+" ya existe");
		}
	}
	
	public void addActor(String a) {
		String aMayus = a.toUpperCase();
		if(!actores.contains(aMayus)) {
			actores.add(aMayus);
		}else {
			System.out.println("el actor "+ aMayus +" ya estaba en la Pelicula");
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getEstreno() {
		return estreno;
	}

	public void setEstreno(int estreno) {
		this.estreno = estreno;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdadMin() {
		return edadMin;
	}

	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}

	public ArrayList<String> getGeneros() {
		ArrayList<String> g = generos;
		return g;
	}

	public ArrayList<String> getActores() {
		ArrayList<String> a = actores;
		return a;
	}
	
	public String toString() {
		return this.titulo;
	}
}
