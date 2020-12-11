package Parcialito4;

public class CriterioActorDirector implements Criterio {

	private String director;
	private String actor;
	public CriterioActorDirector(String actor,String director) {
		this.director = director.toUpperCase();
		this.actor = actor.toUpperCase();
	}
	@Override
	public boolean cumple(Pelicula p) {
		// TODO Auto-generated method stub
		if(p.getActores().contains(actor) && !p.getDirector().contentEquals(director))
			return true;
		else {
			return false;
		}
	}

}