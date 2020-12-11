package Parcialito4;

public class CriterioRentable2 implements Criterio {


	private int estreno;
	private String genero1;
	private String genero2;
	
	public CriterioRentable2(int estreno, String genero1, String genero2) {
		this.estreno = estreno;
		this.genero1 = genero1.toUpperCase();
		this.genero2 = genero2.toUpperCase();
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		if(p.getEstreno() > estreno)
			return true;
		else if(p.getGeneros().contains(genero1) || p.getGeneros().contains(genero2))
			return true;
			
		return false;
	}


}