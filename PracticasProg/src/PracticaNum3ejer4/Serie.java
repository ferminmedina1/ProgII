package PracticaNum3ejer4;

import java.util.ArrayList;
import java.util.List;

public class Serie {
	
	private String titulo;
	private String descripcion;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Temporada> getTemporada() {
		return temporada;
	}

	public void setTemporada(List<Temporada> temporada) {
		this.temporada = temporada;
	}

	private String creador;
	private String genero;
	
	private List<Temporada> temporada;

	public Serie(String titulo, String descripcion, String creador,String genero) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		
		temporada = new ArrayList<Temporada>();
	}
	
	public Serie() {
		this.temporada = new ArrayList<>();
	}

	
	
	//Obtener el promedio de las calificaciones dadas para una serie.
	public double getPromedio() {
		double episodiosVistos = getCantidadEpisodiosVisto();
		double calificacion = 0;
		
		for(Temporada t: temporada) {
			calificacion += t.getCalificacionEpisodiosVistos();
		}

		return calificacion/episodiosVistos;
	}
	
	//Obtener el promedio de las calificaciones dadas para una temporada particular.
	public double getPromedio(int nroTemp) {
		double episodiosVistos = getCantidadEpisodiosVisto(nroTemp);
		double calificacion = 0;
		if(nroTemp <= temporada.size()) {
			calificacion = temporada.get(nroTemp).getCalificacionEpisodiosVistos();
		}

		return calificacion/episodiosVistos;
	}
		
	//Obtener el total de episodios vistos de una serie.
	public int getCantidadEpisodiosVisto() {
		
		int out = 0;
		
		for(Temporada t: temporada) {
			out = out + t.getCantidadEpisodiosVistos();
		}
		
		return out;
	}
	
	
	
	//Obtener el total episodios vistos de una temporada particular.
	public int getCantidadEpisodiosVisto(int nroTemp) {
		
		int out = 0;
		
		if(nroTemp <= temporada.size()) {
			out = temporada.get(nroTemp).getCantidadEpisodiosVistos();
		}
		
		return out;
	}

	//Determinar si se vio todos los episodios de la serie.
	public boolean getSeVio() {
		int episodiosVistos = getCantidadEpisodiosVisto();
		int episodiosTotales = 0;
		for(Temporada t: temporada) {
			episodiosTotales += t.getCantidadEpisodiosTotales();
		}

		if(episodiosTotales == episodiosVistos) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void agregarTemp(Temporada temp) {
		
		this.temporada.add(temp);
		
	}
}
