package Parcialito4;

public class CriterioTituloContiene implements Criterio{

	private String palabra;
	
	
	public CriterioTituloContiene(String palabra) {
		this.palabra = palabra.toUpperCase();
	}


	@Override
	public boolean cumple(Pelicula p) {
		return p.getTitulo().contains(palabra);
	}
}
