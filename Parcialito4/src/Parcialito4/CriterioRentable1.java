package Parcialito4;

public class CriterioRentable1 implements Criterio {

	private int duracion;
	private String genero;
	
	public CriterioRentable1(int duracion, String genero) {
		this.duracion = duracion;
		this.genero = genero.toUpperCase();
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		if(p.getDuracion() < duracion && !p.getGeneros().contains(genero)) {
			return true;
		}
		return false;
	}

}