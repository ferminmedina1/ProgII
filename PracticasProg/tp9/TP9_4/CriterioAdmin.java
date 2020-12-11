package TP9_4;

public class CriterioAdmin implements Criterio{

	private Persona admin;
	
	public CriterioAdmin(Persona p) {
		admin = p;
	}
	
	@Override
	public boolean cumple(Mensaje p) {
		// TODO Auto-generated method stub
		return p.getEmisor().equals(admin);
	}

}
