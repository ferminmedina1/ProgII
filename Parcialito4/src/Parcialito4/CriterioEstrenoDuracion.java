package Parcialito4;

public class CriterioEstrenoDuracion implements Criterio{
	private int estreno;
	private int duracion;
	
	public CriterioEstrenoDuracion(int estreno,int duracion) {
		this.estreno = estreno;
		this.duracion = duracion;
	}
	@Override
	public boolean cumple(Pelicula p) {
		if(p.getEstreno() < estreno && p.getDuracion() < duracion)
		return true;
		
		return false;
	}
}
