package Parcialito4;

import java.util.ArrayList;

public class Plataforma {
	
	private ArrayList<Pelicula> Peliculas;
	
	public Plataforma() {
		this.Peliculas = new ArrayList<Pelicula>();
	}
	
	public boolean isRentable(Pelicula p,Criterio c1, Criterio c2) {
		if(c1.cumple(p) && c2.cumple(p))
			return true;
					
		return false;
	}
	
	public void addPelicula(Pelicula p) {
		if(!Peliculas.contains(p)) {
			Peliculas.add(p);
		}else {
			System.out.println("esa Pelicula ya estaba en la plataforma");
		}
	}
	
	public ArrayList<Pelicula> buscar(Criterio c) {
		ArrayList<Pelicula> p = new ArrayList<Pelicula>();
		for (Pelicula Pelicula : this.Peliculas) {
			if(c.cumple(Pelicula)) {
				p.add(Pelicula);
			}
		}
		return p;
	}

}
