package SIC;

public class FiltroNot implements Filtro{

	private Filtro filtro;
	
	public FiltroNot(Filtro f) {
		filtro = f;
	}
	
	@Override
	public boolean cumple(Automovil c) {
		return !filtro.cumple(c);
	}
}
