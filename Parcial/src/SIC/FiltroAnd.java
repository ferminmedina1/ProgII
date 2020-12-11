package SIC;

public class FiltroAnd {

	private Filtro filtro1;
	private Filtro filtro2;
	
	public FiltroAnd(Filtro f1, Filtro f2) {
		filtro1 = f1;
		filtro2 = f2;
	}
	
	public boolean cumple(Automovil c) {
		return filtro1.cumple(c) && filtro2.cumple(c);
	}
}
