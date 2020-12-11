package TP9_4;

public class CriterioLargo implements Criterio{

	private int num;
	
	public CriterioLargo(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}
	
	@Override
	public boolean cumple(Mensaje p) {
		// TODO Auto-generated method stub
		return p.getPalabrasSize() < num;
	}

}
