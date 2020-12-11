package SistemaArchivos;

public class FiltroNot implements Filtro{
	
	private Filtro f;
	
	public FiltroNot(Filtro f) {
		this.f = f;
	}

	@Override
	public boolean cumple(ElementoSA elem) {
		// TODO Auto-generated method stub
		return (!f.cumple(elem));
	}
	
	

}
