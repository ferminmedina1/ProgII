package Parcialito4;

public class CriterioGenero implements Criterio {

	private String palabra;
	
	public CriterioGenero(String palabra) {
		this.palabra = palabra.toUpperCase();
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		if(p.getGeneros().contains(palabra)) {
			return true;
		}
		return false;
	}

}
