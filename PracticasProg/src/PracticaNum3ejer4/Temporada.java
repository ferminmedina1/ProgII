package PracticaNum3ejer4;

import java.util.ArrayList;
import java.util.List;

public class Temporada extends Serie {


	private List<Episodio> episodios;
	
	public Temporada() {
		this.episodios = new ArrayList<>();
	}
	
	public int getCantidadEpisodiosVistos() {
		int cont = 0;
		
		for(Episodio e: episodios) {
			
			if(e.getVisto() == true) {
				cont++;
			}
		}
		
		return cont;
	}
	
	public int getCalificacionEpisodiosVistos() {
		int calificacion = 0;
		
		for(Episodio e: episodios) {
			
			if(e.getVisto() == true) {
				calificacion += e.getCalificacion();
			}
		}
		
		return calificacion;
	}

	public int getCantidadEpisodiosTotales() {
		int cont = 0;
		
		for(@SuppressWarnings("unused") Episodio e: episodios) {
			
			cont++;
		}
		
		return cont;
	}
	
	public void agregarEpisodios(Episodio ep) {
		
		this.episodios.add(ep);
		
	}
	
}
